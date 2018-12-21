                  /*  File:  fuel2.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class fuel2 extends Template {

     static {templateClass = new fuel2() ; }

     public void setup() {
          filePrefix = "fuel2" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.5*1.2 ;   
          ysize = 1.5*1.2 ;   
          xmin = -120.0 ;
          xmax = 120.0 ;
          ymin = -120.0 ;
          ymax = 120.0 ;
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
          double th = Math.PI/4 ;
          double thDeg = th*180/Math.PI ;
          double x = 100*Math.sin(th) ;
          double y = -100*Math.cos(th) ;
          fEnv("psFillGray", 0.7) ;
          fEllipticalArc(0.0, 0.0, 100, 100, 270-thDeg, 270+thDeg, 
              FILLED+fEllipticalArc.CHORD+OPEN) ;
          fEnv("psFillGray", 1) ;
          fLine(x, y, -x, y) ;
          fEnv("lineWidth", 0.5) ;
          fDisk(0.0, 0.0, 100, 100, BOUNDARY) ;
          fLine(0, 0, x, y) ;
          fLine(0, 0, -x, y) ;
          fLine(0, 0, 0, y) ;
          fLine(90, y, 110, y) ;
          fLine(90, -100, 110, -100) ;
          fArrow(100, y+20, 100, y) ;
          fArrow(100, -120, 100, -100) ;
          fEllipticalArc(0.0, 0.0, 20, 20, 270, 270+thDeg, OPEN) ;
          fTeXlabel(10, -30 , "cc", "$\\theta$") ;
          fTeXlabel(x/2+6, y/2+6 , "lc", "$r$") ;
          fTeXlabel(100, (y-100)/2+2 , "cc", "$h$") ;

     }
}
