package be.sayHello;

public class Info {
    private String to;
    private String message;

    public Info() {}

    public Info(String to, String message){
        this.to = to;
        this.message = message;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }


}
