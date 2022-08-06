    class analyseMood{
    String msg;
    public analyseMood(String msg){
        this.msg = msg;
    }
}
public class Exceptionclass{
    static class MoodAnalyser extends Exception{
        @Override
        public String toString() {
            return "Happy Mood";
        }
        @Override
        public String getMessage() {
            return "Sad Mood";
        }
    }
    public static void main(String[] args) {
        analyseMood amd = new analyseMood(null);
        String input = amd.msg;

        if(input == "Happy"){
            try{
                throw new MoodAnalyser();
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
        }
        else if(input == "Sad"){
            try{
                throw new MoodAnalyser();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            try{
                throw new IllegalArgumentException();
            }
            catch(Exception e){
                System.out.println("This is an Invalid mood");
            }
        }
        
     }
}