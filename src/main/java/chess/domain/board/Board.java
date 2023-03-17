package chess.domain.board;

import chess.domain.piece.Empty;
import chess.domain.piece.Piece;

import java.util.List;
import java.util.Map;

public class Board {

    private final Map<Position, Piece> boards;

    public Board(Map<Position, Piece> boards) {
        this.boards = boards;
    }

    public Piece findPiece(Position position) {
        if (boards.containsKey(position)) {
            return boards.get(position);
        }
        throw new IllegalArgumentException("잘못된 위치를 입력했습니다");
    }

    public Map<Position, Piece> getBoards() {
        return boards;
    }

    public boolean isEmptyPosition(List<Position> paths) {
        return paths.stream()
                .map(boards::get)
                .allMatch(Piece::isEmpty) || paths.isEmpty();
    }

    public void movePiece(Position sourcePosition, Position targetPosition) {
        Piece sourcePiece = boards.get(sourcePosition);
        Piece movedPiece = sourcePiece.move();
        boards.put(targetPosition, movedPiece);
        boards.put(sourcePosition, Empty.create());
    }
}
