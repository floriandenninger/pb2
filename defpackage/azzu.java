package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azzu {
    private final azvm a = azth.o(new azzw(8, false));

    public final int a() {
        long j = ((azzw) this.a.a).b.b;
        return 1073741823 & (((int) ((1152921503533105152L & j) >> 30)) - ((int) (j & 1073741823)));
    }

    public final Object b() {
        azvm azvmVar = this.a;
        while (true) {
            azzw azzwVar = (azzw) azvmVar.a;
            Object b = azzwVar.b();
            if (b != azzw.a) {
                return b;
            }
            this.a.c(azzwVar, azzwVar.c());
        }
    }

    public final void c() {
        azvm azvmVar = this.a;
        while (true) {
            azzw azzwVar = (azzw) azvmVar.a;
            if (azzwVar.d()) {
                return;
            } else {
                this.a.c(azzwVar, azzwVar.c());
            }
        }
    }

    public final boolean d(Object obj) {
        azvm azvmVar = this.a;
        while (true) {
            azzw azzwVar = (azzw) azvmVar.a;
            int a = azzwVar.a(obj);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return false;
            }
            this.a.c(azzwVar, azzwVar.c());
        }
    }
}
