package DSA.MODULE_2.Week7_LinkedList;

class TestLNode {
    public static void main(String args[]){
        LNode<Object> node = new LNode<>();
        node.addAtFirst(12);
        node.addAtFirst(45);
        node.addAtPosition(23, 1);
        node.addAtFirst(7);
        node.addAtFirst(5);
        node.deleteAtPosition(2);
        node.addAtLast(9);
        node.addInMiddle(21);
        System.out.println(node.traverse());
        node.addInMiddle(22);
        System.out.println(node.traverse());
        node.deleteValue(21);
        System.out.println(node.traverse());
        System.out.println(node.indexOf(22));
        node.deleteInMiddle();
        System.out.println(node.traverse());
    }
}