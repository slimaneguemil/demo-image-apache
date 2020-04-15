import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TestImage {
    public static void main(String[] args) throws IOException {
        System.out.println("Image begin!"); // Display the string.

        ImageInfo imageInfo = null;
        File imageFile = new File("C:\\Users\\Slimane\\IdeaProjects\\demo-image-apache\\demo\\src\\main\\resources\\download.jpeg");
        final byte imageFileBytes[] = FileUtils.readFileToByteArray(imageFile);
        try {
            imageInfo =  Imaging.getImageInfo(imageFileBytes);
            System.out.println("height dpi:"+ imageInfo.getPhysicalHeightDpi());

        } catch (ImageReadException e) {
            e.printStackTrace();
        }
    }
}
