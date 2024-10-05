package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fut implements anfz {
    public final /* synthetic */ fuu a;
    private final /* synthetic */ int b;

    public /* synthetic */ fut(fuu fuuVar, int i) {
        this.b = i;
        this.a = fuuVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                return this.a.a((abci) obj);
            }
            return this.a.d.a.b(new fjv(System.currentTimeMillis(), 4), angq.a);
        }
        fuu fuuVar = this.a;
        if (TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - ((Long) obj).longValue()) >= 24) {
            abcp abcpVar = fuuVar.c;
            return anfq.i(anht.q(anfq.i(abcpVar.d(abcpVar.a("")), new fut(fuuVar, i2), angq.a)), new fut(fuuVar, 2), angq.a);
        }
        return anaf.M();
    }
}
