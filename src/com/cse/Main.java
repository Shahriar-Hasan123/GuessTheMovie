package com.cse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CheckAndPrint checkAndPrint = new CheckAndPrint();
        WinAndLose winlose = new WinAndLose();
        Scanner keyBoardLetter = new Scanner(System.in);


        String store = "", title, wrongStore = "";
        int wrong = 0,check=0;
        title = TitleInput.GameTittle();
        checkAndPrint.News(title, store, wrong, wrongStore,0);


        while (check!=title.length()&&wrong!=10) {

            System.out.print("Guess a letter:");

            //input a letter
            String input = keyBoardLetter.nextLine();

            if (title.contains(input))
                store = store + input;
            else {
                wrongStore = wrongStore + input;
                wrong++; }
            check=checkAndPrint.News(title, store, wrong, wrongStore,0);
        }
        if (wrong == 10) winlose.lose();
        else winlose.WIN(title);
    }
}
