package revision.exam2020;

public class AwardedPoints {
    private String secondname;
    private String firstname;
    private int pointstoadd;
    private AwardedPoints points;
    private String reasonforpoints;
    public void AwardedPoints(String sname,String fname,int pointsadd,AwardedPoints apoints)
    {
        secondname=sname;
        firstname=fname;
        pointstoadd=pointsadd;
        points=apoints;

    }
    public void AwardedPoints(String sname,String fname,int pointsadd,AwardedPoints apoints,String reason) 
    {
        secondname=sname;
        firstname=fname;
        pointstoadd=pointsadd;
        points=apoints;
        reasonforpoints=reason;
    }   
}
