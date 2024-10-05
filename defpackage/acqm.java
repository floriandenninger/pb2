package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqm implements axqr {
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
    private final /* synthetic */ int k;

    public acqm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, int i) {
        this.k = i;
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
    }

    public acqm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, int i, byte[] bArr) {
        this.k = i;
        this.j = azrwVar;
        this.h = azrwVar2;
        this.a = azrwVar3;
        this.c = azrwVar4;
        this.f = azrwVar5;
        this.e = azrwVar6;
        this.g = azrwVar7;
        this.b = azrwVar8;
        this.d = azrwVar9;
        this.i = azrwVar10;
    }

    public acqm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, int i, char[] cArr) {
        this.k = i;
        this.g = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.h = azrwVar4;
        this.d = azrwVar5;
        this.e = azrwVar6;
        this.j = azrwVar7;
        this.f = azrwVar8;
        this.i = azrwVar9;
        this.b = azrwVar10;
    }

    public acqm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, int i, int[] iArr) {
        this.k = i;
        this.i = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.g = azrwVar4;
        this.f = azrwVar5;
        this.j = azrwVar6;
        this.c = azrwVar7;
        this.b = azrwVar8;
        this.h = azrwVar9;
        this.e = azrwVar10;
    }

    public acqm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, int i, short[] sArr) {
        this.k = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.e = azrwVar3;
        this.d = azrwVar4;
        this.h = azrwVar5;
        this.f = azrwVar6;
        this.c = azrwVar7;
        this.g = azrwVar8;
        this.i = azrwVar9;
        this.j = azrwVar10;
    }

    public acqm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, int i, boolean[] zArr) {
        this.k = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.e = azrwVar4;
        this.f = azrwVar5;
        this.d = azrwVar6;
        this.i = azrwVar7;
        this.j = azrwVar8;
        this.g = azrwVar9;
        this.h = azrwVar10;
    }

    public static acqm a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10) {
        return new acqm(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, 0);
    }

    public static aduw b(yth ythVar, Context context, Executor executor, String str, aadw aadwVar, azrw azrwVar, afjo afjoVar, ynx ynxVar, Executor executor2, ysb ysbVar) {
        return new aduw(ythVar, context, executor, str, aadwVar, azrwVar, afjoVar, ynxVar, executor2, ysbVar);
    }

    public static aimo c(aimx aimxVar, ahbv ahbvVar, Handler handler, axpg axpgVar, aypn aypnVar, aypn aypnVar2, aypn aypnVar3, aiov aiovVar, azrw azrwVar, azrw azrwVar2) {
        return new aimo(aimxVar, ahbvVar, handler, axpgVar, aypnVar, aypnVar2, aypnVar3, aiovVar, azrwVar, azrwVar2);
    }

    public static aimx d(azqw azqwVar, azqw azqwVar2, azqw azqwVar3, azqw azqwVar4, azqw azqwVar5, azqw azqwVar6, azqw azqwVar7, azqw azqwVar8, azqw azqwVar9, azqw azqwVar10) {
        return new aimx(azqwVar, azqwVar2, azqwVar3, azqwVar4, azqwVar5, azqwVar6, azqwVar7, azqwVar8, azqwVar9, azqwVar10);
    }

    public static acqm e(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10) {
        return new acqm(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, 1, (byte[]) null);
    }

    public static acqm f(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10) {
        return new acqm(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, 2, (char[]) null);
    }

    public static acqm g(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10) {
        return new acqm(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, 3, (short[]) null);
    }

    public static acqm h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10) {
        return new acqm(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, 4, (int[]) null);
    }

    public static acqm i(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10) {
        return new acqm(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, 5, (boolean[]) null);
    }

    public static acrt j(ajkn ajknVar, ypa ypaVar, acre acreVar, acrj acrjVar, ajun ajunVar, Context context, aaea aaeaVar, aadw aadwVar, azrw azrwVar, azrw azrwVar2) {
        return new acqt(acrs.DEFAULT, ajknVar, ypaVar, acreVar, acrjVar, ajunVar, context, aaeaVar, aadwVar, azrwVar, azrwVar2, null, null);
    }

    public static acre k(Context context, ypa ypaVar, acpl acplVar, aadw aadwVar, Map map, acqn acqnVar, acrh acrhVar, acql acqlVar, aaea aaeaVar, axzg axzgVar) {
        return new acre(context, ypaVar, acplVar, aadwVar, map, acqnVar, acrhVar, acqlVar, aaeaVar, axzgVar, null, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.k;
        if (i == 0) {
            return new acql((acpl) this.a.get(), ((ykc) this.b).get(), (ScheduledExecutorService) this.c.get(), (zbw) this.d.get(), (shf) this.e.get(), (aaea) this.f.get(), (ypa) this.g.get(), (ynn) this.h.get(), (afsy) this.i.get(), (ywr) this.j.get());
        }
        if (i == 1) {
            return j((ajkn) this.j.get(), (ypa) this.h.get(), (acre) this.a.get(), (acrj) this.c.get(), (ajun) this.f.get(), (Context) ((axqs) this.e).a, (aaea) this.g.get(), (aadw) this.b.get(), this.d, this.i);
        }
        if (i == 2) {
            return k((Context) ((axqs) this.g).a, (ypa) this.a.get(), (acpl) this.c.get(), (aadw) this.h.get(), ((axqt) this.d).get(), (acqn) this.e.get(), (acrh) this.j.get(), (acql) this.f.get(), (aaea) this.i.get(), (axzg) this.b.get());
        }
        if (i == 3) {
            return b((yth) this.a.get(), (Context) ((axqs) this.b).a, (Executor) this.e.get(), (String) this.d.get(), (aadw) this.h.get(), this.f, (afjo) this.c.get(), (ynx) this.g.get(), (Executor) this.i.get(), (ysb) this.j.get());
        }
        if (i != 4) {
            return d((azqw) this.a.get(), (azqw) this.b.get(), (azqw) this.c.get(), (azqw) this.e.get(), (azqw) this.f.get(), (azqw) this.d.get(), (azqw) this.i.get(), (azqw) this.j.get(), (azqw) this.g.get(), (azqw) this.h.get());
        }
        aimo c = c((aimx) this.i.get(), (ahbv) ((axqs) this.a).a, (Handler) this.d.get(), axqq.a(this.g), (aypn) this.f.get(), (aypn) this.j.get(), (aypn) this.c.get(), (aiov) this.b.get(), this.h, this.e);
        c.b();
        return c;
    }
}
