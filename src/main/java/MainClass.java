import com.baomidou.mybatisplus.core.toolkit.IdWorker;

public class MainClass {
    public static void main(String[] args) {
        long id = IdWorker.getId();
        System.out.println(id);
    }
}
