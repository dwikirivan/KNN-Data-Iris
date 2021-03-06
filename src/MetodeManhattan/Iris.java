/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeManhattan;

public class Iris {

    private final double sepalLength;
    private final double sepalWidth;
    private final double petalLength;
    private final double petalWidth;
    private IrisType irisType;

    public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, IrisType irisType) {
        this.sepalLength = sepalLength;
        this.sepalWidth = sepalWidth;
        this.petalLength = petalLength;
        this.petalWidth = petalWidth;
        this.irisType = irisType;
    }

    public double[] getAllSize() {

        return new double[] {this.sepalLength, this.sepalWidth, this.petalWidth, this.petalWidth};
    }

    public IrisType getIrisType() {

        return irisType;
    }

    public void setIrisType(IrisType irisType) {

        this.irisType = irisType;
    }

    @Override
    public String toString() {
        return this.sepalLength + "," +
            this.sepalWidth + "," +
            this.petalLength + "," +
            this.petalWidth + "," +
            this.irisType;
    }
}

