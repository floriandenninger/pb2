package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atrx implements aonq {
    UNKNOWN_FORMAT_TYPE(0),
    LD(4),
    SD(1),
    HD(2),
    AUDIO_ONLY(3),
    LD_240(5),
    SD_480(6),
    HD_1080(7),
    HD_1440(8),
    HD_2160(9);

    public final int k;

    atrx(int i) {
        this.k = i;
    }

    public static aons a() {
        return atqp.j;
    }

    public static atrx b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT_TYPE;
            case 1:
                return SD;
            case 2:
                return HD;
            case 3:
                return AUDIO_ONLY;
            case 4:
                return LD;
            case 5:
                return LD_240;
            case 6:
                return SD_480;
            case 7:
                return HD_1080;
            case 8:
                return HD_1440;
            case 9:
                return HD_2160;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
