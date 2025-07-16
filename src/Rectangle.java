public class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    double calculateArea(){
        return width*height;
    }

    double calculatePerimeter(){
        return 2*width+2*height;
    }

    boolean isSquare(){
        if(width==height){
            return true;
        }
        else{
            return false;
        }
    }
}
