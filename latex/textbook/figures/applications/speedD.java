                  /*  File:  speedD.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class speedD extends Template {

     static {templateClass = new speedD() ; }

     public void setup() {
          filePrefix = "speedD" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 5 ;   
          ysize = 1.5 ;   
          xmin = -2 ;
          xmax = 3 ;
          ymin = -1 ;
          ymax =  0.5 ;
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
          fEnv("lineWidth", 0.5) ;

          fLine(xmin, 0, xmax, 0) ;
          fLine(-1, -0.05, -1, 0.05) ;
          fLine(0, -0.05, 0, 0.05) ;
          fLine(1, -0.05, 1, 0.05) ;
          fTeXlabel(-1, -0.1, "tc", "$-1$") ;
          fTeXlabel( 0, -0.1, "tc", "$0$") ;
          fTeXlabel( 1, -0.1, "tc", "$1$") ;
          fTeXlabel( xmax, -0.05, "tr", "$t$") ;


          fBracket bracket1 = new fBracket(-2, 0.1, 0.98, 0.1, 0.05) ;
          bracket1.configure("endscale",  0.4) ;
          bracket1.configure("centerscale",  0.4) ;
          bracket1.configure("centerangle",  40) ;
          canvas.append(bracket1) ;
          fTeXlabel(-0.5, 0.3, "bc", "$t-1<0$") ;

          fBracket bracket2 = new fBracket(1.02, 0.1, 3, 0.1, 0.05) ;
          bracket2.configure("endscale",  0.5) ;
          bracket2.configure("centerscale",  0.6) ;
          bracket2.configure("centerangle",  40) ;
          canvas.append(bracket2) ;
          fTeXlabel(2.0, 0.26, "bc", "$t-1>0$") ;


          fBracket bracket3 = new fBracket(-1.02, -0.3, -2, -0.3, 0.05) ;
          bracket3.configure("ar",  0.13) ;
          bracket3.configure("endscale",  0.6) ;
          bracket3.configure("centerscale",  0.7) ;
          bracket3.configure("centerangle",  40) ;
          canvas.append(bracket3) ;
          fTeXlabel(-1.5, -0.5, "tc", "$t+1<0$") ;


          fBracket bracket4 = new fBracket(3, -0.3, -0.98, -0.3, 0.05) ;
          bracket4.configure("ar",  0.04) ;
          bracket4.configure("endscale",  0.35) ;
          bracket4.configure("centerscale",  0.35) ;
          bracket4.configure("centerangle",  40) ;
          canvas.append(bracket4) ;
          fTeXlabel(1.0, -0.5, "tc", "$t+1>0$") ;

          fEnv("lineWidth", 1.0) ;

          fBracket bracket6 = new fBracket(0.98, -0.8, -0.98, -0.8, 0.05) ;
          bracket6.configure("endscale",  0.5) ;
          bracket6.configure("centerscale",  0.6) ;
          bracket6.configure("centerangle",  40) ;
          canvas.append(bracket6) ;
          fTeXlabel(0, -0.98, "tc", "$x(t)<0$") ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;

          fBracket bracket5 = new fBracket(-1.02, -0.8, -2, -0.8, 0.05) ;
          bracket5.configure("ar",  0.12) ;
          bracket5.configure("endscale",  0.6) ;
          bracket5.configure("centerscale",  0.7) ;
          bracket5.configure("centerangle",  40) ;
          canvas.append(bracket5) ;
          fTeXlabel(-1.5, -0.98, "tc", "$x(t)>0$") ;

          fBracket bracket7 = new fBracket(3, -0.8, 1.02, -0.8, 0.05) ;
          bracket7.configure("endscale",  0.5) ;
          bracket7.configure("centerscale",  0.6) ;
          bracket7.configure("centerangle",  40) ;
          canvas.append(bracket7) ;
          fTeXlabel(2, -0.98, "tc", "$x(t)>0$") ;



     }
}
