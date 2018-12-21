                  /*  File:  sketch3.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class sketch3 extends Template {

     static {templateClass = new sketch3() ; }

     public void setup() {
          filePrefix = "sketch3" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.0 ;   
          ysize = 2.5 ;   
          xmin = -30.0 ;
          xmax = 60.0 ;
          ymin = -1.0 ;
          ymax = 4.5 ;
          topmargin = 0.1 ;
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
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y=pow(x*x/((x-6)*(x-6)), 1/3)", 0, 6.005, 60, 1) ;
          fCurve("y=pow(x*x/((x-6)*(x-6)), 1/3)", 0, 0.005, 5.95, 1) ;
          fCurve("y=pow(x*x/((x-6)*(x-6)), 1/3)", 0, -30, -0.005, 1) ;
          String Black = "0 0 0 1 setcmykcolor  " ;
          canvas.append( new fPsWrite(Black+"\n")) ;
          fEnv("useColorPs", "false") ;
          fEnv("lineWidth", 0.5) ;
          fLine(-30,0, 60, 0) ;
          fLine(0,-0.3, 0, 5.5) ;

          fEnv("psDash", "[3 3] 1.5") ;
          fLine(20,1, 60, 1) ;
          fLine(-10,1, -30, 1) ;
          fLine(6,1.5, 6, 5.5) ;
          fEnv("psDash", "clear") ;
          fLine(6,0, 6, -0.13) ;
          fLine(0,1, -1.0, 1) ;
          fTeXlabel(6, -0.2, "tc", "$6$") ;
          fTeXlabel(-1.3, 1, "rc", "$1$") ;

          fTeXlabel(60, -0.1, "tr", "$x$") ;
          fTeXlabel(-0.5, 4.5, "tr", "$y$") ;

          fTeXlabel(12, 2, "lc", "$y=\\root 3 \\of {\\frac{x^2}{(x-6)^2}}$") ;

          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ; // =0.098
          fBracket bracket1 = new fBracket(-0.3, -0.55, xmin, -0.55) ;
          bracket1.configure("ar",  0.15*aspect*0.6) ;     // default 0.15
          bracket1.configure("endscale", 1.1*aspect*0.7) ; // default 1.1
          bracket1.configure("centerscale",  1.0*aspect*0.7) ; // default 1.0
//          bracket1.configure("centerangle",  60) ;   // default 60
//          bracket1.configure("endangle",  50) ;      // default 50
          canvas.append(bracket1) ;
          fTeXlabel( (-0.3+xmin)/2.0, -0.9, "tc", 
                         "${\\scriptstyle f'<0,\\ f{\\rm\\  decreasing}}$" ) ;


          fBracket bracket2 = new fBracket(5.7, -0.55, 0.3, -0.55) ;
          bracket2.configure("ar",  0.15*aspect*1.8) ;     // default 0.15
          bracket2.configure("endscale", 1.1*aspect*1.8) ; // default 1.1
          bracket2.configure("centerscale",  1.0*aspect*1.8) ; // default 1.0
//          bracket2.configure("centerangle",  60) ;   // default 60
//          bracket2.configure("endangle",  50) ;      // default 50
          canvas.append(bracket2) ;
          fTeXlabel( (0.3+5.7)/2.0, -0.9, "tc", 
                         "${\\scriptstyle f'>0}$" ) ;


          fBracket bracket3 = new fBracket(xmax, -0.55, 6.3, -0.55) ;
          bracket3.configure("ar",  0.15*aspect*0.5) ;     // default 0.15
          bracket3.configure("endscale", 1.1*aspect*0.6) ; // default 1.1
          bracket3.configure("centerscale",  1.0*aspect*0.6) ; // default 1.0
//          bracket3.configure("centerangle",  30) ;   // default 60
//          bracket3.configure("endangle",  50) ;      // default 50
          canvas.append(bracket3) ;
          fTeXlabel( (6.3+xmax)/2.0, -1.0, "tc", 
                         "${\\scriptstyle f'<0,\\ f{\\rm\\  decreasing}}$" ) ;


     }
}
