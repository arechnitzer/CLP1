                  /*  File:  triangleAtan.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class triangleAtan extends Template {

     static {templateClass = new triangleAtan() ; }

     public void setup() {
          filePrefix = "triangleAtan" ;    // used as the prefix for any ps or lbl files written
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;      // in inches
          ysize = 1.2 ;   // in inches. 
          xmin = -20 ;
          xmax = 280 ;
          ymin = -20 ;
          ymax = 100 ;
          topmargin =-.5 ;   // in inches
          bottommargin =-.5 ;   // in inches
          leftmargin = 0.25 ;   // in inches
          rightmargin = -2 ;   // in inches
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;   
     }
     
     public  void prepareFigure(Figure canvas) {
     
     double angle = 0.15*Math.PI ;
     double hyp   = 150 ;

     fEnv("lineWidth", 1) ;
     fLine(0, 0, hyp*Math.cos(angle), 0) ;
     fLine(0, 0, hyp*Math.cos(angle), hyp*Math.sin(angle)) ;
     fLine(hyp*Math.cos(angle), 0,  hyp*Math.cos(angle), hyp*Math.sin(angle)) ;
     fEnv("lineWidth", 0.2) ;
     fLine(hyp*Math.cos(angle), 8, hyp*Math.cos(angle)-8, 8) ;
     fLine(hyp*Math.cos(angle)-8, 0,   hyp*Math.cos(angle)-8, 8) ;

     fTeXlabel(40, 4, "bc", "$\\theta$") ;
     fEllipticalArc( 0, 0, 30, 30, 0, angle*180/Math.PI, OPEN) ;

     fTeXlabel(hyp*Math.cos(angle+.15)/2, hyp*Math.sin(angle+.15)/2+13, "cc", "$\\sqrt{1+x^2}$") ;
     fTeXlabel(hyp*Math.cos(angle)+3, hyp*Math.sin(angle)/2, "lc", "$x$") ;
     fTeXlabel(hyp*Math.cos(angle)/2, -4, "tc", "$1$") ;
          
     }
}
