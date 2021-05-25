package com.mycompany.graphicbvasic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class MyLine extends UitlShapes2D implements Shapes2D {

    private Point A, B;
    private int size;
    private Color color;
    private float angle = 0;
    private float speed = 4;

    public MyLine() {
    }

    public MyLine(Point a, Point b) {
        A = a;
        B = b;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        if (angle > 360) {
            angle -= 360;
        }
        this.angle = angle;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

//            void midpoint(int x1,int y1,int x2, int y2,int color){
//    //Truong hop 0<m<1 && x1<x2 && y1<y2
//    int a,b,pi,x,y,p;
//    a=y2-y1;
//    b=-(x2-x1);
//    y=y1;
//    x=x1;
//    putpixel(x,y,color);    //Ve diem pixel dau tien
//    p=2*a+b;        //tinh vi tri tuong doi cua diem Midpoint so voi duong thang
//    while(x < x2){
//        if(p < 0){   
//            p+=2*a; // ta chon chon diem yi
//        }else{      
//            y++;
//            p+=2*(a+b);//ta chon diem yi +1
//        }
//        x++;
//        cout<<"Pixel (x,y) midpoint = ("<<x<<", "<<y<<")\n";
//        putpixel(x,y,color);
//        delay(10);
//    }
//}
    @Override
    public void draw(Graphics g) {
        this.size = 5;
        g.setColor(color);
        int a, b, pi, x, y, p;
        a = B.y - A.y;//y
        b = -(B.x - A.x); //x
        y = A.y;
        x = A.x;
        double k = 0;
        if (a > 0) {
            k = -b / a;
        }
        UitlShapes2D.putPixel(g, x, y, size);   //Ve diem pixel dau tien
        p = 2 * a + b;        //tinh vi tri tuong doi cua diem Midpoint so voi duong thang
//        if (b == 0||a==0) {
//            if (y < B.y) {
//                while (y <= B.y) {
//                    if (p < 0) {
//                        p += 2 * a; // ta chon chon diem yi
//                    } else {
//
//                        p += 2 * (a + b);//ta chon diem yi +1
//                    }
//                    y++;
//                    //  cout<<"Pixel (x,y) midpoint = ("<<x<<", "<<y<<")\n";
//                    UitlShapes2D.putPixel(g, x, y, size);
//                }
//            } else  {
//                while (y >= B.y) {
//                    if (p < 0) {
//                        p += 2 * a; // ta chon chon diem yi
//                    } else {
//
//                        p += 2 * (a + b);//ta chon diem yi +1
//                    }
//                    y--;
//                    //  cout<<"Pixel (x,y) midpoint = ("<<x<<", "<<y<<")\n";
//                    UitlShapes2D.putPixel(g, x, y, size);
//                }
//            }
//
//        }
        if ((k >= 0 && k <1)&&b!=0) {      
            if (a < -b) {
                while (x < B.x) {
                    if (p < 0) {
                        p += 2 * a; // ta chon chon diem yi
                    } else {
                        y++;
                        p += 2 * (a + b);//ta chon diem yi +1
                    }
                    x++;
                    //  cout<<"Pixel (x,y) midpoint = ("<<x<<", "<<y<<")\n";
                    UitlShapes2D.putPixel(g, x, y, size);

                }
            } else if (a > -b) {
                while (y >= B.y) {
                    if (p < 0) {
                        p += 2 * a; // ta chon chon diem yi
                    } else {
                        x++;
                        p += 2 * (a + b);//ta chon diem yi +1
                    }
                    y--;
                    //  cout<<"Pixel (x,y) midpoint = ("<<x<<", "<<y<<")\n";
                    UitlShapes2D.putPixel(g, x, y, size);
                }
            }
        } else {
            {
                if (y < B.y) {
                    while (y <= B.y) {
                        if (p < 0) {
                            p += 2 * a; // ta chon chon diem yi
                        } else {
                            p += 2 * (a + b);//ta chon diem yi +1
                        }
                        y++;
                        //  cout<<"Pixel (x,y) midpoint = ("<<x<<", "<<y<<")\n";
                        UitlShapes2D.putPixel(g, x, y, size);
                    }
                } else {
                    while (y >= B.y) {
                        if (p > 0) {
                            p += 2 * a; // ta chon chon diem yi
                        } else {
                            p += 2 * (a + b);//ta chon diem yi +1
                        }
                        y--;
                        //  cout<<"Pixel (x,y) midpoint = ("<<x<<", "<<y<<")\n";
                        UitlShapes2D.putPixel(g, x, y, size);
                    }
                }

            }
        }
    }
//		g.setColor(color);
//		int Dx = B.x - A.x;
//		int Dy = B.y - A.y;
//		int count = Math.max(Math.abs(Dx), Math.abs(Dy)); // Lấy số bước vẽ dài nhất
//		float delta_X, delta_Y, m, n;
//		if (count > 0) {
//			delta_X = (int) Dx;
//			delta_X /= count;
//			delta_Y = (int) Dy;
//			delta_Y /= count;
//
//			m = A.x;
//			n = A.y;
//                        //put pixel
//                      UitlShapes2D.putPixel(g, m, n, size);
////			while (count-- != 0) {
////				g.fillRect((int) m, (int) n, size, size);
////				m += delta_X;
////				n += delta_Y;
////			}

//		g.setColor(Color.BLUE);
//		g.drawString("A", this.getA().x, this.getA().y);
//		g.drawString("B", this.getB().x, this.getB().y);
    public void Net_Dut(Graphics g, int x1, int y1, int x2, int y2) {
        int Dx, Dy, count;
        float delta_X, delta_Y, m, n;
        Dx = x2 - x1;
        Dy = y2 - y1;
        int dem = 0;
        // Lay so buoc ve
        count = Math.max(Math.abs(Dx), Math.abs(Dy)); // Lấy số bước vẽ dài nhất

        if (count > 0) {
            delta_X = (int) Dx;
            delta_X /= count;
            delta_Y = (int) Dy;
            delta_Y /= count;

            m = x1;
            n = y1;

            do {
                if (dem < 6) {
                    g.setColor(Color.LIGHT_GRAY);
                } else {
                    g.setColor(Color.WHITE);
                }
                if (dem % 10 == 0) {
                    dem = 0;
                }

                g.fillRect((int) m, (int) n, 1, 1);
                m += delta_X;
                n += delta_Y;
                dem++;
                --count;
                g.setColor(Color.BLACK);
            } while (count != -1);

        }
    }

    @Override
    public void init(Point start, Point end, int size, Color color) {
        this.setA(start);
        this.setB(end);
        this.setSize(size);
        this.setColor(color);
    }

    @Override
    public boolean impact(Point p) {
        int AB = (int) Math.sqrt(Math.pow((A.x - B.x), 2) + Math.pow(A.y - B.y, 2));
        int AP = (int) Math.sqrt(Math.pow((A.x - p.x), 2) + Math.pow(A.y - p.y, 2));
        int PB = (int) Math.sqrt(Math.pow((p.x - B.x), 2) + Math.pow(p.y - B.y, 2));
        return (((AP + PB) - AB) < size);
    }

    @Override
    public void move(Point start, Point end) {
        int dx = end.x - start.x;
        int dy = end.y - start.y;
        this.setA(new Point(this.getA().x + dx, this.getA().y + dy));
        this.setB(new Point(this.getB().x + dx, this.getB().y + dy));
    }

    @Override
    public void rotate(Point start, Point end) {
//		float a = Display.angleBetweenTwoLines(start, end);
//		Point p1 = new Point(Display.rotateAround(this.getA(), a));
//		Point p2 = new Point(Display.rotateAround(this.getB(), a));
//		setA(p1);
//		setB(p2);
//		this.setAngle(this.getAngle() + a);
    }

    @Override
    public void scale(Point start, Point end) {
        double AP = Math.sqrt(Math.pow((this.getA().x - start.x), 2) + Math.pow(this.getA().y - start.y, 2));
        double PB = Math.sqrt(Math.pow((start.x - this.getB().x), 2) + Math.pow(start.y - this.getB().y, 2));
        if (AP < PB) {
            this.setA(this.getB());
            this.setB(end);
        } else {
            this.setA(this.getA());
            this.setB(end);
        }
    }

    @Override
    public void play(float angle) {
        // TODO Auto-generated method stub

    }

}
