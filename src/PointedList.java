/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

/**
 *
 * @author Usuario
 * @param <Object>
 */
public class PointedList<Object> {

    private entry<Object> first;
    private entry<Object> last;
    private int size;

    public PointedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public void set(int index, Object o) {
        if(index>=size) throw new ArrayIndexOutOfBoundsException();
        entry e = first;
        do {
            if (index == (e.getIndex())) {
                e.setValue(o);
            }
        } while (null != (e = e.getNextEntry()));
    }

    public void add(Object o) {
        if (size == 0) {
            first = new entry(o);
            last = first;
        } else {
            last.setNextEntry(new entry(o));
            last = last.getNextEntry();
        }
        last.setIndex(size);
        size++;
    }

    public void remove(int index) {
        if(index>=size) throw new ArrayIndexOutOfBoundsException();
        entry e = first;
        boolean remove = false;
        do {
            if (remove) {
                e.setIndex(e.getIndex()-1);
                e.setNextEntry(e.getNextEntry());
            }
            if (index == (e.getIndex()+1)) {
                remove = true;
                size--;
                e.setNextEntry(e.getNextEntry().getNextEntry());
            }
        } while (null != (e = e.getNextEntry()));
    }
    
    public Object get(int index) {
        if(index>=size) throw new ArrayIndexOutOfBoundsException();
        entry e = first;
        do {
            if (index == (e.getIndex())) {
                return (Object) e.getValue();
            }
        } while (null != (e = e.getNextEntry()));
        return null;
    }
    
    public void removeAll() {
        first=null;
        last=null;
        size=0;
    }

    public void print() {
        entry e = first;
        do {
            System.out.println(e.getValue());
        } while (null != (e = e.getNextEntry()));
    }

    private class entry<Object> {

        Object value;
        int index;
        entry nextEntry;

        public entry(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public entry getNextEntry() {
            return nextEntry;
        }

        public int getIndex() {
            return index;
        }

        public void setNextEntry(entry nextValue) {
            this.nextEntry = nextValue;
        }

    }

}
