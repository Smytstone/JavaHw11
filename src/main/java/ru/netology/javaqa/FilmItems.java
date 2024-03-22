package ru.netology.javaqa;
public class FilmItems {
    private int id;
    private String filmName;
    private String filmGenre;
    private String filmImg;

    public FilmItems(int id, String filmName, String filmGenre, String filmImg) {
        this.id = id;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.filmImg = filmImg;
    }

    public int getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public String getFilmImg() {
        return filmImg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public void setFilmImg(String filmImg) {
        this.filmImg = filmImg;
    }
}
