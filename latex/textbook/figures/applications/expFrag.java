                  /*  File:  expFrag.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class expFrag extends Template {

     static {templateClass = new expFrag() ; }

     public void setup() {
          filePrefix = "expFrag" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0*0.7 ;   
          ysize = 2.0*0.7 ;   
          xmin = -3.0 ;
          xmax = 3.0 ;
          ymin = -0.5 ;
          ymax = 7.5 ;
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
          fEnv("lineWidth", 1.0) ;
          fCurve("y = exp(x)", 0, 1.5, 3.0, OPEN) ;
          fCurve("y = exp(x)", 0, -3.0, -1.5, OPEN) ;
          fEnv("lineWidth", 0.5) ;
          fLine(-3.0, 0.0, 3.0, 0.0) ;
          fLine(0.0, -0.5, 0.0, 7.5) ;

          fTeXlabel(2.1, 7.5, "tl", "$y=e^x$") ;
     }
}
