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

public class GeneraPresupuesto {
   Document document = new Document(PageSize.A4, 20, 20, 20, 20);
        try {
String nombre = caja.getText();
String modelo = (String) combo1.getSelectedItem();
            // El archivo pdf que vamos a generar
            FileOutputStream fileOutputStream = new FileOutputStream("Prs/"+nombre+modelo+".pdf"); //NOI18N
            
         ////////////////////////////////////////////////////////////////   
        Calendar cal = Calendar.getInstance();
        Date fecha = new Date( cal.getTimeInMillis() );
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
            String nombre1 = cajarecompra.getText();
            //String nombre = caja.getText();
           // String modelo = (String) combo1.getSelectedItem();
            String vacio1 = cajaotrosdescuentos1.getText();
            String vacio2 = cajaotrosdescuentos.getText();
            String nuevocliente = cajanuevocliente.getText();
             String precio = cajaprecio.getText();
             String color = cajacolor.getText();
             String negro = cajanegro.getText();
             String meses = cajarentingmeses.getText();
             String rentingprecio = cajarentingprecio.getText();
             String alquilerprecio = cajaalquiler.getText();
             String garantia1 = cajagarantia.getText();
             String otrodes2 = cajaotrosdescuentos2.getText();
             String otrodes3 = cajaotrosdescuentos3.getText();
             String otrodes4 = cajaotrosdescuentos4.getText();
             String otrodes5 = cajaotrosdescuentos5.getText();
             
             //////////////////////////////////////////////////////////////
               
            
/////////////////////////////////////////////////////////////////////////

            
        
            Image fotocabecera= Image.getInstance("Imagenes/Cabecera.jpg"); //NOI18N
 
            fotocabecera.setAlignment(Element.ALIGN_CENTER);
            fotocabecera.setSpacingAfter(1);
            fotocabecera.setSpacingBefore(0);
            fotocabecera.setIndentationLeft(1);
            fotocabecera.setIndentationRight(1);
            fotocabecera.scaleAbsolute(500, 110);

////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////
            Image foto2 = Image.getInstance("Imagenes/piedepagina.jpg"); //NOI18N
//foto.scaleAbsolute(150f, 150f);
            foto2.setAlignment(Element.ALIGN_CENTER);
            foto2.setSpacingAfter(1);
            foto2.setSpacingBefore(1);
            //foto2.setIndentationLeft(20);
            foto2.setIndentationRight(1);
            foto2.scaleAbsolute(550, 100);
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

            Chunk chunk1 = new Chunk("Presupuesto exclusivo para  " + nombre + "", fontTitulos1); //NOI18N

            paragraph.add(chunk1);

            //document.add(new Paragraph("Presupuesto     " + nombre + "",fontTitulos1));


////////////////////////////////////////////////////////////////////


    
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


///////////////////////////////////////////////////////////////////
            PdfPTable table = new PdfPTable(2);

            table.getDefaultCell().setFixedHeight(20);
            table.getDefaultCell().setBackgroundColor(BaseColor.YELLOW);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.setWidthPercentage(80);
            table.setSpacingBefore(1);
            table.setSpacingAfter(1);


            PdfPCell cell;
            PdfPCell cell1;
            PdfPCell cell2;
            PdfPCell cell3;
            PdfPCell cell4;
            PdfPCell cell5;
            PdfPCell cell6;
            PdfPCell cell7;
            PdfPCell cell8;
            PdfPCell cell9;
            PdfPCell cell14;
            PdfPCell cell15;
            PdfPCell cell16;
            PdfPCell cell17;
            PdfPCell cell10;
            PdfPCell cell11;
            PdfPCell cell12;
            PdfPCell cell13;
     

            cell = new PdfPCell(new Phrase("Modelo", tfont1)); //NOI18N
            cell.setRowspan(1);

            cell1 = new PdfPCell(new Phrase("" + modelo + "", tfont1)); //NOI18N

            cell2 = new PdfPCell(new Phrase("Finalizador", tfont1)); //NOI18N
            cell3 = new PdfPCell(new Phrase("Incluido", tfont1)); //NOI18N
           cell4 = new PdfPCell(new Phrase());
                if (descuentoporrecompra.isSelected() == true){
               cell4 = new PdfPCell (new Phrase("Descuento por recompra",tfont1)); //NOI18N
           }
            cell5 = new PdfPCell(new Phrase(""+ nombre1 + " Euros", tfont2)); //NOI18N
            cell6 = new PdfPCell();
                if (descuentonuevocliente.isSelected() == true){
            cell6=new PdfPCell(new Phrase("Descuento por nuevo Cliente",tfont1)); //NOI18N
            }
            
            cell7 = new PdfPCell(new Phrase("" + nuevocliente + " Euros", tfont2)); //NOI18N
            cell8 = new PdfPCell(new Phrase("", tfont1)); //NOI18N
            if (otrosdescuentos.isSelected() == true){
               cell8 = new PdfPCell(new Phrase(""+ vacio1 + "" , tfont1)); //NOI18N
            }
             cell9 = new PdfPCell(new Phrase(""+ vacio2 +" Euros", tfont2)); //NOI18N
           // cell8.setBackgroundColor(BaseColor.YELLOW);
            //cell8.setBorderColor(BaseColor.BLUE);
           // cell8.setBorderWidth(1);
            
            
            //cell9.setBackgroundColor(BaseColor.YELLOW);
           // cell8.setBackgroundColor(BaseColor.YELLOW);
           // cell9.setBorderColor(BaseColor.BLUE);
            //cell9.setBorderWidth(1);
            cell9.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell3.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell5.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell7.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell1.setHorizontalAlignment(Element.ALIGN_RIGHT);
         
            cell10 = new PdfPCell(new Phrase("Precio de la maquina", tfont1)); //NOI18N
            cell11 = new PdfPCell(new Phrase(""+ precio + "   Euros", tfont1)); //NOI18N
            cell10.setBorderColor(BaseColor.BLUE);
            cell11.setBorderColor(BaseColor.BLUE);
            /////////////////////////////////////////////////////////////////////////
            cell12 = new PdfPCell(new Phrase("TOTAL", tfont1)); 
             cell12.setBackgroundColor(BaseColor.YELLOW);
             cell12.setBorderWidth(1);
             cell12.setBorderColor(BaseColor.BLUE);
             cell1.setBorderColor(BaseColor.BLUE);
             cell2.setBorderColor(BaseColor.BLUE);
             cell3.setBorderColor(BaseColor.BLUE);
             cell4.setBorderColor(BaseColor.BLUE);
             cell5.setBorderColor(BaseColor.BLUE);
             cell6.setBorderColor(BaseColor.BLUE);
             cell7.setBorderColor(BaseColor.BLUE);
             cell8.setBorderColor(BaseColor.BLUE);
             cell9.setBorderColor(BaseColor.BLUE);
             cell10.setBorderColor(BaseColor.BLUE);
             cell11.setBorderColor(BaseColor.BLUE);
             cell.setBorderColor(BaseColor.BLUE);
             
             
             
             
             
          
                String a = cajaprecio.getText();
                 String b = cajanuevocliente.getText();
                 String c = cajaotrosdescuentos.getText();
                 String d = cajarecompra.getText();
                 String e = cajaotrosdescuentos3.getText();
                 String f = cajaotrosdescuentos5.getText();
                int num_a; 
                int num_b; 
                int num_c; 
                int num_d; 
                int num_e; 
                int num_f; 
             if (a.equals("")) {
                 num_a = 0;
             }else{
                 num_a = Integer.parseInt(a);
                }
             if (b.equals("")) {
                 num_b = 0;
             }else{
                 num_b = Integer.parseInt(b);
                }
             if (c.equals("")) {
                 num_c = 0;
             }else{
                 num_c= Integer.parseInt(c);
                }
             if (d.equals("")) {
                 num_d = 0;
             }else{
                 num_d = Integer.parseInt(d);
                }
              if (e.equals("")) {
                 num_e = 0;
             }else{
                 num_e = Integer.parseInt(e);
                }
                      if (f.equals("")) {
                 num_f = 0;
             }else{
                 num_f = Integer.parseInt(f);
                }
                     
                
                int suma = num_a - num_b - num_c - num_d - num_e - num_f;
                 
               cell13 = new PdfPCell(new Phrase("" + suma +"   Euros", tfont1));
               cell13.setHorizontalAlignment(Element.ALIGN_RIGHT);          
             cell11.setHorizontalAlignment(Element.ALIGN_RIGHT);
              cell13.setBackgroundColor(BaseColor.YELLOW);
              cell13.setBorderWidth(1);
              cell13.setBorderColor(BaseColor.BLUE);
              
              cell14 = new PdfPCell(new Phrase(""+otrodes2+"", tfont1));
            cell15 = new PdfPCell(new Phrase(""+otrodes3+"   Euros", tfont2));
            cell15.setHorizontalAlignment(Element.ALIGN_RIGHT);  
         cell16 = new PdfPCell(new Phrase(""+otrodes4+"", tfont1));
         cell17 = new PdfPCell(new Phrase(""+otrodes5+"   Euros", tfont2));
         cell17.setHorizontalAlignment(Element.ALIGN_RIGHT);  
             

            table.addCell(cell);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);  
            table.addCell(cell4);           
            table.addCell(cell5);
            table.addCell(cell6);
            table.addCell(cell7);
            table.addCell(cell8);
            table.addCell(cell9);
            table.addCell(cell14);
            table.addCell(cell15);
            table.addCell(cell16);
            table.addCell(cell17);
            table.addCell(cell10);
            table.addCell(cell11);
            table.addCell(cell12);
           table.addCell(cell13);
         
/////////////////////////////////////////////////////////////////////////////
            PdfPTable table1 = new PdfPTable(2);

            table1.getDefaultCell().setFixedHeight(20);
            table1.getDefaultCell().setBackgroundColor(BaseColor.BLUE);
            table1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table1.setWidthPercentage(80);
            table1.setSpacingBefore(1);
            table1.setSpacingAfter(1);

            cell = new PdfPCell(new Phrase("Copias en COLOR", tfont1)); //NOI18N
            cell2 = new PdfPCell(new Phrase("Copias en NEGRO", tfont1)); //NOI18N
            cell4 = new PdfPCell(new Phrase("Renting", tfont1)); //NOI18N
                 if (renting.isSelected() == true){
                cell4 = new PdfPCell(new Phrase("Renting    " + meses + "   meses", tfont1));} //NOI18N
                if (renting.isSelected() == true){
            cell5 = new PdfPCell(new Phrase("" + rentingprecio + " Euros/mes", tfont1)); //NOI18N
                 } 
                
                 if (alquiler.isSelected() == true){
                 cell4 = new PdfPCell(new Phrase("Alquiler", tfont1)); //NOI18N
                 }
                 if (alquiler.isSelected() == true){
                 cell4 = new PdfPCell(new Phrase("Alquiler", tfont1)); //NOI18N
                 
                 cell5 = new PdfPCell(new Phrase("" + alquilerprecio + " Euros/mes", tfont1)); //NOI18N
                 }
                
            cell1 = new PdfPCell(new Phrase("" + color + " Euros", tfont2)); //NOI18N
            cell3 = new PdfPCell(new Phrase("" + negro +  " Euros", tfont2)); //NOI18N
            
            cell1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell3.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell5.setHorizontalAlignment(Element.ALIGN_RIGHT);
             cell7 = new PdfPCell(new Phrase("Garantia total durante   " + garantia1 +  "   meses", tfont2)); //NOI18N
             cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
               cell7.setColspan(2);
               cell6 = new PdfPCell(new Phrase("El mantenimiento incluye toner, piezas, reparacion y desplazamiento del T�cnico", tfont1));
               cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
               cell6.setColspan(2);

            table1.addCell(cell);
            table1.addCell(cell1);
            table1.addCell(cell2);
            table1.addCell(cell3);
            table1.addCell(cell4);
            table1.addCell(cell5);
            table1.addCell(cell6);
            table1.addCell(cell7);
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
 //////////////////////////////////////////////////////////////////////
 if (combo1.getSelectedItem().equals("c360")) {
            Image foto1 = Image.getInstance("Imagenes/c360.jpg"); //NOI18N
          foto1.setAlignment(Element.ALIGN_CENTER);
            foto1.setSpacingAfter(5);
            foto1.setSpacingBefore(1);
            foto1.setIndentationLeft(5);
            foto1.setIndentationRight(5);
             document.add(foto1);
            
            
}
if (combo1.getSelectedItem().equals("C284e")) {
            Image foto284 = Image.getInstance("Imagenes/c284e.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("Sindoh D402")) {
            Image foto284 = Image.getInstance("Imagenes/D402.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("c280")) {
            Image foto284 = Image.getInstance("Imagenes/bizhubc220.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("C364e")) {
            Image foto284 = Image.getInstance("Imagenes/c364e.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("C454e")) {
            Image foto284 = Image.getInstance("Imagenes/c454e.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("C554e")) {
            Image foto284 = Image.getInstance("Imagenes/c554e.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("Sindoh D311")) {
            Image foto284 = Image.getInstance("Imagenes/D310_311.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("Sindoh D310")) {
            Image foto284 = Image.getInstance("Imagenes/D310_311.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("Sindoh N712")) {
            Image foto284 = Image.getInstance("Imagenes/N712.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("C224e")) {
            Image foto284 = Image.getInstance("Imagenes/224.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("Lexmark XC9235")) {
            Image foto284 = Image.getInstance("Imagenes/lexmark_xc9235.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("Ricoh SP5210")) {
            Image foto284 = Image.getInstance("Imagenes/sp5210.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("C308")) {
            Image foto284 = Image.getInstance("Imagenes/Maquinas/c308.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("C368")) {
            Image foto284 = Image.getInstance("Imagenes/Maquinas/c368.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("C458")) {
            Image foto284 = Image.getInstance("Imagenes/Maquinas/c458.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("Bh4050")) {
            Image foto284 = Image.getInstance("Imagenes/Maquinas/4050.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("HP A3 Injet")) {
            Image foto284 = Image.getInstance("Imagenes/Maquinas/hpe87650.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
if (combo1.getSelectedItem().equals("HP A4 Injet")) {
            Image foto284 = Image.getInstance("Imagenes/Maquinas/hpp77940.jpg"); //NOI18N
            foto284.setAlignment(Element.ALIGN_CENTER);
            foto284.setSpacingAfter(5);
            foto284.setSpacingBefore(1);
            foto284.setIndentationLeft(5);
            foto284.setIndentationRight(5);
          foto284.scaleAbsolute(550, 250);
            document.add(foto284);
}
 /////////////////////////////////////////////////////////           
            document.add(paragraph2);
            document.add(table);
            document.add(paragraph3);
            document.add(table1);
             //String parrafo =("Documento cerrado a fecha   " +   formato.format(fecha)+"");
            // document.add(new Paragraph(parrafo));
            Paragraph paragraphfecha = new Paragraph();

            paragraphfecha.setSpacingAfter(50);
            paragraphfecha.setSpacingBefore(10);
           paragraphfecha.setAlignment(Element.ALIGN_CENTER);
            paragraphfecha.setIndentationLeft(1);
            paragraphfecha.setIndentationRight(1);
            Chunk chunkfecha = new Chunk("Documento cerrado a fecha   " +   formato.format(fecha)+"", tfont3); //NOI18N
            
            paragraphfecha.add(chunkfecha);
            document.add(paragraphfecha);
            document.add(foto2);
          
          
            document.close();
           
          //Abrir el archivo
            File file = new File("Prs/" +nombre+modelo+ ".pdf"); //NOI18N
          Desktop.getDesktop().open(file);
             
            
           
        } catch (DocumentException | IOException ex) 
        {
        }
        
    }
  

