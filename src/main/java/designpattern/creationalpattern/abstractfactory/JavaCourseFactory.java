package designpattern.creationalpattern.abstractfactory;

/**
 * 具体工厂
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Article getArticle() {
        return new JavaArticle();
    }

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
