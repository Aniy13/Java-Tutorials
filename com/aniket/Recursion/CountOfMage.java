package Recursion;

import java.util.ArrayList;

public class CountOfMage {
    public static void main(String[] args) {
//        System.out.println(count(3,3));

//            path("",3,3);
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathD("",3,3));
        boolean[][] river={{true,true,true},{true,false,true},{true,true,true}};
        pathAb("",river,0,0);
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int down= count(r-1,c);
        int right=count(r,c-1);

        return down+right;
    }
    static void path(String p, int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
    static ArrayList<String> pathRet(String p, int r , int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(p+'R',r,c-1));
        }
        return list;
    }
    static ArrayList<String> pathD(String p , int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathD(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll(pathD(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(pathD(p+'H',r,c-1));
        }
        return list;

    }
    static ArrayList<String> pathAbs(String p , boolean[][] maze , int r , int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if(maze[r][c]==false) {return pathAbs(p,maze,r,c);}
        ArrayList<String > list = new ArrayList<>();
        if(r< maze.length && c<maze[0].length){
            list.addAll(pathD(p+'D',r+1,c+1));
        }
        if(r< maze.length-1){
            list.addAll(pathD(p+'V',r+1,c));
        }
        if(c< maze[0].length-1){
            list.addAll(pathD(p+'H',r,c+1));
        }
        return list;

    }
    static void pathAb(String p , boolean[][] maze , int r , int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) {return;}


        if(r< maze.length-1){
            pathAb(p+'v',maze,r+1,c);
        }
        if(c< maze[0].length-1){
            pathAb(p+'H',maze,r,c+1);
        }

    }
}


