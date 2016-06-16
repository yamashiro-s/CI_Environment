package com.test.yamashiro.unittest;

/**
 * Created by yamashiro on 2016/06/16.
 */
public class Person {
    private String m_Name;
    private int m_Age;

    public Person(){}

    public Person( String name, int age ){
        m_Name = name;
        m_Age = age;
    }

    public void setName(String name){
        m_Name = name;
    }

    public void setAge(int age){
        m_Age = age;
    }

    public String getName(){
        return m_Name;
    }

    public int getAge(){
        return m_Age;
    }
}
