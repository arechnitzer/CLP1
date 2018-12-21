                  /*  File:  pop2.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class pop2 extends Template {

     static {templateClass = new pop2() ; }

     public void setup() {
          filePrefix = "pop2" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 1.5 ;   
          xmin = -200.0 ;
          xmax = 8000.0 ;
          ymin = -100.0 ;
          ymax = 4000.0 ;
          topmargin = 0.1 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 0.5) ;
          fLine(-200, 0, 8000, 0) ;
          fLine(0, 4000, 0, -100) ;
          fLine(0, 1000, -200, 1000) ;
          fLine(0, 2000, -200, 2000) ;
          fLine(0, 3000, -200, 3000) ;
          fTeXlabel(8000, -50, "tr", "$t$") ;
          fTeXlabel(-100, 4000, "tr", "$P(t)$") ;
          fTeXlabel(-300, 1000, "cr", "$1000$") ;
          fTeXlabel(-300, 2000, "cr", "$2000$") ;
          fTeXlabel(-300, 3000, "cr", "$3000$") ;

          fEnv("lineWidth", 1.0) ;
          fLine(0, 0, 8000, 0) ;
          fLine(0, 2000, 8000, 2000) ;

          {
              double[] xlist = { 0, 8000} ;
              double[] ylist = { 1000, 1940} ;
              double[] scale = { 1.2, 1.2} ;
              double[] relScale = { 1.0, 1.0} ;
              double[] angle = { 10.0, -3.0} ;
              double[] relAngle = { 0.0,  0.0} ;
              fBezier(xlist, ylist, scale, relScale, angle, relAngle, 2, OPEN) ;
          }
          {
              double[] xlist = { 0,  8000} ;
              double[] ylist = { 3000, 2060} ;
              double[] scale = { 1.2, 1.2} ;
              double[] relScale = { 1.0, 1.0} ;
              double[] angle = { -10.0,  3.0} ;
              double[] relAngle = { 0.0, 0.0} ;
              fBezier(xlist, ylist, scale, relScale, angle, relAngle, 2, OPEN) ;
          }
     }
}
