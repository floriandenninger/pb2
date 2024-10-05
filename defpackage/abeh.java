package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abeh extends aaru {
    public String a;
    public String b;
    public aomf c;
    public aomf d;
    public String s;
    public String t;
    public byte[] u;
    public byte[] v;
    public String w;
    public String x;
    private final String y;
    private final String z;

    public abeh(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/complete_transaction", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        this.b = "";
        this.y = "";
        this.c = aomf.b;
        this.d = aomf.b;
        this.s = "";
        this.t = "";
        this.z = "";
        this.u = aben.b;
        this.v = aben.a;
        this.w = "";
        this.x = "";
        this.k = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        asfv asfvVar = (asfv) a().build();
        boolean[] zArr = new boolean[3];
        int i = asfvVar.b;
        boolean z = false;
        zArr[0] = (i & 8) != 0;
        zArr[1] = (i & 16) != 0;
        zArr[2] = (i & 32) != 0;
        int ao = anaf.ao(zArr);
        if (ao == 1 || (ao == 0 && !asfvVar.i.isEmpty())) {
            z = true;
        }
        amkq.O(z, "More than one params field or none set. ");
    }

    @Override // defpackage.aaru
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = asfv.a.createBuilder();
        if (!TextUtils.isEmpty(this.y)) {
            String str = this.y;
            createBuilder.copyOnWrite();
            asfv asfvVar = (asfv) createBuilder.instance;
            asfvVar.b |= 2;
            asfvVar.d = str;
        }
        aomf aomfVar = this.c;
        if (aomfVar != null && !aomfVar.H()) {
            aomf aomfVar2 = this.c;
            createBuilder.copyOnWrite();
            asfv asfvVar2 = (asfv) createBuilder.instance;
            aomfVar2.getClass();
            asfvVar2.b |= 4;
            asfvVar2.e = aomfVar2;
        }
        if (!TextUtils.isEmpty(this.a)) {
            String str2 = this.a;
            createBuilder.copyOnWrite();
            asfv asfvVar3 = (asfv) createBuilder.instance;
            str2.getClass();
            asfvVar3.b |= 8;
            asfvVar3.f = str2;
        } else if (TextUtils.isEmpty(this.b)) {
            aomf aomfVar3 = this.d;
            if (aomfVar3 != null && !aomfVar3.H()) {
                aomf aomfVar4 = this.d;
                createBuilder.copyOnWrite();
                asfv asfvVar4 = (asfv) createBuilder.instance;
                aomfVar4.getClass();
                asfvVar4.b |= 32;
                asfvVar4.h = aomfVar4;
            }
        } else {
            String str3 = this.b;
            createBuilder.copyOnWrite();
            asfv asfvVar5 = (asfv) createBuilder.instance;
            str3.getClass();
            asfvVar5.b |= 16;
            asfvVar5.g = str3;
        }
        if (!TextUtils.isEmpty(this.w)) {
            String str4 = this.w;
            createBuilder.copyOnWrite();
            asfv asfvVar6 = (asfv) createBuilder.instance;
            str4.getClass();
            asfvVar6.b |= 64;
            asfvVar6.i = str4;
        }
        if (!TextUtils.isEmpty(this.s) && !TextUtils.isEmpty(this.t)) {
            aone createBuilder2 = arma.a.createBuilder();
            String str5 = this.s;
            createBuilder2.copyOnWrite();
            arma armaVar = (arma) createBuilder2.instance;
            str5.getClass();
            armaVar.b |= 2;
            armaVar.f = str5;
            String str6 = this.t;
            createBuilder2.copyOnWrite();
            arma armaVar2 = (arma) createBuilder2.instance;
            str6.getClass();
            armaVar2.b |= 4;
            armaVar2.g = str6;
            createBuilder.copyOnWrite();
            asfv asfvVar7 = (asfv) createBuilder.instance;
            arma armaVar3 = (arma) createBuilder2.build();
            armaVar3.getClass();
            asfvVar7.j = armaVar3;
            asfvVar7.b |= 128;
        }
        String str7 = this.z;
        createBuilder.copyOnWrite();
        asfv asfvVar8 = (asfv) createBuilder.instance;
        asfvVar8.b |= 1024;
        asfvVar8.m = str7;
        byte[] bArr = this.u;
        if (bArr != null) {
            aomf x = aomf.x(bArr);
            createBuilder.copyOnWrite();
            asfv asfvVar9 = (asfv) createBuilder.instance;
            asfvVar9.b |= 256;
            asfvVar9.k = x;
        }
        byte[] bArr2 = this.v;
        if (bArr2 != null) {
            aomf x2 = aomf.x(bArr2);
            createBuilder.copyOnWrite();
            asfv asfvVar10 = (asfv) createBuilder.instance;
            asfvVar10.b |= 512;
            asfvVar10.l = x2;
        }
        if (!TextUtils.isEmpty(this.x)) {
            aone createBuilder3 = apuf.a.createBuilder();
            String str8 = this.x;
            createBuilder3.copyOnWrite();
            apuf apufVar = (apuf) createBuilder3.instance;
            str8.getClass();
            apufVar.b |= 1;
            apufVar.c = str8;
            createBuilder.copyOnWrite();
            asfv asfvVar11 = (asfv) createBuilder.instance;
            apuf apufVar2 = (apuf) createBuilder3.build();
            apufVar2.getClass();
            asfvVar11.n = apufVar2;
            asfvVar11.b |= 2048;
        }
        return createBuilder;
    }
}
