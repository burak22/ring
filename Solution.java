package Ring;

public class Solution {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Fighter[] fighters = {alex,marc};        //DEĞİŞİKLİK BURADA
        int randomNm = ((Math.random()*100)>50)? 1:0;        //DEĞİŞİKLİK BURADA
        Match match = new Match(fighters[randomNm],fighters[1-randomNm], 90 , 100);        //DEĞİŞİKLİK BURADA
        match.run();
      }
}
