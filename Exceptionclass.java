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

    static String analyseMood(String msg){
        return msg;
    }

    public static void main(String[] args) {
        String input = analyseMood("Sad");

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