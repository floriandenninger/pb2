package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class awz implements awe {
    final /* synthetic */ axa a;

    public awz(axa axaVar) {
        this.a = axaVar;
    }

    @Override // defpackage.awe
    public final void a(Exception exc) {
        prh.j("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.a.a.b(exc);
    }

    @Override // defpackage.awe
    public final void b() {
        pmh pmhVar = this.a.c;
        if (pmhVar != null) {
            pmhVar.a.a.g(2);
        }
    }

    @Override // defpackage.awe
    public final void c(long j) {
        pmh pmhVar = this.a.c;
        if (pmhVar == null || j < 2000) {
            return;
        }
        pmhVar.a.d = true;
    }

    @Override // defpackage.awe
    public final void d(long j) {
        this.a.a.h(j);
    }

    @Override // defpackage.awe
    public final void e() {
        this.a.b = true;
    }

    @Override // defpackage.awe
    public final void f(boolean z) {
        this.a.a.i(z);
    }

    @Override // defpackage.awe
    public final void g(int i, long j, long j2) {
        this.a.a.j(i, j, j2);
    }
}
