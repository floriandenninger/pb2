package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ejm extends fks implements ajmt, ypd {
    public final afsy a;
    public final aahd b;
    public final flh c;
    public final azrw d;
    public final fgq e;
    public boolean f;
    private final ypa g;
    private final ajmu h;

    public ejm(fln flnVar, ypa ypaVar, afsy afsyVar, aahd aahdVar, ajmu ajmuVar, flh flhVar, azrw azrwVar, fgq fgqVar) {
        super(flnVar);
        this.g = ypaVar;
        this.a = afsyVar;
        this.b = aahdVar;
        this.h = ajmuVar;
        this.c = flhVar;
        this.d = azrwVar;
        this.e = fgqVar;
        this.f = afsyVar.t();
    }

    @Override // defpackage.ajmt
    public final void kB(Uri uri, Uri uri2) {
        ipl iplVar;
        if (amkq.b(uri, ipl.a) && (iplVar = (ipl) this.h.b(uri2)) != null && iplVar.g && iplVar.f) {
            this.c.a();
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        this.g.m(this);
        this.h.e(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.g.g(this);
        this.h.h(ipl.a, this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ghg.class, wap.class, wjc.class};
        }
        if (i == 0) {
            if (!((ghg) obj).c()) {
                return null;
            }
            this.c.a();
            return null;
        }
        if (i == 1) {
            if (((wap) obj).a()) {
                return null;
            }
            this.c.l();
            return null;
        }
        if (i == 2) {
            wjc wjcVar = (wjc) obj;
            if (wjcVar.a() != wjb.FINISHED || !wjcVar.c()) {
                return null;
            }
            apxf b = wjcVar.b();
            if (b == null || !fkc.g(b)) {
                boolean t = this.a.t();
                if (this.f || !t || !this.e.g().b()) {
                    ((nnb) this.d.get()).f();
                } else {
                    this.c.b();
                }
                this.f = t;
                return null;
            }
            ((nnb) this.d.get()).f();
            this.b.c(b, null);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
