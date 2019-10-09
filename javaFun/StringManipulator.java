public class StringManipulator{
    public String trimAndConcat(String a,String b){
        String full = a.trim().concat(b.trim());
        return full;
    }
    public Integer getIndexOrNull(String sentence, char letter){
        if(sentence.indexOf(letter)==-1){
            return null;
        }else{
            return sentence.indexOf(letter);
        }
    }
    public Integer getIndexOrNull(String word, String string){
        if(word.indexOf(string)==-1){
            return null;
        }else{
        return word.indexOf(string);
        }
    }
    public String concatSubstring(String word, int a, int b, String string_b ){
        return word.substring(a,b)+ string_b;
    }
}

