package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum baav implements aonq {
    UNKNOWN(0),
    FOREGROUND_TO_BACKGROUND(1),
    BACKGROUND_TO_FOREGROUND(2),
    FOREGROUND_SERVICE_START(3),
    FOREGROUND_SERVICE_STOP(4),
    CUSTOM_MEASURE_START(5),
    CUSTOM_MEASURE_STOP(6);

    public final int h;

    baav(int i2) {
        this.h = i2;
    }

    public static aons a() {
        return axcs.n;
    }

    public static baav b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return FOREGROUND_TO_BACKGROUND;
            case 2:
                return BACKGROUND_TO_FOREGROUND;
            case 3:
                return FOREGROUND_SERVICE_START;
            case 4:
                return FOREGROUND_SERVICE_STOP;
            case 5:
                return CUSTOM_MEASURE_START;
            case 6:
                return CUSTOM_MEASURE_STOP;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
