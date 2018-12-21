                  /*  File:  approx4c.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class approx4c extends Template {

     static {templateClass = new approx4c() ; }

     public void setup() {
          filePrefix = "approx4c" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 1.5 ;   
          xmin = -3.5 ;
          xmax = 3.5 ;
          ymin = -1 ;
          ymax = 1 ;
          topmargin = .3 ;
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
          fCurve("y=x-x*x*x/6+x*x*x*x*x/120-x*x*x*x*x*x*x/5040", 0, xmin, xmax, 1);

          fTeXlabel((xmax+xmin)/2, ymin-0.2, "tc","$\\sin x\\approx x-\\tfrac{1}{3!}x^3+\\tfrac{1}{5!}x^5-\\tfrac{1}{7!}x^7$") ;
     }
}
