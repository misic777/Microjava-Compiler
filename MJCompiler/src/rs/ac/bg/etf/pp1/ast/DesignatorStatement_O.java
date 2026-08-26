// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatement_O extends DesignatorStatement {

    private DesignatorStatementOther DesignatorStatementOther;

    public DesignatorStatement_O (DesignatorStatementOther DesignatorStatementOther) {
        this.DesignatorStatementOther=DesignatorStatementOther;
        if(DesignatorStatementOther!=null) DesignatorStatementOther.setParent(this);
    }

    public DesignatorStatementOther getDesignatorStatementOther() {
        return DesignatorStatementOther;
    }

    public void setDesignatorStatementOther(DesignatorStatementOther DesignatorStatementOther) {
        this.DesignatorStatementOther=DesignatorStatementOther;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStatementOther!=null) DesignatorStatementOther.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementOther!=null) DesignatorStatementOther.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementOther!=null) DesignatorStatementOther.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatement_O(\n");

        if(DesignatorStatementOther!=null)
            buffer.append(DesignatorStatementOther.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatement_O]");
        return buffer.toString();
    }
}
