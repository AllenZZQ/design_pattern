package designPattern.facade;

public class Main {

    public static void main(String[] args) {
        Video video = new Video();
        Music music = new Music();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(video, music);
        homeTheaterFacade.watch("aa");
    }
}
