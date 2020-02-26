package assignment3;

public class Main {
    public static void main(String[] args) {
        News news = new News();
        news.setID(1);
        news.setAuthor("Tuan");
        news.setTitle("Homnayangi");
        news.setContent("Dichoiodau");
        news.setPublishDate("25/02/2020");
        news.Calculate();
        news.getAverageRate();
        news.Display();
    }
}
