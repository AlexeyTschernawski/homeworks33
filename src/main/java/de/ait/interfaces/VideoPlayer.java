package de.ait.interfaces;

public class VideoPlayer implements MediaPlayer{
    /**
     * @param title
     */
    @Override
    public void stop(String title) {
        System.out.println("Играет " + title + " в видеоплеере");
    }

    /**
     * @param title
     */
    @Override
    public void rewind(String title) {
        System.out.println("Перемотан " + title + " в видеоплеере");
    }

    /**
     * @param title
     */
    @Override
    public void pause(String title) {
        System.out.println("Постевлен на паузу  " + title + " в видеоплеере");
    }
}
