                  /*  File:  ladder.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class ladder extends Template {

     static {templateClass = new ladder() ; }

     public void setup() {
          filePrefix = "ladder" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 0.6*1.2 ;   
          ysize = 1.2*1.2 ;   
          xmin = -1 ;
          xmax = 9 ;
          ymin = -1.0 ;
          ymax = 19 ;
          topmargin = -0.0 ;
          bottommargin = 0.00 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 0.5) ;
          fLine(0, 19, 0, 0) ;
          fLine(-1, 0, 9, 0) ;
          fLine(4,0, 4,8) ;
          fLine(-3, 0, 0, 0) ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 1.0) ;
          fLine(8, 0, 0, 16) ;

          fTeXlabel(3.8, 4, "rc", "$8$") ;
          fTeXlabel(2, 0.4, "bc", "$4$") ;
          fTeXlabel(6.2, 0.4, "bc", "$\\theta$") ;
          fTeXlabel(4.2, 8.2, "bl", "$\\ell$") ;
          

     }
}
