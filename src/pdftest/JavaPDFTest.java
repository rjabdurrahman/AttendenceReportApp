package pdftest;

import java.io.IOException;

public class JavaPDFTest {

    public static void main(String[] args) throws IOException {
        String[] date = new String[40];
       PDFManager pdfManager = new PDFManager();
       pdfManager.setFilePath("E:\\test.pdf");
       //System.out.println(pdfManager.ToText().substring(376,704));
       String alldate;
       alldate = pdfManager.ToText().substring(376,704);
       date[0] = alldate.substring(0,10);
       date[1] = alldate.substring(11,21);
       date[2] = alldate.substring(22,33);
        System.out.println(date[0].length());
       
             
    
}    
}

