package HASHING;
import java.util.LinkedList;
import java.util.ArrayList;
public class customHashMap {

    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        
        private int n; //n
        private int N;
        private LinkedList<Node>[] buckets; //N & an array of type linked list

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {//int i = 0; i < buckets.length; i++
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode(); //this hashcode function returns a hash code for any object/value
            return Math.abs(hc) % N; //since we want BI to be between 0 - size of the buckets
        }

        private int searchInLL(K key,int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void put(K key,V value){
            int bi = hashFunction(key); //bucket index
            int di = searchInLL(key,bi); //data index

            if(di!=-1){
                Node node = buckets[bi].get(di); //go inside that particular bucket in the particular di
                node.value = value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            //rehashing
            double lambda = (double)n/N;
            if(lambda>2.0){
                rehash();
            } 
        }

        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            //initialising new buckets with empty LL
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            //storing old date in new one
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public V remove(K key){
            return null; 
        }

        public V get(K key){
            int bi = hashFunction(key); //bucket index
            int di = searchInLL(key,bi); //data index

            if(di!=-1){
                Node node = buckets[bi].get(di); //go inside that particular bucket in the particular di
                return node.value;
            }else{
                return null;
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key); //bucket index
            int di = searchInLL(key,bi); //data index

            if(di!=-1){
                return true;
            }else{
                return false;
            }
        }

        public ArrayList<K> keySet(){
            return null;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("USA", 50);
        map.put("China", 180);
        map.put("Japan", 15);
        System.out.println(map.get("India"));
    }
}
