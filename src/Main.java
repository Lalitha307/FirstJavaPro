//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//***************************STack*********************
//public class Main {
//    public static void main(String[] args) {
//        Stack<Integer> s1 = new Stack<>();
//
//        s1.push(1);
//        s1.push(2);
//        s1.push(3);
//        s1.push(4);
//        s1.push(5);
//        s1.push(6);
//        s1.push(7);
//        s1.push(8);
//        s1.push(9);
//        s1.push(10);
//
//        s1.peek(); // Top of the stack
//
//        s1.pop(); // Remove top element
//        s1.pop(); // Remove top element again
//
//        // After popping 2 times, show the top value
//        s1.peek();
//    }
//}

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList of Integer type
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.print("Integer List: ");
        intList.display();
        intList.remove(20);
        System.out.print("After Removing 20: ");
        intList.display();

        // Create a LinkedList of String type
        LinkedList<String> strList = new LinkedList<>();
        strList.add("Hello");
        strList.add("World");
        System.out.print("String List: ");
        strList.display();
        strList.remove("Hello");
        System.out.print("After Removing 'Hello': ");
        strList.display();
    }
}
