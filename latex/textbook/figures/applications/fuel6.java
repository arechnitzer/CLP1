                  /*  File:  fuel6.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class fuel6 extends Template {

     static {templateClass = new fuel6() ; }

     public void setup() {
          filePrefix = "fuel6" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.5 ;   
          ysize = 1.5 ;   
          xmin = -120.0 ;
          xmax = 120.0 ;
          ymin = -120.0 ;
          ymax = 120.0 ;
          topmargin = -.6 ;
          bottommargin = -.2 ;
          leftmargin = -.2 ;
          rightmargin = -.15 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 1.0) ;
          double th = Math.PI/4 ;
          double thDeg = th*180/Math.PI ;
          double x = 100*Math.sin(th) ;
          double y = -100*Math.cos(th) ;
          fLine(x, y, 0, y) ;
          fEnv("lineWidth", 0.5) ;
          fLine(0, 0, x, y) ;
          fLine(0, 0, 0, y) ;
          fEllipticalArc(0.0, 0.0, 20, 20, 270, 270+thDeg, OPEN) ;
          fTeXlabel(13, -30 , "cc", "$\\theta$") ;
          fTeXlabel(x/2+6, y/2+8 , "lc", "$r$") ;
          fTeXlabel(-7, y/2 , "rc", "$r-h$") ;
     }
}
