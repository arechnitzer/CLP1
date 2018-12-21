                  /*  File: localMaxMinA.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class localMaxMinA extends Template {

     static {templateClass = new localMaxMinA() ; }

     public void setup() {
          filePrefix = "localMaxMinA" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 2.0 ;   
          xmin = -2.5 ;
          xmax = 3.5 ;
          ymin = -6 ;
          ymax = 10 ;
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
          fTeXlabel(xmax, -0.3, "tr", "$x$", "x") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$", "y") ;
          
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fLine(1.0, 0,  1.0, -0.5) ;
          fTeXlabel(1.0, -0.8, "tc",  "$1$") ;
          fLine(-1.0, 0,  -1.0, -0.5) ;
          fTeXlabel(-1.0, -0.8, "tc",  "$-1$") ;
          fLine(2.0, 0,  2.0, -0.5) ;
          fTeXlabel(2.1, -0.8, "tc",  "$2$") ;
          fLine(3.0, 0,  3.0, -0.5) ;
          fTeXlabel(3.0, -0.8, "tc",  "$3$") ;
          fLine(-2.0, 0,  -2.0, -0.5) ;
          fTeXlabel(-2.0, -0.8, "tc",  "$-2$") ;

          fEnv("lineWidth", 1.0) ;
          fCurve("y=x*x*x-6*x", 0, -2, 3, OPEN) ;
          double x = 3 ; double y = x*x*x-6*x ;
          fTeXlabel(x+0.1, y, "tl", "$y=f(x)=x^3-6x$") ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ;
          double r = 0.07 ;
          x = Math.sqrt(2) ; y = x*x*x-6*x ;
          fDisk(x,y, r,r*aspect, FILLED) ;
          fTeXlabel(x,y-0.4, "tc", "$\\big(c_+, f(c_+)\\big)$") ;
          x = -Math.sqrt(2) ; y = x*x*x-6*x ;
          fDisk(x,y, r,r*aspect, FILLED) ;
          fTeXlabel(x,y+0.4, "bc", "$\\big(c_-, f(c_-)\\big)$") ;



     }
}
