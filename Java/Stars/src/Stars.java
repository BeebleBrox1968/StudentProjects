public class Stars {
    //**
    //**
    //**
    String starRectangle(int rows, int collumns) {
        String answer = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < collumns; j++) {
                answer += '*';
            }
            answer += '\n';
        }
        return answer;
    }

    //star square
    String starSquare(int base) {
        String answer = "";
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                answer += '*';
            }
            answer += '\n';
        }
        return answer;
    }


    //star hollowSquare
    String hollowStarSquare(int base) {
        String answer = "";
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == base - 1 || j == 0 || j == base - 1) {
                    answer += '*';
                } else {
                    answer += ' ';
                }
            }
            answer += '\n';
        }
        return answer;
    }

    //*
    //**
    //***
    //****
    //*****
    //star triangle
    String starTriangle(int base) {
        String answer = "";
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < i; j++) {
                answer += '*';
            }
            answer += '\n';
        }
        return answer;
    }

    //   *
    //  ***
    // *****
    //star pyramid
    String starPyramid(int rows) {
        String answer = "";
        for (int i = 0; i < rows; i++) {
            int numOfStars = 1 + 2 * i;
            int numOfSpaces = rows - i;
            for (int j = 0; j < numOfSpaces; j++) {
                answer += ' ';
            }
            for (int j = 0; j < numOfStars; j++) {
                answer += '*';
            }
            answer += '\n';
        }
        return answer;
    }

    //  *
    // ***
    //*****
    // ***
    //  *
    String starDiamond(int rows) {
        String answer = "";
        int maxRow = rows / 2 + 1;
        for (int i = 0; i < rows; i++) {

            int numOfStars = 0;
            if (i < maxRow) {
                numOfStars = 1 + 2 * i;
            } else {
                numOfStars = (maxRow + 1) * 2 + 1 - (2 * i);
            }
            int numOfSpaces = (rows - numOfStars) / 2;
            for (int j = 0; j < numOfSpaces; j++) {
                answer += ' ';
            }
            for (int j = 0; j < numOfStars; j++) {
                answer += '*';
            }
            answer += '\n';
        }
        return answer;
    }

    //*****
    // ***
    //  *
    // ***
    //*****
    String starBlackWidow(int rows) {
        String answer = "";
        int maxRow = rows / 2;
        for (int i = 0; i < rows; i++) {

            int numOfStars = 0;
            if (i > maxRow) {
                numOfStars = 1 + 2 * i;
            } else {
                numOfStars = (maxRow) * 2 + 1 - (2 * i);
            }
            int numOfSpaces = (maxRow * 2 + 1 - numOfStars) / 2;
            for (int j = 0; j < numOfSpaces; j++) {
                answer += ' ';
            }
            for (int j = 0; j < numOfStars; j++) {
                answer += '*';
            }
            answer += '\n';
        }
        return answer;
    }
}
