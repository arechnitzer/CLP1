                  /*  File:  expT.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class expT extends Template {

     static {templateClass = new expT() ; }

     public void setup() {
          filePrefix = "expT" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 8.0*0.5 ;   
          xmin = -1.0 ;
          xmax = 2.0 ;
          ymin = -0.2 ;
          ymax = 7.8 ;
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

          String Red = "0 1 1 0 setcmykcolor  " ;
          String Blue = "0 0.53333 0.8 setrgbcolor  " ;

          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fTeXlabel(2.05, 0, "lc", "$x$") ;
          fTeXlabel(-0.03, 7.8, "tr", "$y$") ;

          fLine(1, 0,   1, -0.12) ;
          fLine(2, 0,   2, -0.12) ;
          fLine(-1, 0,   -1, -0.12) ;
          fTeXlabel(1, -0.15, "tc", "$1$") ;
          fTeXlabel(2, -0.15, "tc", "$2$") ;
          fTeXlabel(-1, -0.15, "tc", "$-1$") ;

          fLine(0, 2,   -0.07, 2) ;
          fLine(0, 3,   -0.07, 3) ;
          fLine(0, 4,   -0.07, 4) ;
          fLine(0, 5,   -0.07, 5) ;
          fLine(0, 6,   -0.07, 6) ;
          fLine(0, 7,   -0.07, 7) ;
          fTeXlabel(-0.1, 1.07, "br", "$1$") ;
          fTeXlabel(-0.1, 2, "rc", "$2$") ;
          fTeXlabel(-0.1, 3, "rc", "$3$") ;
          fTeXlabel(-0.1, 4, "rc", "$4$") ;
          fTeXlabel(-0.1, 5, "rc", "$5$") ;
          fTeXlabel(-0.1, 6, "rc", "$6$") ;
          fTeXlabel(-0.1, 7, "rc", "$7$") ;

          fEnv("lineWidth", 1.0) ;
          fCurve("y=1", 0, xmin, xmax, OPEN);
          fCurve("y=1+x", 0, xmin, xmax, OPEN);
          fCurve("y=1+x+x*x/2", 0, xmin, xmax, OPEN);
          fCurve("y=1+x+x*x/2+x*x*x/6", 0, xmin, xmax, OPEN);
          fCurve("y=1+x+x*x/2+x*x*x/6+x*x*x*x/24", 0, xmin, xmax, OPEN);
          double x = 2 ;
          double y = 1 ;
          fTeXlabel(2.03, y, "lc", "$y=T_0(x)=1$") ;
          y = 1+ x ;
          fTeXlabel(2.03, y, "lc", "$y=T_1(x)=1+x$") ;
          y = 1+ x + x*x/2 ;
          fTeXlabel(2.03, y, "lc", "$y=T_2(x)=1+x+\\frac{x^2}{2}$") ;
          y = 1+ x + x*x/2 + +x*x*x/6;
          fTeXlabel(2.03, y, "lc", "$y=T_3(x)$") ;
//          fTeXlabel(2.03, y, "lc", "$y=1+x+\\frac{1}{2}x^2+\\frac{1}{3!}x^3$") ;
          y = 1+ x + x*x/2 +x*x*x/6 + x*x*x*x/24;
          fTeXlabel(2.03, y, "lc", "$y=T_4(x)$") ;
//          fTeXlabel(2.03, y, "lc", "$y=1+x+\\frac{1}{2}x^2+\\frac{1}{3!}x^3+\\frac{1}{4!}x^4$") ;


          fEnv("lineWidth", 1.5) ;
          canvas.append( new fPsWrite(Blue+"\n")) ;
          fCurve("y=exp(x)", 0, xmin, xmax, OPEN) ;
          y = Math.exp(2.0) ;
          fTeXlabel(2, y, "bc", "$y=e^x$") ;


     }
}
