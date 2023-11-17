package designpattern.creationalpattern.abstractfactory;

/**
 * 具体工厂
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Article getArticle() {
        return new PythonArticle();
    }

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
