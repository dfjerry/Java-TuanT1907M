//package Bai2;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class PhoneBook extends Phone {
//
//    List<ContactInfo> phoneList = new ArrayList<>(); // tao arraylist
//    ContactInfo contactInfo = null;
//
//    @Override
//    void insertPhone(String name, String phone) {
//        int kt1 = 0, kt2 = 0;
//        for (int i=0;i<phoneList.size();i++) {
//            ContactInfo contactInfo = phoneList.get(i);
//            if (contactInfo.getName().equals(name)) { // check name co trong list
//                if(contactInfo.getNumber().equals(phone)){ // check phone co trong list
//                    kt1 = 1;
//                    break;
//                }
//                kt2 = 1;
//            }
//
//        }
//
//        if(kt1 == 1 && kt2 == 1)
//            // check co ca ten va sdt
//            System.out.println("Nhap ten va sdt bi trung!");
//        else if (kt1 == 0 && kt2 == 0) {
//            // check khong co ten va sdt
//            this.contactInfo = new ContactInfo(name, phone);
//            phoneList.add(contactInfo);
//        }
//        else if(kt1 == 0 && kt2 == 1){
//            contactInfo.setNumber(contactInfo.getNumber() + " : " + phone);
//        }
//    }
//
//    @Override
//    void removePhone(String name) {
//        for (int i=0;i<phoneList.size();i++) {
//            ContactInfo contactInfo = phoneList.get(i);
//            if (contactInfo.getName().equals(name))
//                phoneList.remove(i);
//            System.out.println("Contact : "+contactInfo.getName()+"xoa thanh cong!");
//        }
//    }
//
//    @Override
//    void updatePhone(String name, String newphone) {
//        for (int i=0;i<phoneList.size();i++) {
//            ContactInfo contactInfo = phoneList.get(i);
//            if (contactInfo.getName().equals(name))
//                contactInfo.setNumber(newphone);
//            System.out.println("Contact : "+contactInfo.getName()+"update thanh cong!");
//        }
//    }
//
//    @Override
//    void searchPhone(String name) {
//        for (int i=0;i<phoneList.size();i++) {
//            ContactInfo contactInfo = phoneList.get(i);
//            if (contactInfo.getName().equals(name)){
//                System.out.println(name+" co trong list : ");
//            }
//        }
//    }
//
//    @Override
//    void sort() {
//        Collections.sort(phoneList, new Comparator<ContactInfo>() {  // so sanh trong arraylist
//
//            @Override
//            public int compare(ContactInfo o1, ContactInfo o2) { // sap xep theo ten
//                return o1.getName().compareTo(o2.getName());
//            }
//
//        });
//
//    }
//
//    void showListPhone() {
//        System.out.println("Danh sach contact:");
//        for (int i=0;i<phoneList.size();i++) {
//            ContactInfo contactInfo = phoneList.get(i);
//            System.out.println("Name : " + contactInfo.getName() + ", Phone: " + contactInfo.getNumber());
//        }
//    }
//
//}
