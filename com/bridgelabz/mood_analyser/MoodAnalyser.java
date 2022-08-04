package com.bridgelabz.mood_analyser;


public class MoodAnalyser {
    String msg;
    MoodAnalyser(){ }

    MoodAnalyser(String msg){
        this.msg = msg;
    }
    String analyseMood(){
        return analyseMood(msg);
    }
    String analyseMood(String msg){
        String stringArray[] = msg.split(" ");
        String result = " ";

        try {
            if (msg == "") {
                throw new MoodAnalysisException("Empty Mood");
            }
            for (String var : stringArray) {
                if (var.equalsIgnoreCase("happy")) {
                    result = "Happy";
                    break;
                } else if (var.equalsIgnoreCase("sad")) {
                    result = "Sad";
                    break;
                }
            }
        } catch (NullPointerException e){
            result = "Happy";
        } catch (MoodAnalysisException e) {
            return e.getMessage();
        }

        if(result.equals(" ")){
            result = "Happy";
        }

        return result;
    }
}
class AnalyseMoodDemo{
    public static void main(String[] args) {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("");
        System.out.println(mood);

    }
}

