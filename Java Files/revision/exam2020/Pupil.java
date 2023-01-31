package revision.exam2020;

public class Pupil {
    private String secondname;
    private String firstname;
    private int totalpoints;
    private AwardedPoints[] points;
    public Pupil(String sname,String fname)
    {
        secondname=sname;
        firstname=fname;
        totalpoints=0;
        points=new AwardedPoints[100];
        for(int i=0;i<100;i++)
        {
            points[i]=null;
        }
    }  
    public void addpoint(AwardedPoints aw)
    {
        for(int i=0;i<100;i++)
        {
            if (this.points[i]==null)
            {
                points[i]=aw;
                break;
            }
        }
    }
    public String getsname()
    {
        return secondname;
    }  
    public void setsname(String sname)
    {
        secondname=sname;
    }
    public String getfname()
    {
        return firstname;
    }  
    public void setfname(String fname)
    {
        firstname=fname;
    }
    public int getpoints()
    {
        return totalpoints;
    }  
    public void setpoints(int p)
    {
        totalpoints=p;
    }
    public boolean equals(Object o)
    {
        if(o instanceof Pupil)
        {
            Pupil other =(Pupil)o;
            if(this.getsname()==other.getsname()&&this.getfname()==other.getfname())
            return true;
            else
            return true;
        }
        else
        return false;
    }
    public void findtuple(Pupil[] pupils,Pupil tempp,AwardedPoints ap)
    {
        boolean ifexists=false;
        for(int i=0;i<pupils.length;i++)
        {
            if(tempp.equals(pupils[i]))
            {
                ifexists=true;
                pupils[i].addpoint(ap);
                break;
            }
        }
        if(!ifexists)
        {
            Pupil [] newpupils=new Pupil[pupils.length+1];
            for(int i=0;i<pupils.length;i++)
            {
                newpupils[i]=pupils[i];                
            }
            newpupils[pupils.length]=tempp;
            pupils=newpupils;
        }
    }
    public static void main(String[] args) {
        
    }
}
