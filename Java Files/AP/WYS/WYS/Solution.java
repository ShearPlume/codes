package WYS;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;




public class Solution {
    ArrayList<SlowCalculator> calculatorList = new ArrayList<>();
    ArrayList<Thread> threadsList = new ArrayList<>();

    public String runCommand(String command) {
        String[] subSommands = command.split(" ");
        if (subSommands.length == 1) {
            switch (subSommands[0]) {
                case ("running"): {
                    String t = "";
                    int number = 0;
                    for (Thread th : threadsList) {
                        if (th.isAlive() && !calculatorList.get(threadsList.indexOf(th)).getIsCancel()) {
                            number++;
                            t += (" " + calculatorList.get(threadsList.indexOf(th)).getN());
                        }
                    }
                    return (number + " calculations running:" + t);
                }
                case ("finish"): {
                    int number = 0;
                    do {
                        number = 0;
                        for (Thread th : threadsList) {
                            if (th.isAlive()) {
                                number++;
                            }
                        }

                    } while (number != 0);
                    return ("Finished");
                }
                case ("abort"): {
                    for (SlowCalculator sl : calculatorList) {
                        threadsList.get(calculatorList.indexOf(sl)).interrupt();
                        sl.setIsCancel(true);                        
                    }
                    return ("Aborted");
                }
                default: return("Invalid command");
            }
        } else if (subSommands.length == 2) {
            switch (subSommands[0]) {
                case ("start"): {
                    SlowCalculator c = new SlowCalculator(Integer.parseInt(subSommands[1]));
                    calculatorList.add(c);
                    Thread th = new Thread(c);
                    threadsList.add(th);
                    th.start();
                    return ("Started  " + subSommands[1]);
                }
                case ("cancel"): {
                    int i = Integer.parseInt(subSommands[1]);
                    for (SlowCalculator sl : calculatorList) {
                        if (sl.getN() == Long.parseLong(subSommands[1])
                                && threadsList.get(calculatorList.indexOf(sl)).isAlive()) {
                            threadsList.get(calculatorList.indexOf(sl)).interrupt();
                            sl.setIsCancel(true);
                            return ("Cancelled " + subSommands[1]);
                        }
                    }
                    break;

                }
                case ("get"): {
                    int i = Integer.parseInt(subSommands[1]);
                    for (SlowCalculator sl : calculatorList) {
                        if (sl.getN() == Long.parseLong(subSommands[1])) {
                            if (!sl.getIsCancel()) {
                                if (threadsList.get(calculatorList.indexOf(sl)).isAlive())
                                    return "calculating";
                                else
                                    return ("result is " + sl.getAR());
                            }
                        }
                    }
                    break;
                }
                default: return("Invalid command");
            }

        }

        return "";
    }
    public static void main(String[] args) {
        FileReader fr = null;
        Scanner scan = new Scanner(System.in);
        Solution s1 = new Solution();
        // try {
        //     fr = new FileReader("AP/AE2/commands.txt");
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        System.out.println(s1.runCommand("start 191981000"));
        System.out.println(s1.runCommand("start 191981001"));
        System.out.println(s1.runCommand("start 191981002"));
        System.out.println(s1.runCommand("running"));
        System.out.println(s1.runCommand("cancel 191981000"));
        System.out.println(s1.runCommand("running"));
        System.out.println(s1.runCommand("abort"));
        System.out.println(s1.runCommand("running"));
        System.out.println(s1.runCommand("get 191981001"));
        System.out.println(s1.runCommand("get 191981002"));
        System.out.println(s1.runCommand("start 1145202"));
        System.out.println(s1.runCommand("start 1145206"));
        System.out.println(s1.runCommand("running"));
        System.out.println(s1.runCommand("cancel 1145206"));
        System.out.println(s1.runCommand("running"));
        System.out.println(s1.runCommand("finish"));
        System.out.println(s1.runCommand("get 1145202"));
        System.out.println(s1.runCommand("get 1145206"));
        // Scanner sc = new Scanner(fr);
        // // String line;
        // while (sc.hasNextLine()) {
        //     System.out.println(s1.runCommand(sc.nextLine()));
        // }
        // return;
        // while (true) {
        // System.out.print(s1.runCommand(scan.nextLine())+"\n");

        // }
    }
}
