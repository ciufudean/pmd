/* Generated By:JJTree: Do not edit this line. ASTTypeParameters.java */

package net.sourceforge.pmd.ast;

public class ASTTypeParameters extends AbstractJavaNode {
    public ASTTypeParameters(int id) {
        super(id);
    }

    public ASTTypeParameters(JavaParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
