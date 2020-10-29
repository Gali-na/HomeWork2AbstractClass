public class Board {
   private Shape [] board;

    public Board() {
        this.board = new Shape[4];
    }

    public Shape[] getBoard() {
        return board;
    }

    public void setBoard(Shape[] board) {
        this.board = board;
    }

    public void addFiqure(Shape shape) {
        for(int i=0;i<this.board.length;i++) {
            if(this.board[i]==null) {
                board[i]=shape;
                System.out.println("The figure is placed on the board");
                return;
            }
        }
        System.out.println("No way to link a shape");
    }

    public void deletionFiqure(Shape shape) {
        for (int i = 0; i < this.board.length; i++) {
            if (this.board[i] != null) {
                if (this.board[i].equals(shape)) {
                    board[i] = null;
                    System.out.println("Shape deleted successfully");
                    return;
                }
            }
            else {
                System.out.println("Kazan figure is absent on the board");
                return;
            }
        }
    }

    public void showFiqure() {
        for (int i = 0; i < this.board.length; i++) {
            if (this.board[i] != null) {
                System.out.println(board[i].toString() + " area " +board[i].getArea() + " perimetr "+board[i].getPerimetr());
            }
        }
    }
}
