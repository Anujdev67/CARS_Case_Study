package entity;

import entity.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncidentDAO {

    private Connection connection;

    public IncidentDAO() {
        this.connection = DatabaseConnection.getConnection();
    }

    public boolean insertIncident(Incident incident) {
        String sql = "INSERT INTO Incidents (IncidentType, IncidentDate, Location, Description, Status, VictimID, SuspectID) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, incident.getIncidentType());
            preparedStatement.setDate(2, new java.sql.Date(incident.getIncidentDate().getTime()));
            preparedStatement.setString(3, incident.getLocation());
            preparedStatement.setString(4, incident.getDescription());
            preparedStatement.setString(5, incident.getStatus());
            preparedStatement.setInt(6, incident.getVictimID());
            preparedStatement.setInt(7, incident.getSuspectID());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Add methods for fetching, updating, and deleting incidents...
}
