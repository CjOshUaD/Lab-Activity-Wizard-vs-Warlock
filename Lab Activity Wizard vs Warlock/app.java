public class app {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizard Vs Warlock\n");

        Wizard Merlin = new Wizard("Merlin");
        Warlock Metrognome = new Warlock("Metrognome");

        Merlin.windBlade(Metrognome);
        Metrognome.thunderBlast(Merlin);
        Merlin.windBlade(Metrognome);
        Metrognome.thunderBlast(Merlin);
        Merlin.recover(Merlin);
        Metrognome.thunderBlast(Merlin);
        Merlin.hurricane(Metrognome);
        Merlin.displayDetails(Merlin);
    }
}
