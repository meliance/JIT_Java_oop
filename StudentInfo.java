
package com.mycompany.studentinfo;

public class StudentInfo {
    String name;
    int id;
    String department;
    public StudentInfo(){
        name="no name";
        id=0;
        department="no department";
    }
    public StudentInfo(String name, int id, String department){
        this.name= name;
        this.id= id;
        this.department= department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString(){
        String output=" ";
        output+="name"+" "+ name +" ";
        output+="id"+" "+ id+" ";
        output+="department"+" "+ department;
        return output;
    }

    public static void main(String[] args) {
        StudentInfo s1,s2;
        s1=new StudentInfo();
        s2= new StudentInfo("melaku muluken", 1476, "software");
        s1.setName("abel dan");
        System.out.println(s1);
        System.out.println(" ");
        System.out.println(s2);
    }
}
