package com.JavaLearning.Container;

import java.util.*;

public class BasicContainer {
    public static void main(String[] args) {
//        Collection c = new ArrayList();

        Collection c = new HashSet();
        //add()只能添加不同类型的 对象！
        /*c.add("hello");
        c.add(new Name("w","hy"));
        c.add(new Integer(100));

        c.remove("hello");
        c.remove(new Integer(100));
        System.out.println(c.remove(new Name("w", "hy")));
        System.out.println(c);*/

        /*c.add(new Name("f1", "f1"));
        c.add(new Name("f2", "f2"));
        c.add(new Name("f3", "f3"));*/

        /*Iterator i = c.iterator();
        while (i.hasNext()) {
            Name n = (Name)i.next();
            System.out.println(n.getFirstName());
        }*/
        /*for (Iterator i = c.iterator(); i.hasNext();) {
            Name n = (Name) i.next();
            if (n.getFirstName().length() > 2) {
                i.remove();    //只能 i 调用 remove(), c 不可调用
            }
        }*/

        /*Set s1 = new HashSet();
        Set s2 = new HashSet();
         s1.add("a");
         s1.add("b");
         s1.add("c");
         s2.add("a");
         s2.add("b");
         s2.add("d");

         Set sn = new HashSet(s1);    //将s1的内容拷贝到s2
         sn.retainAll(s2);    //求交集
        Set su = new HashSet(s1);
        su.addAll(s2);    //求并集
        System.out.println(sn);
        System.out.println(su);*/
    }
}
class Name implements Comparable {
    private String firstName = null;
    private String lastName = null;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "firstName= " + firstName + ", lastName= " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name name = (Name) obj;
            return firstName.equals(name.firstName) && lastName.equals(name.lastName);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        Name n = (Name) o;
        int lastCam = lastName.compareTo(n.lastName);

        return (lastCam != 0 ? lastCam : firstName.compareTo(n.firstName));
    }
}