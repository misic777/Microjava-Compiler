// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class ElseStatement_y extends ElseStatement {

    private ElseIdent ElseIdent;
    private Statement Statement;

    public ElseStatement_y (ElseIdent ElseIdent, Statement Statement) {
        this.ElseIdent=ElseIdent;
        if(ElseIdent!=null) ElseIdent.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public ElseIdent getElseIdent() {
        return ElseIdent;
    }

    public void setElseIdent(ElseIdent ElseIdent) {
        this.ElseIdent=ElseIdent;
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
        if(ElseIdent!=null) ElseIdent.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ElseIdent!=null) ElseIdent.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ElseIdent!=null) ElseIdent.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ElseStatement_y(\n");

        if(ElseIdent!=null)
            buffer.append(ElseIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ElseStatement_y]");
        return buffer.toString();
    }
}
