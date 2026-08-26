// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class EnumDeclMore_list extends EnumDeclMore {

    private EnumDeclMore EnumDeclMore;
    private AssignConst AssignConst;

    public EnumDeclMore_list (EnumDeclMore EnumDeclMore, AssignConst AssignConst) {
        this.EnumDeclMore=EnumDeclMore;
        if(EnumDeclMore!=null) EnumDeclMore.setParent(this);
        this.AssignConst=AssignConst;
        if(AssignConst!=null) AssignConst.setParent(this);
    }

    public EnumDeclMore getEnumDeclMore() {
        return EnumDeclMore;
    }

    public void setEnumDeclMore(EnumDeclMore EnumDeclMore) {
        this.EnumDeclMore=EnumDeclMore;
    }

    public AssignConst getAssignConst() {
        return AssignConst;
    }

    public void setAssignConst(AssignConst AssignConst) {
        this.AssignConst=AssignConst;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(EnumDeclMore!=null) EnumDeclMore.accept(visitor);
        if(AssignConst!=null) AssignConst.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(EnumDeclMore!=null) EnumDeclMore.traverseTopDown(visitor);
        if(AssignConst!=null) AssignConst.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(EnumDeclMore!=null) EnumDeclMore.traverseBottomUp(visitor);
        if(AssignConst!=null) AssignConst.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("EnumDeclMore_list(\n");

        if(EnumDeclMore!=null)
            buffer.append(EnumDeclMore.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AssignConst!=null)
            buffer.append(AssignConst.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [EnumDeclMore_list]");
        return buffer.toString();
    }
}
