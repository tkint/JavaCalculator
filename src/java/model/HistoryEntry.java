/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tkint
 */
public class HistoryEntry {

    private int varA;
    private int varB;
    private int result;
    private String operator;

    public HistoryEntry(int varA, int varB, int result, String operande) {
        this.varA = varA;
        this.varB = varB;
        this.result = result;
        this.operator = operande;
    }

    public int getVarA() {
        return varA;
    }

    public void setVarA(int varA) {
        this.varA = varA;
    }

    public int getVarB() {
        return varB;
    }

    public void setVarB(int varB) {
        this.varB = varB;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
