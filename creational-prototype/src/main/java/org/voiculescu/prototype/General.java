package org.voiculescu.prototype;

//Doesn't support cloning
public class General extends GameUnit implements Cloneable {

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General " + state + " @ " + getPosition();
    }

    @Override
    public General clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Reset not supported");
    }
}
