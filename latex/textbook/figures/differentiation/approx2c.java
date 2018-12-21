                  /*  File:  approx2c.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class approx2c extends Template {

     static {templateClass = new approx2c() ; }

     public void setup() {
          filePrefix = "approx2c" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 1.5 ;   
          xmin = -3.5 ;
          xmax = 3.5 ;
          ymin = -1 ;
          ymax = 1 ;
          topmargin = 0 ;
          bottommargin = 0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 1.0) ;
          fCurve("y=sin(x)", 0, xmin, xmax, 1) ;
          fEnv("lineWidth", 0.5) ;

          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fCurve("y=x-x*x*x/6", 0, xmin, xmax, 1);

          fTeXlabel((xmax+xmin)/2, ymin-0.2, "tc","$\\sin x\\approx x-\\tfrac{1}{3!}x^3$") ;
     }
}
