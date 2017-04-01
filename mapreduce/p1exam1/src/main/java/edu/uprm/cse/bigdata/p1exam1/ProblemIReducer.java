import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by Danny on 3/31/17 - 8:30 PM in exam1-spring-17-big-data-dannyvillanueva.
 */
public class ProblemIReducer extends Reducer<Text, Text, Text, Text> {
    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {

        java.lang.StringBuilder lista= new java.lang.StringBuilder();
        for (Text value : values){
            lista.append("," + value.toString());
        }
        context.write(key, new Text(lista.toString().toString()));
    }
}
