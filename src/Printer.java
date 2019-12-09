public class Printer {
    private int newTonerLevel;
    private int pagesPrinted;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.newTonerLevel = tonerLevel;
        }
        else {
            this.newTonerLevel = -1;
        }
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return newTonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.newTonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }
    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <=100) {
            if(this.newTonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.newTonerLevel += tonerAmount;
            return this.newTonerLevel;
        }
        else{
            return -1;
        }

    }

    public int printPages(int numPages) {
        if(numPages <= 0) {
            System.out.println("invalid number of pages");
        }
        if(this.isDuplex){
            this.newTonerLevel = newTonerLevel - numPages;
            System.out.println("printing in duplex mode");
            int pagesToPrint = (numPages /= 2) + (numPages % 2);
            this.pagesPrinted = pagesToPrint;
            return pagesPrinted;
        }
        else {
            this.newTonerLevel = newTonerLevel - numPages;
            System.out.println("printing in not duplex mode");
            this.pagesPrinted = numPages;
            return pagesPrinted;
        }
    }

    public int fillToner() {
        return this.newTonerLevel = 100;
    }
}
