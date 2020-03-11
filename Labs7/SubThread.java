package Labs7;

public class SubThread {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--){
            System.out.println("Time out: " + i);
//            try {
//                Thread.sleep(1000);
//            }catch (Exception e){
//            }
        }
        Thread.currentThread().setName("Happy new year!!!");
        System.out.println(Thread.currentThread().getName());
        CountDown ct = new CountDown();
        ct.start();
    }
}
