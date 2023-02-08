package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
        // 싱글톤 인스턴스 호출 막기
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
