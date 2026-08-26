// generated with ast extension for cup
// version 0.8
// 18/1/2026 0:7:3


package rs.ac.bg.etf.pp1.ast;

public class FactorMinus implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Struct struct = null;

    private OptionalMinus OptionalMinus;
    private Factor Factor;

    public FactorMinus (OptionalMinus OptionalMinus, Factor Factor) {
        this.OptionalMinus=OptionalMinus;
        if(OptionalMinus!=null) OptionalMinus.setParent(this);
        this.Factor=Factor;
        if(Factor!=null) Factor.setParent(this);
    }

    public OptionalMinus getOptionalMinus() {
        return OptionalMinus;
    }

    public void setOptionalMinus(OptionalMinus OptionalMinus) {
        this.OptionalMinus=OptionalMinus;
    }

    public Factor getFactor() {
        return Factor;
    }

    public void setFactor(Factor Factor) {
        this.Factor=Factor;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(OptionalMinus!=null) OptionalMinus.accept(visitor);
        if(Factor!=null) Factor.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptionalMinus!=null) OptionalMinus.traverseTopDown(visitor);
        if(Factor!=null) Factor.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptionalMinus!=null) OptionalMinus.traverseBottomUp(visitor);
        if(Factor!=null) Factor.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorMinus(\n");

        if(OptionalMinus!=null)
            buffer.append(OptionalMinus.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Factor!=null)
            buffer.append(Factor.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorMinus]");
        return buffer.toString();
    }
}
