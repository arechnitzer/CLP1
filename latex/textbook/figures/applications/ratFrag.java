                  /*  File:  ratFrag.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class ratFrag extends Template {

     static {templateClass = new ratFrag() ; }

     public void setup() {
          filePrefix = "ratFrag" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0*0.7 ;   
          ysize = 2.0*0.7 ;   
          xmin = -5.0 ;
          xmax = 4.0 ;
          ymin = -5 ;
          ymax = 5 ;
          topmargin = 0.0 ;
          bottommargin = 0.0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 1.0) ;
          fCurve("y = (x+1)/( (x-2)*(x+3) )", 0, -4, -3.01, OPEN) ;
          fCurve("y = (x+1)/( (x-2)*(x+3) )", 0, -2.99, -2, OPEN) ;
          fCurve("y = (x+1)/( (x-2)*(x+3) )", 0, 1, 1.99, OPEN) ;
          fCurve("y = (x+1)/( (x-2)*(x+3) )", 0, 2.01, 3, OPEN) ;
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fEnv("psDash", "[3 3] 1.5") ;
          fLine(-3, ymin, -3, ymax) ;
          fLine(2, ymin, 2, ymax) ;
          fEnv("psDash", "clear") ;


          fTeXlabel(xmax-1, ymax+1, "tl", "$y=\\frac{x+1}{(x+3)(x-2)}$") ;
          fTeXlabel(-2.9, -0.2, "tl", "$-3$") ;
          fTeXlabel(2.1, -0.2, "tl", "$2$") ;
     }
}
