package edu.sdsu.cs;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UnbalancedMap<K extends Comparable<K>, V> implements IMap<K, V>{

    K key;
    V value;
    MapNode root;
    Map<K, V> map = new TreeMap<>();

    public UnbalancedMap(){
    }

    public UnbalancedMap(IMap<K, V> data){
        for (K key : data.keyset()){
            map.put(key, data.getValue(key));
        }
    }

    private class MapNode implements Comparable<MapNode>{
        MapEntry contents;
        MapNode left;
        MapNode right;

        @Override
        public int compareTo(MapNode mapNode) {
            return contents.compareTo(mapNode.contents);
        }
    }

    private class MapEntry implements Comparable<MapEntry>{
        K key;
        V value;

        @Override
        public int compareTo(MapEntry mapEntry) {
            return key.compareTo(mapEntry.key);
        }
    }

    @Override
    public boolean contains(K key) {
        return map.containsKey(key);
    }

    @Override
    public boolean add(K key, V value) {
        return false;
    }

    @Override
    public V delete(K key) {
        return null;
    }

    @Override
    public V getValue(K key) {
        return null;
    }

    @Override
    public K getKey(V value) {
        return null;
    }

    @Override
    public Iterable<K> getKeys(V value) {
        List<K> toReturn = new java.util.LinkedList<>();
        return null;
    }

    @Override
    public int size() {

        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterable<K> keyset() {
        List<K> toReturn = new java.util.LinkedList<>();
        return null;
    }

    @Override
    public Iterable<V> values() {
        List<K> toReturn = new java.util.LinkedList<>();
        return null;
    }
}
