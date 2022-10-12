package week4.day2.babyLion;

public class Watermelon {
    public static void main(String[] args) {
        String str="";
        Watermelon watermelon = new Watermelon();
        watermelon.getWm(5,str); //수박수박수
    }

    public String getWm(int num, String str){
        //매개변수 숫자
        return str;
    }

    public String getSu(String str){
        str+= "수"; //짝
        return str;
    }

    public String getBak(String str){
        str+= "박"; //홀
        return str;
    }
}
