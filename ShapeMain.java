public class ShapeMain {
	public static void main(String[] args) {
		ShapeSet ss = new ShapeSet();
		ss.add(new Circle("red",10,10,20));
		ss.add(new Circle("pink",new Point(5,5),10));
		ss.add(new Triangle("blue",new Point(5,5),new Point(10,5),new Point(15,30)));
		ss.add(new Triangle("sky",3,3,5,5,7,7));
		ss.add(new Rectangle("green",30,30,100,50));
		ss.add(new Rectangle("yellow",new Point(5,5),30,15));
		ss.allShapeDraw();
	}
}
/*
[원:색(red),중심점(10,10),반지름(20)]
[원:색(pink),중심점(5,5),반지름(10)]
[삼각형:색(blue),점1(5,5),점1(10,5),점3(15,30)]
[삼각형:색(sky),점1(3,3),점1(5,5),점3(7,7)]
[사각형:색(green),시작점(30,30),너비(100),높이(50)]
[사각형:색(yellow),시작점(5,5),너비(30),높이(15)]
 */
