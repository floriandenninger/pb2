package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ztx extends yvo {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ ztz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztx(ztz ztzVar, String str, cnk cnkVar, String str2, String str3) {
        super(1, str, cnkVar);
        this.c = ztzVar;
        this.a = str2;
        this.b = str3;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        return cnm.b(cnhVar.b, null);
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
        byte[] bArr = (byte[]) obj;
        String valueOf = String.valueOf(this.a);
        if (valueOf.length() != 0) {
            "Asset fetched: ".concat(valueOf);
        }
        new ztw(this, bArr).execute(new Void[0]);
    }
}
