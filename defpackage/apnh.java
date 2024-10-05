package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum apnh {
    SCREEN_EXIT,
    EVENT_NOT_SET;

    public static apnh a(int i) {
        if (i == 0) {
            return EVENT_NOT_SET;
        }
        if (i != 1) {
            return null;
        }
        return SCREEN_EXIT;
    }
}
