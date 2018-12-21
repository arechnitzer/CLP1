                  /*  File: convexUpB.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class convexUpB extends Template {

     static {templateClass = new convexUpB() ; }

     public void setup() {
          filePrefix = "convexUpB" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 1.2 ;   
          xmin = -0.5 ;
          xmax = 1.5 ;
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
          fEnv("lineWidth", 0.5) ;
          double x = 0 ; double y = x*x ; double yp = 2*x ; double dx = 0.35 ;
          fLine(x-dx, y-yp*dx, x+dx, y+yp*dx) ;
          x = -0.4 ; y = x*x ;  yp = 2*x ;  dx = 0.35 ;
          fLine(x-dx, y-yp*dx, x+dx, y+yp*dx) ;
          x = +0.4 ; y = x*x ;  yp = 2*x ;  dx = 0.35 ;
          fLine(x-dx, y-yp*dx, x+dx, y+yp*dx) ;
          x = 0.8 ; y = x*x ;  yp = 2*x ;  dx = 0.35;
          fLine(x-dx, y-yp*dx, x+dx, y+yp*dx) ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y=x*x", 0, xmin, xmax, OPEN) ;

     }
}
