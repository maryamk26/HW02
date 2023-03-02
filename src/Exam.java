
public class Exam extends Trials implements itry{

    protected int Semmarks;
    protected int mins;
    protected int noquestions;

    public Exam(String subject, String profName, String typeofTrial,int Passingmarks){
        super(subject,profName,typeofTrial,Passingmarks);
    }

    @Override
    public void GETOUT() {
        System.out.println("Exam: "+ "\n" + "Subject: " +subject +"\n" + "Prof.Name: " +profName+ "\n" + "Type of trial: "+TypeofTrial+ "\n" +"Passing marks :" +Passingmarks +"\n"+"Semster marks: "+getSemmarks()+"\n"+"Number of questions: "+getnoquestions()+"\n"+"Time in minutes: "+getmins()+"\n" );
    }

    @Override
    public int getSemmarks() {
        if(getPassingmarks()<40) {
            return (getPassingmarks() / 3);
        } else if (getPassingmarks()>=40) {
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
        return getnoquestions()*3;
    }
}
