package baseball;

public class View {

    public void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printInput() {
        System.out.print("숫자를 입력해주세요: ");
    }

    public void printNotting() {
        System.out.println("낫싱");
    }

    public void printBall(int ball) {
        System.out.print(ball + "볼 ");
    }

    public void printBlank() {
        System.out.println();
    }

    public void printStrike(int strike) {
        System.out.println(strike + "스트라이크");
    }

    public void printCorrect() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printEnd() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}