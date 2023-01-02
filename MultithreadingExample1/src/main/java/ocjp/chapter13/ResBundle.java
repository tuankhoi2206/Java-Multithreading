package ocjp.chapter13;

import java.util.ListResourceBundle;

public class ResBundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
            {"MovieName", "Avatar"},
            {"GrossRevenue","2782275172"},
            {"Year", (Integer)2009}
    };
}