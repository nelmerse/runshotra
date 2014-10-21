package runshotra;

public class Runner {

    private final long id;
    private final String content;

    public Runner(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}