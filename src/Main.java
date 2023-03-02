
public class Main {
    public static void main(String[] args) {

        Test test = new Test("Russian language","Inna","Quiz",10);
        test.GETOUT();
        System.out.println("_________________________________________________");
        Exam exam = new Exam("Mathematics","Dina","Midterm",30);
        exam.GETOUT();
        System.out.println("_________________________________________________");
        Finals finals = new Finals("Informatics","Olga","Final exam",60);
        finals.GETOUT();
        System.out.println("__________________________________________________");

        Trials[] trials = {
                test,
                exam,
                finals,
                new Test("Discrete maths", "Vladimir", "Control work", 20),
                new Exam("Algebra", "Elina", "Midterm", 40),
                new Finals("Psychology", "Aliya", "Dobka", 50)
        };

        System.out.println("2)");
        int HIGHEST = 0;
        for (int i = 0; i < trials.length; i ++){
            if (trials[i].getPassingmarks() > trials[HIGHEST].getPassingmarks()){
                HIGHEST = i;
            }
        }
        System.out.println("The highest passing mark :"+trials[HIGHEST].getSubject());
        System.out.println("__________________________________________________");


        Trials AVERAGE = trials[0];
        for (int i = 0; i < trials.length; i++) {
            if(trials[i].compareTo(AVERAGE) == 1)
                AVERAGE = trials[i];
        }
        System.out.println("The average time : " + AVERAGE);
    }
}