package com.ohgiraffers.section01.object.book;

public class Book {
    private int num;
    private String title;
    private String author;
    private int price;

    public Book(){}

    public Book(int num, String title, String author, int price) {
        this.num = num;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        Book other = (Book) obj;

        if (this.num !=other.num){
            return false;
        }

        if (this.title == null){
            if (other.title != null){
                return false;
            }
        }else if(!this.title.equals(other.title)){
            return false;
        }
        if (this.author == null){
            if (other.author != null){
                return false;
            }
        }else if(!this.author.equals(other.author)){
            return false;
        }
        if (this.price != other.price){
            return false;
        }
        return true;
    } //동등객체를 동일객체로 비교하고 싶어서 하나씩 뜯어서 override 를 비교해서 넘겨줌.

    @Override
    public int hashCode() {

        int result = 1;//초기화
        final int PRIME = 31; //hashCode 재정의 공식
        result = PRIME * result + this.num;
        result = PRIME * result + this.title.hashCode(); //String에 정의되어있는 값들 넣어줌
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price; //int라서 hashCode알아볼 필요 없음.
        //필드마다 값들이 31* 재정의할 값 + 다시 result값 이런식으로 쌓아줌
        return result;

    } //String key값의 값을 재정의해준다 값이 null이기 때문에
}
