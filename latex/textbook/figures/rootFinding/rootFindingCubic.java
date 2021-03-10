                  /*  File: rootFindingCubic.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class rootFindingCubic extends Template {

     static {templateClass = new rootFindingCubic() ; }

     public void setup() {
          filePrefix = "rootFindingCubic" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 2.0 ;   
          xmin = -3 ;
          xmax = 2 ;
          ymin = -100 ;
          ymax = 100 ;
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
          fTeXlabel(xmax, -5.0, "tr", "$x$", "x") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$", "y") ;
          
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fLine(1.0, 0,  1.0, -5.0) ;
          fTeXlabel(1.0, -7.5, "tc",  "$1$") ;

          fEnv("useColorPs", "true") ;
          String Black = "0 0 0 1 setcmykcolor  " ;
          String Blue = "0 0.53333 0.8 setrgbcolor  " ;
          String Pink = "1 0.33333 0.66666 setrgbcolor  " ;
          String Orange = "0.93333 0.46666 0.2 setrgbcolor  " ;
          canvas.append( new fPsWrite(Blue+"\n")) ;

          fEnv("lineWidth", 1.0) ;
          fCurve("y=8*x*x*x+12*x*x+6*x-15", 0, xmin, xmax, OPEN) ;
          double x = 1.6 ; double y = 8*x*x*x+12*x*x+6*x-15 ;
          fTeXlabel(x, y, "tl", "$y=f(x)$") ;

     }
}
