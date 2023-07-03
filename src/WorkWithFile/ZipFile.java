package WorkWithFile;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {

    public static void main(String[] args) throws IOException {
        final File inputFile = new File("D:\\Working\\xTel\\File\\update.txt");
        final String zipFilePath = "D:\\Working\\xTel\\File\\update.zip";
        zipFile(inputFile, zipFilePath);
    }


    private static void zipFile(File inputFile, String zipFilePath)
            throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ZipOutputStream zipos = null;

        try {
            fos = new FileOutputStream(zipFilePath);
            zipos = new ZipOutputStream(fos);

            ZipEntry zipEntry = new ZipEntry(inputFile.getName());
            zipos.putNextEntry(zipEntry);

            fis = new FileInputStream(inputFile);
            byte[] buf = new byte[1024];
            int length;
            while ((length = fis.read(buf)) > 0) {
                zipos.write(buf, 0, length);
            }
            System.out.println("File " + inputFile
                    + " da duoc zip thanh file " + zipFilePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (zipos != null) {
                zipos.closeEntry();
                zipos.close();
            }
            if (fos != null)
                fos.close();
            if (fis != null)
                fis.close();
        }
    }
}
