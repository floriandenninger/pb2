package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wvo implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private final azrw j;
    private final azrw k;
    private final azrw l;
    private final /* synthetic */ int m;

    public wvo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, int i) {
        this.m = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
        this.j = azrwVar10;
        this.k = azrwVar11;
        this.l = azrwVar12;
    }

    public wvo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, int i, byte[] bArr) {
        this.m = i;
        this.j = azrwVar;
        this.d = azrwVar2;
        this.k = azrwVar3;
        this.l = azrwVar4;
        this.b = azrwVar5;
        this.e = azrwVar6;
        this.g = azrwVar7;
        this.a = azrwVar8;
        this.c = azrwVar9;
        this.i = azrwVar10;
        this.f = azrwVar11;
        this.h = azrwVar12;
    }

    public wvo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, int i, char[] cArr) {
        this.m = i;
        this.l = azrwVar;
        this.i = azrwVar2;
        this.f = azrwVar3;
        this.e = azrwVar4;
        this.j = azrwVar5;
        this.d = azrwVar6;
        this.k = azrwVar7;
        this.b = azrwVar8;
        this.a = azrwVar9;
        this.g = azrwVar10;
        this.h = azrwVar11;
        this.c = azrwVar12;
    }

    public wvo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, int i, int[] iArr) {
        this.m = i;
        this.d = azrwVar;
        this.h = azrwVar2;
        this.c = azrwVar3;
        this.l = azrwVar4;
        this.j = azrwVar5;
        this.e = azrwVar6;
        this.b = azrwVar7;
        this.a = azrwVar8;
        this.f = azrwVar9;
        this.k = azrwVar10;
        this.g = azrwVar11;
        this.i = azrwVar12;
    }

    public wvo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, int i, short[] sArr) {
        this.m = i;
        this.h = azrwVar;
        this.l = azrwVar2;
        this.e = azrwVar3;
        this.c = azrwVar4;
        this.b = azrwVar5;
        this.j = azrwVar6;
        this.k = azrwVar7;
        this.g = azrwVar8;
        this.i = azrwVar9;
        this.f = azrwVar10;
        this.a = azrwVar11;
        this.d = azrwVar12;
    }

    public static wvo a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12) {
        return new wvo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, 0);
    }

    public static wvo b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12) {
        return new wvo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, 1, (byte[]) null);
    }

    public static wvo c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12) {
        return new wvo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, 2, (char[]) null);
    }

    public static wvo d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12) {
        return new wvo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, 3, (short[]) null);
    }

    public static wvo e(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12) {
        return new wvo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, 4, (int[]) null);
    }

    public static wnq f(xln xlnVar, whu whuVar, aadw aadwVar, Context context, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8) {
        return new wnq(xlnVar, whuVar, aadwVar, context, set, set2, set3, set4, set5, set6, set7, set8, null, null);
    }

    public static afcu g(ysy ysyVar, shf shfVar, afkn afknVar, afhs afhsVar, afkg afkgVar, adxl adxlVar, aenf aenfVar, adyu adyuVar, Context context, affa affaVar, zbw zbwVar, aypn aypnVar) {
        return new afcu(ysyVar, shfVar, afknVar, afhsVar, afkgVar, adxlVar, aenfVar, adyuVar, context, affaVar, zbwVar, aypnVar, null, null, null, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.m;
        if (i == 0) {
            azrw azrwVar = this.a;
            azrw azrwVar2 = this.b;
            azrw azrwVar3 = this.c;
            azrw azrwVar4 = this.d;
            azrw azrwVar5 = this.e;
            azrw azrwVar6 = this.f;
            azrw azrwVar7 = this.g;
            azrw azrwVar8 = this.h;
            azrw azrwVar9 = this.i;
            azrw azrwVar10 = this.j;
            return new wwk(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10);
        }
        if (i == 1) {
            return f((xln) this.j.get(), (whu) this.d.get(), (aadw) this.k.get(), (Context) ((axqs) this.l).a, ((axqw) this.b).get(), ((axqw) this.e).get(), ((axqw) this.g).get(), ((axqw) this.a).get(), ((axqw) this.c).get(), (Set) this.i.get(), (Set) this.f.get(), ((axqw) this.h).get());
        }
        if (i == 2) {
            return new yun((shf) this.l.get(), this.i, this.f, this.e, ((ytn) this.j).get(), (ynx) this.d.get(), (ScheduledExecutorService) this.k.get(), (ysb) this.b.get(), (Executor) this.a.get(), this.g, ((yto) this.h).get(), (zgi) this.c.get());
        }
        if (i == 3) {
            return g((ysy) this.h.get(), (shf) this.l.get(), ((ahai) this.e).get(), (afhs) this.c.get(), (afkg) this.b.get(), (adxl) this.j.get(), (aenf) this.k.get(), (adyu) this.g.get(), (Context) ((axqs) this.i).a, (affa) this.f.get(), (zbw) this.a.get(), (aypn) this.d.get());
        }
        ypa ypaVar = (ypa) this.d.get();
        axpg a = axqq.a(this.h);
        Handler handler = (Handler) this.c.get();
        zaw zawVar = (zaw) this.l.get();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.j.get();
        Executor executor = (Executor) this.e.get();
        aimx aimxVar = (aimx) this.b.get();
        ahbg ahbgVar = ((aiok) this.a).get();
        aaea aaeaVar = (aaea) this.f.get();
        aadw aadwVar = (aadw) this.k.get();
        return new aiih(ypaVar, a, handler, zawVar, scheduledExecutorService, executor, aimxVar, ahbgVar, aaeaVar, aadwVar, (aifk) this.i.get());
    }
}
