/* Generated By:JJTree: Do not edit this line. ASTVariableDeclarator.java */

package net.sourceforge.pmd.ast;

public class ASTVariableDeclarator extends AbstractJavaTypeNode {
    public ASTVariableDeclarator(int id) {
        super(id);
    }

    public ASTVariableDeclarator(JavaParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
