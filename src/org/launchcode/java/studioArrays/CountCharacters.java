package org.launchcode.java.studioArrays;

public class CountCharacters {
    public static void main(String[] args) {
        String cc = "small phrase.";
        //create an array of individual characters = declare char array
        char[] strArr;
        //use while loop
        while(cc.length() != 0){
            //convert to individual chars
            strArr = cc.toCharArray();
            //
            char ch = strArr[0];
            int count = 1;

            for(int i = 1; i < strArr.length; i++){
                if(ch == strArr[i]){
                    count++;
                }
            }
            // We don't need to count spaces
            if(((ch != ' ') && (ch != '\t'))){
                System.out.println(ch + ": " + count);
            }
            // replace all occurrence of the character
            // which is already iterated and counted
            cc = cc.replace(""+ch, "");
        }
    }
    }

