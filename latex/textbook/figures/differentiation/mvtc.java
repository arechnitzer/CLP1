                  /*  File:  mvtc.java    */


import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;


public class mvtc extends Template {

     static {templateClass = new mvtc() ; }

     public void setup() {
          filePrefix = "mvtc" ;    // used as the prefix for any ps or lbl files
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2*1.1*1.2 ;      // in inches
          ysize = 2*0.9*1.2 ;   // in inches. 
          xmin = -20 ;
          xmax = 90 ;
          ymin = -10 ;
          ymax = 90 ;
          topmargin = 0.1 ;   // in inches
          bottommargin = 0 ;   // in inches
          leftmargin = 0 ;   // in inches
          rightmargin = 0 ;   // in inches
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;   
     }
     
     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 0.4) ;
          double b = 80 ;
          double m = 0.6 ;
          double h = 0.02 ; 
          double r = 1 ;
          double B = m*b ;
          double c = b/2 ;
          double C = h*c*(b-c)+m*c ;
          fDisk(0, 0, r, r, FILLED) ;
          fTeXlabel(-2, 0, "tr", "${\\scriptstyle (a,f(a))}$") ;
          fDisk(b, B, r, r, FILLED) ;
          fTeXlabel(b+2, B, "tl", "${\\scriptstyle (b,f(b))}$") ;
          fDisk(c, C, r, r, FILLED) ; 
          fTeXlabel(c-3, C-2, "tl", "${\\scriptstyle (c,f(c))}$") ;
          double c1 = c - 20 ;   double C1 = C+m*(c1-c) ;
          double c2 = c + 20 ;   double C2 = C+m*(c2-c) ;
          fLine(c1,C1, c2, C2) ;
          fLine(0, 0, b, B) ;
          double H = 10 ;
          double d1 = 0 - H*m ;   double D1 =  0 + H ;
          double d2 = b - H*m ;   double D2 =  B + H ;
          fLine(d1,D1, d2, D2) ;
          H = 17 ;
          double e1 = d1 - H*m ;   double E1 = D1 + H ;
          double e2 = d2 - H*m ;   double E2 = D2 + H ;
          fLine(e1,E1, e2, E2) ;
          double x = 20 ; 
          double X = h*x*(b-x)+m*x ;
//          fDisk(x, X, r, r, FILLED) ; 
          fCurve( h+"*x*("+b+"-x)+"+m+"*x", 0, 0, b, OPEN) ;

     }
}
