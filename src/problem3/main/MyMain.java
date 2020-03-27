package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
class Main {
    public static void main(String[] args) {
        MyPriorityQueue m = new MyPriorityQueue();
        m.insert(30, 3);
        m.insert(40, 4);
        m.insert(10, 1);
        m.insert(20, 2);
        m.display();
    }
}