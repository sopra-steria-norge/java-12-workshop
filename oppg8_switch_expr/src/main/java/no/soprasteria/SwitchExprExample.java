package no.soprasteria;

class SwitchExprExample {
    enum Bokstav {A, B, C, D, E}

    int finnTall(Bokstav bokstav) {
        int number;
        switch (bokstav) {
            case A:
            case B:
                number = 5;
                break;
            case C:
                number = 2;
                break;
            case D:
                number = 7;
                break;
            case E:
                number = 8;
                break;
            default:
                throw new IllegalArgumentException("Huh?: " + bokstav);
        }
        return number;
    }

}
