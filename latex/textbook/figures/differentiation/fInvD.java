                  /*  File:  fInvD.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class fInvD extends Template {

     static {templateClass = new fInvD() ; }

     public void setup() {
          filePrefix = "fInvD" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 2.0 ;   
          ymin = -1.0 ;
          ymax = 1.0 ;
          xmin = -1.5 ;
          xmax = 1.5 ;
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
          fLine(xmin, 0, xmax, 0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fTeXlabel(xmax, -0.07, "tr", "$x$") ;
          fTeXlabel(-0.02, ymax, "tr", "$y$") ;
          fTeXlabel(Math.exp(ymax)-1.5, ymax, "tl", "$y=f^{-1}(x)$") ;
          fEnv("lineWidth", 1.0) ;
          fCurve("[exp(t)-1.5, t]", 1, -3.0, 3.0, 1) ;
          double rx = 0.03 ; double ry = rx*1.5 ;
          double x = 0.15 ; double y = Math.exp(x)-1.5 ;
//          fDisk(x,y, rx,ry, FILLED) ;
//          fTeXlabel(x,y, "tl", "$\\big(Y\\,,\\,f(Y)\\big)$") ;


     }
}
