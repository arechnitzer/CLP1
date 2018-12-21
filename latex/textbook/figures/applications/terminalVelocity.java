                  /*  File:  terminalVelocity.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class terminalVelocity extends Template {

     static {templateClass = new terminalVelocity() ; }

     public void setup() {
          filePrefix = "terminalVelocity" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 1.4 ;   
          xmin = -0.15 ;
          xmax = 3.4 ;
          ymin = -0.1 ;
          ymax = 1.3 ;
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
          fCurve("y = 1-exp(-x)", 0, 0.0, xmax, 1) ;
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fLine(0, 1,   -0.1, 1) ;
          fEnv("psDash", "[2 2] 1") ;
          fLine(0,1, xmax, 1) ;
          fEnv("psDash", "clear") ;
          fTeXlabel(xmax, -0.05, "tr", "$t$") ;
          fTeXlabel(-0.05, ymax, "tr", "$v$") ;
          fTeXlabel(-0.15, 1, "cr", "$\\tfrac{mg}{\\beta}$") ;

//          fTeXlabel(2.2, 7.5, "tl", "$y=e^x$") ;
     }
}
