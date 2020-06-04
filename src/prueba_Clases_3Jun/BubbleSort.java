package prueba_Clases_3Jun;

import prueba_Clases_3Jun.DoublyLinkedList.Node;
//probando logica de bubble sort
public class BubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
               
                DoublyLinkedList dList = new DoublyLinkedList();  
                dList.addNode(6);  
                dList.addNode(9);  
                dList.addNode(123);  
                dList.addNode(45);  
                dList.addNode(8);  
                dList.addNode(56);
                dList.addNode(12);
                dList.addNode(5);
                dList.display(); 
                dList.getLen();
                dList.searchNode(5);
                dList.searchNode(1);
                dList.searchNode(8);
                dList.searchNode(0);
                //dList.current = dList.bubbleSort(current);
                
                System.out.println(" ");
                
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  