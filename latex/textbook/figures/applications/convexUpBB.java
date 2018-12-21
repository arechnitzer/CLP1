                  /*  File: convexUpBB.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class convexUpBB extends Template {

     static {templateClass = new convexUpBB() ; }

     public void setup() {
          filePrefix = "convexUpBB" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.5 ;   
          ysize = 1.0 ;   
          xmin = -0.5 ;
          xmax = 0.9 ;
          ymin = -0.2 ;
          ymax = 0.6;
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
          double x = 0 ; double y = 1-Math.sqrt(1-x*x) ; double yp = x/Math.sqrt(1-x*x) ; 
          double dx = 0.35 ;
          fLine(x-dx, y-yp*dx, x+dx, y+yp*dx) ;
          x = -0.4 ; y = 1-Math.sqrt(1-x*x) ;  yp = x/Math.sqrt(1-x*x) ;  dx = 0.35 ;
          fLine(x-dx, y-yp*dx, x+dx, y+yp*dx) ;
          x = +0.4 ; y = 1-Math.sqrt(1-x*x) ;  yp = x/Math.sqrt(1-x*x) ;  dx = 0.35 ;
          fLine(x-dx, y-yp*dx, x+dx, y+yp*dx) ;
          x = 0.8 ; y = 1-Math.sqrt(1-x*x) ;   yp = x/Math.sqrt(1-x*x) ;  dx = 0.25;
          fLine(x-dx, y-yp*dx, x+dx, y+yp*dx) ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y=1-sqrt(1-x*x)", 0, xmin, xmax, OPEN) ;

     }
}
