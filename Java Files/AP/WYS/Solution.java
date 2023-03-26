import java.util.ArrayList;



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
}
