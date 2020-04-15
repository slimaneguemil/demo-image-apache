import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.io.FileUtils;

import java.io.File;
public class TestImage {

    public void main(String...args){
        ImageInfo imageInfo = null;
        File myObj = new File("filename.txt");
        final byte imageFileBytes[] = FileUtils.readFileToByteArray(imageFile);
        imageInfo =  Imaging.getImageInfo(image);
    }
}
