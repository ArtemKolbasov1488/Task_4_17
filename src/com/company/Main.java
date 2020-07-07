package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                //region Приветственное сообщение
                JOptionPane.showMessageDialog(null, "Таск 4. \n 17. Реализовать сортировку расческой." +
                        "\n Применить данную сортировку для сортировки строк по следующему критерию:" +
                        "\n - вначале по кол-ву гласных в строке (для английского алфавита), впереди должны оказаться строки с большим кол-вом гласных;" +
                        "\n - затем по длине строки, впереди более длинные слова. " +
                        "\n \n Строки по длинне сортируются в независимости от того, есть ли в них гласная или нет." +
                        "\n \n Свою реализацию так же дополнил и возможностью сортировки русских слов.");
                //endregion
                (new Window()).setVisible(true);
            }
        });
    }

    public static String[][] process (String[][] arr) {
        CombSort.countVowelLetter(arr);
        return arr;
    }
}
