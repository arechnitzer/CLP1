                  /*  File:  bisection.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class bisection extends Template {

     static {templateClass = new bisection() ; }

     public void setup() {
          filePrefix = "bisection" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.4*3 ;   
          ysize = 0.2*3;   
          xmin = -0.2 ;
          xmax = 1.2 ;
          ymin = -0.1 ;
          ymax = 0.1 ;
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
          String Red = "0 1 1 0 setcmykcolor  " ;
          String Blue = "1 1 0 0 setcmykcolor  " ;
          double r = 0.012 ;
          double h = 0.05 ; double H = 0.06 ;
          fEnv("lineWidth", 1.0) ;
          fLine(xmin,0, xmax,0) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fDisk(0,0, r,r, FILLED) ;
             fTeXlabel(0, h, "cc", "$-$") ;
             fTeXlabel(0, -H, "cc", "$0$") ;
          fDisk(0.25,0, r,r, FILLED) ;
             fTeXlabel(0.25, h, "cc", "$-$") ;
             fTeXlabel(0.25, -H, "cc", "$\\tfrac{1}{4}$") ;
          fDisk(0.375,0, r,r, FILLED) ;
             fTeXlabel(0.375, h, "cc", "$-$") ;
             fTeXlabel(0.375, -H, "cc", "$\\tfrac{3}{8}$") ;

          fEnv("psFillColor", Blue) ;
          fDisk(1,0, r,r, FILLED) ;
             fTeXlabel(1, h, "cc", "$+$") ;
             fTeXlabel(1, -H, "cc", "$1$") ;
          fDisk(0.5,0, r,r, FILLED) ;
             fTeXlabel(0.5, h, "cc", "$+$") ;
             fTeXlabel(0.5, -H, "cc", "$\\tfrac{1}{2}$") ;
          fDisk(0.4375,0, r,r, FILLED) ;
             fTeXlabel(0.4375, h, "cc", "$+$") ;
             fTeXlabel(0.4375, -H, "cc", "$\\tfrac{7}{16}$") ;

     }
}
