/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 *
 * @author Usuario
 */
public class ListImpl implements List<Object>{

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
    public Iterator<Object> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Object e) {
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
    public boolean addAll(Collection<? extends Object> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Object> c) {
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
    public Object get(int index) {
        return false;
    }

    @Override
    public Object set(int index, Object element) {
        return false;
    }

    @Override
    public void add(int index, Object element) {
        
    }

    @Override
    public Object remove(int index) {
        return false;
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
    public ListIterator<Object> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Object> listIterator(int index) {
        return null;
    }

    @Override
    public List<Object> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Object> action) {
        List.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }
    
}
