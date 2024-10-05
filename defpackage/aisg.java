package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisg implements axqr {
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
    private final azrw n;
    private final /* synthetic */ int o;

    public aisg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, int i) {
        this.o = i;
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
        this.n = azrwVar14;
    }

    public aisg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, int i, byte[] bArr) {
        this.o = i;
        this.b = azrwVar;
        this.l = azrwVar2;
        this.d = azrwVar3;
        this.m = azrwVar4;
        this.e = azrwVar5;
        this.c = azrwVar6;
        this.i = azrwVar7;
        this.a = azrwVar8;
        this.j = azrwVar9;
        this.n = azrwVar10;
        this.h = azrwVar11;
        this.k = azrwVar12;
        this.f = azrwVar13;
        this.g = azrwVar14;
    }

    public static aisf a(ypa ypaVar, Context context, aipt aiptVar, aitb aitbVar, ahbv ahbvVar, ScheduledExecutorService scheduledExecutorService, String str, anhy anhyVar, axpg axpgVar, aifk aifkVar) {
        return new aisf(ypaVar, context, aiptVar, aitbVar, ahbvVar, scheduledExecutorService, str, anhyVar, axpgVar, aifkVar);
    }

    public static aisg b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14) {
        return new aisg(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, 0);
    }

    public static aisg c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14) {
        return new aisg(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, 1, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        if (this.o == 0) {
            aisf a = a((ypa) this.a.get(), (Context) ((axqs) this.b).a, (aipt) this.c.get(), (aitb) this.d.get(), (ahbv) ((axqs) this.e).a, (ScheduledExecutorService) this.f.get(), (String) this.g.get(), (anhy) this.h.get(), axqq.a(this.i), (aifk) this.j.get());
            a.b((aypn) this.k.get(), (aypn) this.l.get(), (aypn) this.m.get(), (aifk) this.n.get());
            return a;
        }
        azrw azrwVar = this.b;
        azrw azrwVar2 = this.l;
        azrw azrwVar3 = this.d;
        azrw azrwVar4 = this.m;
        azrw azrwVar5 = this.e;
        azrw azrwVar6 = this.c;
        azrw azrwVar7 = this.i;
        azrw azrwVar8 = this.a;
        azrw azrwVar9 = this.j;
        azrw azrwVar10 = this.n;
        azrw azrwVar11 = this.h;
        azrw azrwVar12 = this.k;
        azrw azrwVar13 = this.f;
        azrw azrwVar14 = this.g;
        HashMap hashMap = new HashMap();
        whl.h(hashMap, azrwVar2, azrwVar, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14);
        return hashMap;
    }
}
