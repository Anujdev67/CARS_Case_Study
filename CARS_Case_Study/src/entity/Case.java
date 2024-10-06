package entity;

import java.util.Collection;

public class Case {
    private int caseID;
    private String caseDescription;
    private Collection<Incident> incidents;

    // Default constructor
    public Case() {}

    // Parameterized constructor
    public Case(int caseID, String caseDescription, Collection<Incident> incidents) {
        this.caseID = caseID;
        this.caseDescription = caseDescription;
        this.incidents = incidents;
    }

    // Getters and Setters
    public int getCaseID() { return caseID; }
    public void setCaseID(int caseID) { this.caseID = caseID; }
    public String getCaseDescription() { return caseDescription; }
    public void setCaseDescription(String caseDescription) { this.caseDescription = caseDescription; }
    public Collection<Incident> getIncidents() { return incidents; }
    public void setIncidents(Collection<Incident> incidents) { this.incidents = incidents; }
}
