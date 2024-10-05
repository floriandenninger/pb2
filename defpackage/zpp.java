package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpp extends aogi {
    public final zpe a;
    final /* synthetic */ zpw b;
    private final arz h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zpp(defpackage.zpw r2, int r3, int r4) {
        /*
            r1 = this;
            arz r0 = defpackage.arz.b()
            r1.b = r2
            int r2 = r0.a
            r1.<init>(r2, r3, r4)
            r1.h = r0
            r0.c(r3, r4)
            zpe r2 = defpackage.zpe.k(r0)
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpp.<init>(zpw, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        try {
            c();
            zpw.j(this.h);
            zpw.i(this.a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String valueOf = String.valueOf(e.getMessage());
            zga.b(valueOf.length() != 0 ? "Thread was unexpectedly interrupted: ".concat(valueOf) : new String("Thread was unexpectedly interrupted: "));
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.aogi, com.google.mediapipe.framework.TextureFrame
    public final void release() {
        super.release();
        zpw zpwVar = this.b;
        int i = zpw.L;
        if (zpwVar.j) {
            this.b.j = false;
            this.b.k();
        }
    }
}
