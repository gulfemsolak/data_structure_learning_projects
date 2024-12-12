package doublyLinkedList;

public class NeighborIterator {
    Neighbor currentN;
    Neighbor prevN;
    doubleEndedLinkedList theNeighbors;

    NeighborIterator(doubleEndedLinkedList theNeighbors){
        this.theNeighbors=theNeighbors;
        currentN=theNeighbors.firstL;
        prevN=theNeighbors.lastL;
    }

    public void remove(){
        if(prevN==null){
            theNeighbors.firstL=currentN.next;
        }
        else{
            prevN.next=currentN.next;
            if(currentN.next==null){
                currentN=theNeighbors.firstL;
                prevN=null;
            }
            else{
                currentN=currentN.next;
            }
        }
    }

}
