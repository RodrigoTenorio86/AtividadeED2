package outras.arvoreGenerica;
class Node {  
    int value;  
    public Node nextFather;  
    public Node nextSon;  
  
    Node(int value) {  
        this.value = value;  
    }  
  
    Node() {  
  
    }  
  
   public Node addFather(int value) {  
        Node nodeFather = new Node(value);  
        if (nextFather != null) {  
            nodeFather.nextFather = nextFather;  
        }  
        nextFather = nodeFather;  
        return nextFather;  
  
    }  
  
    public Node addSon(int value) {  
        Node nodeSon = new Node(value);  
        if (nextSon != null) {  
            nodeSon.nextSon = nextSon;  
        }  
        nextSon = nodeSon;  
        return nextSon;  
  
    }  
  
}  