public class Test extends Order {

    private boolean requiresAppointment;
    private String results;

    public Test(boolean app) {
        this.requiresAppointment = app;
    }  

    public void inputResults(String res) {
        results += res;
    }

    public String getResults() {
        return this.results;
    }

}

 
    