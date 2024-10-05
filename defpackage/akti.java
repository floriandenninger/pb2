package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akti implements aktk {
    private final azrw a;
    private boolean b = false;

    public akti(azrw azrwVar) {
        this.a = azrwVar;
    }

    private final arpp e(avdg avdgVar) {
        amkq.N(this.b);
        aone createBuilder = avdf.a.createBuilder();
        createBuilder.copyOnWrite();
        avdf avdfVar = (avdf) createBuilder.instance;
        avdgVar.getClass();
        avdfVar.c = avdgVar;
        avdfVar.b |= 1;
        avdf avdfVar2 = (avdf) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).dK(avdfVar2);
        return (arpp) a.build();
    }

    @Override // defpackage.aktk
    public final void a(avdy avdyVar) {
        if (avdyVar == null || (avdyVar.b & 64) == 0) {
            return;
        }
        avdr avdrVar = avdyVar.f;
        if (avdrVar == null) {
            avdrVar = avdr.a;
        }
        this.b = avdrVar.b;
    }

    @Override // defpackage.aktk
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.aktk
    public final void c(avdg avdgVar) {
        ((acpl) this.a.get()).c(e(avdgVar));
    }

    @Override // defpackage.aktk
    public final void d(avdg avdgVar) {
        try {
            ((acpl) this.a.get()).e(e(avdgVar));
        } catch (Exception unused) {
            zga.b("UncaughtException error occurred in critical transmission path.");
        }
    }
}
