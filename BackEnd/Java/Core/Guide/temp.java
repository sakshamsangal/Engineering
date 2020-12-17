public class LabeledBox extends Box implements Drawable{
private String label;
LabeledBox(int length, int width, String label){
super(length,width);
this.label=label;
}
public String getLabel() {
return label;
}

public void setLabel(String label) {
this.label = label;
}

public String draw(){
return "Drawing Box with dimensions: ("+getLength()+","+getWidth()+") with label: "+getLabel();
}


}