package cpen221practice;
import java.util.Set;
import java.util.HashSet;
class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set<Character> set= new HashSet<>();
        String lcase=new String(phrase.toLowerCase());
        for (int i=0; i<lcase.length();i++){
            if (lcase.charAt(i)==' ' || lcase.charAt(i)=='-'){
                continue;
            }
            else if(set.contains(lcase.charAt(i))){
                return false;
            }
            set.add(lcase.charAt(i));
        }
        return true;
    }

}
