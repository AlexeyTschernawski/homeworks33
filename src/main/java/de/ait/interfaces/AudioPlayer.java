package de.ait.interfaces;

public class AudioPlayer implements MediaPlayer{

    private String title;

    public AudioPlayer(String title) {
        this.title = title;
    }

    /**
     * @param title
     */
    @Override
    public void stop(String title) {
        System.out.println("Играет " + title
                + " в аудиоплеере");
    }

    /**
     * @param title
     */
    @Override
    public void rewind(String title) {
        System.out.println("Перемотан  " + title + " в аудиоплеере");
    }

    /**
     * @param title
     */
    @Override
    public void pause(String title) {
        System.out.println("Поставлен на паузу " + title + " в аудиоплеере");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
