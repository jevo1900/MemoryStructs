/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jvazqoter
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        DinamicArray<Integer> a = new DinamicArray<>(3);
//        a.add(0, 1);
//        a.add(2);
//        a.add(2);
//        a.add(0, 6);
//        a.add(2);
//        a.add(2);
//        System.out.println(a.toString());
//        System.out.println(a.size());
//        ArrayMap<String, String> m = new ArrayMap<>();
        
        PointedList<String> list=new PointedList<>();
        for (int i = 0; i < 10; i++) {
            list.add("string "+i);
        }
        System.out.println(list.size());
        list.print();
        System.out.println(list.get(3));
        list.remove(3);
        list.print();
        System.out.println(list.size());
    }
}
