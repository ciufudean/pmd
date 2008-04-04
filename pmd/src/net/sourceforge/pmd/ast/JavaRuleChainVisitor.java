package net.sourceforge.pmd.ast;

import java.util.List;

import net.sourceforge.pmd.AbstractRuleChainVisitor;
import net.sourceforge.pmd.Rule;
import net.sourceforge.pmd.RuleContext;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.rules.XPathRule;

public class JavaRuleChainVisitor extends AbstractRuleChainVisitor {

	protected void indexNodes(List<CompilationUnit> astCompilationUnits, RuleContext ctx) {
		JavaParserVisitor javaParserVistor = new JavaParserVisitorAdapter() {
			// Perform a visitation of the AST to index nodes which need
			// visiting by type
			public Object visit(JavaNode node, Object data) {
				indexNode(node);
				return super.visit(node, data);
			}
		};

		for (int i = 0; i < astCompilationUnits.size(); i++) {
			javaParserVistor.visit((ASTCompilationUnit)astCompilationUnits.get(i), ctx);
		}
	}

	protected void visit(Rule rule, Node node, RuleContext ctx) {
		// Rule better either be a JavaParserVisitor, or a XPathRule
		if (rule instanceof XPathRule) {
			((XPathRule)rule).evaluate(node, ctx);
		} else {
			((JavaNode)node).jjtAccept((JavaParserVisitor)rule, ctx);
		}
	}
}
