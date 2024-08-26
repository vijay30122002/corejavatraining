package com.evergent.corejava.strings;

class UserdefinedException1 extends Exception{
    public UserdefinedException1(String message){
        System.out.println("you are not allowed to drink "+ message);
    }
}

class User {
    public static void Drink(int age) throws UserdefinedException1{
        if(age<18)
        throw new UserdefinedException1("go re go ");
        else
        System.out.println("you can drink now");
}


public static void main(String args[]) throws Exception{
    
    User u=new User();
    
    Drink(17);
    }
    
}

