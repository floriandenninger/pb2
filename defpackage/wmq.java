package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import j$.util.Optional;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wmq implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private final /* synthetic */ int j;

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i) {
        this.j = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
    }

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i, byte[] bArr) {
        this.j = i;
        this.f = azrwVar;
        this.i = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
        this.h = azrwVar5;
        this.g = azrwVar6;
        this.e = azrwVar7;
        this.d = azrwVar8;
        this.a = azrwVar9;
    }

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i, char[] cArr) {
        this.j = i;
        this.e = azrwVar;
        this.a = azrwVar2;
        this.f = azrwVar3;
        this.h = azrwVar4;
        this.c = azrwVar5;
        this.i = azrwVar6;
        this.d = azrwVar7;
        this.b = azrwVar8;
        this.g = azrwVar9;
    }

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i, float[] fArr) {
        this.j = i;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.i = azrwVar3;
        this.a = azrwVar4;
        this.h = azrwVar5;
        this.g = azrwVar6;
        this.b = azrwVar7;
        this.e = azrwVar8;
        this.f = azrwVar9;
    }

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i, int[] iArr) {
        this.j = i;
        this.d = azrwVar;
        this.b = azrwVar2;
        this.f = azrwVar3;
        this.h = azrwVar4;
        this.e = azrwVar5;
        this.i = azrwVar6;
        this.a = azrwVar7;
        this.c = azrwVar8;
        this.g = azrwVar9;
    }

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i, short[] sArr) {
        this.j = i;
        this.i = azrwVar;
        this.c = azrwVar2;
        this.g = azrwVar3;
        this.f = azrwVar4;
        this.a = azrwVar5;
        this.d = azrwVar6;
        this.h = azrwVar7;
        this.b = azrwVar8;
        this.e = azrwVar9;
    }

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i, boolean[] zArr) {
        this.j = i;
        this.h = azrwVar;
        this.d = azrwVar2;
        this.g = azrwVar3;
        this.i = azrwVar4;
        this.e = azrwVar5;
        this.a = azrwVar6;
        this.b = azrwVar7;
        this.f = azrwVar8;
        this.c = azrwVar9;
    }

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i, byte[][] bArr) {
        this.j = i;
        this.i = azrwVar;
        this.g = azrwVar2;
        this.h = azrwVar3;
        this.f = azrwVar4;
        this.c = azrwVar5;
        this.a = azrwVar6;
        this.e = azrwVar7;
        this.d = azrwVar8;
        this.b = azrwVar9;
    }

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i, char[][] cArr) {
        this.j = i;
        this.e = azrwVar;
        this.b = azrwVar2;
        this.i = azrwVar3;
        this.h = azrwVar4;
        this.f = azrwVar5;
        this.c = azrwVar6;
        this.g = azrwVar7;
        this.d = azrwVar8;
        this.a = azrwVar9;
    }

    public wmq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, int i, short[][] sArr) {
        this.j = i;
        this.g = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
        this.e = azrwVar4;
        this.d = azrwVar5;
        this.i = azrwVar6;
        this.b = azrwVar7;
        this.f = azrwVar8;
        this.h = azrwVar9;
    }

    public static wmq a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new wmq(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, 0);
    }

    public static wzm b(wni wniVar, shf shfVar, ywr ywrVar, ysy ysyVar, wyz wyzVar, aigv aigvVar, aifw aifwVar, azrw azrwVar, zbw zbwVar) {
        wzm wzmVar = new wzm(shfVar, ywrVar, ysyVar);
        wyzVar.getClass();
        wzmVar.a = wyzVar;
        azrwVar.getClass();
        wzmVar.e = azrwVar;
        wzmVar.h = aigvVar;
        wzmVar.g = aifwVar;
        if (wniVar.h) {
            wzmVar.f = zbwVar;
        }
        return wzmVar;
    }

    public static acpj c(Object obj, afrw afrwVar, afsy afsyVar, shf shfVar, zbw zbwVar, ynn ynnVar, Optional optional) {
        return new acpj((acpm) obj, afrwVar, afsyVar, shfVar, zbwVar, ynnVar, optional);
    }

    public static aenl d(aaoz aaozVar, aaea aaeaVar, aenv aenvVar, aeot aeotVar, ScheduledExecutorService scheduledExecutorService, yxx yxxVar, axpg axpgVar, axpg axpgVar2, axpg axpgVar3) {
        if (yxxVar.o(yxx.G)) {
            return new aenr(aaozVar.get(), aenvVar, aeotVar, aaeaVar, scheduledExecutorService, axpgVar, axpgVar2, axpgVar3);
        }
        return new aeno(aaozVar, aenvVar, aaeaVar);
    }

    public static aeei e(amnv amnvVar, Key key, afhf afhfVar, shf shfVar, adyc adycVar, ptk ptkVar, ammv ammvVar, adyl adylVar, afhs afhsVar) {
        return new aeei(amnvVar, key, afhfVar, shfVar, adycVar, ptkVar, ammvVar, adylVar, afhsVar);
    }

    public static wmq f(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new wmq(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, 2, (char[]) null);
    }

    public static wmq g(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new wmq(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, 3, (short[]) null);
    }

    public static wmq h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new wmq(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, 4, (int[]) null);
    }

    public static wmq i(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new wmq(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, 5, (boolean[]) null);
    }

    public static wmq j(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new wmq(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, 6, (float[]) null);
    }

    public static wmq k(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new wmq(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, 7, (byte[][]) null);
    }

    public static wmq l(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new wmq(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, 8, (char[][]) null);
    }

    public static wmq m(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new wmq(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, 9, (short[][]) null);
    }

    public static wpc n(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, ypa ypaVar, whu whuVar, aaea aaeaVar) {
        return new wpc(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, ypaVar, aaeaVar);
    }

    public static aijp o(aarm aarmVar, ajoy ajoyVar, ajyw ajywVar, afsy afsyVar, String str, ypa ypaVar, aadw aadwVar, aaea aaeaVar, zfm zfmVar) {
        return new aijp(aarmVar, ajoyVar, ajywVar, afsyVar, str, ypaVar, aadwVar, aaeaVar, zfmVar, null, null, null, null);
    }

    public static abdt p(ammv ammvVar, aarm aarmVar, ajoy ajoyVar, afsy afsyVar, aadw aadwVar, aaea aaeaVar, Set set, axzf axzfVar, anev anevVar) {
        return new abdt(ammvVar, aarmVar, ajoyVar, afsyVar, aadwVar, aaeaVar, set, axzfVar, null, null, null, null, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.j) {
            case 0:
                return b((wni) ((axqs) this.a).a, (shf) this.b.get(), (ywr) this.c.get(), (ysy) this.d.get(), (wyz) this.e.get(), (aigv) this.f.get(), (aifw) this.g.get(), this.h, (zbw) this.i.get());
            case 1:
                return new wij(axqq.a(this.f), axqq.a(this.i), (ypa) this.b.get(), (SharedPreferences) this.c.get(), (wgv) this.h.get(), (abep) this.g.get(), (shf) this.e.get(), (acpk) this.d.get(), (aadw) this.a.get());
            case 2:
                return n(this.e, this.a, this.f, this.h, this.c, this.i, (ypa) this.d.get(), (whu) this.b.get(), (aaea) this.g.get());
            case 3:
                ammv ammvVar = (ammv) ((axqs) this.i).a;
                aarm aarmVar = (aarm) this.c.get();
                ajoy ajoyVar = (ajoy) this.g.get();
                afsy afsyVar = (afsy) this.f.get();
                aadw aadwVar = (aadw) this.a.get();
                aaea aaeaVar = (aaea) this.d.get();
                Set set = ((axqw) this.h).get();
                return p(ammvVar, aarmVar, ajoyVar, afsyVar, aadwVar, aaeaVar, set, (axzf) this.e.get(), ajbp.h());
            case 4:
                Object obj = this.b.get();
                afrw afrwVar = (afrw) this.f.get();
                afsy afsyVar2 = (afsy) this.h.get();
                shf shfVar = (shf) this.e.get();
                zbw zbwVar = (zbw) this.i.get();
                ynn ynnVar = (ynn) this.a.get();
                return c(obj, afrwVar, afsyVar2, shfVar, zbwVar, ynnVar, (Optional) ((axqs) this.g).a);
            case 5:
                return d((aaoz) this.h.get(), (aaea) this.d.get(), (aenv) this.g.get(), (aeot) this.i.get(), (ScheduledExecutorService) this.e.get(), (yxx) this.a.get(), axqq.a(this.b), axqq.a(this.f), axqq.a(this.c));
            case 6:
                return e((amnv) this.c.get(), (Key) this.d.get(), ((adwd) this.i).b(), (shf) this.a.get(), (adyc) this.h.get(), (ptk) this.g.get(), (ammv) ((axqs) this.b).a, (adyl) this.e.get(), (afhs) this.f.get());
            case 7:
                return o((aarm) this.i.get(), (ajoy) this.g.get(), ((aijs) this.h).get(), (afsy) this.f.get(), ((yjv) this.c).b(), (ypa) this.a.get(), (aadw) this.e.get(), (aaea) this.d.get(), (zfm) this.b.get());
            case 8:
                return new aipw((shf) this.e.get(), (Executor) this.b.get(), (Handler) this.i.get(), (SecureRandom) this.h.get(), (aaxn) this.f.get(), ((yjv) this.c).b(), (ahbv) ((axqs) this.g).a, (aifk) this.d.get(), (acpl) this.a.get());
            default:
                return new aiqf((afuh) this.g.get(), (ysy) this.c.get(), (afqj) this.a.get(), ((wmr) this.e).b(), (Executor) this.d.get(), (ahbx) this.i.get(), (acpl) this.b.get(), (aaea) this.f.get(), ((wmr) this.h).b(), null, null);
        }
    }
}
