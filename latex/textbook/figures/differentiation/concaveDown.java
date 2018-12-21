                  /*  File:  concaveDown.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class concaveDown extends Template {

     static {templateClass = new concaveDown() ; }

     public void setup() {
          filePrefix = "concaveDown" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0*0.7 ;   
          ysize = 2.0*0.7 ;   
          xmin = -0.1 ;
          xmax = 1.9 ;
          ymin = -1.9 ;
          ymax = 0.1 ;
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
          fEnv("lineWidth", 1.0) ;
          fCurve("y = -1-2*(x-1)/3 -2*(x-1)*(x-1)/3", 0, 0.5, 1.4, OPEN) ;
          fDisk(1,-1, 0.04, 0.04, FILLED) ;
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0, xmax, 0) ;
          fLine(0, ymin, 0, ymax) ;
          fTeXlabel(xmax+0.05, 0, "cl", "$x$") ;
          fTeXlabel(0, ymax+0.05, "bc", "$y$") ;
          fLine(1, 0,   1, -0.1) ;
          fLine(0, -1, -0.1,   -1) ;
          fTeXlabel(1, -0.15, "tc", "$1$") ;
          fTeXlabel(-0.15, -1, "rc", "$-1$") ;
          double x = 1 ; double y = -1 ;double m = -2.0/3.0 ; double dx = 0.4 ;
          fLine(x-dx , y-m*dx, x+dx, y+m*dx) ; 
     }
}
