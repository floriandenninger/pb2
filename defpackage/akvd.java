package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akvd {
    public String a;
    public Uri b;
    public Uri c;
    public akzw d;
    public avtn e;
    public arvt f;
    public String g;
    public Bitmap h;
    public awaf i;
    public akzt j;
    public akzl k;
    public amru l;
    public int m;
    private Boolean n;
    private Boolean o;
    private Boolean p;

    public akvd() {
    }

    public akvd(akve akveVar) {
        this.a = akveVar.a;
        this.b = akveVar.b;
        this.c = akveVar.c;
        this.m = akveVar.p;
        this.d = akveVar.d;
        this.e = akveVar.e;
        this.f = akveVar.f;
        this.g = akveVar.g;
        this.h = akveVar.h;
        this.i = akveVar.i;
        this.j = akveVar.j;
        this.k = akveVar.k;
        this.l = akveVar.l;
        this.n = Boolean.valueOf(akveVar.m);
        this.o = Boolean.valueOf(akveVar.n);
        this.p = Boolean.valueOf(akveVar.o);
    }

    public final akve a() {
        Boolean bool = this.n;
        if (bool == null || this.o == null || this.p == null) {
            StringBuilder sb = new StringBuilder();
            if (this.n == null) {
                sb.append(" confirmed");
            }
            if (this.o == null) {
                sb.append(" creationFailed");
            }
            if (this.p == null) {
                sb.append(" unconfirmedFlowFailed");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new akve(this.a, this.b, this.c, this.m, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, bool.booleanValue(), this.o.booleanValue(), this.p.booleanValue());
    }

    public final void b(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.p = Boolean.valueOf(z);
    }
}
