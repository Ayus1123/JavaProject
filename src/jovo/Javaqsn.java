package jovo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


public class Javaqsn {

 
    public static void exceptionExample() {
       

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

       
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

       
        try {
            checkFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
    }

    static void checkFile() throws java.io.IOException {
        throw new java.io.IOException("File not found! (checked exception)");
    }

    
    public static void exceptionTypes() {
        
        
        try {
            int a = 5 / 0; // ArithmeticException
        } catch (Exception e) {
            System.out.println("Unchecked Exception: " + e.getClass());
        }
    }
    public static void listIterationExample() {

        List<String> names = new ArrayList<>();
        names.add("Vinod");
        names.add("Yash");
        names.add("Ravi");

        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

       
        ListIterator<String> litr = names.listIterator();
        while (litr.hasNext()) {
            System.out.println("Forward: " + litr.next());
        }
        while (litr.hasPrevious()) {
            System.out.println("Backward: " + litr.previous());
        }
    }

    
    public static void collectionVsCollections() {
        System.out.println("\n4️⃣ Collection vs Collections:");

       
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);

 
        Collections.sort(list);
        System.out.println(list);
    }

    
    public static void arrayVsCollection() {
       
        int[] arr = {1, 2, 3};

        // Collection
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(1));
    }

    
    public static void listSetMapExample() {
       

        List<String> list = Arrays.asList("A", "B", "A");
        
        Set<String> set = new HashSet<>(list);
       

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "C++"); // key duplicate replaced
        System.out.println(map);
    }

    
    public static void wrapperExample() {
        System.out.println("\n7️⃣ Wrapper Class Example:");

        int a = 10;
        Integer obj = Integer.valueOf(a); 
        int b = obj;                      
        System.out.println(a+""+b+""+obj);
    }

   
    public static void polymorphismExample() {
        System.out.println("\n8️⃣ Polymorphism Example:");

     
        add(5, 10);
        add(5, 10, 15);

       
        Animal a = new Dog();
        a.sound();
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

    static class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }

  
    public static void encapsulationExample() {

        Student s = new Student();
        s.setName("Vinod");
        s.setAge(22);
        System.out.println(s.getName() + ", Age: " + s.getAge());
    }

    static class Student {
        private String name;
        private int age;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    
    public static void thisSuperExample() {
        
        Child c = new Child();
        c.display();
    }

    static class Parent {
        int num = 10;
        Parent() {
            System.out.println("Parent constructor called");
        }
    }

    static class Child extends Parent {
        int num = 20;
        Child() {
            super();
            System.out.println("Child constructor called");
        }

        void display() {
            System.out.println(super.num);
            System.out.println(this.num);
        }
    }

   
    public static void main(String[] args) {
        exceptionExample();
        exceptionTypes();
        listIterationExample();
        collectionVsCollections();
        arrayVsCollection();
        listSetMapExample();
        wrapperExample();
        polymorphismExample();
        encapsulationExample();
        thisSuperExample();
    }
}

