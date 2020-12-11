package leaner;

import java.util.ArrayList;

public class HashMap<K,V> {
    ArrayList<MapNode<K,V>> list;
    int size;
    int bucketNumber;

    public HashMap(K key,V value){
        bucketNumber = 20;
        for(int i=0;i<20;i++){
            list.add(null);
        }
    }

    public int hashConverter(V value){
        int v = value.hashCode();
        return v%20;
    }
    public void insert(K key,V value){
        int bucketIndex = hashConverter(value);
        MapNode<K,V> head = list.get(bucketIndex);

        while(head!=null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
        }
        head = list.get(bucketIndex);
        MapNode<K,V> newNode = new MapNode(key,value);
        newNode.next = head;
        list.add(newNode);

    }
}
