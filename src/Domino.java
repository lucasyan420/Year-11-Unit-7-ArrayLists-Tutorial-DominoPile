public class Domino {
    private int top;
    private int bottom;

    public Domino(){
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle(){
        if(bottom < top){
            flip();
        }
    }

    public int compareTo(Domino other){
        int smallest1;
        int smallest2;
        int largest1;
        int largest2;

        if(this.top < this.bottom){
            smallest1 = this.top;
            largest1 = this.bottom;
        }
        else{
            smallest1 = this.bottom;
            largest1 = this.top;
        }

        if(other.top < other.bottom){
            smallest2 = other.top;
            largest2 = other.bottom;
        }
        else{
            smallest2 = other.bottom;
            largest2 = other.top;
        }

        if(smallest1 < smallest2){
            return -1;
        }
        else if(smallest2 < smallest1){
            return 1;
        }
        else{
            if (largest1 < largest2) {
                return -1;
            } else if (largest2 < largest1) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other){
        int total1;
        int total2;

        total1 = this.top + this.bottom;
        total2 = other.top + other.bottom;

        if(total1 < total2){
            return -1;
        }
        else if(total2 < total1){
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean canConnect(Domino other){
        if(this.top == other.top || this.bottom == other.bottom || this.bottom == other.top || this.top == other.bottom){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Domino{" +
                top + "/" + bottom +
                '}';
    }
}

