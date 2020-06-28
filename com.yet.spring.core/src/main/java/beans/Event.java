package beans;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat dateFormat) {
        this.date = date;
        this.dateFormat = dateFormat;
        Random rnd = new Random();
        id = rnd.nextInt(10000) + 1;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormat.format(date);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
