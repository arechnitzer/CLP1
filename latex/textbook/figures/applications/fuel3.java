                  /*  File:  fuel3.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class fuel3 extends Template {

     static {templateClass = new fuel3() ; }

     public void setup() {
          filePrefix = "fuel3" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 0.75 ;   
          ysize = 0.75 ;   
          xmin = -120.0 ;
          xmax = 120.0 ;
          ymin = -120.0 ;
          ymax = 120.0 ;
          topmargin = 0 ;
          bottommargin = -.1 ;
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
          fEnv("psFillGray", 0.7) ;
          fEllipticalArc(0.0, 0.0, 100, 100, 270-thDeg, 270+thDeg, 
              FILLED+fEllipticalArc.CHORD+OPEN) ;
          fEnv("psFillGray", 1) ;
          fLine(x, y, -x, y) ;

     }
}
