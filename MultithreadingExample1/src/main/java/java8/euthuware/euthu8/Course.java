package java8.euthuware.euthu8;

public class Course {
    private String id;
    private String category;

    public Course(String id, String category) {
        this.id = id;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
