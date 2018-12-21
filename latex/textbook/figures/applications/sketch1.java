                  /*  File:  sketch1.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class sketch1 extends Template {

     static {templateClass = new sketch1() ; }

     public void setup() {
          filePrefix = "sketch1" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.0 ;   
          ysize = 2.7 ;   
          xmin = -3.0 ;
          xmax = 3.0 ;
          ymin = -9.0 ;
          ymax = 9.0 ;
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
          fCurve("y=x*x*x-3*x+1", 0, -2.4, 3, 1) ;
          String Black = "0 0 0 1 setcmykcolor  " ;
          canvas.append( new fPsWrite(Black+"\n")) ;
          fEnv("useColorPs", "false") ;
          fEnv("lineWidth", 0.5) ;
          fLine(-3,0, 3, 0) ;
          fLine(0,-6.0, 0, ymax) ;

          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ; // = 4.44
          double r = 0.04 ;
          fDisk(1, -1, r,r*aspect, FILLED) ;
          fDisk(-1, 3, r,r*aspect, FILLED) ;
          fDisk(0, 1,  r,r*aspect, FILLED) ;
          fTeXlabel(-1, 3.2, "bc", "$(-1, 3)$") ;
//          fTeXlabel(-1, 4.6, "bc", "$f'=0$") ;
          fTeXlabel(1, -1.2, "tc", "$(1, -1)$") ;
          fTeXlabel(0.05, 1.0, "bl", "$(0, 1)$") ;

          fTeXlabel(xmax, -0.2, "tr", "$x$") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$") ;

          fTeXlabel(2.3, 8.0, "rc", "$y=x^3-3x+1$") ;

          fBracket bracket1 = new fBracket(-1.02, -6.2, xmin, -6.2, 0.05) ;
          bracket1.configure("ar",  0.15*aspect*0.4) ;     // default 0.15
          bracket1.configure("endscale", 1.1*aspect*0.4) ; // default 1.1
          bracket1.configure("centerscale",  1.0*aspect*0.45) ; // default 1.0
          bracket1.configure("centerangle",  40) ;   // default 60
//          bracket1.configure("endangle",  50) ;      // default 50
          canvas.append(bracket1) ;
          fTeXlabel( (-1.02+xmin)/2.0, -6.8, "tc", 
                         "${\\scriptstyle f'>0,\\ f{\\rm\\  increasing}}$" ) ;


          fBracket bracket2 = new fBracket(0.98, -6.2, -0.98, -6.2, 0.05) ;
          bracket2.configure("ar",  0.15*aspect*0.4) ;     // default 0.15
          bracket2.configure("endscale", 1.1*aspect*0.4) ; // default 1.1
          bracket2.configure("centerscale",  1.0*aspect*0.45) ; // default 1.0
          bracket2.configure("centerangle",  40) ;   // default 60
//          bracket2.configure("endangle",  50) ;      // default 50
          canvas.append(bracket2) ;
          fTeXlabel( 0, -6.8, "tc", 
                         "${\\scriptstyle f'<0,\\ f{\\rm\\  decreasing}}$" ) ;


          fBracket bracket3 = new fBracket(xmax, -6.2, 1.02, -6.2, 0.05) ;
          bracket3.configure("ar",  0.15*aspect*0.4) ;     // default 0.15
          bracket3.configure("endscale", 1.1*aspect*0.4) ; // default 1.1
          bracket3.configure("centerscale",  1.0*aspect*0.45) ; // default 1.0
          bracket3.configure("centerangle",  40) ;   // default 60
//          bracket3.configure("endangle",  50) ;      // default 50
          canvas.append(bracket3) ;
          fTeXlabel( (1.02+xmax)/2.0, -6.8, "tc", 
                         "${\\scriptstyle f'>0,\\ f{\\rm\\  increasing}}$" ) ;


          fBracket bracket4 = new fBracket(xmax, -8.2, 0.02, -8.2, 0.05) ;
          bracket4.configure("ar",  0.15*aspect*0.4) ;     // default 0.15
          bracket4.configure("endscale", 1.1*aspect*0.4) ; // default 1.1
          bracket4.configure("centerscale",  1.0*aspect*0.45) ; // default 1.0
          bracket4.configure("centerangle",  40) ;   // default 60
//          bracket4.configure("endangle",  50) ;      // default 50
          canvas.append(bracket4) ;
          fTeXlabel( (0.02+xmax)/2.0, -9.0, "tc", 
                         "${\\scriptstyle f''>0,\\ f{\\rm\\  convex\\ up}}$" ) ;


          fBracket bracket5 = new fBracket(-0.02, -8.2, xmin, -8.2, 0.05) ;
          bracket5.configure("ar",  0.15*aspect*0.4) ;     // default 0.15
          bracket5.configure("endscale", 1.1*aspect*0.4) ; // default 1.1
          bracket5.configure("centerscale",  1.0*aspect*0.45) ; // default 1.0
          bracket5.configure("centerangle",  40) ;   // default 60
//          bracket5.configure("endangle",  50) ;      // default 50
          canvas.append(bracket5) ;
          fTeXlabel( (-0.02+xmin)/2.0, -9.0, "tc", 
                         "${\\scriptstyle f''<0,\\ f{\\rm\\  convex\\ down}}$" ) ;

     }
}
