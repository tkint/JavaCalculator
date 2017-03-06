/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import model.HistoryEntry;

/**
 *
 * @author tkint
 */
@Named(value = "calculatorBean")
@SessionScoped
public class CalculatorBean implements Serializable {

    private int varA;
    private int varB;
    private int result;
    private List<HistoryEntry> history = new ArrayList<HistoryEntry>();

    /**
     * Creates a new instance of CalculatorBean
     */
    public CalculatorBean() {
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

    public List<HistoryEntry> getHistory() {
        return history;
    }

    public void setHistory(List<HistoryEntry> history) {
        this.history = history;
    }

    public String plus() {
        setResult(getVarA() + getVarB());
        addHistoryEntry("+");
        return "plus";
    }

    public String moins() {
        setResult(getVarA() - getVarB());
        addHistoryEntry("-");
        return "moins";
    }
    
    private void addHistoryEntry(String operande) {
        HistoryEntry entry = new HistoryEntry(varA, varB, result, operande);
        history.add(entry);
    }
}
