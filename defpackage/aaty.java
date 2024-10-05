package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaty extends aaru {
    public final List a;
    public final List b;
    public long c;
    public long d;
    public int s;
    public float t;
    public int u;
    private final List v;
    private final List w;

    public aaty(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("offline/auto_offline", ajoyVar, afsxVar, null, null, null);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arjg.a.createBuilder();
        long j = this.c;
        createBuilder.copyOnWrite();
        arjg arjgVar = (arjg) createBuilder.instance;
        arjgVar.b |= 2;
        arjgVar.d = j;
        long j2 = this.d;
        createBuilder.copyOnWrite();
        arjg arjgVar2 = (arjg) createBuilder.instance;
        arjgVar2.b |= 4;
        arjgVar2.e = j2;
        int i = this.s;
        createBuilder.copyOnWrite();
        arjg arjgVar3 = (arjg) createBuilder.instance;
        arjgVar3.b |= 8;
        arjgVar3.f = i;
        float f = this.t;
        createBuilder.copyOnWrite();
        arjg arjgVar4 = (arjg) createBuilder.instance;
        arjgVar4.b |= 16;
        arjgVar4.g = f;
        int i2 = this.u;
        createBuilder.copyOnWrite();
        arjg arjgVar5 = (arjg) createBuilder.instance;
        arjgVar5.b |= 32;
        arjgVar5.h = i2;
        List list = this.a;
        createBuilder.copyOnWrite();
        arjg arjgVar6 = (arjg) createBuilder.instance;
        aony aonyVar = arjgVar6.i;
        if (!aonyVar.c()) {
            arjgVar6.i = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) arjgVar6.i);
        List list2 = this.b;
        createBuilder.copyOnWrite();
        arjg arjgVar7 = (arjg) createBuilder.instance;
        aony aonyVar2 = arjgVar7.k;
        if (!aonyVar2.c()) {
            arjgVar7.k = aonm.mutableCopy(aonyVar2);
        }
        aolo.addAll((Iterable) list2, (List) arjgVar7.k);
        List list3 = this.v;
        createBuilder.copyOnWrite();
        arjg arjgVar8 = (arjg) createBuilder.instance;
        aony aonyVar3 = arjgVar8.l;
        if (!aonyVar3.c()) {
            arjgVar8.l = aonm.mutableCopy(aonyVar3);
        }
        aolo.addAll((Iterable) list3, (List) arjgVar8.l);
        List list4 = this.w;
        createBuilder.copyOnWrite();
        arjg arjgVar9 = (arjg) createBuilder.instance;
        aony aonyVar4 = arjgVar9.j;
        if (!aonyVar4.c()) {
            arjgVar9.j = aonm.mutableCopy(aonyVar4);
        }
        aolo.addAll((Iterable) list4, (List) arjgVar9.j);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(this.c >= 0);
        amkq.E(this.d >= 0);
        amkq.E(true);
        float f = this.t;
        amkq.E(f >= 0.0f && f <= 1.0f);
        amkq.E(this.u >= 0);
    }
}
