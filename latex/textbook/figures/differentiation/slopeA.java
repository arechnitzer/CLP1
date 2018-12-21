                  /*  File:  slopeA.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class slopeA extends Template {

     static {templateClass = new slopeA() ; }

     public void setup() {
          filePrefix = "slopeA" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 8.0*0.25 ;   
          ysize = 6.0*0.25 ;   
          xmin = -1.0 ;
          xmax =  7.0 ;
          ymin = -1.0 ;
          ymax =  5.0 ;
          topmargin = 0.3 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0.4 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          double m = 0.5 ; double b = 1.5 ;
          double x0 = 1.0 ; double y0 = m*x0+b ;
          double x1 = 5.0 ; double y1 = m*x1+b ;
          double r = 0.1 ;

          fEnv("lineWidth", 0.4) ;
          fTeXlabel(xmax, -0.1, "tr", "$x$", "x") ;
          fTeXlabel(-0.1, ymax, "tr", "$y$", "y") ;
          fLine(xmin,0, xmax, 0) ;
          fLine(0, ymin,0, ymax) ;
          fLine(x0, y0,  x1, y0) ;
          fLine(x1, y0,  x1, y1) ;
          fTeXlabel( (x0+x1)/2.0, y0-0.1, "tc", "$\\De x$") ;
          fTeXlabel( x1+0.1 , (y0+y1)/2.0, "cl", "$\\De y$") ;


          fEnv("lineWidth", 1.0) ;
          fLine(xmin, m*xmin+b, xmax, m*xmax+b) ;
          fTeXlabel(xmax+0.15, m*xmax+b, "cl", "$y=\\tfrac{1}{2} x+\\tfrac{3}{2}$") ;
          fDisk(x0,y0,r,r, FILLED) ;
          fDisk(x1,y1,r,r, FILLED) ;
          fTeXlabel(x0-0.4,y0-0.2, "tl", "$(1,2)$") ;
          fTeXlabel(x1+0.3,y1+0.2, "br", "$(5,4)$") ;




     }
}
