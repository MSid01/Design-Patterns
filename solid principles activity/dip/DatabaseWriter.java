package solid.live.dip;

public class DatabaseWriter implements Writer {

    @Override
    public void write(String encodedData) {
        MyDatabase database = new MyDatabase();
        database.write(encodedData);
    }
}
