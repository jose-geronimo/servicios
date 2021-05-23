package com.isma8.Sesion.clases;

public class DtoSesion {

    private String username;
    private String password;

    public DtoSesion(){

    }
    public DtoSesion(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "{"+
                "username" + this.username + "," +
                "password" + this.password + "}";
    }
}
