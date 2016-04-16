/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import static javax.print.PrintServiceLookup.lookupDefaultPrintService;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Admin
 */
public class PrintBillFile 
{
    
    /**
     *
     * @param path
     * @throws PrintException
     * @throws IOException
     */
    public void print(String path) throws PrintException, IOException {
    String defaultPrinter =lookupDefaultPrintService().getName();
            showMessageDialog(null,"Default printer: " + defaultPrinter);

    PrintService service = lookupDefaultPrintService();
    DocFlavor flavor;
        PrintJobWatcher pjw;
        try (FileInputStream in = new FileInputStream(new File(path))) {
            PrintRequestAttributeSet  pras = new HashPrintRequestAttributeSet();
            pras.add(new Copies(1));
            flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
            Doc doc = new SimpleDoc(in, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
            DocPrintJob job = service.createPrintJob();
            pjw = new PrintJobWatcher(job);
            job.print(doc, pras);
            pjw.waitForDone();
        }

    // send FF to eject the page
    InputStream ff = new ByteArrayInputStream("\f".getBytes());
    Doc docff = new SimpleDoc(ff, flavor, null);
    DocPrintJob jobff = service.createPrintJob();
    pjw = new PrintJobWatcher(jobff);
    jobff.print(docff, null);
    pjw.waitForDone();
  }
}
