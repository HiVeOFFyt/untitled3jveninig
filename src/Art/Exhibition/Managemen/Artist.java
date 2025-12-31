package Art.Exhibition.Managemen;

public class Artist {
    private String name;
    private  String style;

    public Artist(String name,String style){
        this.name=name;
        this.style=style;
    }
    public String getName(){ return name;}
    public void setName(String name){
        this.name=name;
    }

    public String getStyle(){return style;}
    public void setStyle(String style){
        this.style=style;}
    public String toString(){
        return "Artist:"+name + "style:"+ style;
    }
}

