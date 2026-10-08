class LinkedList {
    private static class Node{
        Node next = null;
        int key;
        Node(int key){
            this.key = key;
            this.next = null;
        }
    }
    private Node head;
    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        Node temp = head;
        for(int i = 0; i < index; i++){
            if(temp == null){return -1;}
            temp = temp.next;
        }
        return temp == null? -1 : temp.key;
    }

    public void insertHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
    }

    public void insertTail(int val) {
        Node temp = head;
        if(head == null){
            head = new Node(val);
            return;
        }
        while(temp.next != null){
               temp = temp.next;
            }
            temp.next =new Node(val);
    }

    public boolean remove(int index) {
        if(head == null){return false;}
        else if(index == 0){
            head = head.next;
            return true;
        }
        Node prev = head;
        Node temp = head;
        for(int i = 0; i < index; i++){
            if(temp.next == null){return false;}
            if(i != 0){
                prev = prev.next;
            }
            temp = temp.next;
        }
        prev.next = temp.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> ar = new ArrayList<>();
        Node temp = head;
        
        while( temp != null){
            ar.add(temp.key);
            temp = temp.next;
        }
        return ar; 
    }
}
