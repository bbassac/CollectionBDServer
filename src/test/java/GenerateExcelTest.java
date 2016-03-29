/**
 * Created by b.bassac on 29/09/2015.
 */

import bean.Bd;
import bean.Collection;
import bean.CollectionBuilder;
import bean.Serie;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.testng.annotations.Test;

import javax.ws.rs.core.Response;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GenerateExcelTest {
    public static final String CRLF = System.getProperty("line.separator");

    private static void fillBody(Workbook wb, CreationHelper createHelper) {
        Sheet sheet = wb.createSheet("Listing");
        Collection coll = CollectionBuilder.getCollection(true);
        int lineIndex = 0;
        // Create a row and put some cells in it. Rows are 0 based.
        Row rowTitles = sheet.createRow((short) lineIndex);

        //Headers
        int indexId = 1;
        int indexNom = 2;
        int indexEditeur = 3;
        int indexFini = 4;
        int indexPossede = 5;
        int indexManquante = 6;
        int indexUrl = 7;
        rowTitles.createCell(indexId).setCellValue(createHelper.createRichTextString("ID"));
        rowTitles.createCell(indexNom).setCellValue(createHelper.createRichTextString("Nom"));
        rowTitles.createCell(indexEditeur).setCellValue(createHelper.createRichTextString("Editeur"));
        rowTitles.createCell(indexFini).setCellValue(createHelper.createRichTextString("Fini"));
        rowTitles.createCell(indexPossede).setCellValue(createHelper.createRichTextString("Possede"));
        rowTitles.createCell(indexManquante).setCellValue(createHelper.createRichTextString("Manquante"));
        rowTitles.createCell(indexUrl).setCellValue(createHelper.createRichTextString("Image Url"));
        lineIndex++;

        for (Serie serie : coll.getListeSerie()) {
            Row row = sheet.createRow((short) lineIndex);
            row.createCell(indexId).setCellValue(createHelper.createRichTextString(String.valueOf(serie.getId())));
            row.createCell(indexNom).setCellValue(createHelper.createRichTextString(serie.getNom()));
            row.createCell(indexEditeur).setCellValue(createHelper.createRichTextString(serie.getEditeur()));
            row.createCell(indexFini).setCellValue(createHelper.createRichTextString(serie.isFini() ? "x" : ""));
            StringBuilder sbPossede = new StringBuilder();
            for (Bd possede : serie.getListPossede()) {
                sbPossede.append(possede.getNumero() + " " + possede.getTitre() + System.getProperty("line.separator"));
            }
            Cell cellPossede = row.createCell(indexPossede);

            cellPossede.getCellStyle().setWrapText(true);
            cellPossede.setCellValue(sbPossede.toString());

            StringBuilder sbmanquante = new StringBuilder();
            for (Bd manquante : serie.getListManquante()) {
                sbmanquante.append(manquante.getNumero() + " " + manquante.getTitre() + CRLF);
            }
            Cell cellManquante = row.createCell(indexManquante);
            cellManquante.getCellStyle().setWrapText(true);
            cellManquante.setCellValue(sbmanquante.toString());

            row.createCell(indexUrl).setCellValue(createHelper.createRichTextString(serie.getImageUrl()));
            row.setHeight((short) -1);
            lineIndex++;
        }
        for (int i = 0; i <= 7; i++) {
            sheet.autoSizeColumn(i);
        }
    }

    @Test(enabled = false)
    public void exportExcel() throws IOException {
        Workbook wb = new HSSFWorkbook();
        //Workbook wb = new XSSFWorkbook();
        CreationHelper createHelper = wb.getCreationHelper();

        fillBody(wb, createHelper);

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("D:\\listing.xls");
        wb.write(fileOut);
        fileOut.close();
    }

    @Test()
    public void exportFromJackson() throws IOException {
        Collection coll = CollectionBuilder.getCollection(true);

        ObjectMapper mapper = new ObjectMapper();
        String string = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(coll);
        try {
            File file = new File("D:\\listing");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(string);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test(enabled = false)
    public void export() {
        Collection coll = CollectionBuilder.getCollection(true);

        StringBuilder builder = new StringBuilder();

        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("http://localhost:8080/collectionbdserver/rest/listing");
        Response response = target.request().get();

        try {
            File file = new File("D:\\listing");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(response.readEntity(String.class));
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
