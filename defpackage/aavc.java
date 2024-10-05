package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavc extends aaru {
    public String a;
    public String b;
    public String c;
    private final afsy d;

    public aavc(ajoy ajoyVar, afsy afsyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("channel_edit/validate_channel_handle", ajoyVar, afsyVar.c(), null, null, null);
        this.d = afsyVar;
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asee.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asee aseeVar = (asee) createBuilder.instance;
        str.getClass();
        aseeVar.b |= 2;
        aseeVar.d = str;
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            asee aseeVar2 = (asee) createBuilder.instance;
            str2.getClass();
            aseeVar2.b |= 4;
            aseeVar2.e = str2;
        }
        String str3 = this.c;
        createBuilder.copyOnWrite();
        asee aseeVar3 = (asee) createBuilder.instance;
        str3.getClass();
        aseeVar3.b |= 8;
        aseeVar3.f = str3;
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(this.d.t());
        amkq.N(!TextUtils.isEmpty(this.a));
        amkq.N(!TextUtils.isEmpty(this.c));
    }
}
