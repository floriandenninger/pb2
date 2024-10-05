package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aepz extends aaru {
    private final aone a;

    public aepz(ajoy ajoyVar, afsy afsyVar, byte[] bArr, String str, String str2, String str3, String str4, Integer num, int i, Long l, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super("player/get_drm_license", ajoyVar, afsyVar.c(), 1, true, null, null, null);
        aone createBuilder = arpd.a.createBuilder();
        this.a = createBuilder;
        k();
        boolean z = num != null;
        createBuilder.copyOnWrite();
        arpd arpdVar = (arpd) createBuilder.instance;
        str.getClass();
        arpdVar.b |= 2;
        arpdVar.d = str;
        createBuilder.copyOnWrite();
        arpd arpdVar2 = (arpd) createBuilder.instance;
        arpdVar2.e = 1;
        arpdVar2.b |= 4;
        aomf x = aomf.x((byte[]) afki.a(bArr));
        createBuilder.copyOnWrite();
        arpd arpdVar3 = (arpd) createBuilder.instance;
        arpdVar3.b |= 8;
        arpdVar3.f = x;
        afki.a(str3);
        createBuilder.copyOnWrite();
        arpd arpdVar4 = (arpd) createBuilder.instance;
        str3.getClass();
        arpdVar4.b |= 16;
        arpdVar4.g = str3;
        afki.a(str2);
        createBuilder.copyOnWrite();
        arpd arpdVar5 = (arpd) createBuilder.instance;
        str2.getClass();
        arpdVar5.b |= 32;
        arpdVar5.h = str2;
        createBuilder.copyOnWrite();
        arpd arpdVar6 = (arpd) createBuilder.instance;
        str4.getClass();
        arpdVar6.b |= 64;
        arpdVar6.i = str4;
        createBuilder.copyOnWrite();
        arpd arpdVar7 = (arpd) createBuilder.instance;
        arpdVar7.b |= 128;
        arpdVar7.j = z;
        if (z) {
            int intValue = num.intValue();
            createBuilder.copyOnWrite();
            arpd arpdVar8 = (arpd) createBuilder.instance;
            arpdVar8.b |= 256;
            arpdVar8.k = intValue;
        }
        if (i != 0) {
            createBuilder.copyOnWrite();
            arpd arpdVar9 = (arpd) createBuilder.instance;
            arpdVar9.b |= 1024;
            arpdVar9.l = true;
            createBuilder.copyOnWrite();
            arpd arpdVar10 = (arpd) createBuilder.instance;
            arpdVar10.m = i - 1;
            arpdVar10.b |= 2048;
        }
        if (l != null) {
            long longValue = l.longValue();
            createBuilder.copyOnWrite();
            arpd arpdVar11 = (arpd) createBuilder.instance;
            arpdVar11.b |= 4096;
            arpdVar11.n = longValue;
        }
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        afki.d((((arpd) this.a.instance).b & 8) != 0);
    }
}
