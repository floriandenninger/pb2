package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uui {
    static final uuj a = new uug(bacs.a, true);
    private final Random b;
    private final shf c;
    private final utx d;

    public uui(Random random, utx utxVar, shf shfVar) {
        this.b = random;
        this.c = shfVar;
        this.d = utxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final uuj a(bacs bacsVar) {
        int d = badf.d(bacsVar.d);
        if (d == 0) {
            d = 1;
        }
        int i = d - 1;
        if (i == 1) {
            return new uug(bacsVar, bacsVar.c == 1000);
        }
        if (i == 3) {
            return new uug(bacsVar, this.b.nextDouble() * 1000.0d < ((double) bacsVar.c));
        }
        if (i == 4) {
            return new uuh(bacsVar, this.b, this.d, this.c);
        }
        if (i == 5) {
            bacsVar = bacs.a;
        }
        return new uug(bacsVar, true);
    }
}
