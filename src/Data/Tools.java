package Data;

import java.util.ArrayList;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Tools {
   private int maps;//map列表
   private int reduces;//reduce列表
   private int nodes;//任务节点列表
   private int clouds;//云服务器列表
   
   abstract class schedule{
	   
   }
   public int getmaps(){
	   return maps;
   }
   public void setmaps(){
	   this.maps = maps;
   }
   public int getreduces(){
	   return reduces;
   }
   public void setreduces(){
	   this.reduces = reduces;
   }
   public int getnodes(){
	   return nodes;
   }
   public void setnodes(){
	   this.nodes = nodes;
   }
   public int getclouds(){
	   return clouds;
   }
   public void setclouds(){
	   this.clouds = clouds;
   }
}
