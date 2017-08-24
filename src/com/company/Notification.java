package com.company;
import java.time.LocalDateTime;


public abstract class Notification {

    private LocalDateTime createdAt;
    private String Subject;
    private String Body;
    protected String status = "cool";

    public Notification(String Subject, String Body) {
        this.Subject = Subject;
        this.Body = Body;
        this.createdAt = LocalDateTime.now();
    }
    public void showStatus(){
        System.out.print(this.status);
    }

    public String getSubject() {
        return Subject;
    }

    public String getBody() {
        return Body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public abstract void transport() throws NoTransportation;


}
