                  /*  File:  tortoise.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class tortoise extends Template {

     static {templateClass = new tortoise() ; }

     public void setup() {
          filePrefix = "tortoise" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.5 ;   
          ysize = 1.4 ;   
          xmin = -3 ;
          xmax = 21 ;
          ymin = -3 ;
          ymax = 11 ;
          topmargin = 0.1 ;
          bottommargin = 0.0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 0.5) ;

          fLine(0, 10, 0, 0) ;
          fLine(0, 0, 10*Math.sqrt(3), 0) ;
          fLine(0, 10, 10*Math.sqrt(3), 0) ;
          fLine(0, 10, 10/Math.sqrt(3), 0) ;
          
          fLine(0, -0.5, 0, -3.0) ;
          fLine(10/Math.sqrt(3), -0.5, 10/Math.sqrt(3), -1.5) ;
          fLine(10*Math.sqrt(3), -2.0, 10*Math.sqrt(3), -3.0) ;
          fArrow(-2, -1, 0, -1) ;
          fArrow(10/Math.sqrt(3)+2, -1, 10/Math.sqrt(3), -1) ;
          fArrow(5*Math.sqrt(3)-3, -2.5, 0, -2.5) ;
          fArrow(5*Math.sqrt(3)+3, -2.5, 10*Math.sqrt(3), -2.5) ;
          fTeXlabel(-0.3,5, "rc", "$h$") ;
          fTeXlabel(5/Math.sqrt(3),-1, "cc", "$x(t)$") ;
          fTeXlabel(5*Math.sqrt(3),-2.5, "cc", "$4x(t)$") ;


          fTeXlabel(2.4,8.3, "tc", "$\\theta$") ;
          fTeXlabel(0.8,7.5, "tc", "$\\phi$") ;


     }
}
