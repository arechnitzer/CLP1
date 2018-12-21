                  /*  File:  expInv.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class expInv extends Template {

     static {templateClass = new expInv() ; }

     public void setup() {
          filePrefix = "expInv" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 2.0 ;   
          xmin = -3.0 ;
          xmax = 2.0 ;
          ymin = -2.5 ;
          ymax = 5.0 ;
          topmargin = 0.2 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fTeXlabel(xmax, -0.2, "tr", "$x=Y$") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$") ;
          fTeXlabel(1.7, 5.0, "tl", "$y=e^Y$") ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y = exp(x)", 0, -3.0, 3.0, 1) ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fLine(xmin, 2, xmax, 2) ;
          fTeXlabel(-2.0, 2.1, "bl", "$y=2$") ;
          fLine(xmin, -2, xmax, -2) ;
          fTeXlabel(-2.0, -1.9, "bl", "$y=-2$") ;


     }
}
