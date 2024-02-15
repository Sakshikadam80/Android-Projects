package com.example.splashscreenformajorproject;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity6 extends AppCompatActivity {
    RecyclerView recyclerView;
    List<sample4> sampleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main6 );

        recyclerView = findViewById(R.id.rv);
        initData();
        setRecyclerView();
    }
    private void setRecyclerView() {

        questionAdapter4 questionAdapter = new questionAdapter4(sampleList);
        recyclerView.setAdapter(questionAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        sampleList = new ArrayList<>();

        sampleList.add(new sample4("1.\tWhat is Software Engineering?","Software Engineering is a systematic approach to designing, developing, testing, and maintaining software systems to ensure their quality, reliability, and efficiency.\n"));

        sampleList.add(new sample4("2.\tExplain the Software Development Life Cycle (SDLC).","SDLC is a process used by software developers to design, develop, test, and deploy software. It typically includes stages like planning, analysis, design, implementation, testing, deployment, and maintenance.\n"));

        sampleList.add(new sample4("3.\tWhat is the difference between waterfall and agile methodologies?","Waterfall is a linear, sequential approach to software development, while Agile is an iterative and flexible approach that emphasizes collaboration and adaptability.\n"));

        sampleList.add(new sample4("4.\tDefine the term \"refactoring.\"","Refactoring is the process of restructuring existing computer code without changing its external behaviour. The goal is to improve code readability, maintainability, and efficiency.\n"));

        sampleList.add(new sample4("5.\tWhat is the difference between black-box and white-box testing?","Black-box testing focuses on the functionality of a software system without knowledge of its internal code, while white-box testing examines the internal logic and structure of the code.\n"));

        sampleList.add(new sample4("6.\tWhat is the role of SRS in software development?","It involves gathering, documenting, and managing the functional and non-functional requirements of a software system to ensure that it meets the needs of its users. \n"));

        sampleList.add(new sample4("7.\tWhat is Unit Testing?","Unit Testing is the process of testing individual units or components of a software independently to ensure they perform as intended.\n"));

        sampleList.add(new sample4("8.\tExplain Integration Testing.","Integration Testing involves testing the interactions between different units or modules to ensure they work together as expected.\n"));

        sampleList.add(new sample4("9.\tDefine System Testing.","System Testing is the testing of the entire software system as a whole to verify that it meets the specified requirements.\n"));

        sampleList.add(new sample4("10.\tWhat is Acceptance Testing?","Acceptance Testing is the final phase of testing where the software is tested for its acceptability by the end-users, ensuring it meets their expectations.\n"));

        sampleList.add(new sample4("11.\tExplain the concept of continuous integration.","Continuous Integration is a development practice where code changes are automatically built, tested, and integrated into a shared repository multiple times a day to detect and address integration issues early.\n"));

        sampleList.add(new sample4("12.\tWhat is Agile Software Development?","Agile is an iterative and incremental approach to software development that emphasizes flexibility, collaboration, and customer feedback throughout the development process.\n"));

        sampleList.add(new sample4("13.\tWhat are User Stories in Agile?","User Stories are short, simple descriptions of a feature or functionality from an end-user perspective, used in Agile development to capture and prioritize requirements.\n"));

        sampleList.add(new sample4("14.\tWhat is a Sprint in Agile?","A Sprint is a time-boxed iteration in Agile development, usually lasting two to four weeks, during which a potentially shippable product increment is created.\n"));

        sampleList.add(new sample4("15.\tWhat are different types of framework in Agile?","-Scrum: Time-boxed sprints with defined roles and ceremonies.\n" +
                "-Kanban: Visualized workflow with a focus on continuous delivery.\n" +
                "-Extreme Programming (XP): Technical excellence, customer satisfaction, and iterative development.\n" +
                "-Crystal: Tailored Agile methodologies based on project characteristics.\n"));

        sampleList.add(new sample4("16.\tWhat is a computer network?","A computer network is a set of interconnected computers that communicate with each other for the purpose of sharing resources and information.\n"));

        sampleList.add(new sample4("17.\tExplain the OSI model.","The OSI (Open Systems Interconnection) model is a conceptual framework that standardizes the functions of a telecommunication or computing system into seven abstraction layers.\n"));

        sampleList.add(new sample4("18.\tWhat are the 7 layers of the OSI model?","-Physical Layer: Deals with the physical connection and raw data transmission.\n" +
                "-Data Link Layer: Manages direct link communication, addressing, and error detection.\n" +
                "-Network Layer: Handles logical addressing and routing across networks.\n" +
                "-Transport Layer: Ensures reliable end-to-end communication and data flow control.\n" +
                "-Session Layer: Manages communication sessions between applications.\n" +
                "-Presentation Layer: Translates data formats and handles encryption/compression.\n" +
                "-Application Layer: Provides network services directly to end-user applications.\n"));

        sampleList.add(new sample4("19.What is TCP? & Explain its 4 layer.","- TCP, which stands for Transmission Control Protocol, is one of the main protocols in the Internet Protocol (IP) suite. It operates at the transport layer (Layer 4) of the OSI model. \n" +
                "-Link Layer: Deals with physical network connections.\n" +
                "-Internet Layer: Manages logical addressing and routing.\n" +
                "-Transport Layer: Ensures end-to-end communication reliability.\n" +
                "-Application Layer: Interfaces directly with user applications.\n"));

        sampleList.add(new sample4("20.\tWhat is IP addressing?","IP addressing is a numerical label assigned to each device participating in a computer network that uses the Internet Protocol for communication.\n"));

        sampleList.add(new sample4("21.\tExplain the difference between a hub, a switch, and a router.","A hub operates at the physical layer and simply broadcasts data to all connected devices. A switch operates at the data link layer and intelligently forwards data to the specific device. A router operates at the network layer and connects different networks.\n"));

        sampleList.add(new sample4("22.\tWhat is the purpose of ARP (Address Resolution Protocol)?","ARP is used to map a known IP address to a MAC address in a local network, facilitating communication between devices on the same network.\n"));

        sampleList.add(new sample4("23.\tExplain the concept of VLAN (Virtual Local Area Network).","VLAN is a network configuration that allows a network administrator to create logically segmented local networks within a physical network.\n"));

        sampleList.add(new sample4("24.\tExplain Different types of Network?","-LAN (Local Area Network): Small geographic area network.\n" +
                "-WAN (Wide Area Network): Large geographic area network.\n" +
                "-MAN (Metropolitan Area Network): Intermediate size network covering a city.\n" +
                "-PAN (Personal Area Network): Network for personal devices in close proximity.\n"));

        sampleList.add(new sample4("25.\tWhat is an Operating System?","An operating system is system software that manages computer hardware, software resources, and provides common services for computer programs.\n"));

        sampleList.add(new sample4("26.\tExplain the difference between a process and a thread.","A process is an independent program, while a thread is a smaller unit of a process. Processes have their own memory space, while threads share the same memory space.\n"));

        sampleList.add(new sample4("27.\tWhat is a deadlock?","A deadlock is a situation in which two or more processes cannot proceed because each is waiting for the other to release a resource.\n"));

        sampleList.add(new sample4("28.\tWhat is a file system?","A file system is a method for storing and organizing computer files and the data they contain.\n"));

        sampleList.add(new sample4("29.\tWhat is CPU scheduling?",
                "CPU scheduling is the process by which the operating system decides the order in which processes are executed by the CPU.\n"));

        sampleList.add(new sample4("30.\tWhat is a semaphore?","A semaphore is a synchronization construct that is used to control access to a common resource in a concurrent system. \n"));

        sampleList.add(new sample4("31.\tWhat is paging and how does it work?","Paging is a memory management scheme that eliminates the need for contiguous allocation of physical memory. It allows the physical address space to be non-contiguous. \n"));

        sampleList.add(new sample4("32.\tWhat is computer architecture?","Computer architecture is the design and organization of a computer system, including its components and their interrelationships.\n"));

        sampleList.add(new sample4("33.\tWhat is pipelining in computer architecture?","Pipelining is a technique where multiple instructions are overlapped in execution to improve instruction throughput. \n"));

        sampleList.add(new sample4("34.\tExplain the concept of cache memory.","Cache memory is a small, high-speed type of volatile computer memory that provides high-speed data access to a processor and stores frequently used computer programs, applications, and data.\n"));

        sampleList.add(new sample4("35.\tWhat is the role of the ALU (Arithmetic Logic Unit) in a CPU?","The ALU is responsible for performing arithmetic and logical operations, including addition, subtraction, AND, OR, and other basic operations.\n"));

        sampleList.add(new sample4("36.\tWhat is the role of the control unit in a CPU?","The control unit manages the execution of instructions by coordinating the activities of the other units in the CPU.\n"));

        sampleList.add(new sample4("37.\tExplain the concept of parallel processing in computer architecture.","Parallel processing involves the simultaneous execution of multiple instructions or processes to improve computational speed and efficiency.\n"));

        sampleList.add(new sample4("38.\tWhat are the key factors affecting computer performance?","Computer performance is influenced by factors such as clock speed, instruction set architecture, memory hierarchy, and input/output systems.\n"));






    }
}