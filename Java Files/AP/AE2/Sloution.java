package AE2;

import java.util.Scanner;
import java.util.Vector;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sloution implements CommandRunner {
    Vector<Thread> threadsVector;
    Vector<SlowCalculator> calculatorsVector;

    public Sloution() {
        threadsVector = new Vector<>();
        calculatorsVector = new Vector<>();
    }

    @Override
    public String runCommand(String command) {
        String[] split = command.split(" ");
        String cmd1 = split[0];
        switch (cmd1) {
            case "start": {
                try {
                    int test=Integer.parseInt(split[1]);
                } catch (Exception e) {
                    return ("Invalid command");
                    // TODO: handle exception
                }
                SlowCalculator sc = new SlowCalculator(Integer.parseInt(split[1]));
                calculatorsVector.add(sc);
                Thread th = new Thread(sc);
                threadsVector.add(th);
                th.start();
                return ("Started " + split[1]);
            }
            case "cancel": {
                try {
                    int test=Integer.parseInt(split[1]);
                } catch (Exception e) {
                    return ("Invalid command");
                    // TODO: handle exception
                }
                for (SlowCalculator c : calculatorsVector) {
                    if (c.getN() == Long.parseLong(split[1])&&threadsVector.get(calculatorsVector.indexOf(c)).isAlive()) {//only perfome if the thread is stilll running
                        threadsVector.get(calculatorsVector.indexOf(c)).interrupt();
                        c.setSign(true);
                        // try {
                        //     threadsVector.get(calculatorsVector.indexOf(c)).join();
                        // } catch (InterruptedException e) {
                        //     // TODO Auto-generated catch block
                        //     e.printStackTrace();
                        // }
                        // // while(threadsVector.get(calculatorsVector.indexOf(c)).isAlive())
                        // // {
                        // //     ;//Because interrupt function does not terminate the thread immediately, so I wait untill it's not alive anymore
                        // // }
                        // // threadsVector.remove(threadsVector.get(calculatorsVector.indexOf(c)));
                        // // calculatorsVector.remove(c);
                        return ("Cancelled " + split[1]);
                    }
                }

                break;
            }
            case "running": {
                String tempS = "";
                int runningThreadsNum = 0;
                for (Thread t : threadsVector) {
                    if (t.isAlive()&&!calculatorsVector.get(threadsVector.indexOf(t)).getSign()) {
                        tempS += (" " + calculatorsVector.get(threadsVector.indexOf(t)).getN());
                        runningThreadsNum++;
                    }
                }
                return (runningThreadsNum + " calculations running:" + tempS);
            }
            case "get": {
                try {
                    int test=Integer.parseInt(split[1]);
                } catch (Exception e) {
                    return ("Invalid command");
                    // TODO: handle exception
                }
                for (SlowCalculator c : calculatorsVector) {
                    if (c.getN() == Long.parseLong(split[1])) {
                        if(!c.getSign())//if not cancelled or aborted
                        {
                            Thread tempT = threadsVector.get(calculatorsVector.indexOf(c));
                            if (tempT.isAlive())
                            return ("calculating");
                            else
                            return ("result is " + c.getR());
                        }


                    }
                }
                break;
            }
            case "finish": {
                // boolean finshed = false;
                boolean allFinished = true;
                while (allFinished) {
                    for (Thread t : threadsVector) {
                        if (t.isAlive()) {
                            {
                                allFinished = false;
                            }
                        }
                    }
                    if (allFinished) {
                        return ("Finished");
                    } else
                        allFinished = true;
                }

            }
            case "abort": {
                // for (SlowCalculator c : calculatorsVector) {
                    
                //     calculatorsVector.remove(c);
                // }
                for(Thread t:threadsVector)
                {
                    t.interrupt();
                    calculatorsVector.get(threadsVector.indexOf(t)).setSign(true);//set cancelled sign to true, so that it won't return the result
                    // try {
                    //     t.join(0);
                    // } catch (InterruptedException e) {
                    //     // TODO Auto-generated catch block
                    //     e.printStackTrace();
                    // }
                    // threadsVector.remove(t);
                }
                return ("Aborted");
                // boolean allTerminated = true;
                // while (allTerminated) {
                //     for (Thread t : threadsVector) {
                //         if (t.isAlive()) {
                //             {
                //                 allTerminated = false;
                //             }
                //             continue;
                //         }
                //     }
                //     if (allTerminated) {
                //         // for (Thread t : threadsVector) {
                //         //     threadsVector.remove(t);
                //         // }
                //         return ("Aborted");
                //     } else
                //     allTerminated = true;
                // }
            }
            default: {
                return ("Invalid command");
                // break;
            }
        }
        // TODO Auto-generated method stub
        return "";
    }

    public static void main(String[] args) {
        FileReader fr = null;
        Scanner scan = new Scanner(System.in);
        Sloution s1 = new Sloution();
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
