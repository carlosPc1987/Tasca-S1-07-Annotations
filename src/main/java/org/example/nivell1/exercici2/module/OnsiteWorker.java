package org.example.nivell1.exercici2.module;


public class OnsiteWorker extends Worker {

    private static double fuelCompensation = 75.0;

    public OnsiteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + fuelCompensation;
    }

    public static void setFuelCompensation(double value) {
        fuelCompensation = value;
    }

    @Deprecated
    public void usePaperAttendanceSheet() {
        System.out.println("Signing attendance on paper sheet (obsolete).");
    }
}
