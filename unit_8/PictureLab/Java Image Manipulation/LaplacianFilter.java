// pixel new clr = 255 - og value

public class LaplacianFilter implements Filter
{
   public void filter(PixelImage pi) {
       Pixel[][] data = pi.getData();    
       for(int row = 1;row<data.length-1;row++){
        for(int col = 1;col<data[row].length-1;col++){
           Pixel temp = data[row][col];
           int totalRed = temp.getRed() * 8;
           int totalBlue = temp.getBlue() * 8;
           int totalGreen = temp.getGreen()* 8;
           
           for(int rowCheck = row-1;rowCheck<=row+1;rowCheck++){
              for(int colCheck = col-1;colCheck<=col+1;colCheck++){
               if(rowCheck == row && colCheck == col){
                 totalRed = totalRed;
                 totalGreen = totalGreen;
                 totalBlue = totalBlue;
                  }else{
                    totalRed = totalRed - data[rowCheck][colCheck].getRed();
                    totalGreen = totalGreen - data[rowCheck][colCheck].getGreen();
                    totalBlue = totalBlue - data[rowCheck][colCheck].getBlue(); 
                    }
                }
              }
              if(totalRed < 0){
                totalRed = 0;
                }else if(totalRed > 255){
                totalRed = 255;
                }
              if(totalGreen < 0){
                totalGreen = 0;
                }else if(totalGreen > 255){
                totalGreen = 255;
                }
              if(totalBlue < 0){
                totalBlue = 0;
                }else if(totalBlue > 255){
                totalBlue = 255;
                }
              temp.setRed(totalRed);
              temp.setGreen(totalGreen);
              temp.setBlue(totalBlue);
            }
        }
        pi.setData(data);
    }
}
