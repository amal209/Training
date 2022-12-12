package OOBasics

import scala.reflect.io.File
import java.nio.file.{FileSystems, Files}
import scala.collection.JavaConverters._



object test extends App{

  val dir = FileSystems.getDefault.getPath("C:/Users/aelhadyn/Desktop/Training/")
  Files.list(dir).iterator().asScala.foreach(println)

  /hive/warehouse/


  val uri = new URI("hdfs://192.168.182.6:8020/hive/warehouse/")
  val fs = FileSystem.get(uri, new Configuration())
  val filePath = new Path("/hive/warehouse/")
  val status = fs.listStatus(filePath)
  status.map(sts => sts.getPath).foreach(println)


  val listStatus = org.apache.hadoop.fs.FileSystem.get(new URI("hdfs://192.168.182.6:8020/hive/warehouse/"), sc.hadoopConfiguration)
    .globStatus(new org.apache.hadoop.fs.Path("hdfs://192.168.182.6:8020/hive/warehouse/"))



  FileSystem.get(new URI("hdfs://192.168.182.6:8020/hive/warehouse/"), new Configuration())


}

object HDFSProgram extends App {
  val uri = new URI("hdfs://192.168.182.6:8020/");
  val fs = FileSystem.get(uri,new Configuration());
  val filePath = new Path("hive/warehouse/");
  val status = fs.listStatus(filePath);
  status.map(sts => sts.getPath).foreach(println);
}

import org.apache.hadoop.fs.FileSystem;
import java.net.URI;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.Configuration;
var fs1 = FileSystem.get(new URI("hdfs://192.168.182.6:8020"), new Configuration()).listStatus(new Path("hdfs://192.168.182.6:8020/ecomData"));

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.net.URI;


val conf = spark.sparkContext.hadoopConfiguration;
val fs = FileSystem.get(conf);
FileSystem.get(new URI("hdfs://192.168.182.6:8020"), conf);
val dirPath = new Path("hdfs://192.168.182.6:8020/hive/warehouse/");
val filestatus = fs.listStatus(dirPath);


FileSystem.get(new URI("hdfs://quickstart.cloudera:8020/"), new Configuration())