                  /*  File:  concaveUpDown.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class concaveUpDown extends Template {

     static {templateClass = new concaveUpDown() ; }

     public void setup() {
          filePrefix = "concaveUpDown" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.0*0.8 ;   
          ysize = 2.4*0.8 ;   
          xmin = -2.0 ;
          xmax = 2.0 ;
          ymin = -2.2 ;
          ymax = 2.2 ;
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
          fCurve("y = x*x*x-3*x", 0, -3.0, 3.0, 1) ;
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0, xmax, 0) ;
          fLine(0, ymin, 0, ymax) ;
          fTeXlabel(xmax, -0.1, "tr", "$x$") ;
          fTeXlabel(-0.03, ymax, "tr", "$y$") ;
          fLine(1, 0,   1, -0.1) ;
          fLine(-1, 0,   -1, -0.1) ;
          fTeXlabel(1, -0.15, "tc", "$1$") ;
          fTeXlabel(-1, -0.15, "tc", "$-1$") ;
          double x = -1 ; double y = x*x*x-3*x ;double m = 0 ; double dx = 0.6 ;
          fLine(x-dx , y-m*dx, x+dx, y+m*dx) ; 
           x = -1.3 ; y = x*x*x-3*x ; m = 3*(x*x-1) ; dx = 0.4 ;
          fLine(x-dx , y-m*dx, x+dx, y+m*dx) ; 
           x = -0.7 ; y = x*x*x-3*x ; m = 3*(x*x-1) ; dx = 0.4 ;
          fLine(x-dx , y-m*dx, x+dx, y+m*dx) ; 
           x = 1 ; y = x*x*x-3*x ; m = 0 ;  dx = 0.6 ;
          fLine(x-dx , y-m*dx, x+dx, y+m*dx) ; 
           x = 1.3 ; y = x*x*x-3*x ; m = 3*(x*x-1) ; dx = 0.4 ;
          fLine(x-dx , y-m*dx, x+dx, y+m*dx) ; 
           x = 0.7 ; y = x*x*x-3*x ; m = 3*(x*x-1) ; dx = 0.4 ;
          fLine(x-dx , y-m*dx, x+dx, y+m*dx) ; 

          fTeXlabel(xmax-0.05, ymax, "tr", "$y=x^3-3x$") ;
     }
}
