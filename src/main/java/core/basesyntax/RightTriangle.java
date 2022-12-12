package core.basesyntax;

public class RightTriangle extends Figures {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (0.5 * (firstLeg * secondLeg));
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg + " units, color: " + color;
    }
}