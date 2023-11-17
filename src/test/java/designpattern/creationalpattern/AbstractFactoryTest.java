package designpattern.creationalpattern;

import designpattern.creationalpattern.abstractfactory.*;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        // 指定具体工厂，可以获得该工厂生产的一系列产品
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        Article javaArticle = javaCourseFactory.getArticle();
        Video javaVideo = javaCourseFactory.getVideo();
        javaArticle.produce();
        javaVideo.produce();

        CourseFactory pythonFactory = new PythonCourseFactory();
        Article pythonArticle = pythonFactory.getArticle();
        Video pythonVideo = pythonFactory.getVideo();
        pythonArticle.produce();
        pythonVideo.produce();
    }
}
