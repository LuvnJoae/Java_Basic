package Linkedlist.Single;

public class isLoop {
    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public Object getData() {
            return data;
        }
        public void setData(Object data) {
            this.data = data;
        }
    }

    public boolean isLoop(Node head){
        Node slow = head.next;
        Node fast = head.next.next;

        if (slow == null || fast == null){
            return false;
        }
        while (slow != null){
//            if (fast.next == null){
//                return false;
//            }

            if (slow.data == fast.data){
                return true;
            }

            slow = slow.next;
            fast = fast.next;

            if (fast == null){
                return false;
            }
        }
        return false;

    }
}
