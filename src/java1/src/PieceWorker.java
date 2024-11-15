// Final class PieceWorker (inherits from Employee)
public final class PieceWorker extends Employee {
    private final double wagePerPiece;
    private final int piecesProduced;

    // Constructor
    public PieceWorker(String name, double wagePerPiece, int piecesProduced) {
        super(name);
        this.wagePerPiece = wagePerPiece;
        this.piecesProduced = piecesProduced;
    }

    // Overriding the abstract method to calculate earnings
    @Override
    public double earnings() {
        return wagePerPiece * piecesProduced;
    }
}
