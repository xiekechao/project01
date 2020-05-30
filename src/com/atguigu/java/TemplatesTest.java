package com.atguigu.java;

import java.util.ArrayList;

public class TemplatesTest {
    private int id;
    public static void main(String[] args){
        String[] arr=new String[]{"a","bb","ccc"};
       /* for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }*/
        for (String s : arr) {
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        /*for (Object o : list) {
            System.out.println(o);
        }*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        }
        public void test01(){

        }
    }

