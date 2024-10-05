package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahce extends actb {
    private final String b;

    public ahce(String str, int i, boolean z) {
        super("prebuffer", i, z);
        this.b = str;
    }

    @Override // defpackage.actb
    public final edb b() {
        g("mod_trans", this.b);
        return super.b();
    }
}
