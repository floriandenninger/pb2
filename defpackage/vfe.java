package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vfe {
    public Boolean a;
    private Uri b;
    private aooy c;
    private vep d;
    private amrp e;
    private amru f;
    private vgn g;
    private Boolean h;
    private Boolean i;

    public final vff a() {
        aooy aooyVar;
        vep vepVar;
        vgn vgnVar;
        Boolean bool;
        amrp amrpVar = this.e;
        if (amrpVar != null) {
            this.f = amrpVar.g();
        } else if (this.f == null) {
            this.f = amru.q();
        }
        Uri uri = this.b;
        if (uri == null || (aooyVar = this.c) == null || (vepVar = this.d) == null || (vgnVar = this.g) == null || (bool = this.h) == null || this.a == null || this.i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" uri");
            }
            if (this.c == null) {
                sb.append(" schema");
            }
            if (this.d == null) {
                sb.append(" handler");
            }
            if (this.g == null) {
                sb.append(" variantConfig");
            }
            if (this.h == null) {
                sb.append(" useGeneratedExtensionRegistry");
            }
            if (this.a == null) {
                sb.append(" updateSequencingBugFix");
            }
            if (this.i == null) {
                sb.append(" enableTracing");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new vff(uri, aooyVar, vepVar, this.f, vgnVar, bool.booleanValue(), this.a.booleanValue(), this.i.booleanValue());
    }

    public final void b(vez vezVar) {
        if (this.e == null) {
            if (this.f == null) {
                this.e = amru.f();
            } else {
                amrp f = amru.f();
                this.e = f;
                f.j(this.f);
                this.f = null;
            }
        }
        this.e.h(vezVar);
    }

    public final void c() {
        this.i = false;
    }

    public final void d(vep vepVar) {
        if (vepVar == null) {
            throw new NullPointerException("Null handler");
        }
        this.d = vepVar;
    }

    public final void e(aooy aooyVar) {
        if (aooyVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.c = aooyVar;
    }

    public final void f(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.b = uri;
    }

    public final void g(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void h(vgn vgnVar) {
        if (vgnVar == null) {
            throw new NullPointerException("Null variantConfig");
        }
        this.g = vgnVar;
    }
}
