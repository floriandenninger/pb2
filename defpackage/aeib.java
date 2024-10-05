package defpackage;

import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeib {
    public Uri a;
    public long b;
    public long c;
    public long d;
    public final pow e;
    public final aaoz f;
    final /* synthetic */ aeie g;
    private Uri h;
    private String i;
    private long j;
    private boolean k;

    public aeib(aeie aeieVar, Uri uri, aaoz aaozVar) {
        this.g = aeieVar;
        afki.a(uri);
        this.a = uri;
        this.e = (pow) aeieVar.b.get();
        this.i = null;
        this.j = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = aeieVar.d.d();
        this.k = false;
        this.f = aaozVar;
    }

    public final synchronized Uri a() {
        return this.h;
    }

    public final synchronized String b() {
        if (this.i == null) {
            return null;
        }
        long d = this.g.d.d();
        long j = this.j;
        aeie aeieVar = this.g;
        if (d - j > aeieVar.c + aeieVar.i) {
            return null;
        }
        return this.i;
    }

    public final synchronized void d() {
        this.c = 0L;
        this.d = this.g.d.d() + this.g.c;
        this.k = false;
    }

    public final void e() {
        this.a = aeie.a(this.a);
        this.b = this.g.d.d();
    }

    public final synchronized void f(Uri uri) {
        this.h = uri;
        this.i = uri != null ? uri.getAuthority() : null;
        this.j = this.g.d.d();
        if (uri != null) {
            this.g.e(uri);
        }
    }

    public final synchronized void c() {
        long max;
        if (this.k) {
            long j = this.c;
            max = Math.max(1000L, j + j);
        } else {
            max = 0;
        }
        this.c = max;
        long min = Math.min(max, this.g.c);
        this.c = min;
        this.c = Math.min(86400000L, min);
        this.d = this.g.d.d() + this.c;
        this.k = true;
    }
}
