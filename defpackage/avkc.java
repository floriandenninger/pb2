package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avkc {
    TASK_REGISTERED,
    EVENT_NOT_SET;

    public static avkc a(int i) {
        if (i == 0) {
            return EVENT_NOT_SET;
        }
        if (i != 1) {
            return null;
        }
        return TASK_REGISTERED;
    }
}
