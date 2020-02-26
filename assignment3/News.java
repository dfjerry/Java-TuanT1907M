package assignment3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;//ngay xuat ban
    public String Author; //tac gia
    public String Content;
    public float  AverageRate;//ty le trung binh
    public News(){

    }
    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void Display(){
        System.out.println("Title: " +getTitle() +"\nPublishDate: "+getPublishDate()+ "\nAuthor: "+getAuthor()+"\nContent: "+getContent()+"\nAverageRate: "+getAverageRate());
    }
    public float Calculate() {
        Scanner sc = new Scanner(System.in);
        int[] RateList = new int[3];//tao 1 array ten RateList 3 phan tu
        for (int i = 0; i < RateList.length; i++) {
            System.out.printf("Enter RateLish[%d]: ", +i);
            RateList[i] = sc.nextInt();
        }//nhap 3 phan tu ratelish
        int sumRateList = 0;
        float AverageRate1 = 0;
        for (int i = 0; i < RateList.length; i++) {
            sumRateList += RateList[i];
            AverageRate1 = sumRateList / RateList.length;
        }//tinh trung binh cong
        return AverageRate = AverageRate1; //tra ve ket qua
    }
}
