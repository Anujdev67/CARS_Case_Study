package entity;

public class Evidence {
    private int evidenceID;
    private int incidentID;
    private String evidenceType;
    private String description;
    private String collectedDate;

    // Default constructor
    public Evidence() {}

    // Parameterized constructor
    public Evidence(int evidenceID, int incidentID, String evidenceType, String description, 
                    String collectedDate) {
        this.evidenceID = evidenceID;
        this.incidentID = incidentID;
        this.evidenceType = evidenceType;
        this.description = description;
        this.collectedDate = collectedDate;
    }

    // Getters and Setters
    public int getEvidenceID() { return evidenceID; }
    public void setEvidenceID(int evidenceID) { this.evidenceID = evidenceID; }
    public int getIncidentID() { return incidentID; }
    public void setIncidentID(int incidentID) { this.incidentID = incidentID; }
    public String getEvidenceType() { return evidenceType; }
    public void setEvidenceType(String evidenceType) { this.evidenceType = evidenceType; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getCollectedDate() { return collectedDate; }
    public void setCollectedDate(String collectedDate) { this.collectedDate = collectedDate; }
}
