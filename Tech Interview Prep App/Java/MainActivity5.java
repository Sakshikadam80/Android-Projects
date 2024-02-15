package com.example.splashscreenformajorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {
    RecyclerView recyclerView;
    List<sample3> sampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_main5 );
        recyclerView = findViewById(R.id.rv);
        initData();
        setRecyclerView();
    }
    private void setRecyclerView() {

        questionAdapter3 questionAdapter = new questionAdapter3(sampleList);
        recyclerView.setAdapter(questionAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        sampleList = new ArrayList<>();

        sampleList.add(new sample3("1.\tWhat do you mean by Data-Structure and Algorithms?","Data structure is a way of defining, storing & retrieving of data in a structural & systematic way. Algorithms are step by step procedures or formulas for solving problems.\n"));

        sampleList.add(new sample3("2.\tWhat are linear and non-linear data Structures?","- Linear: A data structure is said to be linear if its elements form a sequence. Examples: Array, Linked List, Stacks and Queues\n" +
                "- Non-Linear: A data structure is said to be non-linear if the traversal of nodes is nonlinear in nature. Examples: Trees, Graph.\n"));

        sampleList.add(new sample3("3.\tWhat are common operations that can be performed on a data-structure?","- Insertion − adding a data item\n" +
                "- Deletion: removing a data item.\n" +
                "- Traversal: accessing and/or printing all data items.\n" +
                "- Searching: finding a particular data item.\n" +
                "- Sorting: arranging data items in a pre-defined sequence.\n"
        ));

        sampleList.add(new sample3("4.\tWhat is Time Complexity","Time complexity is a type of computational complexity that describes the time required to execute an algorithm. The time complexity of an algorithm is the amount of time it takes for each statement to complete. As a result, it is highly dependent on the size of the process.\n"));

        sampleList.add(new sample3("5.\tWhat is Space Complexity","It refers to the amount of memory space required by an algorithm to solve a problem concerning the input size. It encompasses all memory usage, including variables, data structures, and additional space needed for computation. Essentially, it measures how the memory requirements of an algorithm or program grow as the input size increases.\n"));

        sampleList.add(new sample3("6.\tExplain Asymptotic Notations.","- Big Oh Notation: it represents the upper bound. It describes the worst-case time complexity of an algorithm.\n" +
                "- Omega Notation: it represents the lower bound, or the best-case scenario, for an algorithm’s running time. \n" +
                "- Theta Notation: it represents both upper and lower bounds running time of an algorithm. \n"));

        sampleList.add(new sample3("7.\tHow linear search algorithm works","A linear search is the simplest approach employed to search for an element in a data set. It examines each element until it finds a match, starting at the beginning of the data set, until the end. The search is finished and terminated once the target element is located.\n"));

        sampleList.add(new sample3("8.\tWhat is binary search algorithm?","Binary search is a highly efficient algorithm used to find a specific target value within a sorted array or list. The basic idea behind binary search is to repeatedly divide the search interval in half by comparing the target value with the middle element of the array and then deciding to continue the search on the left or right half based on the comparison.\n"));

        sampleList.add(new sample3("9.\tBubble Sort","- Compares adjacent elements and swaps them if they are in the wrong order.\n" +
                "- Repeatedly passes through the list until no more swaps are needed.\n" +
                "- Not efficient for large lists due to its time complexity (O(n^2)).\n"));

        sampleList.add(new sample3("10.\tSelection Sort","- Divides the input list into sorted and unsorted portions.\n" +
                "- Finds the smallest (or largest) element from the unsorted portion and swaps it with the first unsorted element.\n" +
                "- Continues this process until the entire list is sorted.\n" +
                "- Also inefficient for large lists with a time complexity of O(n^2)\n"));

        sampleList.add(new sample3("11.\tInsertion Sort","-\tBuilds the final sorted list one item at a time.\n" +
                "-\tIterates through the list, removing one element and inserting it into its correct position in the sorted portion of the list.\n" +
                "-\tEfficient for small datasets but can be slow for large lists (O(n^2)).\n"));

        sampleList.add(new sample3("12.\tMerge Sort","-\tEmploys a divide-and-conquer strategy.\n" +
                "-\tDivides the input list into smaller lists until each sublist contains only one element (trivially sorted). \n" +
                "-\tMerges these sub-lists in a sorted manner until a single sorted list is created.\n" +
                "-\tEfficient and stable, with a time complexity of O(n log n).\n"));


        sampleList.add(new sample3("13.\tQuick Sort","- \tUses a pivot element to partition the list into smaller elements on its left and larger elements on its right.\n" +
                "-\tRecursively sorts the sub-lists on the left and right of the pivot.\n" +
                "- \tEfficient on average with a time complexity of O(n log n), but worst-case scenario can degrade to O(n^2) if poorly implemented.\n"));

        sampleList.add(new sample3("14.\tHeap Sort","- \tUses a binary heap data structure to sort elements.\n" +
                "-\tBuilds a max heap and repeatedly extracts the maximum element from the heap, placing it at the end of the list.\n" +
                "-\tEfficient with a time complexity of O(n log n) and in-place sorting.\n"));

        sampleList.add(new sample3("15.\tRadix Sort","-\tSorts elements by processing individual digits or characters of the elements.\n" +
                "-\tCan be used for integers or strings by grouping elements based on digits or characters at different positions.\n" +
                "-\tEfficient for a specific range of input, achieving linear time complexity O(nk) where k is the number of digits or characters.\n"));

        sampleList.add(new sample3("16.\tWhat Is an Array? What type of operations performed on array","An array is a data structure in which data values are stored in contiguous locations in the memory. Every element is given an index, which is its position in the sequence of data values. The basic operations in the Arrays are insertion, deletion, searching, display, traverse, and update.\n"));

        sampleList.add(new sample3("17.\tWhat is a linked-list?","Linked List is the collection of randomly stored data objects called nodes. In Linked List, each node is linked to its adjacent node through a pointer. A node contains two fields, i.e. Data Field and Link Field.\n"));

        sampleList.add(new sample3("18.\tWrite the syntax in C to create a node in the singly linked list.","struct node   \n" +
                "{  \n" +
                " int data;   \n" +
                " struct node *next;  \n" +
                "};  \n" +
                "struct node *head, *ptr;   \n" +
                "ptr = (struct node *)malloc(sizeof(struct node));  \n"));

        sampleList.add(new sample3("19.\tWhat are operations that can perform on linked list","- Insertion:\n" +
                "-\tInsert at the Beginning: Add a new node at the start of the linked list.\n" +
                "-\tInsert at the End: Add a new node at the end of the linked list.\n" +
                "-\tInsert at a Specific Position: Insert a new node at a specified index or position within the linked list.\n"+
                "-Deletion:\n" +
                "-\tDelete from the Beginning: Remove the first node in the linked list.\n" +
                "-\tDelete from the End: Remove the last node in the linked list.\n" +
                "-\tDelete at a Specific Position: Remove a node from a specified index or position within the linked list.\n"
        ));

        sampleList.add(new sample3("20.\tWhat are the types of linked list?","- Singly Linked List: In a singly linked list, each node contains data and a reference/pointer to the next node in the sequence. The last node points to NULL, indicating the end of the list.\n" +
                "-Doubly Linked List: In a doubly linked list, each node contains data, a reference to the next node, and a reference to the previous node. This allows traversal both forward and backward through the list.\n" +
                "-Circular Linked List: A circular linked list is similar to a singly or doubly linked list, except that the last node's reference points back to the first node in a circular manner.\n"));

        sampleList.add(new sample3("21.\tWhat is stack? and What operations can be performed on stacks","-A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. It allows data to be added or removed only from one end, known as the top of the stack. Stacks are used commonly in recursive function calls, expression parsing, depth first traversal of graphs etc.\n" +
                "- push(): adds an item to stack\n" +
                "- pop(): removes the top stack item\n" +
                "- peek(): gives value of top item without removing it\n" +
                "- isempty(): checks if stack is empty\n" +
                "- isfull(): checks if stack is full\n"));

        sampleList.add(new sample3("22.\tWrite the stack overflow condition.","Overflow occurs when top = Maxsize -1 \n"));

        sampleList.add(new sample3("23.\tWhat is queue? and what operations can be performed on queue","-A queue can be defined as an ordered list which enables insert operations to be performed at one end called REAR and delete operations to be performed at another end called FRONT. (FIFO)\n" +
                "- Operations:\n" +
                "- enqueue(): adds an item to rear of the queue\n" +
                "- dequeue(): removes the item from front of the queue\n" +
                "- peek(): gives value of front item without removing it\n" +
                "- isempty(): checks if stack is empty\n" +
                "- isfull(): checks if stack is full\n"));

        sampleList.add(new sample3("24.\tWhat are Binary trees?","A binary tree is a kind of tree implementation in which each node can have, at most, two sub nodes or children. The two children are referred to as the left child and right child.\n"));

        sampleList.add(new sample3("25.\tWhat is Binary Search Tree","Each node in the tree has at most two children: a left child and a right child, where the left child contains a value smaller than its parent, and the right child contains a value greater than its parent. This ordering enables efficient searching, insertion, and deletion operations within the tree.\n"));

        sampleList.add(new sample3("26.\tDescribe the Different Kinds of Tree Traversals for a Binary Search Tree.","- In-order Traversal: Traverse the tree starting at the left subtree, then to the root of the tree and finishing off at the right subtree. \n" +
                "- Pre-order Traversal: Preorder traversal starts at the root, then moves to the left subtree &finally the right subtree.\n" +
                "- Post-order Traversal: This involves covering the tree starting from the left subtree and moving to the right subtree. You then move from the right subtree to the root to complete traversal.\n"));

        sampleList.add(new sample3("27.\tWhat is infix, prefix and postfix notations","- Infix notation: X + Y\n" +
                "- Prefix notation (also known as \"Polish notation\"): + X Y\n" +
                "- Postfix notation (also known as \"Reverse Polish notation\"): X Y +\n"));

        sampleList.add(new sample3("28.\tExplain Graph Data Structures.","A graph is a data structure in which a set of nodes is connected to some or all of the other nodes via edges. As a result, graphs are non-linear data structures.\n"));

        sampleList.add(new sample3("29.\tWhat is Breadth-First Search",
                "Breadth-First Search (BFS) is a vertex-based graph traversal using a Queue. It explores neighbouring vertices level by level, marking and enqueuing adjacent unvisited vertices before moving to the next level. BFS aims to find the shortest path and visits vertices in order of their distance from the source, making it ideal for unweighted graphs. It is slower than DFS.\n"));

        sampleList.add(new sample3("30.\tWhat is Depth First Search","Depth First Search (DFS) is an edge-based graph traversal using a Stack. It begins by visiting a vertex, pushes its adjacent unvisited vertices into the Stack, and continues exploring as deeply as possible. When no unvisited vertices remain, it backtracks by popping the last visited vertex from the Stack to explore other paths. \n"));

        sampleList.add(new sample3("31.\tWhat Is a Heap Data Structure?","A heap is a data structure that is based on trees. Heaps are constructed in such a way that they are complete binary trees, which means that all the levels are filled and every node is left-justified. \n"));

        sampleList.add(new sample3("32.\tWhat Is the Advantage of a Heap Over a Stack?","Heaps allocate memory dynamically, which is why they’re more flexible than stacks. You don’t need to initialize heaps with a particular memory size. With a heap, you can add elements on the go, and the heap will adapt to the new storage requirements. \n"));

        sampleList.add(new sample3("33.\tWhat Is a Hash Table?","A hash table is a data structure in which data is stored along with an index, which is where the element is stored in the memory. This makes hash tables a lot like arrays, except the data values are stored along with information on their location in the memory. \n"));

        sampleList.add(new sample3("34.\tWhat is hashing?","Hashing is a method that transforms a set of keys into a range of indexes within an    array. It involves utilizing hash tables to establish an associative data structure where data indices are determined by their respective key values, facilitating efficient storage and retrieval of information based on those keys.\n"));






    }
}
