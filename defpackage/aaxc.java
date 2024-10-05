package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaxc extends aaru {
    public String a;
    public String b;
    public boolean c;
    public arqi d;
    public arqm s;
    public int t;

    public aaxc(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("flag/flag", ajoyVar, afsxVar, null, null, null);
        this.t = 1;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arqg.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            arqg arqgVar = (arqg) createBuilder.instance;
            str.getClass();
            arqgVar.b |= 2;
            arqgVar.d = str;
        }
        int i = this.t;
        if (i != 0) {
            createBuilder.copyOnWrite();
            arqg arqgVar2 = (arqg) createBuilder.instance;
            arqgVar2.e = i - 1;
            arqgVar2.b |= 4;
        }
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            arqg arqgVar3 = (arqg) createBuilder.instance;
            str2.getClass();
            arqgVar3.b |= 8;
            arqgVar3.f = str2;
        }
        boolean z = this.c;
        createBuilder.copyOnWrite();
        arqg arqgVar4 = (arqg) createBuilder.instance;
        arqgVar4.b |= 16;
        arqgVar4.g = z;
        arqi arqiVar = this.d;
        if (arqiVar != null) {
            createBuilder.copyOnWrite();
            arqg arqgVar5 = (arqg) createBuilder.instance;
            arqgVar5.h = arqiVar;
            arqgVar5.b |= 512;
        }
        arqm arqmVar = this.s;
        if (arqmVar != null) {
            createBuilder.copyOnWrite();
            arqg arqgVar6 = (arqg) createBuilder.instance;
            arqgVar6.i = arqmVar;
            arqgVar6.b |= 1024;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(!ammx.e(this.a));
    }
}
