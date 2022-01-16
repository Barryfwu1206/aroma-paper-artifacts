package model;

public class Node {
    /**
     * 语法规则名称
     */
    String ruleName;

    /**
     * 节点语法字符串原始内容
     */
    String oriText;

    /**
     * 节点语法字符串正则化内容
     */
    String normText;

    /**
     * 节点行数
     */
    int lineNumber;

    /**
     * 节点缩进
     */
    int columnNumber;

    /**
     * 节点token内容
     */
    String keyWord;

    /**
     * 索引
     */
    Boolean isVariable;


    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getOriText() {
        return oriText;
    }

    public void setOriText(String oriText) {
        this.oriText = oriText;
    }

    public String getNormText() {
        return normText;
    }

    public void setNormText(String normText) {
        this.normText = normText;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Boolean getVariable() {
        return isVariable;
    }

    public void setVariable(Boolean variable) {
        isVariable = variable;
    }
}
