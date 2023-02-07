package Objects;

import java.util.HashMap;

public class FrameObject {


    private String firstFrame;
    private String secondFrame;

    public FrameObject(HashMap<String, String> TestData) {
        populateObject(TestData);
    }

    public String getFirstFrame() {
        return firstFrame;
    }

    public void setFirstFrame(String firstFrame) {
        this.firstFrame = firstFrame;
    }

    public String getSecondFrame() {
        return secondFrame;
    }

    public void setSecondFrame(String secondFrame) {
        this.secondFrame = secondFrame;
    }

    private void populateObject(HashMap<String, String> TestData){
        for (String Key: TestData.keySet()){
            switch (Key){
                case "firstFrame":
                    setFirstFrame(TestData.get(Key));
                    break;
                case "secondFrame":
                    setSecondFrame(TestData.get(Key));
                    break;
            }
        }
    }




}
