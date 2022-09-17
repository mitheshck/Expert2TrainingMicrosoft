import java.util.*;
class getcharcount{

    public static void getCharCount(String word){
            Map<Character,Integer> newmap=new HashMap<Character,String>();
            char[] splitword=word.toCharArray();

            for(char c:splitword){
                if(newmap.containsKey(c)){
                    newmap.put(c,newmap.get(c)+1);
                }
                else{
                    newmap.put(c,1);
                }
            }
            System.out.println(word+ " : "+newmap);

    }
    public static void main(String[] args){
        getCharCount("mithesh");
    }
}