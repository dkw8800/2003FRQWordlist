package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	ArrayList animalArr = new ArrayList(Arrays.asList("cat","mouse","frog","dog","dog"));
    }

    WordList animals = new WordList(animalArr);
    System.out.println();


}

    public int numWordsofLength(int len)
    {
        int count = 0;
        for(int i =0;i < MyList.length;i++)
        {
            if(MyList[i].length() == len)
            {
                count++;
            }
        }
        return count;
    }

    public void removeWordsofLength(len)
    {
        if(MyList[i].length() == len)
        {
            MyList.remove(i);
        }
    }