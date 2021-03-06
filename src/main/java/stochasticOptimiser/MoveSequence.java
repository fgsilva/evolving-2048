package stochasticOptimiser;

/**
 * A sequence of moves -- each move is represented as a byte (0, 1, 2, 3),
 * and is assigned a score
 */
public class MoveSequence implements Cloneable {

    protected byte[] values;
    protected double score;
    private int id;

    public MoveSequence(int length, int id) {
        values = new byte[length];
        this.id = id;

    }

    public int getID() {
        return id;
    }

    public void setID(int newID) {
        this.id = newID;
    }

    public void setValues(byte[] values) {
        this.values = values;
    }

    public byte[] getValues() {
        return values;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public Object clone() {
        MoveSequence clone = new MoveSequence(values.length, -1);
        clone.setValues(values.clone());

        return clone;
    }
}
