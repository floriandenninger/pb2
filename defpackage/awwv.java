package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awwv implements aonq {
    ACTION_TYPE_UNKNOWN(0),
    ACTION_TYPE_RETRY(1),
    ACTION_TYPE_GIVE_UP(2),
    ACTION_TYPE_PASS_THROUGH_ERROR(3);

    private final int f;

    awwv(int i) {
        this.f = i;
    }

    public static aons a() {
        return awwu.a;
    }

    public static awwv b(int i) {
        if (i == 0) {
            return ACTION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return ACTION_TYPE_RETRY;
        }
        if (i == 2) {
            return ACTION_TYPE_GIVE_UP;
        }
        if (i != 3) {
            return null;
        }
        return ACTION_TYPE_PASS_THROUGH_ERROR;
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
