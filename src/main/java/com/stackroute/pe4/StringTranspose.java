package com.stackroute.pe4;

public class StringTranspose {
    public String TransposeOfAString(String str)
    {
        //splits the words by space
        String words[]=str.split(" ");
        String reverse="";
        for(String w:words)
        {
            StringBuilder sb=new StringBuilder(w);
            //reverses
            sb.reverse();
            reverse+=sb.toString()+" ";

        }
        return reverse.trim();
    }
}
