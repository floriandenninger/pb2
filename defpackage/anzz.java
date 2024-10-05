package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum anzz implements anvt {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int f;

    anzz(int i) {
        this.f = i;
    }

    @Override // defpackage.anvt
    public final int a() {
        return this.f;
    }
}
