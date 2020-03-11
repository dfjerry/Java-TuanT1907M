package Labs7;

public class CountDown extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            for(int j=0;j<60;j++){
                if(j>=10){
                    System.out.println("0"+i+":"+j);
                }else {
                    System.out.println("0"+i+":"+"0"+j);
                }
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
        }
    }
}
