package com.systemdesign.LLD.OOPS;

/*
* Design a small Java system for a media library — think something like a personal collection of Movies, Songs, and Podcasts.
Requirements:

Every media item has a title and a durationInSeconds
Some media items can be downloaded for offline play, others can't (e.g., maybe live podcasts can't be downloaded, but movies and regular songs can)
Some media items support subtitles, others don't (e.g., songs don't have subtitles, movies and some podcasts do)
You should be able to call a generic play() on anything in your library

Write the class/interface structure in Java. Think carefully about what should be a base class, what should be an interface, and why — before you write any code, decide that on paper (or in your head) first.
* */

import java.util.ArrayList;
import java.util.List;

interface Downloadable{
    public void download();
}
interface SubtitleSupport {
    public void getSubtitles();
}
abstract class Media{
    private String title;
    private int durationInSeconds;
    public Media(String title, int durationInSeconds){
        this.title=title;
        this.durationInSeconds=durationInSeconds;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    abstract public void play();


}
class Podcast extends Media implements Downloadable, SubtitleSupport {
    public Podcast(String title, int durationInSeconds) {
        super(title, durationInSeconds);
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.getTitle() + " podcast");
    }

    @Override
    public void download() {
        System.out.println("Now " + this.getTitle() + " available offline");
    }

    @Override
    public void getSubtitles() {
        System.out.println("Showing subtitles for podcast");
    }
}
class LivePodcast extends Media implements SubtitleSupport {

    public LivePodcast(String title, int durationInSeconds){
        super(title,durationInSeconds);
    }

    @Override
    public void play() {
        System.out.println("Playing "+this.getTitle() + " Podcast");
    }

    @Override
    public void getSubtitles() {
        System.out.println("Showing subtitles Live Podcast");
    }
}
class Song extends Media implements Downloadable{

    public Song(String title, int durationInSeconds) {
        super(title, durationInSeconds);
    }

    @Override
    public void play() {
        System.out.println("Playing "+this.getTitle()+ " song");
    }

    @Override
    public void download() {
        System.out.println("Now "+this.getTitle()+" available offline");
    }
}
class Movie extends Media implements Downloadable, SubtitleSupport {

    public Movie(String title, int durationInSeconds) {
        super(title, durationInSeconds);
    }

    @Override
    public void download() {
        System.out.println("Now "+this.getTitle()+" available offline");
    }

    @Override
    public void getSubtitles() {
        System.out.println("Showing subtitles for movie");
    }

    @Override
    public void play() {
        System.out.println("Playing "+this.getTitle()+ " movie");
    }
}
public class MediaLibrary {


    public static void main(String[] args) {
        LivePodcast livePodcast = new LivePodcast("How to use time wisely", 3600);
        livePodcast.play();
        livePodcast.getSubtitles();
        System.out.println();

        Podcast podcast = new Podcast("How to use time wisely", 3600);
        podcast.play();
        podcast.getSubtitles();
        podcast.download();
        System.out.println();

        Movie movie=new Movie("Durandhar",15000);
        movie.play();
        movie.getSubtitles();
        movie.download();
        System.out.println();

        Song song=new Song("BABY",600);
        song.play();
        song.download();



        // this is separate logic for calling method which not comes in dynamic binding
        List<Media> media=new ArrayList<>();
        media.add(podcast);
        media.add(song);
        media.add(movie);
        media.add(livePodcast);
        for (Media m: media){
            if(m instanceof Downloadable d){
                d.download();
            }
        }


    }

}
