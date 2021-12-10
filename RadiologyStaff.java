public class RadiologyStaff  extends SpecialtyStaff {
    public RadiologyStaff() {}

    public void inputOrderResults(Test t, String result) {
        t.Results(result);
    }
}