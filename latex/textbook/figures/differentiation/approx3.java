                  /*  File:  approx3.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class approx3 extends Template {

     static {templateClass = new approx3() ; }

     public void setup() {
          filePrefix = "approx3" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.5 ;   
          ysize = 1.5 ;   
          xmin = -1 ;
          xmax = 3 ;
          ymin = -0.2 ;
          ymax = 2 ;
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
          fTeXlabel(1.0, -0.15, "tc", "$a$", "a") ;
          fTeXlabel(3.0, -0.05, "tr", "$x$", "x") ;
          fTeXlabel(-0.1, 2, "tr", "$y$", "y") ;
          fCurve("y=sqrt(x)", 0, 0.0, 3.0, 1) ;
          fEnv("lineWidth", 0.5) ;

          fLine(-0.2, 0.0, 3.0, 0.0) ;
          fLine(0.0, 2, 0.0, -0.1) ;
          fLine(1.0, 0.0, 1.0, -0.1) ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fCurve("y=1+(x-1)/2-(x-1)*(x-1)/8", 0, 0.0, 3.0, 1) ;


          fTeXlabel(3.1, Math.sqrt(3)+0.05, "cl", "$y=f(x)$") ;
          fTeXlabel(3.1, 1.45, "cl", "$y=F(x)=f(a)+f'(a)(x-a)+\\half f''(a)(x-a)^2$") ;


     }
}
