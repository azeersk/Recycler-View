package foodmodels;

public class foodClass {
    int Image;
    String Text;
    public foodClass(int Image, String Text){
        this.Image = Image;
        this.Text = Text;
    }

    public int getImage() {
        return Image;
    }
    public void setImage(int image) {
        Image = image;
    }

    public String getText() {
        return Text;
    }
    public void setText(String text) {
        Text = text;
    }
}
