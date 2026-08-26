// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatement_A extends DesignatorStatement {

    private DesignatorStatementAssign DesignatorStatementAssign;

    public DesignatorStatement_A (DesignatorStatementAssign DesignatorStatementAssign) {
        this.DesignatorStatementAssign=DesignatorStatementAssign;
        if(DesignatorStatementAssign!=null) DesignatorStatementAssign.setParent(this);
    }

    public DesignatorStatementAssign getDesignatorStatementAssign() {
        return DesignatorStatementAssign;
    }

    public void setDesignatorStatementAssign(DesignatorStatementAssign DesignatorStatementAssign) {
        this.DesignatorStatementAssign=DesignatorStatementAssign;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStatementAssign!=null) DesignatorStatementAssign.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementAssign!=null) DesignatorStatementAssign.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementAssign!=null) DesignatorStatementAssign.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatement_A(\n");

        if(DesignatorStatementAssign!=null)
            buffer.append(DesignatorStatementAssign.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatement_A]");
        return buffer.toString();
    }
}
