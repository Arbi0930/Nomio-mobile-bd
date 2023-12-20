package com.emsoderia.weather.Domains;

public class Hourly {
    private String hour;
    private int temp;
    private String picPath;


    /** Constructor function Android studio эсхүл spring boot ер нь Жава дээр юм хийж байгаа бол constructor
        function заавал байх ёстой alt+insert дархаар windows дээр generate дотроос гараад ирнэ.
     ***/
    public Hourly(String hour, int temp, String picPath) {
        this.hour = hour;
        this.temp = temp;
        this.picPath = picPath;
    }


}
