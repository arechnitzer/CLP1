                  /*  File:  baseball.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class baseball extends Template {

     static {templateClass = new baseball() ; }

     public void setup() {
          filePrefix = "baseball" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0*1.5 ;   
          ysize = 1.0*1.5 ;   
          xmin = -50 ;
          xmax = 250 ;
          ymin = -50 ;
          ymax = 50 ;
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
          String Red = "0 1 1 0 setcmykcolor  " ;
          double thE = 20 ; double thErad = thE*Math.PI/180 ;
          double th = 12 ; double thrad = th*Math.PI/180 ;
          double R = 200 ;
          double rb = R*Math.sin(thrad) ; 
          double re = 15 ; 
          double rth = 45 ;
          double x = -rb*Math.sin(thrad) ; double y = rb*Math.cos(thrad) ;
          fEnv("lineWidth", 0.5) ;
          fDisk(R,0,  rb,rb, CLOSED) ;
          fLine(0,0, 250*Math.cos(thrad), 250*Math.sin(thrad) ) ;
          fEllipticalArc(-re,0, re, re, -thE, thE, OPEN) ;
          fLine(-re,0, -re+(re+5)*Math.cos(thErad), (re+5)*Math.sin(thErad) ) ;
          fLine(-re,0, -re+(re+5)*Math.cos(thErad), -(re+5)*Math.sin(thErad) ) ;
          fEllipticalArc(0,0, rth, rth, 0,th, OPEN ) ;
          fTeXlabel(rth+10, 1.3, "bl", "$\\theta(t)$") ;
          double d = 5 ;
          double dxa = d*Math.cos(thrad) ; double dya = d*Math.sin(thrad) ;
          double dxb = -d*Math.sin(thrad) ; double dyb = d*Math.cos(thrad) ;
          fLine(R+x-dxb,y-dyb,   R+x-dxb-dxa,y-dyb-dya) ;
          fLine(R+x-dxa,y-dya,   R+x-dxb-dxa,y-dyb-dya) ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 1.0) ;
          fLine(0,0, R,0) ;
          fTeXlabel(R/2, -3, "tc", "$d-vt$") ;
          fLine(0,0, R+x,y) ;
          fLine(R,0, R+x,y) ;
          fTeXlabel(R+x/2+3, y/2, "bl", "$r$") ;

          
     }
}
