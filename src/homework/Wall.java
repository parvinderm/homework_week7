package homework;

public class Wall {       //Declare class
    double width;      //Declare Instance Variable
    double height;     //Declare Instance variable

    public static void main(String[] args) {       //Declare main method or predefined method
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

    public Wall(){      //Declare no argument Constructor

    }
    public Wall(double width,double height) {      //Declare parameterised Constructor
        if (width > 0 && height < 0) {
            this.width = width;
            this.height = 0;

        } else if (width < 0 && height > 0) {
            this.width = 0.0;
            this.height = height;


        } else if (width < 0 && height < 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else {
            this.width = width;
            this.height = height;
        }

    }
        public void setWidth(double width){    //Declare Instance method with parameter
            if(width < 0 ){
                this.width = 0;
            }else {
                this.width = width;
            }
            }
        public double getWidth() {    //Declare Instance method without parameter
            return width;
        }
            public void setHeight(double height) {
                if (height < 0) {
                    this.height = 0;
                } else {
                    this.height = height;
                }
            }

                public  double getHeight() {      //Declare Instance method without parameter
                    return height;
                }


        public double getArea(){       //Declare Instance method without parameter
            return this.width * this.height;
        }

    }

