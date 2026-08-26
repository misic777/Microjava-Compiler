// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class ConditionOptional_Epsilon extends ConditionOptional {

    public ConditionOptional_Epsilon () {
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
        buffer.append("ConditionOptional_Epsilon(\n");

        buffer.append(tab);
        buffer.append(") [ConditionOptional_Epsilon]");
        return buffer.toString();
    }
}
