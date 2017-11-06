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
        int i,j=0;
        for (i = 0; i < 100; i++) {
            date[j++] = alldate.substring(i,i+10);
            i = i+10;
        }
        //date[0] = alldate.substring(0,10);
        //date[1] = alldate.substring(11,21);
        //date[2] = alldate.substring(22,33);
        System.out.println("Date: " + date[5].substring(0,2) + " Month: " + date[5].substring(5,6) + date[5].substring(8,9) );
       
             
    
}    
}

