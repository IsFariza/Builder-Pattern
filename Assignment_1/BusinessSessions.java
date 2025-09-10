package Assignment_1;

import java.util.ArrayList;
import java.util.HashMap;


public class BusinessSessions {

    private String department;
    private int participantID;
    private ArrayList<String> sessions;
    
    public BusinessSessions(Builder builder){
        this.department=builder.department;
        this.participantID=builder.participantID;
        this.sessions = builder.sessions;
    }

    public static class Builder{
        private String department;
        private int participantID;
        private ArrayList<String> sessions = new ArrayList<>();

        public Builder setDepartment(String department){
            this.department = department;
            return this;
        }
        public Builder setId(int ID){
            this.participantID = ID;
            return this;
        }

        public Builder setSession(String session) {
            this.sessions.add(session);
            return this;
        }
        public BusinessSessions build() {
            return new BusinessSessions(this);
        }


    }

    public String plan(){
        String output = "Business Meeting Plan for participant "+ this.participantID +
                " (department: " + this.department + ")";
        int i=1;
        for(String session : sessions){
            output += "\n" + i + ". " + session;
            i++;
        }
        return output;
    }
    @Override
    public String toString(){
            return plan();
    }


}
