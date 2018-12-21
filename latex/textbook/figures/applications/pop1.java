                  /*  File:  pop1.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class pop1 extends Template {

     static {templateClass = new pop1() ; }

     public void setup() {
          filePrefix = "pop1" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0*1.1 ;   
          ysize = 1.0*1.1 ;   
          xmin = -200.0 ;
          xmax = 8000.0 ;
          ymin = -100.0 ;
          ymax = 4000.0 ;
          topmargin = 0.1 ;
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
          fLine(-200, 0, 8000, 0) ;
          fLine(0, 4000, 0, -100) ;
          fLine(0, 1000, -200, 1000) ;
          fLine(0, 2000, -200, 2000) ;
          fLine(0, 3000, -200, 3000) ;
          fTeXlabel(8000, -50, "tr", "$t$") ;
          fTeXlabel(-100, 4300, "tr", "$P(t)$") ;
          fTeXlabel(-300, 1000, "cr", "$1000$") ;
          fTeXlabel(-300, 2000, "cr", "$2000$") ;
          fTeXlabel(-300, 3000, "cr", "$3000$") ;

          fEnv("lineWidth", 1.0) ;
          fLine(3800, 0, 4200, 0) ;
          fLine(3800, 900, 4200, 1100) ;
          fLine(3800, 2000, 4200, 2000) ;
          fLine(3800, 3100, 4200, 2900) ;

          fDisk(4000, 0, 75, 75, FILLED) ;
          fDisk(4000, 1000, 75, 75, FILLED) ;
          fDisk(4000, 2000, 75, 75, FILLED) ;
          fDisk(4000, 3000, 75, 75, FILLED) ;
     }
}
