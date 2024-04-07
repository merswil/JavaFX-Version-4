package org.example.javafx_v4;

public class Calculation extends LandView {
    private int projectCost;

    private void calculateProjectCost() {
        int calculation = TotalLandCost();
        projectCost = calculation * (calculation * 2);
    }

    public String appendCalculationData() {
        calculateProjectCost();
        String calculationData = "Project Cost: €" + projectCost + "\n\n\n\n";
        return InputData.appendCalculationData(calculationData);

    }

    public int getProjectCost() {
        return projectCost;
    }
}
