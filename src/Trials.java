
public abstract class Trials implements Comparable{

    protected String subject;
    protected String profName;
    protected String TypeofTrial;
    protected int Passingmarks;

    public Trials(){
    }

    public Trials (String subject, String profName, String typeofTrial, int Passingmarks){
        super();
        this.subject=subject;
        this.profName=profName;
        this.TypeofTrial=typeofTrial;
        this.Passingmarks=Passingmarks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getTypeofTrial() {
        return TypeofTrial;
    }

    public void setTypeofTrial(String typeofTrial) {
        TypeofTrial = typeofTrial;
    }

    public int getPassingmarks() {
        return Passingmarks;
    }

    public void setPassingmarks(int passingmarks) {
        Passingmarks = passingmarks;
    }

    public abstract void GETOUT();

    @Override
    public int compareTo(Trials trials){
        int onepassingmarks = getPassingmarks();
        int twopassingmarks = trials.getPassingmarks();
        return Double.compare(onepassingmarks,twopassingmarks);
    }
}
