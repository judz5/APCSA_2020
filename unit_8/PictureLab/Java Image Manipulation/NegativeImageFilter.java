// pixel new clr = 255 - og value

public class NegativeImageFilter implements Filter
{
   public void filter(PixelImage pi) {
       Pixel[][] data = pi.getData();    
       
       for(int row = 0; row<data.length;row++){
        for(int col = 0; col<data[row].length;col++){
            Pixel temp = data[row][col];
            temp.setRed(255-temp.getRed());
            temp.setGreen(255-temp.getGreen());
            temp.setBlue(255-temp.getBlue());
            }
        }
       
       
       
       
        pi.setData(data);
    }
}
