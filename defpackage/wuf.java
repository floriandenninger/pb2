package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wuf implements axqr {
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
    private final azrw o;
    private final azrw p;
    private final azrw q;
    private final azrw r;
    private final /* synthetic */ int s;

    public wuf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, azrw azrwVar16, azrw azrwVar17, azrw azrwVar18, int i) {
        this.s = i;
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
        this.o = azrwVar15;
        this.p = azrwVar16;
        this.q = azrwVar17;
        this.r = azrwVar18;
    }

    public wuf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, azrw azrwVar16, azrw azrwVar17, azrw azrwVar18, int i, byte[] bArr) {
        this.s = i;
        this.p = azrwVar;
        this.o = azrwVar2;
        this.d = azrwVar3;
        this.r = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.i = azrwVar7;
        this.a = azrwVar8;
        this.j = azrwVar9;
        this.m = azrwVar10;
        this.g = azrwVar11;
        this.c = azrwVar12;
        this.k = azrwVar13;
        this.q = azrwVar14;
        this.l = azrwVar15;
        this.n = azrwVar16;
        this.b = azrwVar17;
        this.h = azrwVar18;
    }

    public static wuf a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, azrw azrwVar16, azrw azrwVar17, azrw azrwVar18) {
        return new wuf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, azrwVar16, azrwVar17, azrwVar18, 0);
    }

    public static wuf b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, azrw azrwVar16, azrw azrwVar17, azrw azrwVar18) {
        return new wuf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, azrwVar16, azrwVar17, azrwVar18, 1, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        if (this.s == 0) {
            return new wue(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Executor) this.n.get(), (Executor) this.o.get(), (CopyOnWriteArrayList) this.p.get(), (whu) this.q.get(), this.r, null, null);
        }
        wnm wnmVar = (wnm) this.p.get();
        Set set = ((axqw) this.o).get();
        Set set2 = ((axqw) this.d).get();
        Set set3 = ((axqw) this.r).get();
        Set set4 = ((axqw) this.e).get();
        Set set5 = ((axqw) this.f).get();
        Set set6 = ((axqw) this.i).get();
        Set set7 = ((axqw) this.a).get();
        Set set8 = ((axqw) this.j).get();
        Set set9 = (Set) this.m.get();
        Set set10 = (Set) this.g.get();
        Context context = (Context) ((axqs) this.c).a;
        xln xlnVar = (xln) this.k.get();
        return new wnl(wnmVar, set, set2, set3, set4, set5, set6, set7, set8, set9, set10, context, xlnVar, (yfl) this.l.get(), (wwm) this.n.get(), (aaea) this.b.get(), (aadw) this.h.get(), null);
    }
}
