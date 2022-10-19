package ExercitiulExtra;


public enum KmRange {
    RANGE1(0, 2999), RANGE2(3000, 4999), RANGE3(5000, 10000), RANGE4(10001,null);

    private int start;
    private Integer end;

    KmRange(int start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }
}

