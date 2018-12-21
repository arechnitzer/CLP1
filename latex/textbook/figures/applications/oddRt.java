                  /*  File:  oddRt.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class oddRt extends Template {

     static {templateClass = new oddRt() ; }

     public void setup() {
          filePrefix = "oddRt" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2*0.9 ;   
          ysize = 2*0.9 ;   
          xmin = -1.2 ;
          xmax =  1.2 ;
          ymin = -1.2 ;
          ymax =  1.2 ;
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
          double x0 =0.9 ; double y0 = x0*x0*x0 ;
          double r = 0.05 ;
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;  fTeXlabel(xmax, -0.1, "tr", "$x$") ;
          fLine(0.0, ymin, 0.0, ymax) ;  fTeXlabel(-0.1, ymax, "tr", "$y$") ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y=x*x*x", 0, 0.0, xmax, OPEN) ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fDisk(x0,y0, r,r, FILLED) ;
          fTeXlabel(x0+1.3*r, y0, "cl", "$(x_0,y_0)$") ;
     }
}
