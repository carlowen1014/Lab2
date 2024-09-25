import javax.swing.*;

public class Meeting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Planner");
        EventListPanel eventListPanel = new EventListPanel();
        addDefaultEvents(eventListPanel);

        frame.add(eventListPanel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void addDefaultEvents(EventListPanel eventListPanel) {
        LocalDateTime deadlineTime = LocalDateTime.now().plusDays(1);
        Deadline deadline = new Deadline("Project Submission", deadlineTime);

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.now().plusHours(2);
        Meeting meeting = new Meeting("Team Meeting", start, end, "Conference Room A");

        eventListPanel.addEvent(deadline);
        eventListPanel.addEvent(meeting);
    }
}