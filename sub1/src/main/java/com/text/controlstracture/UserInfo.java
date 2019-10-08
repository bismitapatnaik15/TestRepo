package com.text.controlstracture;

public class UserInfo {
    public String userName;
    public int age;
    public String city;

    public UserInfo(String userName, int age, String city) {
        this.userName = userName;
        this.age = age;
        this.city = city;
    }

    public UserInfo(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public UserInfo(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] x)
    {
        int z=Integer.parseInt(x[1]);


        UserInfo obj1=new UserInfo("ram",z,"mumbai");
        UserInfo obj2=new UserInfo("hari",z);
//        UserInfo obj1=new UserInfo(x[0],z,x[2]);
//        UserInfo obj2=new UserInfo(x[0],z);

//        obj1.setUserName(x[0]);
//        obj1.setCity(x[2]);
//
//        int z=Integer.parseInt(x[1]);
//        obj1.setAge(z);


       System.out.println(obj1.toString());
        System.out.println(obj2.toString());

    }
}


