package servlet;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfGenerator {
    public static void convertHtmlToPdf(String inputHtmlPath, String outputPdfPath) throws IOException {
        // 从文件中读取 HTML
        org.jsoup.nodes.Document document = Jsoup.parse(new File(inputHtmlPath), "UTF-8");

        // 创建 PDF 文档
        Document pdfDocument = new Document();

        try {
            // 创建 PDF 写入器
            PdfWriter.getInstance(pdfDocument, new FileOutputStream(outputPdfPath));

            // 打开 PDF 文档
            pdfDocument.open();

            // 将 HTML 元素添加到 PDF 文档中
            Elements elements = document.select("body").select("*");
            for (Element element : elements) {
                pdfDocument.add((com.itextpdf.text.Element) element);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            // 关闭 PDF 文档
            pdfDocument.close();
        }
    }
}