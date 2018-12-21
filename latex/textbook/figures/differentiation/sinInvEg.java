                  /*  File:  sinInvEg.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class sinInvEg extends Template {

     static {templateClass = new sinInvEg() ; }

     public void setup() {
          filePrefix = "sinInvEg" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 2.0 ;   
          xmin = -0.1*Math.PI ;
          xmax = 1.1*Math.PI ;
          ymin = -0.5 ;
          ymax = 1.2 ;
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
          double th = 5*Math.PI/16;
          double th2 = 11*Math.PI/16;
          double pi2 = Math.PI/2;
          double y = Math.sin(th) ;
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, -0.2, 0.0, ymax) ;
          fTeXlabel(xmax+0.2, 0, "cl", "$Y$") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$") ;
          fLine(Math.PI/2,0, Math.PI/2, -0.07) ;
          fTeXlabel(Math.PI/2, -0.1, "tc", "${\\ts\\frac{\\pi}{2}}$") ;
          fLine(th2,0, th2, -0.07) ;
          fTeXlabel(th2, -0.1, "tc", "${\\ts\\frac{11\\pi}{16}}$") ;
          fLine(5*Math.PI/16,0, 5*Math.PI/16, -0.07) ;
          fTeXlabel(5*Math.PI/16, -0.1, "tc", "${\\ts\\frac{5\\pi}{16}}$") ;
          fTeXlabel(xmax-0.05, Math.sin(xmax-0.1), "cl", "$y=\\sin(Y)$") ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y = sin(x)", 0, xmin+0.1, xmax-0.1, OPEN) ;
          String Blue = "1 1 0 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Blue+"\n")) ;
          fEnv("lineWidth", 2.0) ;
          fCurve("y = sin(x)", 0, xmin+0.1, Math.PI/2, OPEN) ;
          fEnv("lineWidth", 1.0) ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fLine(xmin, y, xmax, y) ;
          fTeXlabel(xmin-0.1, y, "cr", "$y=\\sin(\\nicefrac{11\\pi}{16})$") ;
          double rx = 0.05 ;  double ry = rx/ysize*(ymax-ymin)/(xmax-xmin)*xsize ;
          fDisk(th, y, rx, ry, FILLED) ;
          fEnv("lineWidth", 0.5) ;
          canvas.append( new fPsWrite("[3 3] 0 setdash\n")) ;
          fLine(th, 0, th, y) ;
          fLine(th2, 0, th2, y) ;
          canvas.append( new fPsWrite("[ ] 0 setdash\n")) ;
          fBracket(pi2-0.015,-0.35, th, -0.35 ) ;
          fBracket(th2,-0.35, pi2+0.015, -0.35 ) ;
          fTeXlabel((th+pi2)/2, -0.45, "tc", "${\\ts\\frac{3\\pi}{16}}$") ;
          fTeXlabel((th2+pi2)/2, -0.45, "tc", "${\\ts\\frac{3\\pi}{16}}$") ;

          fEnv("useColorPs", "false") ;
          fEnv("psFillGray", 1.0) ;
          fDisk(th2, y, rx, ry, FILLED+CLOSED) ;



     }
}
