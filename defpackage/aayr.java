package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayr extends aaru {
    public boolean a;
    public boolean b;
    public boolean c;
    private boolean d;
    private boolean s;
    private final ArrayList t;

    public aayr(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live/get_broadcast_status", ajoyVar, afsxVar, null, null, null);
        this.t = new ArrayList();
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arrb.a.createBuilder();
        boolean z = this.a;
        createBuilder.copyOnWrite();
        arrb arrbVar = (arrb) createBuilder.instance;
        arrbVar.b |= 64;
        arrbVar.h = z;
        boolean z2 = this.d;
        createBuilder.copyOnWrite();
        arrb arrbVar2 = (arrb) createBuilder.instance;
        arrbVar2.b |= 128;
        arrbVar2.i = z2;
        boolean z3 = this.s;
        createBuilder.copyOnWrite();
        arrb arrbVar3 = (arrb) createBuilder.instance;
        arrbVar3.b |= 4;
        arrbVar3.e = z3;
        boolean z4 = this.c;
        createBuilder.copyOnWrite();
        arrb arrbVar4 = (arrb) createBuilder.instance;
        arrbVar4.b |= 16;
        arrbVar4.g = z4;
        boolean z5 = this.b;
        createBuilder.copyOnWrite();
        arrb arrbVar5 = (arrb) createBuilder.instance;
        arrbVar5.b |= 8;
        arrbVar5.f = z5;
        if (!this.t.isEmpty()) {
            ArrayList arrayList = this.t;
            createBuilder.copyOnWrite();
            arrb arrbVar6 = (arrb) createBuilder.instance;
            aony aonyVar = arrbVar6.d;
            if (!aonyVar.c()) {
                arrbVar6.d = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) arrayList, (List) arrbVar6.d);
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }

    public final void d(String str) {
        zhq.m(str);
        this.t.add(str);
    }

    public final void e() {
        this.d = true;
    }

    public final void v() {
        this.s = true;
    }
}
