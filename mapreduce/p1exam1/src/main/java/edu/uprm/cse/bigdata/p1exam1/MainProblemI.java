package edu.uprm.cse.bigdata.p1exam1;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * Created by Danny on 3/31/17 - 8:40 PM in exam1-spring-17-big-data-dannyvillanueva.
 */
class MainProblemI {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.println("Usage: MainProblemI <input path> <output path>");
            System.exit(-1);
        }
        Job job = Job.getInstance();
        deleteOutputFileIfExists(arguments, job);
        job.setJarByClass(edu.uprm.cse.bigdata.p1exam1.MainProblemI.class);
        job.setJobName("Problem I");
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        job.setMapperClass(edu.uprm.cse.bigdata.p1exam1.ProblemIMapper.class);
        job.setReducerClass(edu.uprm.cse.bigdata.p1exam1.ProblemIReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        System.exit(job.waitForCompletion(true) ? 0 : 1);

    }
    private void deleteOutputFileIfExists(String[] args, Job job) throws IOException {
        final Path output = new Path(args[1]);
        FileSystem.get(output.toUri(), job.getConfiguration()).delete(output, true);
    }


}

