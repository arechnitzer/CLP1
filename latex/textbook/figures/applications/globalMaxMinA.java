                  /*  File: globalMaxMinA.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class globalMaxMinA extends Template {

     static {templateClass = new globalMaxMinA() ; }

     public void setup() {
          filePrefix = "globalMaxMinA" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 1.5 ;   
          xmin = -1.0 ;
          xmax = 1.0 ;
          ymin = -0.2 ;
          ymax = 5;
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
          fEnv("lineWidth", 0.5) ;
          fTeXlabel(xmax+0.1, 0, "cl", "$x$", "x") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$", "y") ;
          
          double dy = 0.2 ;
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fLine(1.0, 0,  1.0, -dy) ;
          fTeXlabel(1.0, -1.5*dy, "tc",  "$1$") ;
          fLine(-1.0, 0,  -1.0, -dy) ;
          fTeXlabel(-1.0, -1.5*dy, "tc",  "$-1$") ;

          fEnv("lineWidth", 1.0) ;
          double t2 = Math.pow(2.0, 1.0/3.0)  ;
          fCurve("[t*t*t , 2*t*t*t*t*t+3*t*t]", 1, -1, 1, OPEN) ;
          double t= 1; double x = t*t*t ; double y = 2*t*t*t*t*t+3*t*t ;
          fTeXlabel(x+0.05, y, "cl", "$y=f(x)=2x^{5/3}+3x^{2/3}$") ;

//          String Red = "0 1 1 0 setcmykcolor  " ;
//          canvas.append( new fPsWrite(Red+"\n")) ;
//          fEnv("useColorPs", "true") ;
//          fEnv("psFillColor", Red) ;
//          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ;
//          double r = 0.07 ;
//          x = Math.sqrt(2) ; y = x*x*x-6*x ;
//          fDisk(x,y, r,r*aspect, FILLED) ;
//          fTeXlabel(x,y-0.4, "tc", "$\\big(c_+, f(c_+)\\big)$") ;



     }
}
