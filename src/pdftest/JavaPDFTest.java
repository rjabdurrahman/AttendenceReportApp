package pdftest;

import java.io.IOException;

public class JavaPDFTest {

    public static void main(String[] args) throws IOException {

       PDFManager pdfManager = new PDFManager();
       pdfManager.setFilePath("E:\\test.pdf");
       System.out.println(pdfManager.ToText());       
    
}    
}

