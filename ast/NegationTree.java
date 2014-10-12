package ast;

import visitor.*;

public class NegationTree extends AST {

    public NegationTree() {
    }

    public Object accept(ASTVisitor v) {
        return v.visitNegationTree(this);
    }

}