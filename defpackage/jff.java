package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jff extends ahxg implements ypd {
    private final adlt a;

    public jff(adlt adltVar, ainy ainyVar, ainl ainlVar, ahxe ahxeVar) {
        super(ainyVar, ainlVar, ahxeVar);
        this.a = adltVar;
    }

    @Override // defpackage.ahxg, defpackage.ahxd
    public final void a() {
        adlm g = this.a.g();
        if (g != null) {
            g.H();
        } else {
            super.a();
        }
    }

    @Override // defpackage.ahxg, defpackage.ahxd
    public final void b() {
        adlm g = this.a.g();
        if (g != null) {
            g.N();
        } else {
            super.b();
        }
    }

    @Override // defpackage.ahxg, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != jff.class) {
            return ahbl.c(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{ahdu.class};
        }
        if (i == 0) {
            g();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
