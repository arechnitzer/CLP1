                  /*  File:  triangle62.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class triangle62 extends Template {

     static {templateClass = new triangle62() ; }

     public void setup() {
          filePrefix = "triangle62" ;    // used as the prefix for any ps or lbl files written
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 0.7*1.2 ;      // in inches
          ysize = 0.6*1.2 ;   // in inches. 
          xmin = -1 ;
          xmax = 5 ;
          ymin = -1 ;
          ymax = 6 ;
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
     double y   = 5 ;

     fEnv("lineWidth", 0.5) ;
     fLine(0, 0, x, 0) ;
     fLine(0, 0, x, y) ;
     fLine(x, 0,  x, y) ;

     fTeXlabel(1.0,0.28, "bl", "$\\theta$") ;
     fTeXlabel(x/2, -0.5, "tc", "$1$") ;
     fTeXlabel(x+0.2, y/2, "lc", "$\\root 3\\of 2$") ;
     fTeXlabel(x/2-2.5, y/2, "bc", "$\\sqrt{1+2^{2/3}}$") ;
          
     }
}
