import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    private Instant starTime;
    private Instant endTime;

    //Constructor không tham số của starTime với thời gian hiện tại của hệ thống:
    public StopWatch() {
        starTime = Instant.now();
    }

    //getter của startTime và endTime:
    public Instant getStarTime() {
        return starTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    //Phương thức:
    public void start() {
        starTime = Instant.now();
    }
    public void stop() {
        endTime = Instant.now();
    }

    //Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây:
    public long getElapsedTime() {
        if (endTime != null) {
            Duration duration = Duration.between(starTime, endTime);
            return duration.toMillis();
        } else {
            return -1; //Việc trả về -1 là một cách thông thường để xác định trạng thái không hợp lệ hoặc không hoàn thành của một phương thức
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        // Làm 1 hành động nào đó để tính thử thời gian
        int sum = 0;
        for (int i = 0; i < 9999; i++) {
            sum += i;
            System.out.println(sum);
        }
        String message = "Đã đếm xong!";
        System.out.println(message);

        stopWatch.stop();

        long timeResult = stopWatch.getElapsedTime();
        System.out.println("số milli giây đã trôi qua là: " + timeResult);

    }

}
