                  /*  File:  expGraph.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class expGraph extends Template {

     static {templateClass = new expGraph() ; }

     public void setup() {
          filePrefix = "expGraph" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 2.0 ;   
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
          fCurve("y = exp(x)", 0, -3.0, 3.0, 1) ;
          fEnv("lineWidth", 0.5) ;
          fLine(-3.0, 0.0, 3.0, 0.0) ;
          fLine(0.0, -0.5, 0.0, 7.5) ;
          fLine(1, 0,   1, -0.2) ;
          fLine(2, 0,   2, -0.2) ;
          fLine(3, 0,   3, -0.2) ;
          fLine(-1, 0,   -1, -0.2) ;
          fLine(-2, 0,   -2, -0.2) ;
          fLine(-3, 0,   -3, -0.2) ;
          fLine(0, 1,   -0.1, 1) ;
          fLine(0, 2,   -0.1, 2) ;
          fLine(0, 4,   -0.1, 4) ;
          fLine(0, 6,   -0.1, 6) ;
          fTeXlabel(3.15, 0, "lc", "$x$") ;
          fTeXlabel(-0.05, 7.5, "tr", "$y$") ;
          fTeXlabel(1, -0.25, "tc", "$1$") ;
          fTeXlabel(2, -0.25, "tc", "$2$") ;
          fTeXlabel(3, -0.25, "tc", "$3$") ;
          fTeXlabel(-1, -0.25, "tc", "$-1$") ;
          fTeXlabel(-2, -0.25, "tc", "$-2$") ;
          fTeXlabel(-3, -0.25, "tc", "$-3$") ;
          fTeXlabel(-0.15, 1, "rb", "$1$") ;
          fTeXlabel(-0.15, 2, "rc", "$2$") ;
          fTeXlabel(-0.15, 4, "rc", "$4$") ;
          fTeXlabel(-0.15, 6, "rc", "$6$") ;

          fTeXlabel(2.2, 7.5, "tl", "$y=e^x$") ;
     }
}
