package controlflow;

public class ExamplesOfSwitch {
    public static void main(String[] args) {
        String extension = "pdf";

        switch (extension) {
            case "docx":
                System.out.println("This is a word document");
                break;
            case "pdf":
                System.out.println("This is pdf file.");
                break;
            case "pptx":
                System.out.println("This is a power point presentation.");
                break;
            case "txt":
                System.out.println("This is a text file.");
                break;
            default:
                System.out.println("We don't support this file.");
        }

        int month = 3;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("This month has 31 days.");
                break;
            case 4, 6, 9, 11:
                System.out.println("This month has 30 days.");
                break;
            case 2:
                System.out.println("This month has 28 or 29 days.");
                break;
        }
    }
}
