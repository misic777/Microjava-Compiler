// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class CaseList_y extends CaseList {

    private CaseList CaseList;
    private Case Case;
    private CaseNumber CaseNumber;
    private ColonSw ColonSw;
    private StatementList StatementList;

    public CaseList_y (CaseList CaseList, Case Case, CaseNumber CaseNumber, ColonSw ColonSw, StatementList StatementList) {
        this.CaseList=CaseList;
        if(CaseList!=null) CaseList.setParent(this);
        this.Case=Case;
        if(Case!=null) Case.setParent(this);
        this.CaseNumber=CaseNumber;
        if(CaseNumber!=null) CaseNumber.setParent(this);
        this.ColonSw=ColonSw;
        if(ColonSw!=null) ColonSw.setParent(this);
        this.StatementList=StatementList;
        if(StatementList!=null) StatementList.setParent(this);
    }

    public CaseList getCaseList() {
        return CaseList;
    }

    public void setCaseList(CaseList CaseList) {
        this.CaseList=CaseList;
    }

    public Case getCase() {
        return Case;
    }

    public void setCase(Case Case) {
        this.Case=Case;
    }

    public CaseNumber getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(CaseNumber CaseNumber) {
        this.CaseNumber=CaseNumber;
    }

    public ColonSw getColonSw() {
        return ColonSw;
    }

    public void setColonSw(ColonSw ColonSw) {
        this.ColonSw=ColonSw;
    }

    public StatementList getStatementList() {
        return StatementList;
    }

    public void setStatementList(StatementList StatementList) {
        this.StatementList=StatementList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CaseList!=null) CaseList.accept(visitor);
        if(Case!=null) Case.accept(visitor);
        if(CaseNumber!=null) CaseNumber.accept(visitor);
        if(ColonSw!=null) ColonSw.accept(visitor);
        if(StatementList!=null) StatementList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CaseList!=null) CaseList.traverseTopDown(visitor);
        if(Case!=null) Case.traverseTopDown(visitor);
        if(CaseNumber!=null) CaseNumber.traverseTopDown(visitor);
        if(ColonSw!=null) ColonSw.traverseTopDown(visitor);
        if(StatementList!=null) StatementList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CaseList!=null) CaseList.traverseBottomUp(visitor);
        if(Case!=null) Case.traverseBottomUp(visitor);
        if(CaseNumber!=null) CaseNumber.traverseBottomUp(visitor);
        if(ColonSw!=null) ColonSw.traverseBottomUp(visitor);
        if(StatementList!=null) StatementList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CaseList_y(\n");

        if(CaseList!=null)
            buffer.append(CaseList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Case!=null)
            buffer.append(Case.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CaseNumber!=null)
            buffer.append(CaseNumber.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ColonSw!=null)
            buffer.append(ColonSw.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementList!=null)
            buffer.append(StatementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CaseList_y]");
        return buffer.toString();
    }
}
