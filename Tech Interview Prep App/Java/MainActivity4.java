package com.example.splashscreenformajorproject;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity4 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<sample2> sampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main4 );

        recyclerView = findViewById(R.id.rv);

        initData();
        setRecyclerView();

    }

    private void setRecyclerView() {

        questionAdapter2 questionAdapter = new questionAdapter2(sampleList);
        recyclerView.setAdapter(questionAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        sampleList = new ArrayList<>();

        sampleList.add(new sample2("1.\tWhat is data?","- Raw information in numbers,text,images.\n" +
                "- Foundation for knowledge.\n" +
                "- Collected through observations or measurements.\n"));

        sampleList.add(new sample2("2.\tWhat is the difference between data & information?","- Data: Raw facts and figures\n" +
                "- Information: Processed, organized data with context and meaning\n"));

        sampleList.add(new sample2("3.\tWhat is a Database?","- Organized, consistent, and logical data collection.\n" +
                "- Contains sets of tables with records and fields.\n" +
                "- Tuple or row represents single entry.\n" +
                "- Attribute or column represent basic units of data storage.\n"));

        sampleList.add(new sample2("4.\tWhat is DBMS?","- Provides tool for performing operations like inserting, deleting, updating in databases.\n" +
                "- Enables more compact and secure data storage than file-based systems.\n" +
                "- Popular systems include XML and Windows Registry.\n"));

        sampleList.add(new sample2("5.\tExplain RDBMS with examples. How it is different from DBMS?","- Stands for Relational Database Management System.\n" +
                "- Stores data in tables, not files.\n" +
                "- Easier to locate specific values.\n" +
                "- Popular RDBMS systems include MySQL and Oracle DB\n"));

        sampleList.add(new sample2("6.\tExplain a few advantages of a DBMS.","- Data Sharing: Enables simultaneous data sharing by multiple users, allowing quick response to changes.\n" +
                "- Integrity Constraints: Allows organized and refined data storage.\n" +
                "- Redundancy Control: Eliminates redundancy by integrating all data in a single database.\n" +
                "- Data Security: Provides tools for reliable and secure data storage and transfer, including authentication and encryption.\n" +
                "\n"));

        sampleList.add(new sample2("7.\tWhat is SQL?","SQL, or Structured Query Language, is a domain-specific language designed for managing and manipulating relational database management systems (RDBMS). It facilitates tasks such as querying data, updating records, and defining database structures."));

        sampleList.add(new sample2("8.\tExplain different languages present in DBMS.","- DDL: Defines database commands like CREATE, ALTER, DROP, TRUNCATE, RENAME.\n" +
                "- DML: Manipulates database data with commands like SELECT, UPDATE, INSERT, DELETE.\n" +
                "- DCL: Deals with user permissions and controls of the database system.\n" +
                "- TCL: Handles database transactions with commands like COMMIT, ROLLBACK, and SAVEPOINT\n"));

        sampleList.add(new sample2("9.\tWhat are different DDL commands?","- Create: CREATE TABLE table_name (col_1 datatype, col_2 datatype,..);\n" +
                "- Alter: ALTER table table_name ADD (col_1, datatype);\n" +
                "- Drop: DROP table table_name;\n" +
                "- Truncate: TRUNCATE table table_name;\n" +
                "- Rename: RENAME table old_table_name to new_table_name;\n"));

        sampleList.add(new sample2("10.\tWhat are different DML commands?","- Select: SELECT *FROM table_name;\n" +
                "- Insert: INSERT INTO table_name VALUES (value1, value2, ...);\n" +
                "- Update: UPDATE table_name SET column1 = value1, column2 = value2, WHERE condition;\n" +
                "- Delete: DELETE from table_name WHERE condition;\n"));

        sampleList.add(new sample2("11.\tWhat is the difference between DROP, DELETE & TRUNCATE statements?","-\tTRUNCATE: Deletes all rows from a table, freeing the table's space.\n" +
                "- DELETE: Deletes rows based on a condition in the where clause or all rows if no condition is specified.\n" +
                "- DROP: Deletes all associated tables, including relationships, integrity checks, constraints, access privileges, and grants.\n"));

        sampleList.add(new sample2("12.\tDescribe types of keys?","-\tPrimary Key: The primary key defines a set of attributes that are used to uniquely identify every tuple. \n" +
                "-\tForeign Key:  The foreign key defines an attribute that can only take the values present in one table common to the attribute present in another table. \n" +
                "-\tCandidate Key: The candidate key represents a set of properties that can uniquely identify a table. Each table may have multiple candidate keys. One key amongst all candidate keys can be chosen as a primary key\n" +
                "-\tSuper Key: The super key defines a set of attributes that can uniquely identify a tuple. Candidate key and primary key are subsets of the super key, in other words, the super key is their superset.\n"));


        sampleList.add(new sample2("13.\tWhat are joins in SQL?","- Combines records from multiple tables based on common field.\n" +
                "- Uses join condition and SELECT statement for table joining.\n" +
                "- Allows data retrieval from tables with many-to-many or one-to-many relationships.\n" +
                "\n"));

        sampleList.add(new sample2("14.\tWhat are different types of joins?","- Inner Join: Returns datasets with identical values in both tables.\n" +
                "- Full Join: Combines all rows from left and right tables to create a result set.\n" +
                "- Right Join: Returns all records from right table and any matching records from left table.\n" +
                "- Left Join: Returns all records from left table and any matching records from right table\n"));

        sampleList.add(new sample2("15.\tExplain different levels of data abstraction in a DBMS.","The process of hiding irrelevant details from users is known as data abstraction.\n" +
                "- Physical Level: Managed by DBMS, consists of data storage descriptions. Details are typically hidden from system admins, developers, and users.\n" +
                "- Conceptual or Logical Level: Defines data storage and data point relationships.\n" +
                "- External or View Level: Only describes part of the database, hiding table schema details from users.\n"));

        sampleList.add(new sample2("16.\tWhat is meant by ACID properties in DBMS?","- Atomicity: Enables execution of whole queries or nothing at all.\n" +
                "- Consistency: Ensures data consistency before and after transactions.\n" +
                "- Isolation: Ensures each transaction occurs independently, preventing state affecting others.\n" +
                "- Durability: Ensures data remains intact during system failures or restarts, preserving its original state.\n"));

        sampleList.add(new sample2("17.\tWhat is the E-R model?","- Based on real-world entities.\n" +
                "- Includes necessary objects and relationships.\n" +
                "- Primary objects: entity, attribute, relationship set.\n" +
                "- Attributes can be mapped in E-R diagram\n"));

        sampleList.add(new sample2("18.\tExplain different types of relationships amongst tables","Relationship Types in Tables\n" +
                "- One to One: Relationship between a row in X and a singular row in Y.\n" +
                "- One to Many: Relationship between a single row in X and many rows in Y.\n" +
                "- Many to Many: Relationship between multiple rows in X and Y.\n"));

        sampleList.add(new sample2("19.\tWhat is normalization?","- Normalization is a process of analyzing relation schemas based on their functional dependencies to minimize redundancy.\n" +
                "- It is essential to avoid data redundancy, insertion, update, and deletion anomalies.\n"));

        sampleList.add(new sample2("20.\tExplain types of Normalization","- First Normal Form (1NF): Aims to ensure every column has atomic value, remove duplicate columns, and create separate tables for related data.\n" +
                "  -  Second Normal Form (2NF): A table is considered 2NF if it follows 1NF rules and every non-prime attribute is functionally dependent on the primary key.\n" +
                "  -  Third Normal Form (3NF): A database is 3NF if it is in second normal form and has no transitive functional dependency.\n" +
                "  -  Boyce & Codd Normal Form (BCNF): A table complies with BCNF if it is in 3NF and the super key of the table for every functional dependency X->Y\n"));

        sampleList.add(new sample2("What are some common clauses used with SELECT query in SQL?","Some common SQL clauses used in conjuction with a SELECT query are as follows:\n" +
                "- WHERE clause in SQL is used to filter records that are necessary, based on specific conditions.\n" +
                "- ORDER BY clause in SQL is used to sort the records based on some field(s) in ascending (ASC) or descending order (DESC).\n" +
                "- GROUP BY clause in SQL is used to group records with identical data and can be used in conjunction with some aggregation functions to produce summarized results from the database.\n" +
                "- HAVING clause in SQL is used to filter records in combination with the GROUP BY clause. It is different from WHERE, since the WHERE clause cannot filter aggregated records.\n"));

        sampleList.add(new sample2("22.\tHow to find the values in a text column of a table that start with a certain letter?","Using the LIKE operator in combination with the % and _ wildcards. For example, we need to find all surnames in a table that start with \"A\". The query is:\n" +
                "SELECT * FROM table_name\n" +
                "WHERE surname LIKE 'A_';\n"));

        sampleList.add(new sample2("23.\tHow to find nth highest value in a column of a table?","Using the OFFSET clause. For example, to find the 6th highest value from a column, we would use the following syntax:\n" +
                "SELECT * FROM table_name\n" +
                "ORDER BY column_name DESC\n" +
                "LIMIT 1\n" +
                "OFFSET 5;\n" +
                "\n"));

        sampleList.add(new sample2("24.\tWhat are Aggregate Functions?","Following are the widely used SQL aggregate functions:\n" +
                "- AVG() - Calculates the mean of a collection of values.\n" +
                "- COUNT() - Counts the total number of records in a specific table or view.\n" +
                "- MIN() - Calculates the minimum of a collection of values.\n" +
                "- MAX() - Calculates the maximum of a collection of values.\n" +
                "- SUM() - Calculates the sum of a collection of values.\n" +
                "- FIRST() - Fetches the first element in a collection of values.\n" +
                "- LAST() - Fetches the last element in a collection of values.\n" +
                "\n"));

        sampleList.add(new sample2("25.\tWhat is an SQL trigger?","- Automatically executes instructions in response to specific table events.\n" +
                "- Includes actions like record inserting, updating, deletion.\n" +
                "- Enforces business rules and maintains data integrity.\n" +
                "\n"));

        sampleList.add(new sample2("26.\tExplain the concept of an SQL cursor.","- Database object for iterative processing of result sets.\n" +
                "- Enables navigation through query-returned rows.\n" +
                "- Useful for operations requiring row-level processing\n"));

        sampleList.add(new sample2("27.\tExplain the concept of indexing in databases.","- Enhances query performance.\n" +
                "- Creates faster record retrieval.\n" +
                "- Functions like an index in a book.\n" +
                "- Provides quick reference to specific data location\n"));

        sampleList.add(new sample2("28.\tExplain the concept of a subquery in SQL.","A subquery is a query embedded within another query. It can be used to retrieve data that will be used by the main query for further processing. \n" +
                "Subqueries can appear in various parts of a SQL statement, such as the SELECT clause, FROM clause, or WHERE clause.\n"));

        sampleList.add(new sample2("29.\tHow does the concept of database sharding contribute to scalability in a distributed database system?",
                "- Distributes workload across servers.\n" +
                        "- Enhances performance.\n" +
                        "- Each shard is self-contained with unique schema.\n" +
                        "- Reduces resource contention and allows parallel process\n"));

        sampleList.add(new sample2("30.\tWhat is Relational Algebra?","Relational Algebra is a Procedural Query Language which contains a set of operations that take one or two relations as input and produce a new relationship. Relational algebra is the basic set of operations for the relational model"));

        sampleList.add(new sample2("31.\t What is Relational Calculus?","Relational Calculus is a Non-procedural Query Language which uses mathematical predicate calculus instead of algebra. It is also known as predicate calculus.\n" +
                "There are two type of relational calculus:\n" +
                "-\tTuple relational calculus\n" +
                "-\tDomain relational calculus\n"));

        sampleList.add(new sample2("32.\tWhat do you understand by query optimization?","- Efficient execution plan for evaluating queries with least estimated cost.\n" +
                "- Originated from the need to determine the most efficient method for a task.\n" +
                "- Process involves determining the most efficient way to perform a query.\n"));

        sampleList.add(new sample2("33.\tWhat is functional Dependency?","- Also known as database dependency.\n" +
                "- Exists when relation between two attributes allows unique attribute value determination.\n" +
                "- Defined as A->B, indicating B's functional dependency on A.\n" +
                "\n"));

        sampleList.add(new sample2("34.\tExplain the concept of recursive queries in SQL.","- Allows query to refer to output.\n" +
                "- Creates recursive loop.\n" +
                "- Represents hierarchical relationships in data.\n"));

        sampleList.add(new sample2("35.\tWhat are materialized views, and how do they differ from regular views?","- Physical storage structures for query results.\n" +
                "- Improve query performance by precomputing and storing aggregated/complex data.\n" +
                "- Persist computed data until explicitly refreshed\n"));




    }
}
