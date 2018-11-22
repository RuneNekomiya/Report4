public class NullNullExeptionTime {
    public static void main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("失敗しちゃった☆\n元凶はこいつ : " + e.getMessage());
        }
    }
}