package com.javaee.basis;

import java.util.*;

public class demo2 {
    static int[][] map;
    static boolean[][] visit;
    static int[][] move = {{1,2},{2,1},{-1,-2},{-2,-1},{1,-2},{-2,1},{-1,2},{2,-1}};
    static int n,m;
    static int a,b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        map = new int[n][m];
        visit = new boolean[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                map[i][j]=-1;
            }
        }
        BFS(x-1,y-1);
        /*for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }*/
        System.out.println(map[a][b]);
    }

    //dfs深度优先遍历 bfs广度优先遍历
    public static void BFS(int x,int y) {
        Queue<Node> queue = new LinkedList<Node>();
        Node start = new Node(x,y,0);
        queue.offer(start);
        map[x][y]=start.step;
        visit[x][y]=true;
        while(!queue.isEmpty()) {
            Node next = queue.poll();
            for(int i=0;i<8;i++) {
                x=next.x+move[i][0];
                y=next.y+move[i][1];
                if(x>=0 && x<n && y>=0 && y<m && !visit[x][y]) {
                    queue.offer(new Node(x,y,next.step+1));
                    map[x][y]=next.step+1;
                    visit[x][y]=true;
                }
            }
        }
    }

    public static int dfs(int x,int y){
        //1什么时候退出
        //xy可以到达的点集合
        List<Node> list=new ArrayList<>();
        Node start = new Node(x,y,0);
        map[x][y]=start.step;
        visit[x][y]=true;
        int min;
        for (int j = 0; j < list.size(); j++) {
            Node node = list.get(j);
            int dfs = dfs(node.x, node.y);
            for(int i=0;i<8;i++) {
                x=start.x+move[i][0];
                y=start.y+move[i][1];
                if(x>=0 && x<n && y>=0 && y<m &&!visit[x][y]) {
                    list.add(new Node(x,y,start.step+=1));
                }
            }
            //比较大小 或者记录步数
        }
        return 0;
    }

}
