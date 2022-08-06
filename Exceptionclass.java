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
        analyseMood amd = new analyseMood("Happy");
        String input = amd.msg;

        if(input == "Happy"){
            try{
                throw new MoodAnalyser();
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
        }
        else{
            try{
                throw new MoodAnalyser();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
     }
}