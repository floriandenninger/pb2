package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awfk implements aonq {
    YOU_THERE_TRIGGER_REASON_UNKNOWN(0),
    YOU_THERE_TRIGGER_REASON_1(1),
    YOU_THERE_TRIGGER_REASON_2(2),
    YOU_THERE_TRIGGER_REASON_3(3),
    YOU_THERE_TRIGGER_REASON_4(4);

    public final int f;

    awfk(int i) {
        this.f = i;
    }

    public static aons a() {
        return aweb.f;
    }

    public static awfk b(int i) {
        if (i == 0) {
            return YOU_THERE_TRIGGER_REASON_UNKNOWN;
        }
        if (i == 1) {
            return YOU_THERE_TRIGGER_REASON_1;
        }
        if (i == 2) {
            return YOU_THERE_TRIGGER_REASON_2;
        }
        if (i == 3) {
            return YOU_THERE_TRIGGER_REASON_3;
        }
        if (i != 4) {
            return null;
        }
        return YOU_THERE_TRIGGER_REASON_4;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
