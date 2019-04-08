package designPattern.facade;

public class HomeTheaterFacade {

    private Video video;

    private Music music;

    public HomeTheaterFacade(Video video, Music music) {
        this.video = video;
        this.music = music;
    }


    public void watch(String movie) {
        video.watchMovie(movie);
        music.play();
    }
}
