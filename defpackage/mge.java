package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mge {
    public final augf a;
    public aoxy b = null;
    public augy c = null;
    public auge d = null;
    public augv[] e = null;
    private byte[] f = null;

    public mge(augf augfVar) {
        this.a = augfVar;
    }

    public final auge a() {
        if (this.d == null) {
            auge augeVar = this.a.d;
            if (augeVar == null) {
                augeVar = auge.a;
            }
            this.d = augeVar;
        }
        return this.d;
    }

    public final byte[] b() {
        if (this.f == null) {
            this.f = this.a.g.I();
        }
        return this.f;
    }
}
