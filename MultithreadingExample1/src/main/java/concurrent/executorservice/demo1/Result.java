package concurrent.executorservice.demo1;

public class Result {
    private String name;
    private String timestamp;

    public Result(String name, String timestamp) {
        this.name = name;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Result{" + "name='" + name + '\'' + ", timestamp='" + timestamp + '\'' + '}';
    }
}
