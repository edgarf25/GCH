package Scenes;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MementoCaretaker {
    public List<Memento> getMementos()
    {
        return new List<Memento>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Memento> iterator() {
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
            public boolean add(Memento memento) {
                return false;
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
            public boolean addAll(Collection<? extends Memento> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Memento> c) {
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

            @Override
            public Memento get(int index) {
                return null;
            }

            @Override
            public Memento set(int index, Memento element) {
                return null;
            }

            @Override
            public void add(int index, Memento element) {

            }

            @Override
            public Memento remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Memento> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Memento> listIterator(int index) {
                return null;
            }

            @Override
            public List<Memento> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
    public void restoreFromMemento(Memento m)
    {

    }
}
