import java.util.Scanner;

/*
    In this Program You will learn CRUD Operation in Array
*/
class ArrayBasics01{
    int arr[] ;
    int currentSize; // Used to indentify how many elements currently in the array
    // 1. Create Constructor for Initalize
    ArrayBasics01(int capacity){
        this.arr = new int[capacity];
        
        int currentSize = 0;
    }
    // 2. Create Insert Function
    void insert(int index, int value){
            //2.1 Adding Checks 
            if(index>currentSize){
                throw new RuntimeException("Position can't be greater than currentSize");
            }
            if(currentSize == arr.length){
                //throw new RuntimeException("Array Full");
                System.out.println("Array Full Can't Add ");
                return;
            }
            // From Current Size till i reach to the index(position) move the element to the next index
            for(int i = currentSize-1; i>=index; i--){
                arr[i+1] = arr[i];
            }
            arr[index] = value ; // Element Inserted
            currentSize++;
            System.out.println("Element Added...");
            print();

    }

    // 3. Print
    void print(){
        for(int element: arr){
            System.out.println("Element "+element);
        }
        
    }

    // 4. remove
    void remove(int index){
        if(currentSize==0){
            //throw new RuntimeException("Array is Empty !");
            System.out.println("Array is Empty Can't remove Further");
            return ;
        }
        for(int i = index; i<currentSize-1; i++){
            arr[i] = arr[i+1]; //Opposite of Array Insert Operation
        }
        arr[currentSize-1] = 0;
        currentSize--;
        System.out.println("Element Removed...");
        print();
    }

    // 5. Search in an Array (Linear Search)
    int search(int value){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]== value){
                System.out.println("Found "+value);
                return i;
            }
        }
        System.out.println("Not Found "+value);
        return -1;
    }

    // 6. Update Operation in Array
    void update(int valueToSearch , int valueToUpdate){
        int index = search(valueToSearch);
        if(index ==-1){
            return ;
        }
        else{
            arr[index] = valueToUpdate;
            System.out.println("Array Value Updated...");
            print();
        }
        
    }

    public static void main(String[] args) {
        ArrayBasics01 opr = new ArrayBasics01(5);
        Scanner scanner = new Scanner(System.in);
        int choice;
        int index;
        int value;
        while(true){
        System.out.println("Array Operations");
        System.out.println("1. Array Insert at Specific Position");
        System.out.println("2. Array Delete From Specific Position");
        System.out.println("3. Search in Array");
        System.out.println("4. Print the Array");
        System.out.println("5. Update the Array");
        System.out.println("6. Exit");  
        System.out.println("Enter the Choice");
        choice = scanner.nextInt();
        ArrayOperations enumChoice = ArrayOperations.values()[choice-1];
        switch(enumChoice){
            case INSERT:
                System.out.println("Enter the Index");
                index = scanner.nextInt();
                System.out.println("Enter the Value");
                value = scanner.nextInt();
                opr.insert(index, value);
                break;
            case DELETE:
                System.out.println("Enter the Index Where you want to Remove the Value");
                index = scanner.nextInt();
                opr.remove(index);
                break;
            case SEARCH:
                System.out.println("Enter the Value to Search");
                value = scanner.nextInt();
                opr.search(value);
                break;
            case UPDATE:
                System.out.println("Enter the Value to Search");
                value = scanner.nextInt();
                System.out.println("Enter the Value to Update");
                int value2 = scanner.nextInt();  
                opr.update(value, value2);
                break;         
            case PRINT:
                opr.print();
                break;
            case EXIT:
                return ;
             default:
                System.out.println("Wrong Choice...");   
        }

    }

    }
}


enum ArrayOperations{

    INSERT, DELETE, SEARCH, PRINT, UPDATE, EXIT;
    
}