package BFS;

import Graph.Vertex;

import java.util.*;

/**
 * Created by bandit on 11/17/15.
 */
public class OwnQueue {
    public Queue<Vertex<String>> queue = new Queue<Vertex<String>>() {
        List<Vertex<String>> list = new ArrayList<>();
        int size =0;
        @Override
        public boolean add(Vertex<String> stringVertex) {
            list.add(stringVertex);
            size++;
            return false;
        }

        @Override
        public boolean offer(Vertex<String> stringVertex) {
            return false;
        }

        @Override
        public Vertex<String> remove() {
            return null;
        }

        @Override
        public Vertex<String> poll() {
            if(list.size()!=0) {
                Vertex<String> tmp = list.get(0);
                list.remove(0);
                size--;
                return tmp;
            }
            return null;
        }

        @Override
        public Vertex<String> element() {
            return null;
        }

        @Override
        public Vertex<String> peek() {
           if(list.size()!=0) {
               list.get(0);
           }
            return null;
        }
        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            return size()==0;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Vertex<String>> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Vertex<String>> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };
}
