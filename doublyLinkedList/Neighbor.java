package doublyLinkedList;

public class Neighbor {
    public String homeOwnerName;
    public int houseNumber;
    public Neighbor next;
    public Neighbor prev;

    public Neighbor(String homeOwnerName,int houseNumber){
        this.homeOwnerName=homeOwnerName;
        this.houseNumber=houseNumber;
    }
    public void display(){
        System.out.println(homeOwnerName+":"+houseNumber+",Private Drive");
    }
    public String toString(){
        return homeOwnerName;
    }
}
