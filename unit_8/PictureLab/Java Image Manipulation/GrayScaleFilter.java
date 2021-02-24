

public class GrayScaleFilter implements Filter
{
   public void filter(PixelImage pi) {
       Pixel[][] data = pi.getData();    
       
       for(int row = 0; row<data.length;row++){
        for(int col = 0; col<data[row].length;col++){
            Pixel temp = data[row][col];
            int avg = (temp.getRed()+temp.getBlue()+temp.getGreen())/3;
            temp.setRed(avg);
            temp.setBlue(avg);
            temp.setGreen(avg);
            }
        }
       
        pi.setData(data);
    }
}
