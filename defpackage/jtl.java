package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtl extends jsn {
    private final Context a;
    private final azrw b;
    private final shf c;
    private final axzf d;

    public jtl(Context context, azrw azrwVar, axzf axzfVar, shf shfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(agnv.class, aqdb.class);
        this.a = context;
        this.b = azrwVar;
        this.d = axzfVar;
        this.c = shfVar;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        apxf Y;
        agnv agnvVar = (agnv) obj;
        Integer num = (Integer) e(amrzVar, "downloads_page_item_index");
        acrb acrbVar = (acrb) e(amrzVar, "downloads_page_item_ve_type");
        jti jtiVar = (jti) this.b.get();
        boolean z = amrzVar != null && ((Boolean) amrzVar.getOrDefault("is_candidate_video", false)).booleanValue();
        avgg k = agnvVar.k();
        aong aongVar = (aong) aqdb.a.createBuilder();
        aqyg g = ajcq.g(agnvVar.o(this.a));
        aongVar.copyOnWrite();
        aqdb aqdbVar = (aqdb) aongVar.instance;
        g.getClass();
        aqdbVar.e = g;
        aqdbVar.b |= 4;
        aqyg g2 = ajcq.g(agnvVar.n());
        aongVar.copyOnWrite();
        aqdb aqdbVar2 = (aqdb) aongVar.instance;
        g2.getClass();
        aqdbVar2.k = g2;
        aqdbVar2.b |= 2048;
        if (k == null) {
            k = avgg.a;
        }
        aongVar.copyOnWrite();
        aqdb aqdbVar3 = (aqdb) aongVar.instance;
        k.getClass();
        aqdbVar3.d = k;
        aqdbVar3.b |= 2;
        if (z) {
            Y = mcy.Y(agnvVar, true, 0.0f, 0, "");
        } else {
            Y = mcy.Y(agnvVar, false, mcy.U(agnvVar.f(), agnvVar.h), 0, "PPSV");
        }
        aong aongVar2 = (aong) Y.toBuilder();
        aonk aonkVar = atmb.b;
        aone createBuilder = atmc.a.createBuilder();
        int intValue = num.intValue();
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 4;
        atmcVar.e = intValue;
        int i = acrbVar.Jk;
        createBuilder.copyOnWrite();
        atmc atmcVar2 = (atmc) createBuilder.instance;
        atmcVar2.b |= 2;
        atmcVar2.d = i;
        aongVar2.e(aonkVar, (atmc) createBuilder.build());
        aongVar.copyOnWrite();
        aqdb aqdbVar4 = (aqdb) aongVar.instance;
        apxf apxfVar = (apxf) aongVar2.build();
        apxfVar.getClass();
        aqdbVar4.m = apxfVar;
        aqdbVar4.b |= 4096;
        aone createBuilder2 = atdf.a.createBuilder();
        aone createBuilder3 = atdc.a.createBuilder();
        aone createBuilder4 = atda.a.createBuilder();
        atde e = jtiVar.e(agnvVar, null);
        e.getClass();
        createBuilder4.copyOnWrite();
        atda atdaVar = (atda) createBuilder4.instance;
        atdaVar.d = e;
        atdaVar.b |= 2;
        createBuilder3.aE(createBuilder4);
        createBuilder2.copyOnWrite();
        atdf atdfVar = (atdf) createBuilder2.instance;
        atdc atdcVar = (atdc) createBuilder3.build();
        atdcVar.getClass();
        atdfVar.c = atdcVar;
        atdfVar.b |= 1;
        aongVar.copyOnWrite();
        aqdb aqdbVar5 = (aqdb) aongVar.instance;
        atdf atdfVar2 = (atdf) createBuilder2.build();
        atdfVar2.getClass();
        aqdbVar5.v = atdfVar2;
        aqdbVar5.b |= 134217728;
        aone createBuilder5 = avwi.a.createBuilder();
        String m = agnvVar.m();
        createBuilder5.copyOnWrite();
        avwi avwiVar = (avwi) createBuilder5.instance;
        m.getClass();
        avwiVar.b |= 1;
        avwiVar.c = m;
        aongVar.copyOnWrite();
        aqdb aqdbVar6 = (aqdb) aongVar.instance;
        avwi avwiVar2 = (avwi) createBuilder5.build();
        avwiVar2.getClass();
        aqdbVar6.u = avwiVar2;
        aqdbVar6.b |= 2097152;
        aone createBuilder6 = avfv.a.createBuilder();
        avfs avfsVar = avfs.a;
        createBuilder6.copyOnWrite();
        avfv avfvVar = (avfv) createBuilder6.instance;
        avfsVar.getClass();
        avfvVar.l = avfsVar;
        avfvVar.b |= 32768;
        aongVar.cv(createBuilder6);
        if (this.d.l()) {
            ammv ai = mcy.ai(agnvVar, z, this.c, mcy.U(agnvVar.f(), agnvVar.h), 0, "PPSV");
            if (ai.h()) {
                aong aongVar3 = (aong) ((apxf) ai.c()).toBuilder();
                aonk aonkVar2 = atmb.b;
                aone createBuilder7 = atmc.a.createBuilder();
                int intValue2 = num.intValue();
                createBuilder7.copyOnWrite();
                atmc atmcVar3 = (atmc) createBuilder7.instance;
                atmcVar3.b |= 4;
                atmcVar3.e = intValue2;
                int i2 = acrbVar.Jk;
                createBuilder7.copyOnWrite();
                atmc atmcVar4 = (atmc) createBuilder7.instance;
                atmcVar4.b |= 2;
                atmcVar4.d = i2;
                aongVar3.e(aonkVar2, (atmc) createBuilder7.build());
                aongVar.copyOnWrite();
                aqdb aqdbVar7 = (aqdb) aongVar.instance;
                apxf apxfVar2 = (apxf) aongVar3.build();
                apxfVar2.getClass();
                aqdbVar7.m = apxfVar2;
                aqdbVar7.b |= 4096;
            }
        }
        if (agnvVar.j() != null) {
            aone createBuilder8 = aqda.a.createBuilder();
            atsb j = agnvVar.j();
            j.getClass();
            createBuilder8.copyOnWrite();
            aqda aqdaVar = (aqda) createBuilder8.instance;
            aqdaVar.c = j;
            aqdaVar.b |= 1;
            aongVar.copyOnWrite();
            aqdb aqdbVar8 = (aqdb) aongVar.instance;
            aqda aqdaVar2 = (aqda) createBuilder8.build();
            aqdaVar2.getClass();
            aqdbVar8.t = aqdaVar2;
            aqdbVar8.b |= 1048576;
        }
        if (!z) {
            long f = agnvVar.f();
            long j2 = agnvVar.h;
            aone createBuilder9 = avfv.a.createBuilder();
            aone createBuilder10 = avft.a.createBuilder();
            createBuilder10.copyOnWrite();
            avft avftVar = (avft) createBuilder10.instance;
            avftVar.b |= 1;
            avftVar.c = mcy.V(f, j2);
            createBuilder9.copyOnWrite();
            avfv avfvVar2 = (avfv) createBuilder9.instance;
            avft avftVar2 = (avft) createBuilder10.build();
            avftVar2.getClass();
            avfvVar2.f = avftVar2;
            avfvVar2.b |= 128;
            aongVar.cv(createBuilder9);
        }
        agnb h = agnvVar.h();
        if (h != null) {
            aqyg g3 = ajcq.g(h.b);
            aongVar.copyOnWrite();
            aqdb aqdbVar9 = (aqdb) aongVar.instance;
            g3.getClass();
            aqdbVar9.f = g3;
            aqdbVar9.b |= 16;
            avgg e2 = h.c.e();
            aongVar.copyOnWrite();
            aqdb aqdbVar10 = (aqdb) aongVar.instance;
            e2.getClass();
            aqdbVar10.h = e2;
            aqdbVar10.b |= 64;
        }
        return (aqdb) aongVar.build();
    }
}
