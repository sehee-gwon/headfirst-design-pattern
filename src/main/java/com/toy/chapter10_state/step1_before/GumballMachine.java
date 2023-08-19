package com.toy.chapter10_state.step1_before;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    // 동전 투입
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어 주세요.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        } else if (state == SOLD) {
            System.out.println("알맹이를 내보내고 있습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해 주세요.");
        }
    }

    // 동전 반환
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어 주세요.");
        } else if (state == SOLD) {
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        }
    }

    // 손잡이 돌림
    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어 주세요.");
        } else if (state == SOLD) {
            System.out.println("손잡이는 한 번만 돌려 주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        }
    }

    // 알맹이 내보내기
    public void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("알맹이를 내보낼 수 없습니다.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어 주세요.");
        } else if (state == SOLD) {
            System.out.println("알맹이를 내보내고 있습니다.");
            count -= 1;
            if (count == 0) {
                System.out.println("매진되었습니다.");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == SOLD_OUT) {
            System.out.println("매진입니다.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n주식회사 왕뽑기\n");
        sb.append("자바로 돌아가는 최신형 뽑기 기계\n");
        sb.append("남은 개수: ").append(count).append("개\n");

        if (state == HAS_QUARTER) {
            sb.append("동전 있음");
        } else if (state == NO_QUARTER) {
            sb.append("동전 투입 대기중");
        } else if (state == SOLD) {
            sb.append("알맹이 내보내는중");
        } else if (state == SOLD_OUT) {
            sb.append("매진");
        }

        return sb.append("\n").toString();

    }
}
