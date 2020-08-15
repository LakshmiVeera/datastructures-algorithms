package com.lakshmi.java.LogOperations;
import java.util.*;

public class reOrderLogs {

    public String[] formatLogs(String[] logs) {

        if(logs.length != 0 || logs != null) {

            Arrays.sort(logs, (logLine1, logLine2) -> {
                String[] logArray1 = logLine1.split("\\s", 2);
                String[] logArray2 = logLine2.split("\\s", 2);

                boolean isDigit1 = Character.isDigit(logArray1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(logArray2[1].charAt(0));

                int c = 0;

                if(!isDigit1 && !isDigit2){
                    c = logArray1[1].compareTo(logArray2[1]);
                    return c == 0 ? logArray1[0].compareTo(logArray2[0]) : c;
                }

                return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
            });
        }
        return logs;
    }

    public static void main(String... args) {
        String[] logs = {"dig3 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        reOrderLogs orderLogs = new reOrderLogs();
        System.out.println(orderLogs.formatLogs(logs));
    }

}
