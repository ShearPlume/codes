package AE2;

public class Sloution implements CommandRunner{
    @Override
    public String runCommand(String command) {
        String [] split=command.split(" ");
        String cmd1=split[0];
        switch (cmd1){
            case "start":
            {
                SlowCalculator sc=new SlowCalculator(Integer.parseInt(split[1]));
                Thread th1=new Thread(sc);
                break;
            }
            case "cancel":
            {
                break;
            }
            case "running":
            {
                break;
            }
            case "get":
            {
                break;
            }
            case "finish":
            {
                break;
            }
            case "abort":
            {
                break;
            }
            default:
            {
                break;
            }
        }
        // TODO Auto-generated method stub
        return null;
    }
}
