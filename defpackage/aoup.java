package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aoup implements aonq {
    ACCOUNT_SELECTOR_EVENT_RESULT_UNKNOWN(0),
    ACCOUNT_SELECTOR_EVENT_RESULT_SUCCESS(1),
    ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED(2);

    public final int d;

    aoup(int i) {
        this.d = i;
    }

    public static aons a() {
        return aouo.a;
    }

    public static aoup b(int i) {
        if (i == 0) {
            return ACCOUNT_SELECTOR_EVENT_RESULT_UNKNOWN;
        }
        if (i == 1) {
            return ACCOUNT_SELECTOR_EVENT_RESULT_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
