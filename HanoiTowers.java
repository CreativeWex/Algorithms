/*
    =====================================
    @project Algorithms
    @created 01/02/2023    
    @author Bereznev Nikita @CreativeWex
    =====================================
 */

/*

Есть три высоких вертикальных столбика (здесь и далее — башни). Мы будем их обозначать A, B и C.
Диски с отверстиями в центре нанизаны на башню А. Самый широкий диск — будем называть его диском 1 — находится внизу.
Остальные диски, расположенные над ним, обозначены возрастающими цифрами и постепенно уменьшаются кверху.
Например, если бы у нас было три диска, то самый широкий из них, тот, что снизу, имел бы номер 1.
Следующий по ширине диск, под номером 2, располагался бы над диском 1.
Наконец, самый узкий диск, под номером 3, лежал бы на диске 2.

Наша цель — переместить все диски с башни А на башню С, учитывая следующие ограничения.
Диски можно перемещать только по одному.
Единственный доступный для перемещения диск — тот, что расположен наверху любой башни.
Более широкий диск никогда не может располагаться поверх более узкого.

 */

import java.util.Stack;

public class HanoiTowers {
    public final Stack<Integer> towerA = new Stack<>();
    public final Stack<Integer> towerB = new Stack<>();
    public final Stack<Integer> towerC = new Stack<>();
    private final int discsNumber;

    public HanoiTowers(int discs) {
        discsNumber = discs;
        for (int i = 1; i <= discs; i++) {
            towerA.push(i);
        }
    }

    private void move(Stack<Integer> begin, Stack<Integer> end, Stack<Integer> temp, int n) {
        if (n == 1) {
            end.push(begin.pop());
        } else {
            move(begin, temp, end, n - 1);
            move(begin, end, temp, 1);
            move(temp, end, begin, n - 1);
        }
    }

    public void solve() {
        move(towerA, towerB, towerC, discsNumber);
    }

}
