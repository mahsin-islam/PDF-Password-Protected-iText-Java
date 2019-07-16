/**
*
* @author mahsin
*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
public class Main {
public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException {
       PdfReader reader = new PdfReader("C:/PasswordNOTGivenPDF.pdf");
       PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("C:/PDFwithPassword.pdf"));
       stamper.setEncryption("password".getBytes(), "owner_password".getBytes(),PdfWriter.ALLOW_COPY, PdfWriter.ENCRYPTION_AES_256);
       stamper.close();
       reader.close();
       System.out.println("Successfully Done");
}
}
