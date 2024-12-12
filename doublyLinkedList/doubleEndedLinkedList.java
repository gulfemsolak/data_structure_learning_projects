package doublyLinkedList;

public class doubleEndedLinkedList {
    Neighbor firstL;
    Neighbor lastL;
    
    public void insertToHead(String homeOwnerName,int houseNumber){
        Neighbor newLink=new Neighbor(homeOwnerName, houseNumber);
        if(isEmpty()){
            lastL=newLink;
        }
        else{
            firstL.prev=newLink;
        }
        newLink.next=firstL;
        firstL=newLink;
    }
    public void inserttoTail(String homeOwnerName,int houseNumber){
        Neighbor newLink=new Neighbor(homeOwnerName, houseNumber);
        if(isEmpty()){
            firstL=newLink;
        }
        else{
        lastL.next=newLink;
        newLink.prev=lastL;
        }
        lastL=newLink;
    } 
    public boolean insertAfterKey(String homeOwnerName,int houseNumber,int key){
        Neighbor newLink=new Neighbor(homeOwnerName, houseNumber);
        Neighbor currentN=firstL;

        while(houseNumber!=key){
            currentN=currentN.next;
            if(currentN==null){
                return false;
            }
        }
        if(currentN==lastL){
            newLink.next=null;
            lastL=newLink;
        }
        else{
            newLink.next=currentN.next;
            currentN.next.prev=newLink; 
        }
        newLink.prev=currentN;
        currentN.next=newLink;
        return true;
    }
    public void insertInOrder(String homeOwnerName,int houseNumber){
        Neighbor newLink=new Neighbor(homeOwnerName, houseNumber);
        Neighbor prevN=null;
        Neighbor currentN=firstL;
        while((currentN!=null) && (houseNumber>currentN.houseNumber)){
            prevN=currentN;
            currentN=currentN.next;
        }
        if(prevN==null){
            firstL=newLink;
        }
        else{
            prevN.next=newLink;
        }
        newLink.next=currentN;
    }
    
    public boolean isEmpty(){
        return(firstL==null);
    }
    public void display(){
        Neighbor theLink=firstL;
        while(theLink!=null){
            theLink.display();;
            System.out.println("Next Link:"+theLink.next);
            theLink=theLink.next;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        doubleEndedLinkedList linkedList=new doubleEndedLinkedList(); 
        linkedList.insertToHead("jack ", 7);
        linkedList.insertToHead("susan", 4);
        linkedList.inserttoTail("megan ", 9);
        linkedList.insertToHead("ashlyn", 6);
        
        linkedList.insertInOrder("melissa",5);
        linkedList.insertInOrder("jane",2);
        linkedList.insertInOrder("sean",8);

        linkedList.display();

        System.out.println("/n");

        NeighborIterator neighbors= new NeighborIterator(linkedList);
        neighbors.currentN.display();;
        neighbors.remove();
        neighbors.currentN.display();


    }
    
}
