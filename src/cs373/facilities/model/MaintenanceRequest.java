package cs373.facilities.model;


/**
 * MaintenanceRequests are produced from InspectionRequests, after calling
 * inspectUnit from within a Unit. MaintenanceRequests differ from 
 */
public class MaintenanceRequest {

    private String id;
    private String description;
    private String technician;
    private double cost;

    public void setID(String id) {
        this.id = id;
    }
    public String getID() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }
    public String getTechnician() {
        return technician;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }
}
