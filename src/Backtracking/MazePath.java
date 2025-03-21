package Backtracking;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args){
        Path("",3,3);
        System.out.println(PathRet("",3,3));
        System.out.println(PathRetDiagonal("",3,3));
    }
    static void Path(String path, int row, int col){
        if( row == 1 && col == 1){
            System.out.println(path);
            return;
        }
        if( row > 1){
            Path(path + 'D',row -1,col);
        }
        if( col > 1){
            Path( path + 'R',row,col- 1);
        }
    }
    static ArrayList<String> PathRet(String p, int row,int col){
        if( row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(row > 1){
            list.addAll(PathRet(p + 'D', row - 1, col));
        }
        if(col > 1){
            list.addAll(PathRet(p + 'R' , row,col -1 ));
        }
        return list;
    }
    static ArrayList<String> PathRetDiagonal(String p, int row,int col){
        if( row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && col > 1){
            list.addAll(PathRetDiagonal(p + 'D', row -1,col - 1));
        }
        if(row > 1){
            list.addAll(PathRetDiagonal(p + 'V', row - 1, col));
        }
        if(col > 1){
            list.addAll(PathRetDiagonal(p + 'H' , row,col -1 ));
        }

        return list;
    }
}
