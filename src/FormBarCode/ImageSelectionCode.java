
package FormBarCode;

import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 *
 * @author CSR
 */
public class ImageSelectionCode implements Transferable {
    
    private Image image;
    
    public ImageSelectionCode (Image image) {
        this.image = image;
    }
    
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[] { DataFlavor.imageFlavor };
    }
    
    public boolean isDataFlavorSupported (DataFlavor Flavor) {
        return DataFlavor.imageFlavor.equals(Flavor);
    }
    
    public Object getTransferData (DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        if (!DataFlavor.imageFlavor.equals(flavor)) {
            throw new UnsupportedFlavorException(flavor);
        }
        return image;
    }
}