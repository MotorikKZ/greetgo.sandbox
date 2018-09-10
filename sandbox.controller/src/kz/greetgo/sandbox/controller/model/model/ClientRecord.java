package kz.greetgo.sandbox.controller.model.model;


public class ClientRecord {
    public int id;
    public String firstname;
    public String lastname;
    public String patronymic;
    public Charm character;
    public String dateOfBirth;
    public int totalAccountBalance;
    public int maximumBalance;
    public int minimumBalance;

    public ClientRecord(){
        this.firstname="";
        this.lastname="";
        this.patronymic="";
        this.character=new Charm();
        this.dateOfBirth="2018-10-22";
        this.totalAccountBalance=0;
        this.maximumBalance=0;
        this.minimumBalance=0;
    }
}