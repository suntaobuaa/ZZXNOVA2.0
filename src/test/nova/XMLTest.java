package test.nova;

import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
public  class  XMLTest  {  
       public  void  xmlEncode()    throws  Exception  
       {  
               MyInfo  my  =  new  MyInfo();  
               my.setMyAge(25);  
               my.setMyName("google");  
               my.setMyAddress("china");  
               my.setMyEducation("master in science");  
 
               XMLEncoder  encoder  =  new  XMLEncoder(  
                               new  BufferedOutputStream(  
                               new  FileOutputStream("myinf.xml")));  
               encoder.writeObject(my);  
               encoder.close();  
               System.out.println(my);  
       }  
 
       public  void  xmlDecode()    throws  Exception  
       {  
             java.beans.XMLDecoder  decoder  =  new  java.beans.XMLDecoder(  
                             new  BufferedInputStream(new  FileInputStream("myinfo.xml")));  
             MyInfo  my  =  (MyInfo)decoder.readObject();  
             decoder.close();  
             System.out.println(my);  
             System.out.println("Your age: "+my.getMyAge());
             System.out.println("Your name: "+my.getMyName());
             System.out.println("Your Address: "+my.getMyAddress()); 
             System.out.println("Your Education: "+my.getMyEducation());
       }  
       public  static  void  main  (String  args[])  throws  Exception  {  
               XMLTest  st  =  new  XMLTest();  
               st.xmlEncode();  
               //st.xmlDecode();  
       }  
}

/**
 * Add one sentence class summary here.
 * Add class description here.
 *
 * @author lxx
 * @version 1.0, 2004-11-16
 */