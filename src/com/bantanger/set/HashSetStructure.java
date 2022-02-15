package com.bantanger.set;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class HashSetStructure {
    public static void main(String[] args) {
        // 先创建一个大小为16的table数组
        Node[] table = new Node[16];
        Node jack = new Node("jack", null);
        table[2] = jack;
        Node king = new Node("king", null);
        jack.next = king;
        Node wangfang = new Node("wangfang", null);
        king.next = wangfang;
        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println(table);
    }
}
class Node{
    String item;
    Node next;

    public Node(String item, Node next) {
        this.item = item;
        this.next = next;
    }
}
