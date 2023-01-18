package HEAPS_PRIORITYQUEUE;

import java.util.PriorityQueue;

public class priorityQueue {

    static class Student implements Comparable<Student>{
        String name;
        int rank;
        
        public Student(String name,int rank){
            this.name = name; 
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSquare;
        int idx;

        public Point(int x,int y,int distSquare,int idx){
            this.x = x;
            this.y = y;
            this.distSquare = distSquare;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSquare - p2.distSquare;
        }
    }

    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int distsq = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            pq.add(new Point(points[i][0], points[i][1], distsq,i));
        }

        //nearest k cars
        for(int i=0;i<k;i++){
            System.out.println("C" + pq.remove().idx);
        }
    }     
}
