package ru.batyrkhanov.springcourse.PrognozPogody;

public class Response {
    public String country;
    public String city;
    public String localtime;
    public double temp;

    public Response(String country, String city, String localtime, double temp) {
        this.country = country;
        this.city = city;
        this.localtime = localtime;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Response{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", localtime='" + localtime + '\'' +
                ", temp=" + temp +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
