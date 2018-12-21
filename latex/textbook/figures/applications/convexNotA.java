                  /*  File: convexNotA.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class convexNotA extends Template {

     static {templateClass = new convexNotA() ; }

     public void setup() {
          filePrefix = "convexNotA" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.0 ;   
          ysize = 1.0 ;   
          xmin = -1.0 ;
          xmax = 1.0 ;
          ymin = -0.2 ;
          ymax = 1;
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
          fCurve("y=x*x*x*x", 0, -0.9, 0.9, OPEN) ;

          double x = 0.8 ; double y = x*x*x*x ;
          fTeXlabel(x,y, "br", "$y=x^4$") ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ;
          double r = 0.05 ;
          x = 0 ; y = x*x*x ;
          fDisk(x,y, r,r*aspect, FILLED) ;

     }
}
