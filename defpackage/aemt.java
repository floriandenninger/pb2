package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aemt implements aeru {
    public afjf a;
    final /* synthetic */ aemv b;
    private final aems d;
    private final aesn e;
    private final afcv f;
    private final aemu g;

    public aemt(aemv aemvVar, aems aemsVar, aesn aesnVar, afcv afcvVar, aemu aemuVar, afjf afjfVar) {
        this.b = aemvVar;
        this.d = aemsVar;
        this.e = aesnVar;
        this.f = afcvVar;
        this.g = aemuVar;
        this.a = afjfVar;
    }

    @Override // defpackage.aeru
    public final afjf a() {
        return this.a;
    }

    @Override // defpackage.aeru
    public final void b(int i) {
        this.f.a(i);
    }

    @Override // defpackage.aeru
    public final void c(int i) {
        int i2;
        afcv afcvVar = this.f;
        if (!afcvVar.d.D() || i == (i2 = afcvVar.c)) {
            return;
        }
        if (i2 != -1) {
            afcvVar.a(i2);
        }
        afcvVar.b.putExtra("android.media.extra.AUDIO_SESSION", i);
        afcvVar.a.sendBroadcast(afcvVar.b);
        afcvVar.c = i;
    }

    @Override // defpackage.aesn
    public final void d() {
        this.d.b();
        try {
            this.e.d();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void e(FormatStreamModel formatStreamModel, long j, long j2, aesh[] aeshVarArr) {
        formatStreamModel.e();
        int length = aeshVarArr.length;
        this.e.e(formatStreamModel, j, j2, aeshVarArr);
    }

    @Override // defpackage.aesn
    public final void f() {
        afid.b(afic.MLPLAYER, "MedialibPlayerEvents[%s].%s", Integer.valueOf(aemv.e(this)), "onEnded()");
        this.d.b();
        try {
            this.e.f();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void g(afih afihVar) {
        afihVar.i();
        afihVar.k();
        int i = ammx.a;
        this.d.b();
        if (afihVar.n()) {
            this.b.g = false;
        }
        try {
            this.e.g(afihVar);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void h(aeqq aeqqVar) {
        this.d.b();
        try {
            this.e.h(aeqqVar);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void i(String str, afgj afgjVar) {
        afgjVar.a(0L);
        this.d.b();
        try {
            this.e.i(str, afgjVar);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void j(afqu afquVar) {
        this.g.a = afquVar;
        this.d.b();
        try {
            this.e.j(afquVar);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void k(long j, long j2) {
        this.d.b();
        try {
            this.e.k(j, j2);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void l(String str) {
        this.d.b();
        try {
            this.e.l(str);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void m() {
        this.d.b();
        try {
            this.e.m();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void n() {
        this.d.b();
        try {
            this.e.n();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void o(long j) {
        this.d.b();
        try {
            this.e.o(j);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void p(float f) {
        this.d.b();
        try {
            this.e.p(f);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void q() {
        this.d.b();
        try {
            this.e.q();
            this.a = afjf.a;
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void r() {
        this.d.b();
        try {
            this.e.r();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void s(long j) {
        this.d.b();
        try {
            this.e.s(j);
            this.a = afjf.a;
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void t(long j) {
        this.d.b();
        try {
            this.e.t(j);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void u(long j) {
        this.d.b();
        try {
            this.e.u(j);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void v() {
        this.d.b();
        try {
            this.e.v();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void w(String str, String str2) {
        this.d.b();
        try {
            this.e.w(str, str2);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void x(int i) {
        this.d.b();
        try {
            this.e.x(i);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void y(long j) {
        this.d.b();
        try {
            this.e.y(j);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aesn
    public final void z(avzr avzrVar) {
        int i = avzrVar.e;
        this.d.b();
        try {
            this.e.z(avzrVar);
        } finally {
            this.d.a();
        }
    }
}
