                  /*  File:  logGraph.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class logGraph extends Template {

     static {templateClass = new logGraph() ; }

     public void setup() {
          filePrefix = "logGraph" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.1*2.0/3.0 ;   
          ysize = 3.0*2.0/3.0 ;   
          xmin = -0.1 ;
          xmax = 4.0 ;
          ymin = -1.5 ;
          ymax = 1.5 ;
          topmargin = 0.4 ;
          bottommargin = 0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fCurve("y = ln(x)", 0, 0.1, 4.0, 1) ;
          fEnv("lineWidth", 0.2) ;
          fLine(-0.1, 0.0, 4.0, 0.0) ;
          fLine(0.0, -1.5, 0.0, 1.5) ;
          fLine(1, 0,   1, -0.1) ;
          fLine(2, 0,   2, -0.1) ;
          fLine(3, 0,   3, -0.1) ;
          fLine(4, 0,   4, -0.1) ;
          fLine(0, 0.5,   -0.1, 0.5) ;
          fLine(0, 1,   -0.1, 1) ;
          fLine(0, 1.5,   -0.1, 1.5) ;
          fLine(0, -0.5,   -0.1, -0.5) ;
          fLine(0, -1,   -0.1, -1) ;
          fLine(0, -1.5,   -0.1, -1.5) ;
          fTeXlabel(4.05, 0, "lc", "$x$") ;
          fTeXlabel(0,1.75, "tr", "$y$") ;
          fTeXlabel(1, -0.15, "tc", "$1$") ;
          fTeXlabel(2, -0.15, "tc", "$2$") ;
          fTeXlabel(3, -0.15, "tc", "$3$") ;
          fTeXlabel(4, -0.15, "tc", "$4$") ;
          fTeXlabel(-0.15, 0.5, "rc", "$0.5$") ;
          fTeXlabel(-0.15, 1, "rc", "$1.0$") ;
          fTeXlabel(-0.15, 1.51, "rc", "$1.5$") ;
          fTeXlabel(-0.15, -0.5, "rc", "$-0.5$") ;
          fTeXlabel(-0.15, -1, "rc", "$-1.0$") ;
          fTeXlabel(-0.15, -1.51, "rc", "$-1.5$") ;

          fTeXlabel(3, 1.1, "tl", "$y=\\ln x$") ;
     }
}
