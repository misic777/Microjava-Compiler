// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementOptional_Epsilon extends DesignatorStatementOptional {

    public DesignatorStatementOptional_Epsilon () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementOptional_Epsilon(\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementOptional_Epsilon]");
        return buffer.toString();
    }
}
