/* Generated By:JJTree: Do not edit this line. ASTElExpression.java */

package net.sourceforge.pmd.jsp.ast;

public class ASTElExpression extends AbstractJspNode {
    public ASTElExpression(int id) {
        super(id);
    }

    public ASTElExpression(JspParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JspParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
