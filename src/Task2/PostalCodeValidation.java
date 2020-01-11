package Task2;

public class PostalCodeValidation {
    public static void main(String args[]) {
    }
}

    private void emailValidation() {
            String code = "80-567";
            if (code.matches ("^[a-zA-Z0-9]([a-zA-z0-9]+\\.?[a-zA-Z0-9]+)*" + "@[a-zA-z]+" + "[a-z.]+[a-z]+")) {
                System.out.println ("ZIP Code correct");
                System.out.println (code);
                return;
            }
            System.out.println (code);
            System.out.println  ("ZIP Code incorrect");
        }
    public PostalCodeValidation setTitle(String PostalCodeValidation) {
    }

    public void setSize(int i, int i1) {
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean getVisible() {
        return visible;
    };
    }

    private void dateValidation() {
        dateButton.setOnAction (event -> {
            String date = dateInput.getText ();
            if (date.matches ("\\d{4}-\\d{2}-\\d{2}")) {
                dateValidationText.setText ("ZIP Code Correct");
                return;
            }
            dateValidationText.setText ("ZIP Code Incorrect");
        });
    }

    private void postCodeValidation() {
        validateButton.setOnAction (event -> {
            String code = validationTest.getText ();
            if (code.matches ("^\\d{2}" + "-" + "\\d{3}$")) {
                validationField.setText ("True");
                return;
            }
            validationField.setText ("False");
        });
    }


