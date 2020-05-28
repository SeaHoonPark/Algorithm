import java.util.*;

public class BFS1697 {

	public static int n, k;
	public static int visit[] = new int[100001];

	public static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		visit[n] = 1;

		while (!q.isEmpty()) {
			n = q.poll();

			if (n == k)
				break;

			if (n + 1 <= 100000 && visit[n + 1] == 0) {
				q.add(n + 1);
				visit[n + 1] = visit[n] + 1;
			}

			if (n - 1 >= 0 && visit[n - 1] == 0) {
				q.add(n - 1);
				visit[n - 1] = visit[n] + 1;
			}

			if (n * 2 <= 100000 && visit[n * 2] == 0) {
				q.add(n * 2);
				visit[n * 2] = visit[n] + 1;
			}
		}
		System.out.println(visit[k] - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();

		bfs();
	}
}
