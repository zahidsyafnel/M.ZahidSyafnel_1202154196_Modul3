package com.example.android.mzahidsyafnel_1202154196_modul3;


//class air
public class Water {
    String title, descpription, detail;
    int image;
//class untuk mendiskripsikan,judul,detail,dan image
    public Water(String title, String descpription, String detail, int image) {
        this.title = title;
        this.descpription = descpription;
        this.detail = detail;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }//mengambil kembali tittle

    public String getDescpription() {
        return descpription;
    }//mengambil kembali deskripsi

    public String getDetail() {
        return detail;
    }//mengambil kembali detail

    public int getImage() {
        return image;
    }//mengambil kembali gambar
}
