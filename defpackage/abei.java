package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abei extends aaru {
    public String a;
    public long b;
    public avit c;
    public String d;
    public aone s;
    private String t;

    public abei(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/get_cart", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        this.t = "";
        this.d = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        boolean[] zArr = new boolean[5];
        int i = ((asfx) a().build()).b;
        zArr[0] = (i & 2) != 0;
        zArr[1] = (i & 8) != 0;
        zArr[2] = (i & 16) != 0;
        zArr[3] = (i & 32) != 0;
        zArr[4] = (i & 128) != 0;
        amkq.N(anaf.ao(zArr) == 1);
    }

    public final void d(byte[] bArr) {
        if (this.s == null) {
            this.s = apmu.a.createBuilder();
        }
        aone aoneVar = this.s;
        aomf x = aomf.x(bArr);
        aoneVar.copyOnWrite();
        apmu apmuVar = (apmu) aoneVar.instance;
        apmu apmuVar2 = apmu.a;
        apmuVar.b |= 1;
        apmuVar.e = x;
    }

    public final void e(String str) {
        this.t = i(str);
    }

    @Override // defpackage.aaru
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = asfx.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            asfx asfxVar = (asfx) createBuilder.instance;
            str.getClass();
            asfxVar.b |= 2;
            asfxVar.d = str;
        } else if (!TextUtils.isEmpty(this.t)) {
            long j = this.b;
            createBuilder.copyOnWrite();
            asfx asfxVar2 = (asfx) createBuilder.instance;
            asfxVar2.b |= 4;
            asfxVar2.e = j;
            String str2 = this.t;
            createBuilder.copyOnWrite();
            asfx asfxVar3 = (asfx) createBuilder.instance;
            str2.getClass();
            asfxVar3.b |= 8;
            asfxVar3.f = str2;
        }
        aone aoneVar = this.s;
        if (aoneVar != null) {
            createBuilder.copyOnWrite();
            asfx asfxVar4 = (asfx) createBuilder.instance;
            apmu apmuVar = (apmu) aoneVar.build();
            apmuVar.getClass();
            asfxVar4.g = apmuVar;
            asfxVar4.b |= 32;
        }
        avit avitVar = this.c;
        if (avitVar != null) {
            createBuilder.copyOnWrite();
            asfx asfxVar5 = (asfx) createBuilder.instance;
            asfxVar5.h = avitVar;
            asfxVar5.b |= 64;
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str3 = this.d;
            createBuilder.copyOnWrite();
            asfx asfxVar6 = (asfx) createBuilder.instance;
            str3.getClass();
            asfxVar6.b |= 128;
            asfxVar6.i = str3;
        }
        return createBuilder;
    }
}
