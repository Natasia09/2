/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Slider {
    private final double min;
    private final String name;
    private final double stepSize;
    private final int maxStep;
    private final boolean circular;
    private final int value;
    private int currentStep;

    public Slider(double min, String name, double stepSize, int maxStep, boolean circular, int value) {
        this.min = min;
        this.name = (name == null) ? "NoName" : name;
        this.stepSize = stepSize > 0 ? stepSize : 1.0;
        this.maxStep = maxStep > 0 ? maxStep : 1;
        this.circular = circular;
        this.value = value;
    }

    public void up() {
        currentStep++;
        if (currentStep > maxStep) {
            if (circular == true) {
                currentStep = 0;
            } else {
                currentStep = maxStep;
            }
        }
    }

    public void down() {
        currentStep--;
        if (currentStep < 0) {
            if (circular == true) {
                currentStep = maxStep;
            } else {
                currentStep = 0;
            }
        }

    }

    public double getValue() {
        return min + currentStep * stepSize;
    }

    @Override
    public String toString() {
        return name + "(" + getValue() + ")";

    }

}
