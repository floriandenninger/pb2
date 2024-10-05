package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Calendar;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afze implements ylb {
    private final Context a;
    private final aaea b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final afyt f;
    private final shf g;
    private final Map h;
    private final Set i;
    private final acpl j;
    private final afzd k;
    private final ylf l;

    public afze(Context context, aaea aaeaVar, azrw azrwVar, azrw azrwVar2, ylf ylfVar, azrw azrwVar3, afyt afytVar, shf shfVar, Map map, Set set, acpl acplVar, afzd afzdVar) {
        this.a = context;
        this.b = aaeaVar;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.l = ylfVar;
        this.e = azrwVar3;
        this.f = afytVar;
        this.g = shfVar;
        this.h = map;
        this.i = set;
        this.j = acplVar;
        this.k = afzdVar;
    }

    public static atoc b(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if (a == null) {
            return null;
        }
        atog atogVar = a.p;
        if (atogVar == null) {
            atogVar = atog.a;
        }
        if ((atogVar.b & 64) == 0) {
            return null;
        }
        atog atogVar2 = a.p;
        if (atogVar2 == null) {
            atogVar2 = atog.a;
        }
        atoc atocVar = atogVar2.f;
        return atocVar == null ? atoc.a : atocVar;
    }

    public static boolean d(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return false;
        }
        atoa atoaVar = b.w;
        if (atoaVar == null) {
            atoaVar = atoa.a;
        }
        return atoaVar.c;
    }

    public static void e(aaea aaeaVar, ylf ylfVar, shf shfVar, int i, boolean z) {
        long j;
        atoc b = b(aaeaVar);
        apcw h = h(aaeaVar);
        if ((!j(aaeaVar) || b == null) && (h == null || !i(aaeaVar))) {
            return;
        }
        boolean z2 = b.l | z;
        if (z2) {
            ylfVar.c("device_context_task");
        }
        if (l(aaeaVar) || k(aaeaVar)) {
            ylfVar.e("device_context_task", i, z2, f(aaeaVar), g(shfVar, i), null, false);
            return;
        }
        long j2 = 0;
        if (j(aaeaVar)) {
            long j3 = b(aaeaVar).c;
            j = b(aaeaVar).c;
        } else if (i(aaeaVar)) {
            long j4 = h(aaeaVar).b;
            j = h(aaeaVar).b;
        } else {
            j = 0;
        }
        if (j(aaeaVar)) {
            j2 = b(aaeaVar).d;
        } else if (i(aaeaVar)) {
            j2 = h(aaeaVar).c;
        }
        ylfVar.d("device_context_task", j, j2, z2, f(aaeaVar), false, g(shfVar, i), null);
    }

    private static int f(aaea aaeaVar) {
        atoc b = b(aaeaVar);
        return (b == null || (b.b & 8) == 0 || b.f) ? 2 : 0;
    }

    private static Bundle g(shf shfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putLong("device_context_task_scheduled", shfVar.c() + TimeUnit.SECONDS.toMillis(i));
        return bundle;
    }

    private static apcw h(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if (a == null) {
            return null;
        }
        atog atogVar = a.p;
        if (atogVar == null) {
            atogVar = atog.a;
        }
        apcw apcwVar = atogVar.g;
        return apcwVar == null ? apcw.a : apcwVar;
    }

    private static boolean i(aaea aaeaVar) {
        apcw h = h(aaeaVar);
        return h != null && h.b > 0 && h.c > 0;
    }

    private static boolean j(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if (a == null) {
            return false;
        }
        atog atogVar = a.p;
        if (atogVar == null) {
            atogVar = atog.a;
        }
        return atogVar.d && b(aaeaVar) != null;
    }

    private static boolean k(aaea aaeaVar) {
        atoc b = b(aaeaVar);
        return b.s || b.v;
    }

    private static boolean l(aaea aaeaVar) {
        atoc b = b(aaeaVar);
        return b != null && b.g;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:134|(1:273)(1:138)|139|(4:141|(1:143)|144|(26:150|(1:154)|155|156|157|158|159|161|162|(1:261)(8:166|(1:168)|169|(1:171)|172|(7:175|(1:177)(1:188)|(1:179)(1:187)|180|(2:182|183)(2:185|186)|184|173)|189|190)|(1:192)|193|194|(1:196)|197|198|199|(1:258)(7:203|(1:205)(1:257)|206|(1:256)(2:209|(2:210|(2:212|(1:214)(1:215))(2:254|255)))|216|(1:(1:222)(1:(1:224)(1:225)))|226)|227|(2:232|(1:234))|235|236|237|238|239|(5:244|(1:246)|247|(1:249)|250)))|272|199|(1:201)|258|227|(3:229|232|(0))|235|236|237|238|239|(6:242|244|(0)|247|(0)|250)) */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x05b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05b4, code lost:
    
        defpackage.zga.d("Error in sending SendDeviceContextRequest.", r0);
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05d6  */
    @Override // defpackage.ylb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afze.a(android.os.Bundle):int");
    }

    final void c(atoc atocVar, long j) {
        long seconds;
        long c = this.g.c() / 1000;
        long j2 = (j == 0 || j <= c) ? atocVar.c : j - c;
        if (atocVar.s) {
            if (TimeUnit.MILLISECONDS.toHours(this.g.c() - this.k.b) > atocVar.t) {
                j2 = TimeUnit.HOURS.toSeconds(atocVar.u);
            }
        }
        if (atocVar.v) {
            int hours = Calendar.getInstance().get(11) + ((int) TimeUnit.SECONDS.toHours(j2));
            if (hours < atocVar.w) {
                seconds = TimeUnit.HOURS.toSeconds(atocVar.w - hours);
            } else if (hours > atocVar.x) {
                seconds = TimeUnit.HOURS.toSeconds(atocVar.w + (24 - hours));
            }
            j2 += seconds;
        }
        long j3 = j2;
        if (atocVar.m) {
            this.l.c("device_context_task");
        }
        this.l.e("device_context_task", j3, true, 2, g(this.g, (int) j3), null, false);
    }
}
