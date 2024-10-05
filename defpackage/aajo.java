package defpackage;

import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aajo implements axqr {
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
    private final azrw m;
    private final /* synthetic */ int n;

    public aajo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, int i) {
        this.n = i;
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
        this.m = azrwVar13;
    }

    public aajo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, int i, byte[] bArr) {
        this.n = i;
        this.b = azrwVar;
        this.h = azrwVar2;
        this.a = azrwVar3;
        this.k = azrwVar4;
        this.f = azrwVar5;
        this.e = azrwVar6;
        this.g = azrwVar7;
        this.d = azrwVar8;
        this.l = azrwVar9;
        this.m = azrwVar10;
        this.j = azrwVar11;
        this.i = azrwVar12;
        this.c = azrwVar13;
    }

    public aajo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, int i, char[] cArr) {
        this.n = i;
        this.j = azrwVar;
        this.b = azrwVar2;
        this.i = azrwVar3;
        this.a = azrwVar4;
        this.d = azrwVar5;
        this.m = azrwVar6;
        this.f = azrwVar7;
        this.k = azrwVar8;
        this.l = azrwVar9;
        this.g = azrwVar10;
        this.c = azrwVar11;
        this.h = azrwVar12;
        this.e = azrwVar13;
    }

    public aajo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, int i, int[] iArr) {
        this.n = i;
        this.d = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.a = azrwVar4;
        this.m = azrwVar5;
        this.g = azrwVar6;
        this.l = azrwVar7;
        this.j = azrwVar8;
        this.f = azrwVar9;
        this.i = azrwVar10;
        this.k = azrwVar11;
        this.h = azrwVar12;
        this.e = azrwVar13;
    }

    public aajo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, int i, short[] sArr) {
        this.n = i;
        this.a = azrwVar;
        this.m = azrwVar2;
        this.j = azrwVar3;
        this.d = azrwVar4;
        this.k = azrwVar5;
        this.b = azrwVar6;
        this.i = azrwVar7;
        this.c = azrwVar8;
        this.l = azrwVar9;
        this.f = azrwVar10;
        this.h = azrwVar11;
        this.g = azrwVar12;
        this.e = azrwVar13;
    }

    public static aajo a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13) {
        return new aajo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, 0);
    }

    public static aajn b(Context context, shf shfVar, ypa ypaVar, afsy afsyVar, Map map, azrw azrwVar, Executor executor, Executor executor2, Object obj, azrw azrwVar2, aals aalsVar, aaip aaipVar, azrw azrwVar3) {
        return new aajn(context, shfVar, ypaVar, afsyVar, map, azrwVar, executor, executor2, (amea) obj, azrwVar2, aalsVar, aaipVar, azrwVar3, null, null);
    }

    public static ajae c(azrw azrwVar, ScheduledExecutorService scheduledExecutorService, azrw azrwVar2, aiow aiowVar, Handler handler, Executor executor, aaea aaeaVar, aifk aifkVar, SecureRandom secureRandom, aapf aapfVar, acpl acplVar) {
        return new ajae(azrwVar, scheduledExecutorService, azrwVar2, aiowVar, handler, executor, aaeaVar, aifkVar, secureRandom, aapfVar, acplVar);
    }

    public static aajo d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13) {
        return new aajo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, 1, (byte[]) null);
    }

    public static aajo e(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13) {
        return new aajo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, 2, (char[]) null);
    }

    public static aajo f(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13) {
        return new aajo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, 3, (short[]) null);
    }

    public static aajo g(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13) {
        return new aajo(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, 4, (int[]) null);
    }

    public static afhs h(Context context, ywr ywrVar, ammv ammvVar, ysy ysyVar, aaea aaeaVar, aadw aadwVar, afkg afkgVar, afjv afjvVar, afqp afqpVar, axzg axzgVar, axzg axzgVar2, axzg axzgVar3, axzg axzgVar4) {
        return new afhs(context, ywrVar, ammvVar, ysyVar, aaeaVar, aadwVar, afkgVar, afjvVar, afqpVar, axzgVar, axzgVar2, axzgVar3, axzgVar4, null, null, null, null);
    }

    public static aaqo i(Context context, army armyVar, TelephonyManager telephonyManager, shf shfVar, azrw azrwVar, azrw azrwVar2, aaea aaeaVar, aadw aadwVar, aaqq aaqqVar, ysy ysyVar, amea ameaVar, axzf axzfVar, amcc amccVar) {
        return new aaqo(context, armyVar, telephonyManager, shfVar, azrwVar, azrwVar2, aaeaVar, aadwVar, aaqqVar, ysyVar, ameaVar, axzfVar, amccVar, null, null, null, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.n;
        if (i == 0) {
            return b((Context) ((axqs) this.a).a, (shf) this.b.get(), (ypa) this.c.get(), (afsy) this.d.get(), (Map) ((axqs) this.e).a, this.f, (Executor) this.g.get(), (Executor) this.h.get(), this.i.get(), this.j, (aals) this.k.get(), (aaip) this.l.get(), this.m);
        }
        if (i == 1) {
            return new wsi(this.b, this.h, this.a, this.k, this.f, this.e, this.g, this.d, this.l, this.m, this.j, (Executor) this.i.get(), (Executor) this.c.get());
        }
        if (i == 2) {
            return i((Context) ((axqs) this.j).a, ((aaby) this.b).get(), ((amdc) this.i).get(), (shf) this.a.get(), this.d, this.m, (aaea) this.f.get(), (aadw) this.k.get(), ((aabz) this.l).get(), (ysy) this.g.get(), (amea) this.c.get(), (axzf) this.h.get(), (amcc) this.e.get());
        }
        if (i == 3) {
            return h((Context) ((axqs) this.a).a, (ywr) this.m.get(), (ammv) ((axqs) this.j).a, (ysy) this.d.get(), (aaea) this.k.get(), (aadw) this.b.get(), (afkg) this.i.get(), ((afjw) this.c).get(), (afqp) ((axqs) this.l).a, (axzg) this.f.get(), (axzg) this.h.get(), (axzg) this.g.get(), (axzg) this.e.get());
        }
        ajae c = c(this.d, (ScheduledExecutorService) this.b.get(), this.c, (aiow) this.a.get(), (Handler) this.m.get(), (Executor) this.g.get(), (aaea) this.l.get(), (aifk) this.j.get(), (SecureRandom) this.f.get(), ((adwk) this.i).get(), (acpl) this.k.get());
        c.z((aypn) this.h.get(), (aypn) this.e.get());
        return c;
    }
}
