package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum anzx implements anvt {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int e;

    anzx(int i) {
        this.e = i;
    }

    @Override // defpackage.anvt
    public int a() {
        return this.e;
    }
}
