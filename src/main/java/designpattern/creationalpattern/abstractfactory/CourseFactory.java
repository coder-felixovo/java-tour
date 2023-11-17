package designpattern.creationalpattern.abstractfactory;

/**
 * 抽象工厂
 */
public interface CourseFactory {
    Article getArticle();
    Video getVideo();
}
