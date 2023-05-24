package com.onmotor.taller;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PdfPresupuestos {

    public void GeneraPDF() {
        Document document = new Document(PageSize.A4, 20, 20, 20, 20);
        try {
            String nombre = PanelPresupuestos.NombreCliente.getText();
            String matricula = PanelPresupuestos.MatriculaCliente.getText();
            // El archivo pdf que vamos a generar
            FileOutputStream fileOutputStream = new FileOutputStream("Prs/" + nombre + matricula + ".pdf"); //NOI18N

            ////////////////////////////////////////////////////////////////   
            Calendar cal = Calendar.getInstance();
            Date fecha = new Date(cal.getTimeInMillis());
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            ///////////////////////////////////////////////////////
            // Obtener la instancia del PdfWriter
            PdfWriter.getInstance(document, fileOutputStream);

            // Abrir el documento
            document.open();

            ///////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
//ESTE APARTADO ES PARA CREAR EL TIPO DE LETRA COLOR ETC.
            Font fontTitulos1 = FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 15,
                    BaseColor.BLUE);
            Font tfont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);
            Font tfont1 = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD, BaseColor.BLUE);
            Font tfont2 = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD, BaseColor.RED);
            Font tfont3 = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD, BaseColor.BLUE);
/////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////
            String cantidad1 = PanelPresupuestos.c1.getText();
            //String nombre = caja.getText();
            // String modelo = (String) combo1.getSelectedItem();
            String nombre1 = PanelPresupuestos.n1.getText();
            String precio1 = PanelPresupuestos.p1.getText();
            String descuento1 = PanelPresupuestos.d1.getText();

            //////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
            Image fotocabecera = Image.getInstance("src\\main\\java\\Resource\\logo.png"); //NOI18N

            fotocabecera.setAlignment(Element.ALIGN_CENTER);
            fotocabecera.setSpacingAfter(1);
            fotocabecera.setSpacingBefore(0);
            fotocabecera.setIndentationLeft(1);
            fotocabecera.setIndentationRight(1);
            fotocabecera.scaleAbsolute(297, 107);

///////////////////////////////////////////////////////////////////////////////////////////////
            //String parrafo =(""+ formato.format(fecha)+"");
            // document.add(new Paragraph(parrafo));
            ////////////////////////////////////////////////////// ///////////////////////////////
            Paragraph paragraph = new Paragraph();

            paragraph.setSpacingAfter(15);
            paragraph.setSpacingBefore(1);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            paragraph.setIndentationLeft(1);
            paragraph.setIndentationRight(1);

            Chunk chunk1 = new Chunk("Presupuesto exclusivo para  " + nombre + " con el Vehiculo, matricula " + matricula + "", fontTitulos1); //NOI18N

            paragraph.add(chunk1);

            //document.add(new Paragraph("Presupuesto     " + nombre + "",fontTitulos1));
////////////////////////////////////////////////////////////////////
            PdfPTable table = new PdfPTable(4);
            table.getDefaultCell().setFixedHeight(20);
            table.getDefaultCell().setBackgroundColor(BaseColor.YELLOW);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.setWidthPercentage(80);
            table.setSpacingBefore(1);
            table.setSpacingAfter(1);
             PdfPCell cell,cell1,cell2,cell3,cell4;
            cell = new PdfPCell(new Phrase("cantidad", tfont1)); //NOI18N
            cell.setRowspan(1);
            cell1 = new PdfPCell(new Phrase("Descripcion", tfont1)); //NOI18N
            cell1.setRowspan(1);
            cell2 = new PdfPCell(new Phrase("Precio", tfont1)); //NOI18N
            cell2.setRowspan(1);
            cell3 = new PdfPCell(new Phrase("Descuento", tfont1)); //NOI18N
            cell3.setRowspan(1);
            cell4 = new PdfPCell(new Phrase(PanelPresupuestos.c1.getText(), tfont1)); //NOI18N
            cell4.setRowspan(1);
            cell4 = new PdfPCell(new Phrase(PanelPresupuestos.n1.getText(), tfont1)); //NOI18N
            cell4.setRowspan(1);
            cell4 = new PdfPCell(new Phrase(PanelPresupuestos.p1.getText(), tfont1)); //NOI18N
            cell4.setRowspan(1);
            cell4 = new PdfPCell(new Phrase(PanelPresupuestos.d1.getText(), tfont1)); //NOI18N
            cell4.setRowspan(1);
            table.addCell(cell);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            table.addCell(cell4);
            table.addCell(cell4);
            table.addCell(cell4);
            

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////    
            Paragraph paragraph2 = new Paragraph();

            paragraph2.setSpacingAfter(5);
            paragraph2.setSpacingBefore(1);
            paragraph2.setAlignment(Element.ALIGN_CENTER);
            paragraph2.setIndentationLeft(50);
            paragraph2.setIndentationRight(50);

            Chunk chunk = new Chunk("Propuesta econ�mica", fontTitulos1); //NOI18N

            paragraph2.add(chunk);

            ////////////////////////////////////////////////////////////////////////
            Paragraph paragraph3 = new Paragraph();

            paragraph3.setSpacingAfter(5);
            paragraph3.setSpacingBefore(1);
            paragraph3.setAlignment(Element.ALIGN_CENTER);
            paragraph3.setIndentationLeft(50);
            paragraph3.setIndentationRight(50);

            Chunk chunk3 = new Chunk("Mantenimiento", fontTitulos1); //NOI18N

            paragraph3.add(chunk3);

/////////////////////////////////////////////////////////////////////////////           
            document.add(fotocabecera);
            document.add(paragraph);
            document.add(table);
            //////////////////////////////////////////////////////////////////////
            /////////////////////////Imagen de la maquina////////////////////////////// 

            document.add(paragraph2);

            document.add(paragraph3);

            //String parrafo =("Documento cerrado a fecha   " +   formato.format(fecha)+"");
            // document.add(new Paragraph(parrafo));
            Paragraph paragraphfecha = new Paragraph();

            paragraphfecha.setSpacingAfter(50);
            paragraphfecha.setSpacingBefore(10);
            paragraphfecha.setAlignment(Element.ALIGN_CENTER);
            paragraphfecha.setIndentationLeft(1);
            paragraphfecha.setIndentationRight(1);
            Chunk chunkfecha = new Chunk("Documento cerrado a fecha   " + formato.format(fecha) + "", tfont3); //NOI18N

            paragraphfecha.add(chunkfecha);
            document.add(paragraphfecha);

            document.close();

            //Abrir el archivo
            File file = new File("Prs/" + nombre + matricula + ".pdf"); //NOI18N
            Desktop.getDesktop().open(file);

        } catch (DocumentException | IOException ex) {
        }

    }
}
