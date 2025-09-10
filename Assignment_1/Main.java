package Assignment_1;
//the idea is that there is a Business Event of an IT Company with some Meetings,
//and those meetings are sessions about various topics for the departments of the company.
//Each participant may create their own "plan" for this Business Event,
//going only to those sessions that are related to their department.
//For example, there are sessions for Designers, Front Developers, Back Developers and so on,
//but designer will not go to the sessions for back dev-s, it's unnecessary.
//So with this builder they will be able to construct their own plan
//of the sessions that they will attend.
public class Main {
    public static void main(String[] args) {

        SessionsList intro = new SessionsList();
        intro.listOfSessions();

        BusinessSessions designer = new BusinessSessions.Builder()
                .setDepartment("Design")
                .setId(101)
                .setSession("Briefing")
                .setSession("Design Session")
                .setSession("Future Strategies Discussion")
                .setSession("Final General Meeting")
                .build();


        System.out.println(designer);
    }
}
