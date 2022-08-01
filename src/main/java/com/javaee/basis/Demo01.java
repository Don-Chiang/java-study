package com.javaee.basis;

import java.util.*;

public class Demo01 {
    static int[][] map; //记录到达每个位置的坐标
    static boolean[][] visit; //记录走过的位置坐标
    static int[][] move = {{1,2},{2,1},{-1,-2},{-2,-1},{1,-2},{-2,1},{-1,2},{2,-1}};//枚举从起点可能到达的坐标
    static int n,m; //棋盘边界

    public static void main(String[] args) {
        //输入棋盘边界,起点和终点
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        //初始化棋盘
        map = new int[n][m];
        visit = new boolean[n][m];
        //初始化棋盘每个位置的下标为-1
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                map[i][j]=-1;
            }
        }
        //原点坐标为(0,0)
        BFS(x-1,y-1);
        //输出到达终点的步骤
        System.out.println(map[a][b]);
    }

    public static void BFS(int x,int y) {
        Queue<Node> queue = new LinkedList<Node>();
        Node start = new Node(x,y,0);
        queue.offer(start);
        map[x][y]=start.step;
        visit[x][y]=true;
        //将可走的点放入队列中，直到队列为空之前，若走到则输出最短路径所走的步数
        while(!queue.isEmpty()) {
            Node next = queue.poll();
            for(int i=0;i<8;i++) {
                x=next.x+move[i][0];
                y=next.y+move[i][1];
                if(x>=0 && x<n && y>=0 && y<m && !visit[x][y]) {
                    queue.offer(new Node(x,y,next.step+1));
                    //记录到达每个坐标的最短路径的步数
                    map[x][y]=next.step+1;
                    visit[x][y]=true;
                }
            }
        }
    }

    //dfs深度优先遍历 bfs广度优先遍历
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
