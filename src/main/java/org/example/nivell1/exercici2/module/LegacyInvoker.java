package org.example.nivell1.exercici2.module;


public class LegacyInvoker {

    @SuppressWarnings("deprecation")
    public void useDeprecatedMethods() {
        OnlineWorker online = new OnlineWorker("Lina", "Gilbert", 19.0);
        OnsiteWorker onsite = new OnsiteWorker("Marc", "Ortiz", 21.0);

        online.connectViaDialUp();
        onsite.usePaperAttendanceSheet();
    }
}