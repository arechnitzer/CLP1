                  /*  File:  triangleCor.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class triangleCor extends Template {

     static {templateClass = new triangleCor() ; }

     public void setup() {
          filePrefix = "triangleCor" ;    // used as the prefix for any ps or lbl files written
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 0.7*1.2 ;      // in inches
          ysize = 0.6*1.2 ;   // in inches. 
          xmin = -1 ;
          xmax = 5 ;
          ymin = -1 ;
          ymax = 6.1 ;
          topmargin = 0 ;   // in inches
          bottommargin = -0.1 ;   // in inches
          leftmargin = -0.1 ;   // in inches
          rightmargin = 0 ;   // in inches
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;   
     }
     
     public  void prepareFigure(Figure canvas) {
     


     double angle = Math.atan2(5, 4) ;
     double x   = 4 ;
     double y   = 6 ;

     fEnv("lineWidth", 0.5) ;
     fLine(0, 0, x, 0) ;
     fLine(0, 0, x, y) ;
     fLine(x, 0,  x, y) ;

     fTeXlabel(1.0,0.3, "bl", "$\\theta$") ;
     fTeXlabel(x/2, -0.5, "tc", "$\\root 3\\of 2$") ;
     fTeXlabel(x+0.2, y/2, "lc", "$\\root 3\\of 3$") ;
     fTeXlabel(x/2-2.9, y/2, "bc", "$\\sqrt{2^{\\nicefrac{2}{3}}+3^{\\nicefrac{2}{3}}}$") ;
          
     }
}
