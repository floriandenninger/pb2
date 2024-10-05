package defpackage;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afwd implements afvz {
    private final awxc a;
    private final anic b;
    private final afvx c;
    private final AtomicInteger d;
    private final shf e;

    public afwd(anic anicVar, ajoy ajoyVar, shf shfVar, awxc awxcVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = awxcVar;
        this.b = anicVar;
        aqvp aqvpVar = afvx.a;
        axpg axpgVar = ((axqv) ajoyVar.a).get();
        axpgVar.getClass();
        aqvpVar.getClass();
        this.c = new afvx(axpgVar, aqvpVar);
        this.d = new AtomicInteger(0);
        this.e = shfVar;
    }

    @Override // defpackage.afvz
    public final anhy a(awyx awyxVar) {
        return anaf.O(awwv.ACTION_TYPE_GIVE_UP);
    }

    @Override // defpackage.afvz
    public final anhy b(int i) {
        if (!this.a.c) {
            return anaf.O(awwv.ACTION_TYPE_GIVE_UP);
        }
        afvx afvxVar = this.c;
        int andIncrement = this.d.getAndIncrement();
        aqvp aqvpVar = afvxVar.b;
        double d = aqvpVar.e;
        double d2 = aqvpVar.c;
        double pow = Math.pow(aqvpVar.d, Math.max(0, andIncrement - 1));
        Double.isNaN(d2);
        double min = Math.min(d, d2 * pow);
        float nextFloat = afvxVar.b.f * (((SecureRandom) afvxVar.c.get()).nextFloat() - 0.5f);
        double d3 = nextFloat + nextFloat;
        Double.isNaN(d3);
        long round = Math.round(d3 * min);
        int i2 = afvxVar.b.e;
        double d4 = round;
        Double.isNaN(d4);
        long min2 = Math.min(i2, (int) (min + d4));
        aoqa aoqaVar = this.a.d;
        if (aoqaVar == null) {
            aoqaVar = aoqa.a;
        }
        if (this.e.c() + min2 > aora.b(aoqaVar)) {
            return anaf.O(awwv.ACTION_TYPE_GIVE_UP);
        }
        return this.b.schedule(aein.d, min2, TimeUnit.MILLISECONDS);
    }
}
