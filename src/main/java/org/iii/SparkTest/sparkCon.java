package org.iii.SparkTest;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;

public class sparkCon {
//  static SparkConf conf;
//  static JavaSparkContext sc;
//  public sparkCon() {
//    conf = new SparkConf().setMaster("local");
//    sc = new JavaSparkContext(conf);
//  }
  
  public static void main(String[] args) {
	  SparkConf conf = new SparkConf().setMaster("local").setAppName("firstSpark");
	  JavaSparkContext sc = new JavaSparkContext(conf); 
	  JavaRDD<String> lines = sc.textFile("README.md");
	  JavaRDD<String> filterLines = lines.filter(line -> line.contains("Python"));
	  System.out.println(lines.count());
	  System.out.println("The first of test.html is" +lines.first());
	  System.out.println(filterLines.first()+", 過濾後的行數："+filterLines.count());
  }
}
