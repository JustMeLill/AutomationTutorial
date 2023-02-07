package Objects;

import java.util.HashMap;

public class AlertObject {
    private String alertText;

    public AlertObject(HashMap <String, String> TestData) {
        populateObject(TestData);
    }

    public String getAlertText() {
        return alertText;
    }

    public void setAlertText(String alertText) {
        this.alertText = alertText;
    }

    private void populateObject(HashMap <String, String> TestData){
        for (String Key: TestData.keySet()){
            switch (Key){
                case "alertText":
                    setAlertText(TestData.get(Key));
                    break;
            }
        }
    }


}
