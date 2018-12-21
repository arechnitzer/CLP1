                  /*  File:  slopeE.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class slopeE extends Template {

     static {templateClass = new slopeE() ; }

     public void setup() {
          filePrefix = "slopeE" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 8.0*0.4 ;   
          ysize = 5.3*0.4 ;   
          xmin = -1.0 ;
          xmax =  7.0 ;
          ymin = -0.3 ;
          ymax =  5.0 ;
          topmargin = 0.3 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0.4 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          String Blue = "1 1 0 0 setcmykcolor  " ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          String Yellow = "0 0 1 0 setcmykcolor  " ;

          double m = 0.5 ; double b = 1.5 ;
          double x0 = 3.0 ; double y0 = m*x0+b ;
          double x1 = 6.0 ; double y1 = m*x1+b ;
          double r = 0.15 ;

          fEnv("lineWidth", 0.5) ;
          fTeXlabel(xmax, -0.1, "tr", "$x$", "x") ;
          fTeXlabel(-0.1, ymax, "tr", "$y$", "y") ;
          fLine(xmin,0, xmax, 0) ;
          fLine(0, ymin,0, ymax) ;


          fEnv("lineWidth", 3.0) ;
          fEnv("useColorPs", "true") ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fLine(xmin, m*xmin+b, xmax, m*xmax+b) ;
          fEnv("lineWidth", 0.5) ;
          canvas.append( new fPsWrite(Yellow+"\n")) ;
          fLine(xmin, m*xmin+b, xmax, m*xmax+b) ;
          fEnv("useColorPs", "false") ;
          fTeXlabel(xmax+0.15, m*xmax+b, "cl", "$y=\\tfrac{1}{2} x+\\tfrac{3}{2}$") ;
          fDisk(x0,y0,r,r, FILLED) ;
          fDisk(x1,y1,r,r, FILLED) ;
          fTeXlabel(x0+0.3,y0+0.3, "br", "$(x_0,y_0)$") ;
          fTeXlabel(x1+0.3,y1+0.3, "br", "$(x_1,y_1)$") ;




     }
}
