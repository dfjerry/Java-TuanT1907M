package Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {

    protected String name;
    protected String phoneNumber;

    public Phone(){

    }

    public Phone(String name,String phoneNumber) {

        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Phone> phoneList = new ArrayList<Phone>();
    public void displayContact(){
        for(int i=0; i<phoneList.size();i++){
            System.out.println("Name: "+ phoneList.get(i).getName()+ " Phone: "+ phoneList.get(i).getPhoneNumber());
        }
    }
    public void addContact(String name, String phoneNumber){
        phoneList.add(new Phone(name, phoneNumber));
    }
    public void updateContact(int i, String name, String phoneNumber){
        phoneList.set(i, new Phone(name, phoneNumber));
        System.out.println("Update ");
        System.out.println("Contact "+(i+1)+"Name "+phoneList.get(i).getName()+" Sdt "+ phoneList.get(i).getPhoneNumber());
    }
    public void remoteContact(int i){
        phoneList.remove(i);
    }
    public int findCOntact(String search){
        for(int i =0;i<this.phoneList.size();i++){
            Phone phone = this.phoneList.get(i);
            if(phone.getName().equals(search)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int choose =0;
        Scanner sc = new Scanner(System.in);
        Phone objPhone = new Phone("","");
        System.out.println("1 - To shutdown");
        System.out.println("2 - Print to contact");
        System.out.println("3 - Add a new contact");
        System.out.println("4 - Update contact");
        System.out.println("5 - Remote contact");
        System.out.println("6 - Find contact");
        System.out.println("7 - To print a list of available");
        while (choose !=1){
            System.out.println("Nhap case muon chon: ");
            choose = sc.nextInt();

        switch (choose){
            case 1:
                break;
            case 2:
                objPhone.displayContact();
                break;
            case 3:
                System.out.println("Nhap vao ten va sdt: ");
                objPhone.addContact(sc.next(), sc.next());
                break;
            case 4:
                objPhone.displayContact();
                System.out.println("Nhap contact ban muon update");
                objPhone.updateContact(sc.nextInt(), sc.next(), sc.next());
                break;
            case 5:
                objPhone.displayContact();
                System.out.println("Ban muon xoa contact nao ");
                objPhone.remoteContact(sc.nextInt());
                break;
            case 6:
                System.out.println("Nhap lien ma ban muon tim:   ");
                System.out.println("So thu tu: "+objPhone.findCOntact(sc.next()));

                break;
            case 7:
                System.out.println("1 - To shutdown");
                System.out.println("2 - Print to contact");
                System.out.println("3 - add a new contact");
                System.out.println("4 - update contact");
                System.out.println("5 - remote contact");
                System.out.println("6 - find contact");
                System.out.println("7 - to print a list of available ");
                break;
        }
        }
    }
}
