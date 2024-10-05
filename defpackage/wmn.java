package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wmn implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final /* synthetic */ int h;

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i) {
        this.h = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, byte[] bArr) {
        this.h = i;
        this.d = azrwVar;
        this.f = azrwVar2;
        this.a = azrwVar3;
        this.c = azrwVar4;
        this.e = azrwVar5;
        this.b = azrwVar6;
        this.g = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, char[] cArr) {
        this.h = i;
        this.b = azrwVar;
        this.f = azrwVar2;
        this.c = azrwVar3;
        this.g = azrwVar4;
        this.d = azrwVar5;
        this.a = azrwVar6;
        this.e = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, float[] fArr) {
        this.h = i;
        this.d = azrwVar;
        this.f = azrwVar2;
        this.b = azrwVar3;
        this.g = azrwVar4;
        this.e = azrwVar5;
        this.a = azrwVar6;
        this.c = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, int[] iArr) {
        this.h = i;
        this.d = azrwVar;
        this.g = azrwVar2;
        this.f = azrwVar3;
        this.a = azrwVar4;
        this.c = azrwVar5;
        this.b = azrwVar6;
        this.e = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, short[] sArr) {
        this.h = i;
        this.d = azrwVar;
        this.a = azrwVar2;
        this.f = azrwVar3;
        this.b = azrwVar4;
        this.e = azrwVar5;
        this.g = azrwVar6;
        this.c = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, boolean[] zArr) {
        this.h = i;
        this.g = azrwVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
        this.a = azrwVar4;
        this.c = azrwVar5;
        this.d = azrwVar6;
        this.b = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, byte[][] bArr) {
        this.h = i;
        this.g = azrwVar;
        this.f = azrwVar2;
        this.d = azrwVar3;
        this.a = azrwVar4;
        this.e = azrwVar5;
        this.c = azrwVar6;
        this.b = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, char[][] cArr) {
        this.h = i;
        this.f = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.g = azrwVar4;
        this.b = azrwVar5;
        this.e = azrwVar6;
        this.a = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, float[][] fArr) {
        this.h = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.g = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.d = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, int[][] iArr) {
        this.h = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.g = azrwVar4;
        this.f = azrwVar5;
        this.e = azrwVar6;
        this.b = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, short[][] sArr) {
        this.h = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.e = azrwVar4;
        this.b = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, boolean[][] zArr) {
        this.h = i;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
        this.f = azrwVar4;
        this.g = azrwVar5;
        this.e = azrwVar6;
        this.a = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, byte[][][] bArr) {
        this.h = i;
        this.b = azrwVar;
        this.f = azrwVar2;
        this.g = azrwVar3;
        this.d = azrwVar4;
        this.c = azrwVar5;
        this.e = azrwVar6;
        this.a = azrwVar7;
    }

    public wmn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, int i, char[][][] cArr) {
        this.h = i;
        this.f = azrwVar;
        this.e = azrwVar2;
        this.a = azrwVar3;
        this.c = azrwVar4;
        this.d = azrwVar5;
        this.g = azrwVar6;
        this.b = azrwVar7;
    }

    public static wmn a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 0);
    }

    public static adyl c(amnv amnvVar, azrw azrwVar, afhe afheVar, aejn aejnVar, adyj adyjVar, acpl acplVar, afhs afhsVar) {
        return new adyl(amnvVar, azrwVar, afheVar, aejnVar, adyjVar, acplVar, afhsVar);
    }

    public static afrp d(afqd afqdVar, afrz afrzVar, afrv afrvVar, ylf ylfVar, shf shfVar, ysy ysyVar) {
        return new afrp(afqdVar, afrzVar, afrvVar, ylfVar, shfVar, ysyVar);
    }

    public static ahbc e(aimx aimxVar, aiov aiovVar, axpg axpgVar, Executor executor, azrw azrwVar, aypn aypnVar, aypn aypnVar2) {
        return new ahbc(aimxVar, aiovVar, axpgVar, executor, azrwVar, aypnVar, aypnVar2);
    }

    public static wmn f(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 1, (byte[]) null);
    }

    public static wmn g(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 2, (char[]) null);
    }

    public static wmn h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 3, (short[]) null);
    }

    public static wmn i(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 4, (int[]) null);
    }

    public static wmn j(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 5, (boolean[]) null);
    }

    public static wmn k(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 7, (byte[][]) null);
    }

    public static wmn l(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 8, (char[][]) null);
    }

    public static wmn m(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 9, (short[][]) null);
    }

    public static wmn n(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 10, (int[][]) null);
    }

    public static wmn o(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 11, (boolean[][]) null);
    }

    public static wmn p(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 12, (float[][]) null);
    }

    public static wmn q(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 13, (byte[][][]) null);
    }

    public static wmn r(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        return new wmn(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, 14, (char[][][]) null);
    }

    public static aacs s(ScheduledExecutorService scheduledExecutorService, acpk acpkVar, afsy afsyVar, aftp aftpVar, aayb aaybVar, aayb aaybVar2, qtv qtvVar) {
        return new aacs(scheduledExecutorService, acpkVar, afsyVar, aftpVar, aaybVar, aaybVar2, qtvVar, null, null);
    }

    public static wnm t(wxr wxrVar, wxr wxrVar2, ywt ywtVar, Map map, azrw azrwVar, amsx amsxVar, whu whuVar) {
        return new wnm(wxrVar, wxrVar2, ywtVar, map, azrwVar, amsxVar, null, null);
    }

    public static wse u(azrw azrwVar, ajoy ajoyVar, azrw azrwVar2, shf shfVar) {
        return new wse(azrwVar, ajoyVar, azrwVar2, shfVar, null, null, null, null);
    }

    public static aiij v(ajoy ajoyVar, aijp aijpVar, akpq akpqVar, ysl yslVar, shf shfVar, aelm aelmVar) {
        return new aiij(ajoyVar, aijpVar, akpqVar, yslVar, shfVar, aelmVar, null, null, null, null);
    }

    public static wza b(Context context, aadw aadwVar, wni wniVar, wng wngVar, wyx wyxVar, shf shfVar, afsy afsyVar) {
        if (!wniVar.i) {
            return whu.k(context, wniVar.e, wngVar.c(), wngVar.d(), wyxVar, null, null, null);
        }
        String str = wniVar.e;
        String c = wngVar.c();
        String d = wngVar.d();
        aadwVar.getClass();
        shfVar.getClass();
        afsyVar.getClass();
        return whu.k(context, str, c, d, wyxVar, shfVar, afsyVar, aadwVar);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.h) {
            case 0:
                return b((Context) ((axqs) this.a).a, (aadw) this.b.get(), (wni) ((axqs) this.c).a, (wng) this.d.get(), (wyx) this.e.get(), (shf) this.f.get(), (afsy) this.g.get());
            case 1:
                return rwh.bk((Context) ((axqs) this.d).a, (ScheduledExecutorService) this.f.get(), (vcw) this.a.get(), axqq.a(this.c), (ammv) ((axqs) this.e).a, (ammv) this.b.get(), (tko) this.g.get());
            case 2:
                return t((wxr) this.b.get(), (wxr) this.f.get(), (ywt) this.c.get(), (Map) this.g.get(), this.d, (amsx) this.a.get(), (whu) this.e.get());
            case 3:
                azrw azrwVar = this.d;
                ajoy ajoyVar = (ajoy) this.a.get();
                azrw azrwVar2 = this.b;
                return u(azrwVar, ajoyVar, azrwVar2, (shf) this.c.get());
            case 4:
                wni wniVar = (wni) ((axqs) this.d).a;
                aaea aaeaVar = (aaea) this.g.get();
                shf shfVar = (shf) this.f.get();
                acpl acplVar = (acpl) this.a.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.get();
                return new xln(wniVar, aaeaVar, shfVar, acplVar, scheduledExecutorService, (wyu) this.e.get());
            case 5:
                return new aabv(this.g, this.e, this.f, this.a, this.c, this.d, this.b);
            case 6:
                return s((ScheduledExecutorService) this.d.get(), (acpk) this.f.get(), (afsy) this.b.get(), (aftp) this.g.get(), (aayb) this.e.get(), (aayb) this.a.get(), ((ouo) this.c).get());
            case 7:
                return c((amnv) this.g.get(), this.f, ((aduy) this.d).b(), (aejn) this.a.get(), (adyj) this.e.get(), (acpl) this.c.get(), (afhs) this.b.get());
            case 8:
                afqd afqdVar = (afqd) this.f.get();
                afrz afrzVar = (afrz) this.d.get();
                afrv afrvVar = (afrv) this.c.get();
                ylf ylfVar = (ylf) this.g.get();
                return d(afqdVar, afrzVar, afrvVar, ylfVar, (shf) this.e.get(), (ysy) this.a.get());
            case 9:
                return new afty((yol) this.a.get(), (Executor) this.d.get(), (afql) this.c.get(), (shf) this.e.get(), (ysl) this.b.get(), (afsy) this.f.get(), ((axqw) this.g).get());
            case 10:
                ahbc e = e((aimx) this.a.get(), (aiov) this.d.get(), axqq.a(this.c), (Executor) this.g.get(), this.f, (aypn) this.e.get(), (aypn) this.b.get());
                e.a();
                return e;
            case 11:
                return new ahhc((Context) ((axqs) this.d).a, (ypa) this.c.get(), (aifs) this.b.get(), (afgr) this.f.get(), (afgr) this.g.get(), this.e, (axfg) this.a.get(), null);
            case 12:
                ajoy ajoyVar2 = (ajoy) this.c.get();
                aijp aijpVar = (aijp) this.a.get();
                akpq akpqVar = ((aijw) this.b).get();
                ysl yslVar = (ysl) this.g.get();
                shf shfVar2 = (shf) this.e.get();
                aelm aelmVar = ((aham) this.f).get();
                return v(ajoyVar2, aijpVar, akpqVar, yslVar, shfVar2, aelmVar);
            case 13:
                return new aior((aigv) this.b.get(), (aild) this.f.get(), (ajby) this.g.get(), (ypa) this.d.get(), (Set) ((axqs) this.c).a, (aiov) this.e.get(), (Set) ((axqs) this.a).a);
            default:
                return new airx((afgt) this.f.get(), (aypn) this.e.get(), (aifv) this.a.get(), (aypn) this.c.get(), (shf) this.d.get(), (ajby) this.g.get(), (aaea) this.b.get());
        }
    }
}
