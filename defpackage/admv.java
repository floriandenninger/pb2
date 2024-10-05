package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class admv implements Runnable {
    public final /* synthetic */ adnd a;
    private final /* synthetic */ int b;

    public /* synthetic */ admv(adnd adndVar, int i) {
        this.b = i;
        this.a = adndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            adnd adndVar = this.a;
            adndVar.q.f();
            adndVar.aF();
        } else {
            if (i == 1) {
                adnd adndVar2 = this.a;
                try {
                    adrp adrpVar = adndVar2.q;
                    if (adrpVar != null) {
                        adrpVar.e(adndVar2.o);
                        return;
                    }
                    return;
                } catch (IOException e) {
                    zga.f(adnd.a, "Unable to start web socket server: ", e);
                    afsi.b(2, 21, "failed to start web socket server for local transport");
                    return;
                }
            }
            this.a.j.d();
        }
    }
}
