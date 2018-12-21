                  /*  File:  evenPt.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class evenPt extends Template {

     static {templateClass = new evenPt() ; }

     public void setup() {
          filePrefix = "evenPt" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.2*0.4 ;   
          ysize = 3.2*0.4 ;   
          xmin = -2.1 ;
          xmax =  2.1 ;
          ymin = -0.2 ;
          ymax =  3.0 ;
          topmargin = 0.0 ;
          bottommargin = 0.0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          double x0 =1.6 ; double y0 = x0*x0 ;
          double r = 0.1 ;
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ; // fTeXlabel(xmax+0.1, 0, "cl", "$x$") ;
          fLine(0.0, ymin, 0.0, ymax) ; // fTeXlabel(0, ymax+0.1, "cb", "$y$") ;
          fLine(x0,0, x0,-0.2) ; fTeXlabel(x0, -0.3, "tc", "$x_0$") ;
          fLine(-x0,0, -x0,-0.2) ; fTeXlabel(-x0, -0.3, "tc", "$-x_0$") ;
          fLine(0,y0, -0.2,y0) ;  ; fTeXlabel(-0.3, y0, "rc", "$y_0$") ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fDisk(x0,y0, r,r, FILLED) ;
          fTeXlabel(x0+1.3*r, y0, "cl", "$(x_0,y_0)$") ;
          fDisk(-x0,y0, r,r, FILLED) ;
          fTeXlabel(-x0-1.3*r, y0, "cr", "$(-x_0,y_0)$") ;
     }
}
