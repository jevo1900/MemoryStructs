/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author jvazqoter
 */
public class DinamicArray<Object> {

    private Object[] objects = null;
    private int num_objects;

    public DinamicArray(int default_size) {
        this.objects = (Object[]) new Integer[default_size];
        num_objects = 0;
    }

    public DinamicArray() {
        num_objects = 0;
    }

    public DinamicArray(Object[] objects) {
        this.objects = objects;
    }

    public void add(int index, Object o) {
        System.out.println("size: " + num_objects);
        if (objects.length > index) {
            objects[index] = o;
            if (num_objects <= index) {
                num_objects = index + 1;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object o) {
        System.out.println("size: " + num_objects);
        if (objects.length > num_objects) {
            objects[num_objects] = o;
            num_objects++;
        } else {
            objects = Arrays.copyOf(objects, objects.length + 1);
            System.out.println("new size: " + objects.length);
            objects[num_objects] = o;
            num_objects++;
        }
    }
    
    public void replace(Object[] objects) {
        this.objects=objects;
    }

    public void addAll(Object[] objects) {
        for (Object o : objects) {
            add(o);
        }
    }

    public void addAll(Collection<Object> objects) {
        for (Object o : objects) {
            add(o);
        }
    }

    public Object get(int index) {
        return objects[index];
    }

    public int size() {
        return num_objects;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(objects);
    }
}
