                  /*  File:  tangentA.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class tangentA1 extends Template {

     static {templateClass = new tangentA1() ; }

     public void setup() {
          filePrefix = "tangentA1" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 2.0 ;   
          xmin = -0.1 ;
          xmax =  1.0 ;
          ymin = -0.1 ;
          ymax =  1.0 ;
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
          double x0 = 0.15 ; double y0 = Math.sqrt(2*x0-x0*x0)-0.2 ;
          double x1 = 0.7 ; double y1 = Math.sqrt(2*x1-x1*x1)-0.2 ;
          double r = 0.02 ;

          fEnv("lineWidth", 0.4) ;
          fTeXlabel(xmax, -0.03, "tr", "$x$", "x") ;
          fTeXlabel(-0.02, ymax, "tr", "$y$", "y") ;
          fLine(xmin,0, xmax, 0) ;
          fLine(0, ymin,0, ymax) ;
          fLine( 0, y0,  x1, y0) ;
          fLine(x0,  0,  x0, y0) ;
          fLine(x1,  0,  x1, y1) ;
          fLine( 0, y1,  x1, y1) ;
          fTeXlabel( (x0+x1)/2.0, y0-0.1, "tc", "$h$") ;
          fTeXlabel( x1+0.02 , (y0+y1)/2.0, "cl", "$f(a+h)-f(a)$") ;
          fTeXlabel( x0 , -0.09 , "bc", "$a$") ;
          fTeXlabel( x1 , -0.09 , "bc", "$a+h$") ;
          fTeXlabel( -0.02 , y0, "rc", "$f(a)$") ;
          fTeXlabel( -0.02 , y1, "rc", "$f(a+h)$") ;
          fTeXlabel(xmax+0.02, 0.82, "cl", "$y=f(x)$") ;

          double m = (y1-y0)/(x1-x0) ;  double b = y0-m*x0 ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;

          fEnv("lineWidth", 1.0) ;
          fCurve("y=sqrt(2*x-x*x)-0.2" , 0, 0, xmax, OPEN) ;
          fDisk(x0,y0,r,r, FILLED) ;
          fDisk(x1,y1,r,r, FILLED) ;
          fEnv("lineWidth", 0.8) ;
          m = (1-x0)/(y0+0.2) ;  b = y0-m*x0 ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;


     }
}
