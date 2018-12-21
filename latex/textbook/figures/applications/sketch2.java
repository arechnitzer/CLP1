                  /*  File:  sketch2.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class sketch2 extends Template {

     static {templateClass = new sketch2() ; }

     public void setup() {
          filePrefix = "sketch2" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.0 ;   
          ysize = 2.5 ;   
          xmin = -3.0 ;
          xmax = 5.0 ;
          ymin = -45.0 ;
          ymax = 30.0 ;
          topmargin = 0.0 ;
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
          fCurve("y=x*x*x*(x-4)", 0, -3, 5, 1) ;
          String Black = "0 0 0 1 setcmykcolor  " ;
          canvas.append( new fPsWrite(Black+"\n")) ;
          fEnv("useColorPs", "false") ;
          fEnv("lineWidth", 0.5) ;
          fLine(-3,0, 5, 0) ;
          fLine(0,-30.0, 0, ymax) ;
          fTeXlabel(xmax, -0.8, "tr", "$x$") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$") ;
          fTeXlabel(4.25, 30.0, "rc", "$y=x^4-4x^3$") ;

          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ; // =15.0
          double r = 0.07 ;
          fDisk(0, 0, .07, r*aspect, FILLED) ;
          fDisk(3, -27, .07, r*aspect, FILLED) ;
          fDisk(2, -16, .07, r*aspect, FILLED) ;
          fTeXlabel(0.07, 1, "bl", "$(0, 0)$") ;
          fTeXlabel(3, -28, "tc", "$(3, -27)$") ;
          fTeXlabel(2.15, -16, "lc", "$(2, -16)$") ;

          fBracket bracket1 = new fBracket(-0.03, -34, xmin, -34) ;
          bracket1.configure("ar",  0.15*aspect*0.3) ;     // default 0.15
          bracket1.configure("endscale", 1.1*aspect*0.3) ; // default 1.1
          bracket1.configure("centerscale",  1.0*aspect*0.4) ; // default 1.0
          bracket1.configure("centerangle",  20) ;   // default 60
          bracket1.configure("endangle",  35) ;      // default 50
          canvas.append(bracket1) ;
          fTeXlabel( (-0.03+xmin)/2.0, -37, "tc", 
                         "${\\scriptstyle f'<0,\\ f{\\rm\\  decreasing}}$" ) ;


          fBracket bracket11 = new fBracket(2.97, -34, 0.03, -34) ;
          bracket11.configure("ar",  0.15*aspect*0.3) ;     // default 0.15
          bracket11.configure("endscale", 1.1*aspect*0.3) ; // default 1.1
          bracket11.configure("centerscale",  1.0*aspect*0.4) ; // default 1.0
          bracket11.configure("centerangle",  20) ;   // default 60
          bracket11.configure("endangle",  35) ;      // default 50
          canvas.append(bracket11) ;
          fTeXlabel( (2.97+0.03)/2.0, -37, "tc", 
                         "${\\scriptstyle f'<0,\\ f{\\rm\\  decreasing}}$" ) ;

          fBracket bracket2 = new fBracket(xmax, -34, 3.03, -34) ;
//          bracket2.configure("ar",  0.4) ;
//          bracket2.configure("endscale",  5) ;
//          bracket2.configure("centerscale",  6) ;
//          bracket2.configure("centerangle",  10) ;
          bracket2.configure("ar",  0.15*aspect*0.37) ;     // default 0.15
          bracket2.configure("endscale", 1.1*aspect*0.35) ; // default 1.1
          bracket2.configure("centerscale",  1.0*aspect*0.45) ; // default 1.0
          bracket2.configure("centerangle",  15) ;   // default 60
          bracket2.configure("endangle",  29) ;      // default 50
          canvas.append(bracket2) ;
          fTeXlabel( (3.03+xmax)/2.0, -37, "tc", 
                         "${\\scriptstyle f'>0,\\ f{\\rm\\  increasing}}$" ) ;


          fBracket bracket3 = new fBracket(-0.03, -42, xmin, -42) ;
          bracket3.configure("ar",  0.15*aspect*0.3) ;     // default 0.15
          bracket3.configure("endscale", 1.1*aspect*0.3) ; // default 1.1
          bracket3.configure("centerscale",  1.0*aspect*0.4) ; // default 1.0
          bracket3.configure("centerangle",  20) ;   // default 60
          bracket3.configure("endangle",  35) ;      // default 50
          canvas.append(bracket3) ;
          fTeXlabel( (-0.03+xmin)/2.0, -45, "tc", 
                         "${\\scriptstyle f''>0,\\ f{\\rm\\  convex\\ up}}$" ) ;


          fBracket bracket4 = new fBracket(1.97, -42, 0.03, -42) ;
          bracket4.configure("ar",  0.15*aspect*0.37) ;     // default 0.15
          bracket4.configure("endscale", 1.1*aspect*0.35) ; // default 1.1
          bracket4.configure("centerscale",  1.0*aspect*0.45) ; // default 1.0
          bracket4.configure("centerangle",  15) ;   // default 60
          bracket4.configure("endangle",  29) ;      // default 50
          canvas.append(bracket4) ;
          fTeXlabel( (0.03+1.97)/2.0, -45, "tc", 
                         "${\\scriptstyle f''<0,{\\rm\\  convex\\ down}}$" ) ;


          fBracket bracket5 = new fBracket(xmax, -42, 2.03, -42) ;
          bracket5.configure("ar",  0.15*aspect*0.3) ;     // default 0.15
          bracket5.configure("endscale", 1.1*aspect*0.3) ; // default 1.1
          bracket5.configure("centerscale",  1.0*aspect*0.4) ; // default 1.0
          bracket5.configure("centerangle",  20) ;   // default 60
          bracket5.configure("endangle",  35) ;      // default 50
          canvas.append(bracket5) ;
          fTeXlabel( (2.03+xmax)/2.0, -45, "tc", 
                         "${\\scriptstyle f''>0,\\ f{\\rm\\  convex\\ up}}$" ) ;





     }
}
