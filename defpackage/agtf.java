package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agtf {
    public agnm a;
    public int b = -1;
    public int c = 1;
    private final ArrayList d = new ArrayList();

    public final agtg a() {
        int i;
        int i2;
        agnm agnmVar = this.a;
        if (agnmVar == null || (i = this.b) < 0 || (i2 = this.c) == 1) {
            throw new IllegalArgumentException("OfflineStreamVerificationResult.Builder not properly initialized");
        }
        ArrayList arrayList = this.d;
        return new agtg(agnmVar, i, i2, (atoq[]) arrayList.toArray(new atoq[arrayList.size()]));
    }

    public final void b(long j) {
        aone createBuilder = atoq.a.createBuilder();
        int a = this.a.a();
        createBuilder.copyOnWrite();
        atoq atoqVar = (atoq) createBuilder.instance;
        atoqVar.b |= 1;
        atoqVar.c = a;
        createBuilder.copyOnWrite();
        atoq atoqVar2 = (atoq) createBuilder.instance;
        atoqVar2.b |= 2;
        atoqVar2.d = j;
        this.d.add((atoq) createBuilder.build());
    }
}
