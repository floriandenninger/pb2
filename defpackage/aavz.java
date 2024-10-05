package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavz extends aaru {
    public String a;
    public String b;
    private final String c;
    private String d;

    public aavz(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("comment/create_comment_reply", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        this.c = "";
        this.d = "";
        this.b = "";
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arlx.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            arlx arlxVar = (arlx) createBuilder.instance;
            arlxVar.b |= 2;
            arlxVar.f = str;
        }
        String str2 = this.c;
        createBuilder.copyOnWrite();
        arlx arlxVar2 = (arlx) createBuilder.instance;
        arlxVar2.b |= 8;
        arlxVar2.h = str2;
        String str3 = this.d;
        createBuilder.copyOnWrite();
        arlx arlxVar3 = (arlx) createBuilder.instance;
        str3.getClass();
        arlxVar3.b |= 4;
        arlxVar3.g = str3;
        if (!TextUtils.isEmpty(this.b)) {
            aone createBuilder2 = arln.a.createBuilder();
            String str4 = this.b;
            createBuilder2.copyOnWrite();
            arln arlnVar = (arln) createBuilder2.instance;
            str4.getClass();
            arlnVar.b |= 1;
            arlnVar.c = str4;
            createBuilder.copyOnWrite();
            arlx arlxVar4 = (arlx) createBuilder.instance;
            arln arlnVar2 = (arln) createBuilder2.build();
            arlnVar2.getClass();
            arlxVar4.d = arlnVar2;
            arlxVar4.c = 7;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        String valueOf = String.valueOf(this.a);
        String str = this.c;
        zhq.m(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
        zhq.m(this.d);
    }

    public final void d(String str) {
        this.d = i(str);
    }
}
