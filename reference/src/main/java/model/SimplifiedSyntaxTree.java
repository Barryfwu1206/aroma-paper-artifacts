package model;

import java.util.ArrayList;
import java.util.List;

public class SimplifiedSyntaxTree<T>{
    /**
     * 自研语法树的节点
     */
    private T data;

    /**
     * 语法树的根节点
     */
    private List<SimplifiedSyntaxTree> children = new ArrayList<>();

    /**
     * 语法书的父节点
     */
    private SimplifiedSyntaxTree parent = null;

    /**
     * 构造函数
     * @param data 节点
     */
    public SimplifiedSyntaxTree(T data) {
        this.data = data;
    }

    /**
     * 新增孩子树
     * @param child 孩子树
     */
    public void addChild(SimplifiedSyntaxTree child) {
        child.setParent(this);
        this.children.add(child);
    }

    /**
     * 新增孩子节点
     * @param data 孩子节点
     */
    public void addChild(T data) {
        SimplifiedSyntaxTree<T> newChild = new SimplifiedSyntaxTree<>(data);
        newChild.setParent(this);
        children.add(newChild);
    }

    /**
     * 新增一组孩子树
     * @param children 孩子树组
     */
    public void addChildren(List<SimplifiedSyntaxTree> children) {
        for(SimplifiedSyntaxTree t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    /**
     * 获取孩子树
     * @return 所有孩子树
     */
    public List<SimplifiedSyntaxTree> getChildren() {
        return children;
    }

    /**
     * 获取节点
     * @return 节点
     */
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(SimplifiedSyntaxTree parent) {
        this.parent = parent;
    }

    public SimplifiedSyntaxTree getParent() {
        return parent;
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.setKeyWord("test");
        node.setColumnNumber(2);
        node.setLineNumber(1);
        node.setRuleName("methodDeclaration");
        node.setOriText("if A = B");
        node.setNormText("if A = B");
        node.setVariable(false);
        node.setKeyWord("private");

        Node node2 = new Node();
        node2.setKeyWord("test");
        node2.setColumnNumber(2);
        node2.setLineNumber(1);
        node2.setRuleName("methodDeclaration");
        node2.setOriText("if A1 = B1");
        node2.setNormText("if A1 = B1");
        node2.setVariable(false);
        node2.setKeyWord("private");

        Node node3 = new Node();
        node3.setKeyWord("test");
        node3.setColumnNumber(2);
        node3.setLineNumber(1);
        node3.setRuleName("methodDeclaration");
        node3.setOriText("if A2 = B2");
        node3.setNormText("if A2 = B2");
        node3.setVariable(false);
        node3.setKeyWord("private");

        SimplifiedSyntaxTree<Node> tree = new SimplifiedSyntaxTree<>(node);
        SimplifiedSyntaxTree<Node> child = new SimplifiedSyntaxTree<>(node2);
        SimplifiedSyntaxTree<Node> child2 = new SimplifiedSyntaxTree<>(node3);
        tree.addChild(child);
        child.addChild(child2);
        System.out.println(tree);
    }
}
