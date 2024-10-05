package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iyw implements aapu {
    private final azrw a;
    private final Executor b;

    public iyw(azrw azrwVar, Executor executor) {
        this.a = azrwVar;
        this.b = executor;
    }

    public static /* synthetic */ void b(Throwable th) {
        zga.d("There was an error prefetching the BrowseResponse", th);
    }

    @Override // defpackage.aapu
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        auox auoxVar = (auox) obj;
        atmt atmtVar = auoxVar.c;
        if (atmtVar == null) {
            atmtVar = atmt.a;
        }
        if (atmtVar.g) {
            aaue aaueVar = (aaue) this.a.get();
            atmt atmtVar2 = auoxVar.c;
            if (atmtVar2 == null) {
                atmtVar2 = atmt.a;
            }
            aauc a = aaueVar.a(ahbj.o(atmtVar2));
            a.j = true;
            ynm.j(((aaue) this.a.get()).h(a, this.b), angq.a, gwr.k);
        }
    }
}
