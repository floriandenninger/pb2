package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afah {
    public final axl a;
    public final FormatStreamModel b;
    public final axg c;
    public final long d;
    final bdm e;

    public afah(long j, axl axlVar, FormatStreamModel formatStreamModel, bdm bdmVar, axg axgVar) {
        this.d = j;
        this.a = axlVar;
        this.b = formatStreamModel;
        this.e = bdmVar;
        this.c = axgVar;
    }

    public final long a() {
        return this.c.e();
    }

    public final long b(long j) {
        return d(j) + this.c.a(j, this.d);
    }

    public final long c(long j) {
        return this.c.f(j);
    }

    public final long d(long j) {
        return this.c.b(j);
    }

    public final axk e(long j) {
        return this.c.c(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long f() {
        long a = a();
        h();
        return a - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        a();
        h();
    }

    public final void h() {
        this.c.d();
    }
}
