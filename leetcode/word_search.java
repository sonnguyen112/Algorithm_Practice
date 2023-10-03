import java.util.ArrayList;
import java.util.HashMap;

public class word_search {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        ArrayList<int[]> path = new ArrayList<>();
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                if (dfs(r, c, 0, word, rows, cols, board, path)) return true;
            }
        }
        return false;
    }

    private boolean dfs(int r, int c, int i, String word, int rows, int cols, char[][] board, ArrayList<int[]> path) {
        if (i == word.length()) return true;
        int[] pos = {r, c};
        // System.out.printf("r: %d, c: %d%n", r, c);
        // path.forEach((ePath) -> printPos(ePath));
        // System.out.println(path.contains(pos));
        if (r < 0 ||
            r >= rows ||
            c < 0 ||
            c >= cols ||
            board[r][c] != word.charAt(i) ||
            checkContain(path, pos)) return false;
        // System.out.println("--------");
        path.add(pos);
        boolean res = dfs(r + 1, c, i + 1, word, rows, cols, board, path) ||
                        dfs(r - 1, c, i + 1, word, rows, cols, board, path) ||
                        dfs(r, c + 1, i + 1, word, rows, cols, board, path) ||
                        dfs(r, c - 1, i + 1, word, rows, cols, board, path);
        path.remove(pos);
        return res;
    }

    private boolean checkContain(ArrayList<int[]> path, int[] pos) {
        for (int i = 0; i < path.size(); i++){
            if (path.get(i)[0] == pos[0] && path.get(i)[1] == pos[1]){
                return true;
            }
        }
        return false;
    }

    private void printPos(int[] pos) {
        System.out.print(pos[0]);
        System.out.print(pos[1]);
        System.out.println();
    }

    public static void main(String[] args) {
        word_search solution = new word_search();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        System.out.println(solution.exist(board, word));

        // char[][] board1 = {{'A'}};
        // String word1 = "B";
        // System.out.println(solution.exist(board1, word1));

        // char[][] board2 = {{'A', 'A'}};
        // String word2 = "AAA";
        // System.out.println(solution.exist(board2, word2));
    }
}