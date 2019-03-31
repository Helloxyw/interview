package recursion;

import java.util.List;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/3/30
 * Time:21:19
 */
public class LinkedListCreator {

    /**
     * Creates a linked list
     * @param data
     * @return
     */
    public Node createLinkedList(List<Integer> data){
        if(data.isEmpty()){
            return null;
        }
        Node firstNode = new Node(data.get(0));
        Node headOfSublist = createLinkedList(data.subList(1,data.size()));
        firstNode.setNext(headOfSublist);
        return firstNode;
    }


    public static void main(String []args){

    }
}
