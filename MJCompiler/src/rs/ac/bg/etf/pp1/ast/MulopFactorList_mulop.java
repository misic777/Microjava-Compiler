// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class MulopFactorList_mulop extends MulopFactorList {

    private MulopFactorList MulopFactorList;
    private Mulop Mulop;
    private FactorMinus FactorMinus;

    public MulopFactorList_mulop (MulopFactorList MulopFactorList, Mulop Mulop, FactorMinus FactorMinus) {
        this.MulopFactorList=MulopFactorList;
        if(MulopFactorList!=null) MulopFactorList.setParent(this);
        this.Mulop=Mulop;
        if(Mulop!=null) Mulop.setParent(this);
        this.FactorMinus=FactorMinus;
        if(FactorMinus!=null) FactorMinus.setParent(this);
    }

    public MulopFactorList getMulopFactorList() {
        return MulopFactorList;
    }

    public void setMulopFactorList(MulopFactorList MulopFactorList) {
        this.MulopFactorList=MulopFactorList;
    }

    public Mulop getMulop() {
        return Mulop;
    }

    public void setMulop(Mulop Mulop) {
        this.Mulop=Mulop;
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
        if(MulopFactorList!=null) MulopFactorList.accept(visitor);
        if(Mulop!=null) Mulop.accept(visitor);
        if(FactorMinus!=null) FactorMinus.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MulopFactorList!=null) MulopFactorList.traverseTopDown(visitor);
        if(Mulop!=null) Mulop.traverseTopDown(visitor);
        if(FactorMinus!=null) FactorMinus.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MulopFactorList!=null) MulopFactorList.traverseBottomUp(visitor);
        if(Mulop!=null) Mulop.traverseBottomUp(visitor);
        if(FactorMinus!=null) FactorMinus.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MulopFactorList_mulop(\n");

        if(MulopFactorList!=null)
            buffer.append(MulopFactorList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Mulop!=null)
            buffer.append(Mulop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FactorMinus!=null)
            buffer.append(FactorMinus.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MulopFactorList_mulop]");
        return buffer.toString();
    }
}
