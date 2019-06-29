package state;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("You can't insert another quarter");
        } else if(state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("Ypu insert a quarter");
        } else if (state == SOLD_OUT){
            System.out.println("You can't insert a quarter. A machine is sold out");
        } else if(state == SOLD){
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("QUARTER returned");
            state = NO_QUARTER;
        } else if(state == NO_QUARTER){
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD){
            System.out.println("Tou can't eject, you haven't inserted a quarter yet");
        } else if(state == SOLD_OUT){
            System.out.println("sorry, you are already turned the crank");
        }
    }

    public void turnCrank(){
        if(state == SOLD){
            System.out.println("Turning twice doesn't get you another gumball");
            state = NO_QUARTER;
        } else if(state == NO_QUARTER){
            System.out.println("You turned but there is no quarter");
        } else if (state == SOLD_OUT){
            System.out.println("You turned but there is no gumball");
        } else if(state == HAS_QUARTER){
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    public void dispense(){
        if(state ==SOLD){
            System.out.println("A gumball comes rolling down to the slot");
            count = count -1;
            if(count == 0){
                System.out.println("NO GUMBLE");
                state = SOLD_OUT;
            } else if (state == NO_QUARTER){
                System.out.println("You need  to pay first");
            }else if (state == SOLD_OUT){
                System.out.println("No gumball dispensed");
            }else if (state == HAS_QUARTER){
                System.out.println("No gumball dispensed");
            }

        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
