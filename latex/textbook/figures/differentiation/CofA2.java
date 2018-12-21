                  /*  File:  CofA2.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class CofA2 extends Template {

     static {templateClass = new CofA2() ; }

     public void setup() {
          filePrefix = "CofA2" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.1 ;   
          ysize = 1.6 ;   
          xmin = -0.1 ;
          xmax = 4.0 ;
          ymin = -0.1 ;
          ymax = 1.5 ;
          topmargin = 0.25 ;
          bottommargin = 0.25 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fCurve("y = ln(x)", 0, 1.0, 4.0, 1) ;
          fEnv("lineWidth", 0.2) ;
          fLine(0, 1, Math.exp(1), 1) ;
          fLine(Math.exp(1), 0, Math.exp(1), 1) ;
          fLine(-0.1, 0.0, 4.0, 0.0) ;
          fLine(0.0, -0.1, 0.0, 1.5) ;
          fLine(1, 0,   1, -0.1) ;
          fLine(2, 0,   2, -0.1) ;
          fLine(Math.exp(1), 0,   Math.exp(1), -0.1) ;
          fLine(3, 0,   3, -0.1) ;
          fLine(4, 0,   4, -0.1) ;
          fLine(0, 0.5,   -0.1, 0.5) ;
          fLine(0, 1,   -0.1, 1) ;
          fLine(0, 1.5,   -0.1, 1.5) ;
          fTeXlabel(4.05, 0, "lc", "$a$") ;
          fTeXlabel(0,1.65, "tr", "$y$") ;
          fTeXlabel(1, -0.15, "tc", "$1$") ;
          fTeXlabel(2, -0.15, "tc", "$2$") ;
          fTeXlabel(Math.exp(1), -0.15, "tc", "$e$") ;
          fTeXlabel(3, -0.15, "tc", "$3$") ;
          fTeXlabel(4, -0.15, "tc", "$4$") ;
          fTeXlabel(-0.15, 0.5, "rc", "$0.5$") ;
          fTeXlabel(-0.15, 1, "rc", "$1.0$") ;
          fTeXlabel(-0.15, 1.51, "rc", "$1.5$") ;

          fTeXlabel(3.1, 1.12, "tl", "$y=C(a)=C(10)\\log_{10}a$") ;
     }
}
