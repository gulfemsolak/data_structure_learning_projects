package singleLinkedList;

public class LinkedList {
    public Link head;
    LinkedList(){
        head=null;
    }
    public boolean isEmpty(){
        return(head==null);
    }
    public void insertToHead(String bookName,int millionSold){
        Link newLink= new Link(bookName, millionSold);
        newLink.next=head;
        head=newLink;
    }
    public Link removeFromHead(){
        Link linkReference=head;
        if(!isEmpty()){
            head=head.next;
        }
        else{
            System.out.println("Empty list");
        }
        return linkReference;
    }
    public void display(){
        Link theLink=head;
        while(theLink!=null){
            theLink.display();
            System.out.println("Next Link:"+theLink.next);
            theLink=theLink.next;
        }
    }
    public Link find(String bookName){
        Link theLink=head;
        if(!isEmpty()){
            while(theLink.bookName!=bookName){
                if(theLink.next==null){
                    return null;
                }
                else{
                    theLink=theLink.next;
                }
            }
        }
        else{
            System.out.println("Empty list");
        }
        return theLink;
    }
    public Link removeLink(String bookName){
        Link currentL=head;
        Link prevL=head;
        while(currentL.bookName!=bookName){
            if(currentL.next==null){
                return null;
            }
            else{
                prevL=currentL;
                currentL=currentL.next;
            }
        }
        if(currentL==head){
            head=head.next;
        }
        else{
            prevL.next=currentL.next;
        }
        return currentL;
        
    }

}
