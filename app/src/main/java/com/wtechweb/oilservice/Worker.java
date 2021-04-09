package com.wtechweb.oilservice;
public class Worker {
    String name;
    String email;
    String password;

    public Worker(){

    }
    public Worker( String email, String name, String pass){
        this.name=name;
        this.password=pass;
        this.email=email;
    }

    public void setId(String id){
        this.email=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPassword(String password){this.password=password;}
    public String getId(){
        return email;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){return password;}
    public String toString(){
        return email+" "+name+" "+password+"\n";
    }

}
