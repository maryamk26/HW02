
public class Test extends Trials implements itry{

    protected int Semmarks;
    protected int mins;
    protected int noquestions;


    public Test(String subject, String profName, String typeofTrial,int Passingmarks){
        super(subject,profName,typeofTrial,Passingmarks);
    }

    @Override
    public void GETOUT() {
        System.out.println("Test: "+ "\n" + "Subject: " +subject +"\n" + "Prof.Name: " +profName+ "\n" + "Type of trial: "+TypeofTrial+ "\n" +"Passing marks :" +Passingmarks +"\n"+"Semster marks: "+getSemmarks()+"\n"+"Number of questions: "+getnoquestions()+"\n"+"Time in minutes: "+getmins()+"\n" );
    }

    @Override
    public int getSemmarks() {
        if(getPassingmarks()<20) {
            return (getPassingmarks() / 4);
        } else if (getPassingmarks()>=20) {
            return (getPassingmarks()/2);
        }
        return getSemmarks();
    }

    @Override
    public int getnoquestions() {
        return Passingmarks/2;
    }

    @Override
    public int getmins() {
        return getnoquestions()*2;
    }
}
