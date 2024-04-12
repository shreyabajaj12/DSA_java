//package shreya.java;
//
//import java.util.LinkedList;
//
//public class lec86_implementation_MyHashMap {
//    static class MyHashMap<K,V>{
//        public static final int DEFAULT_CAPACITY=4;
//        public static final float DEFAULT_LOAD_FACTOR=.75f;
//        private class Node{
//        K key;
//        V value;
//        Node(K key,V value){
//        this.key = key;
//        this.value =value;
//        }
//        private int n;  //the number of entries in map
//            private LinkedList<Node>[]buckets;
//            private void iniBuckets(int N){  //N- capacity/size of buckets array
//                buckets =  new LinkedList[N];
//                for(int i=0;i< buckets.length;i++){
//                    buckets[i]=new LinkedList<>();
//
//
//                }
//            }
//            public  MyHashMap(){
//               iniBuckets(DEFAULT_CAPACITY);
//            }
//        public int size(){  //no of entries in map
//
//        }
//        private int HashFun(K key){
//                int hc = key.hashCode();
//                return (Math.abs(hc))% buckets.length;
//        }
//        public void put(K key , V value){
//                int bi = HashFun()
//
//        }
//        public void get(K key){
//
//        }
//        public V remove(K key){
//
//        }
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//
//    }
//}
