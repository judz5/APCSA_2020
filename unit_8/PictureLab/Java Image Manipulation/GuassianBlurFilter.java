/*
 * 
 * 
 * 
 * 
 */

public class GuassianBlurFilter implements Filter
{
   public void filter(PixelImage pi) {
       Pixel[][] data = pi.getData();    
       for(int row = 1;row<data.length-1;row++){
        for(int col = 1;col<data[row].length-1;col++){
           Pixel temp = data[row][col];
           int totalRed = 0;
           int totalBlue = 0;
           int totalGreen = 0;
           
           for(int rowCheck = row-1;rowCheck<=row+1;rowCheck++){
              for(int colCheck = col-1;colCheck<=col+1;colCheck++){
              
                 if((rowCheck == row-1 || rowCheck == row+1)&&(colCheck == col-1 || colCheck == col+1)){
                totalRed = totalRed + data[rowCheck][colCheck].getRed();
                totalGreen = totalGreen + data[rowCheck][colCheck].getGreen();
                totalBlue = totalBlue + data[rowCheck][colCheck].getBlue();
                 }else if(((rowCheck == row-1 || rowCheck == row+1) && colCheck == col) || (rowCheck == row && (colCheck == col-1 || colCheck == col+1))){
                 totalRed = totalRed + data[rowCheck][colCheck].getRed() * 2;
                 totalGreen = totalGreen + data[rowCheck][colCheck].getGreen() * 2;
                 totalBlue = totalBlue + data[rowCheck][colCheck].getBlue() * 2;
                 }else if(rowCheck == row && colCheck == col){
                  totalRed = totalRed + data[rowCheck][colCheck].getRed() * 4;
                 totalGreen = totalGreen + data[rowCheck][colCheck].getGreen() * 4;
                 totalBlue = totalBlue + data[rowCheck][colCheck].getBlue() * 4;
                  }
                }
              }
              temp.setRed(totalRed/16);
              temp.setGreen(totalGreen/16);
              temp.setBlue(totalBlue/16);
            }
        }
        pi.setData(data);
    }
    }



