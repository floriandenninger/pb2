package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class tir extends tfz {
    final /* synthetic */ tis a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tir(tis tisVar, awxk awxkVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(awxkVar, null, null, null, null, null);
        this.a = tisVar;
    }

    @Deprecated
    public final void a(Object obj) {
        amkq.N(this.a.a.get(obj) == null);
        tgb f = f(this.a.b.e);
        f.a = new tit(f);
        this.a.a.put(obj, f);
        this.a.b.a.d(f);
    }
}
