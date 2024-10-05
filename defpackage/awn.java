package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awn implements awe {
    final /* synthetic */ awo a;

    public awn(awo awoVar) {
        this.a = awoVar;
    }

    @Override // defpackage.awe
    public final void a(Exception exc) {
        prh.j("DecoderAudioRenderer", "Audio sink error", exc);
        this.a.a.b(exc);
    }

    @Override // defpackage.awe
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.awe
    public final /* synthetic */ void c(long j) {
    }

    @Override // defpackage.awe
    public final void d(long j) {
        this.a.a.h(j);
    }

    @Override // defpackage.awe
    public final void e() {
        this.a.c = true;
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
