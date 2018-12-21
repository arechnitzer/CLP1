                  /*  File:  painting.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class painting extends Template {

     static {templateClass = new painting() ; }

     public void setup() {
          filePrefix = "painting" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.5 ;   
          ysize = 1.2 ;   
          xmin = -1 ;
          xmax = 24 ;
          ymin = -1 ;
          ymax = 11 ;
          topmargin = 0.1 ;
          bottommargin = 0.0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 0.5) ;
          fLine(20, 10, 20, 0) ;
          fLine(0, 0, 20, 0) ;
          fLine(0, 0, 20, 3) ;
          fLine(0, 0, 20, 10) ;

          fTeXlabel(20.5, 1.5, "lc", "$d$") ;
          fTeXlabel(20.5, 6.5, "lc", "$h$") ;
          fTeXlabel(10, -1, "tc", "$x$") ;

          fTeXlabel(5,1.7, "cc", "$\\theta$") ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 2.0) ;
          fLine(20, 3, 20, 10) ;
     }
}
