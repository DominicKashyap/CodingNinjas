import java.util.ArrayList;

public class Map<K,V> {
   ArrayList<MapNode<K,V>> buckets;
    int size;
    int numBucket;

    public Map(){
        numBucket = 20;
        buckets = new ArrayList<>();
        for(int i=0 ;i<numBucket;i++){
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key){
        int hashCode = key.hashCode();
        return hashCode % 20;
    }


    public V deleteKey(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        MapNode<K,V> prev = null;

        while(head!=null){
            if(head.key.equals(key)){
                if(prev==null){
                    buckets.set(bucketIndex,null);
                }else {
                    prev.next = head.next;
                }
                return head.value;
            }

            prev = head;
            head = head.next;
        }

        return null;
    }
    public V getValue(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);

        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }

        return null;
    }

    public void insert(K key, V value){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);

        while (head!=null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }

        head = buckets.get(bucketIndex);
        MapNode<K,V> newElementNode = new MapNode<K,V>(key,value);
        newElementNode.next = head;
        buckets.set(bucketIndex,newElementNode);
    }


    public static void main(String[] args) {
        Map<String,Integer> haspMap = new Map<>();

        haspMap.insert("a",1);
        haspMap.insert("b",2);
        haspMap.insert("c",3);
        haspMap.insert("d",4);
        haspMap.insert("e",5);

        System.out.println(haspMap.getValue("a"));
        System.out.println(haspMap.getValue("b"));
        System.out.println(haspMap.getValue("c"));
        System.out.println(haspMap.getValue("d"));
        System.out.println(haspMap.getValue("e"));
    }
}
