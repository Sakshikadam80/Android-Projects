package com.example.splashscreenformajorproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    RecyclerView recyclerView;
    List<sample1> sampleList;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3 );

        recyclerView = findViewById(R.id.rv );

        initData();
        setRecyclerView();
    }
    private void setRecyclerView() {

        questionAdapter1 questionAdapter = new questionAdapter1(sampleList);
        recyclerView.setAdapter(questionAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        sampleList = new ArrayList<>();

        sampleList.add(new sample1("1.\tWhat is OOP?","OOP is a programming paradigm that uses objects and classes in programming. It focuses on the concept of objects, encapsulation, inheritance, polymorphism, abstraction to design applications.\n"));

        sampleList.add(new sample1("2.\tWhat are the 4 pillars of OOP?","- \tEncapsulation: Binding data and methods that manipulate the data in a single unit.\n" +
                "- \tInheritance: Ability of a class to inherit properties and behavior from another class.\n"+
                "- \tPolymorphism: Objects/classes can take multiple forms and have different behaviors while sharing the same interface.\n" +
                "- \tAbstraction: Hiding the complex implementation details and showing only necessary features of an object.\n"));

        sampleList.add(new sample1("3.\tWhat is a Class?","A class is a blueprint or template of objects having common properties and methods.\n" ));

        sampleList.add(new sample1("4.\tWhat is Object?","An object is an instance of a class. It represents a real-world entity and can have both data (attributes) and methods (functions)\n" ));

        sampleList.add(new sample1("5.\tWhat are access modifiers in OOP?","Access modifiers control the accessibility of classes, methods, and variables in OOP languages. \n" +
                "- Public: Accessible from anywhere.\n" +
                "- Private: Accessible only within the same class.\n" +
                "- Protected: Accessible within the same class and its subclasses.\n" +
                "- Default: Accessible within the same package.\n"));

        sampleList.add(new sample1("6.\tWhat is the difference between method overloading and method overriding?","- Method Overloading: It involves having multiple methods in the same class with the same name but different parameters.\n" +
                "- Method Overriding: It occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.\n"
        ));

        sampleList.add(new sample1("7.\tWhat is Compile-Time Polymorphism?","Compile time polymorphism, also known as static polymorphism or early binding is the type of polymorphism where the binding of the call to its code is done at the compile time. Method overloading or operator overloading are examples of compile-time polymorphism.\n"));

        sampleList.add(new sample1("8.\tWhat is Runtime Polymorphism","Also known as dynamic polymorphism or late binding, runtime polymorphism is the type of polymorphism where the actual implementation of the function is determined during the runtime or execution. Method overriding is an example of this method.\n"));

        sampleList.add(new sample1("9.\tWhat are different types of inheritances?","- Single Inheritance: Child class derived directly from the base class\n" +
                "- Multiple Inheritance: Child class derived from multiple base classes.\n" +
                "- Multilevel Inheritance: Child class derived from the class which is also derived from another base class.\n" +
                "- Hierarchical Inheritance: Multiple child classes derived from a single base class.\n"+
                "- Hybrid Inheritance: Inheritance consisting of multiple inheritance types of the above specified."));

        sampleList.add(new sample1("10.\t What is the difference between an abstract class and an interface?","- Abstract Class: Can have abstract and non-abstract methods. It can contain method implementations. A class can extend only one abstract class.\n" +
                "- Interface: Contains only abstract methods by default, and all methods are public. A class can implement multiple interfaces.\n"));

        sampleList.add(new sample1("11.\t What is a constructor?\n","A constructor is a special method used to initialize objects of a class. It has the same name as the class (C++/Java) for python named as __init__, and does not have a return type. It is called automatically when an object is created.\n"));

        sampleList.add(new sample1("12.\tWhat is a destructor? Does Java have destructors?","-\tA destructor is a special method that is called automatically when an object is destroyed or goes out of scope. In Java, there is no explicit destructor like in languages such as C++, python. Instead, Java has automatic garbage collection, where unused objects are automatically deallocated by the JVM. \n" ));


        sampleList.add(new sample1("13.\tWhat is the purpose of the 'super' keyword in Java?","The 'super' keyword in Java is used to refer to the superclass, allowing access to its members (methods, constructors, and variables). It is used to invoke superclass constructors or methods and to differentiate between superclass and subclass members with the same name.\n"));

        sampleList.add(new sample1("14.\tWhat is the purpose of scope resolution (: :) operator?","It is used for inheritance to specify which class's member or method we want to access in cases of ambiguity, especially when a subclass inherits from multiple parent classes having the same named members or methods.\n"));

        sampleList.add(new sample1("15.\tWhat is pure virtual function?","A pure virtual function is a method declared without implementation in an abstract class, defining an interface that must be implemented by its subclasses.\n"));

        sampleList.add(new sample1("16.\t What is Diamond problem in OOPs, how does C++ and Java handle it?","The diamond problem in object-oriented programming occurs in languages like C++ that allow multiple inheritance, particularly when a class inherits from two classes, each of which inherits from a common base class. This creates ambiguity when the derived class tries to access members that are inherited from both paths.\n"));

        sampleList.add(new sample1("17.\tC++ Handling of Diamond Problem","In C++, the diamond problem is resolved by using virtual inheritance. When a class is virtually inherited, it ensures that only one instance of the base class exists, even if multiple paths lead to it. This resolves ambiguity and avoids redundant instances of the base class.\n" ));

        sampleList.add(new sample1("18.\tJava Handling of Diamond Problem","Java doesn't have the diamond problem because it doesn't support multiple inheritance of classes. However, it allows multiple inheritance of interfaces. In Java, a class can implement multiple interfaces, but it can only extend one class, preventing the occurrence of the diamond problem.\n"));

    }
}
