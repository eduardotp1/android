package testing.gps_location;

/**
 * Created by Hugo on 08/05/2017.
 */

public class checkin {
    private static String id;
    private static String[] location;
    private static String professional;
    private static String message;
    private static String talkedto;
    private static String clientname;
    private static String time;
    private static String salestatus;

    public checkin(String id){
        this.id = id;
        location = new String[2];
        location[0] = null;
        location[1] = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTalkedto() {
        return talkedto;
    }

    public void setTalkedto(String talkedto) {
        this.talkedto = talkedto;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSalestatus() {
        return salestatus;
    }

    public void setSalestatus(String salestatus) {
        this.salestatus = salestatus;
    }
}
