package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aosx implements aonq {
    UNKNOWN_CODEC(0),
    AAC(1),
    VORBIS(2),
    OPUS(3),
    DTSHD(4),
    EAC3(5),
    PCM(6),
    AC3(7),
    SPEEX(8),
    MP3(9),
    MP2(10),
    AMR(11);

    public final int m;

    aosx(int i) {
        this.m = i;
    }

    public static aons a() {
        return aokr.p;
    }

    public static aosx b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CODEC;
            case 1:
                return AAC;
            case 2:
                return VORBIS;
            case 3:
                return OPUS;
            case 4:
                return DTSHD;
            case 5:
                return EAC3;
            case 6:
                return PCM;
            case 7:
                return AC3;
            case 8:
                return SPEEX;
            case 9:
                return MP3;
            case 10:
                return MP2;
            case 11:
                return AMR;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
