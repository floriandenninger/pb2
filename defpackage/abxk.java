package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abxk extends aaru {
    public String a;
    public String b;
    public long c;
    public int d;
    public int s;

    public abxk(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live/create_livestream_highlight_clip", ajoyVar, afsxVar, 1, true, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        aone createBuilder = arod.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            arod arodVar = (arod) createBuilder.instance;
            str.getClass();
            arodVar.b |= 8;
            arodVar.f = str;
        }
        aone createBuilder2 = arog.a.createBuilder();
        int i = this.s;
        if (i != 0) {
            createBuilder2.copyOnWrite();
            arog arogVar = (arog) createBuilder2.instance;
            arogVar.c = i - 1;
            arogVar.b |= 1;
        }
        if (TextUtils.isEmpty(null)) {
            createBuilder.copyOnWrite();
            arod arodVar2 = (arod) createBuilder.instance;
            arog arogVar2 = (arog) createBuilder2.build();
            arogVar2.getClass();
            arodVar2.e = arogVar2;
            arodVar2.b |= 4;
            if (!TextUtils.isEmpty(this.b)) {
                String str2 = this.b;
                createBuilder.copyOnWrite();
                arod arodVar3 = (arod) createBuilder.instance;
                str2.getClass();
                arodVar3.b |= 16;
                arodVar3.g = str2;
            }
            aone createBuilder3 = aroj.a.createBuilder();
            aone createBuilder4 = aroh.a.createBuilder();
            aone createBuilder5 = aoms.a.createBuilder();
            long j = this.c;
            createBuilder5.copyOnWrite();
            ((aoms) createBuilder5.instance).b = j;
            int i2 = this.d;
            createBuilder5.copyOnWrite();
            ((aoms) createBuilder5.instance).c = i2;
            createBuilder4.copyOnWrite();
            aroh arohVar = (aroh) createBuilder4.instance;
            aoms aomsVar = (aoms) createBuilder5.build();
            aomsVar.getClass();
            arohVar.c = aomsVar;
            arohVar.b |= 1;
            createBuilder3.copyOnWrite();
            aroj arojVar = (aroj) createBuilder3.instance;
            aroh arohVar2 = (aroh) createBuilder4.build();
            arohVar2.getClass();
            arojVar.c = arohVar2;
            arojVar.b = 2;
            createBuilder.copyOnWrite();
            arod arodVar4 = (arod) createBuilder.instance;
            aroj arojVar2 = (aroj) createBuilder3.build();
            arojVar2.getClass();
            aony aonyVar = arodVar4.d;
            if (!aonyVar.c()) {
                arodVar4.d = aonm.mutableCopy(aonyVar);
            }
            arodVar4.d.add(arojVar2);
            aone createBuilder6 = arof.a.createBuilder();
            if (TextUtils.isEmpty(null)) {
                if (TextUtils.isEmpty(null)) {
                    createBuilder.copyOnWrite();
                    arod arodVar5 = (arod) createBuilder.instance;
                    arof arofVar = (arof) createBuilder6.build();
                    arofVar.getClass();
                    arodVar5.h = arofVar;
                    arodVar5.b |= 32;
                    return createBuilder;
                }
                createBuilder6.copyOnWrite();
                throw null;
            }
            createBuilder6.copyOnWrite();
            throw null;
        }
        createBuilder2.copyOnWrite();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(!TextUtils.isEmpty(this.a));
        amkq.N(this.c >= 0);
        amkq.N(this.d >= 0);
        amkq.N(this.c + ((long) this.d) > 0);
    }
}
