package ExercitiulExtra;

public enum PriceRange {
    RANGE1(0, 999), RANGE2(1000, 2999), RANGE3(3000, 9999), RANGE4(10000,null);

    private int start;
    private Integer end;

    PriceRange(int start, Integer end) {
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
