package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aers implements aeru {
    public final aeru a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public aers(aeru aeruVar) {
        this.a = aeruVar;
    }

    private final void A(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.aeru
    public final afjf a() {
        return afjf.a;
    }

    @Override // defpackage.aeru
    public final void b(int i) {
        A(new aerp(this, i, 1));
    }

    @Override // defpackage.aeru
    public final void c(int i) {
        A(new aerp(this, i, 0));
    }

    @Override // defpackage.aesn
    public final void d() {
        aeru aeruVar = this.a;
        aeruVar.getClass();
        A(new aero(aeruVar, 1));
    }

    @Override // defpackage.aesn
    public final void e(FormatStreamModel formatStreamModel, long j, long j2, aesh[] aeshVarArr) {
        this.a.e(formatStreamModel, j, j2, aeshVarArr);
    }

    @Override // defpackage.aesn
    public final void f() {
        aeru aeruVar = this.a;
        aeruVar.getClass();
        A(new aero(aeruVar, 0));
    }

    @Override // defpackage.aesn
    public final void g(final afih afihVar) {
        A(new Runnable() { // from class: aeri
            @Override // java.lang.Runnable
            public final void run() {
                aers aersVar = aers.this;
                aersVar.a.g(afihVar);
            }
        });
    }

    @Override // defpackage.aesn
    public final void h(final aeqq aeqqVar) {
        A(new Runnable() { // from class: aerh
            @Override // java.lang.Runnable
            public final void run() {
                aers aersVar = aers.this;
                aersVar.a.h(aeqqVar);
            }
        });
    }

    @Override // defpackage.aesn
    public final void i(final String str, final afgj afgjVar) {
        A(new Runnable() { // from class: aerm
            @Override // java.lang.Runnable
            public final void run() {
                aers aersVar = aers.this;
                aersVar.a.i(str, afgjVar);
            }
        });
    }

    @Override // defpackage.aesn
    public final void j(final afqu afquVar) {
        A(new Runnable() { // from class: aerj
            @Override // java.lang.Runnable
            public final void run() {
                aers aersVar = aers.this;
                aersVar.a.j(afquVar);
            }
        });
    }

    @Override // defpackage.aesn
    public final void k(final long j, final long j2) {
        A(new Runnable() { // from class: aerr
            @Override // java.lang.Runnable
            public final void run() {
                aers aersVar = aers.this;
                aersVar.a.k(j, j2);
            }
        });
    }

    @Override // defpackage.aesn
    public final void l(final String str) {
        A(new Runnable() { // from class: aerl
            @Override // java.lang.Runnable
            public final void run() {
                aers aersVar = aers.this;
                aersVar.a.l(str);
            }
        });
    }

    @Override // defpackage.aesn
    public final void m() {
        aeru aeruVar = this.a;
        aeruVar.getClass();
        A(new aero(aeruVar, 2));
    }

    @Override // defpackage.aesn
    public final void n() {
        aeru aeruVar = this.a;
        aeruVar.getClass();
        A(new aero(aeruVar, 3));
    }

    @Override // defpackage.aesn
    public final void o(long j) {
        A(new aerq(this, j, 1));
    }

    @Override // defpackage.aesn
    public final void p(final float f) {
        A(new Runnable() { // from class: aerg
            @Override // java.lang.Runnable
            public final void run() {
                aers aersVar = aers.this;
                aersVar.a.p(f);
            }
        });
    }

    @Override // defpackage.aesn
    public final void q() {
        aeru aeruVar = this.a;
        aeruVar.getClass();
        A(new aero(aeruVar, 4));
    }

    @Override // defpackage.aesn
    public final void r() {
        aeru aeruVar = this.a;
        aeruVar.getClass();
        A(new aero(aeruVar, 5));
    }

    @Override // defpackage.aesn
    public final void s(long j) {
        A(new aerq(this, j, 0));
    }

    @Override // defpackage.aesn
    public final void t(long j) {
        A(new aerq(this, j, 2));
    }

    @Override // defpackage.aesn
    public final void u(long j) {
        A(new aerq(this, j, 3));
    }

    @Override // defpackage.aesn
    public final void v() {
        aeru aeruVar = this.a;
        aeruVar.getClass();
        A(new aero(aeruVar, 6));
    }

    @Override // defpackage.aesn
    public final void w(final String str, final String str2) {
        A(new Runnable() { // from class: aern
            @Override // java.lang.Runnable
            public final void run() {
                aers aersVar = aers.this;
                aersVar.a.w(str, str2);
            }
        });
    }

    @Override // defpackage.aesn
    public final void x(int i) {
        A(new aerp(this, i, 2));
    }

    @Override // defpackage.aesn
    public final void y(long j) {
        A(new aerq(this, j, 4));
    }

    @Override // defpackage.aesn
    public final void z(final avzr avzrVar) {
        A(new Runnable() { // from class: aerk
            @Override // java.lang.Runnable
            public final void run() {
                aers aersVar = aers.this;
                aersVar.a.z(avzrVar);
            }
        });
    }
}
