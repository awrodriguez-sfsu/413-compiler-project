package ast;

import visitor.*;

public class UnaryTree extends AST {

    public UnaryTree() {
    }

    public Object accept(ASTVisitor v) {
        return v.visitUnaryTree(this);
    }

}