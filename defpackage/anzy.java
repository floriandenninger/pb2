package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum anzy implements anvt {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int f;

    anzy(int i) {
        this.f = i;
    }

    @Override // defpackage.anvt
    public final int a() {
        return this.f;
    }
}
