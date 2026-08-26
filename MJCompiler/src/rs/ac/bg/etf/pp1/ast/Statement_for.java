// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class Statement_for extends Statement {

    private DesignatorStatementOptional DesignatorStatementOptional;
    private Semi1 Semi1;
    private ConditionOptional ConditionOptional;
    private Semi2 Semi2;
    private DesignatorStatementOptional DesignatorStatementOptional1;
    private RParen RParen;
    private Statement Statement;

    public Statement_for (DesignatorStatementOptional DesignatorStatementOptional, Semi1 Semi1, ConditionOptional ConditionOptional, Semi2 Semi2, DesignatorStatementOptional DesignatorStatementOptional1, RParen RParen, Statement Statement) {
        this.DesignatorStatementOptional=DesignatorStatementOptional;
        if(DesignatorStatementOptional!=null) DesignatorStatementOptional.setParent(this);
        this.Semi1=Semi1;
        if(Semi1!=null) Semi1.setParent(this);
        this.ConditionOptional=ConditionOptional;
        if(ConditionOptional!=null) ConditionOptional.setParent(this);
        this.Semi2=Semi2;
        if(Semi2!=null) Semi2.setParent(this);
        this.DesignatorStatementOptional1=DesignatorStatementOptional1;
        if(DesignatorStatementOptional1!=null) DesignatorStatementOptional1.setParent(this);
        this.RParen=RParen;
        if(RParen!=null) RParen.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public DesignatorStatementOptional getDesignatorStatementOptional() {
        return DesignatorStatementOptional;
    }

    public void setDesignatorStatementOptional(DesignatorStatementOptional DesignatorStatementOptional) {
        this.DesignatorStatementOptional=DesignatorStatementOptional;
    }

    public Semi1 getSemi1() {
        return Semi1;
    }

    public void setSemi1(Semi1 Semi1) {
        this.Semi1=Semi1;
    }

    public ConditionOptional getConditionOptional() {
        return ConditionOptional;
    }

    public void setConditionOptional(ConditionOptional ConditionOptional) {
        this.ConditionOptional=ConditionOptional;
    }

    public Semi2 getSemi2() {
        return Semi2;
    }

    public void setSemi2(Semi2 Semi2) {
        this.Semi2=Semi2;
    }

    public DesignatorStatementOptional getDesignatorStatementOptional1() {
        return DesignatorStatementOptional1;
    }

    public void setDesignatorStatementOptional1(DesignatorStatementOptional DesignatorStatementOptional1) {
        this.DesignatorStatementOptional1=DesignatorStatementOptional1;
    }

    public RParen getRParen() {
        return RParen;
    }

    public void setRParen(RParen RParen) {
        this.RParen=RParen;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStatementOptional!=null) DesignatorStatementOptional.accept(visitor);
        if(Semi1!=null) Semi1.accept(visitor);
        if(ConditionOptional!=null) ConditionOptional.accept(visitor);
        if(Semi2!=null) Semi2.accept(visitor);
        if(DesignatorStatementOptional1!=null) DesignatorStatementOptional1.accept(visitor);
        if(RParen!=null) RParen.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementOptional!=null) DesignatorStatementOptional.traverseTopDown(visitor);
        if(Semi1!=null) Semi1.traverseTopDown(visitor);
        if(ConditionOptional!=null) ConditionOptional.traverseTopDown(visitor);
        if(Semi2!=null) Semi2.traverseTopDown(visitor);
        if(DesignatorStatementOptional1!=null) DesignatorStatementOptional1.traverseTopDown(visitor);
        if(RParen!=null) RParen.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementOptional!=null) DesignatorStatementOptional.traverseBottomUp(visitor);
        if(Semi1!=null) Semi1.traverseBottomUp(visitor);
        if(ConditionOptional!=null) ConditionOptional.traverseBottomUp(visitor);
        if(Semi2!=null) Semi2.traverseBottomUp(visitor);
        if(DesignatorStatementOptional1!=null) DesignatorStatementOptional1.traverseBottomUp(visitor);
        if(RParen!=null) RParen.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Statement_for(\n");

        if(DesignatorStatementOptional!=null)
            buffer.append(DesignatorStatementOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Semi1!=null)
            buffer.append(Semi1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConditionOptional!=null)
            buffer.append(ConditionOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Semi2!=null)
            buffer.append(Semi2.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorStatementOptional1!=null)
            buffer.append(DesignatorStatementOptional1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(RParen!=null)
            buffer.append(RParen.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Statement_for]");
        return buffer.toString();
    }
}
