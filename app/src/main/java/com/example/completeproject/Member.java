package com.example.completeproject;

public class Member {

    private String room;
    private String Day,Month,Year;
    private String address,contractNumber;
    private String coxhotel;
    private String dhakaHotel;
    public Member() {}

    public String getRoom()
    {
        return room;
    }

    public void setRoom(String room) {
       this.room = room;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCoxhotel() {
        return coxhotel;
    }

    public void setCoxhotel(String coxhotel) {
        this.coxhotel = coxhotel;
    }

    public String getDhakaHotel() {
        return dhakaHotel;
    }

    public void setDhakaHotel(String dhakaHotel) {
        this.dhakaHotel = dhakaHotel;
    }
}
