package outras.arvoreGenerica;
public class GenericTree {  
  
    Node firstFather;  
    Node firstSon;  
  
    public GenericTree() {  
          
        firstFather = new Node();  
        firstFather.addFather(10);  
        firstFather.addFather(20);  
        firstFather.addFather(50);  
        firstFather.addFather(51);  
        firstFather.addFather(55); 
        Node aux = firstFather.nextFather;  
        aux.addSon(1);  
        aux.addSon(2);  
        aux.addSon(3);  
        System.out.println(aux.value);  
    }  
    public boolean searchValue(int value){  
          
        Node aux=firstFather;//recebe a raiz  
        while(aux != null){  
            if(value == aux.value){  
                aux=aux.nextFather;  
             return true;  
            }  
            aux=aux.nextFather;  
          
        }  
        return false;  
    }  
    
     public static void main(String[] args) {  
        GenericTree genericTree =new GenericTree();  
         System.out.println( ""+genericTree.searchValue(60));  
  
     }  
  
}  