package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
       vonkajisFor:
        for(int i =1;i<5;i++) {
           for (int j= 10;j>0;j--){
               System.out.println("---");
               if (i%3 == 0){
                   break vonkajisFor;
               }
               System.out.println(i+" "+j);
           }
       }
        System.out.println("koniec");
    }
}
