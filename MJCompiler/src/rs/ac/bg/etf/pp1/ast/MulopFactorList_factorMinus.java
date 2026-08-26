// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class MulopFactorList_factorMinus extends MulopFactorList {

    private FactorMinus FactorMinus;

    public MulopFactorList_factorMinus (FactorMinus FactorMinus) {
        this.FactorMinus=FactorMinus;
        if(FactorMinus!=null) FactorMinus.setParent(this);
    }

    public FactorMinus getFactorMinus() {
        return FactorMinus;
    }

    public void setFactorMinus(FactorMinus FactorMinus) {
        this.FactorMinus=FactorMinus;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FactorMinus!=null) FactorMinus.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FactorMinus!=null) FactorMinus.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FactorMinus!=null) FactorMinus.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MulopFactorList_factorMinus(\n");

        if(FactorMinus!=null)
            buffer.append(FactorMinus.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MulopFactorList_factorMinus]");
        return buffer.toString();
    }
}
