package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afur extends afvw {
    final /* synthetic */ long a;
    final /* synthetic */ ajyw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afur(ajyw ajywVar, String str, cnk cnkVar, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(5, str, cnkVar);
        this.b = ajywVar;
        this.a = j;
    }

    @Override // defpackage.yvo
    public final yvn i() {
        return yvn.LOW;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        String.format(Locale.US, "Prewarm took %dms (%d)", Long.valueOf(((shf) this.b.a.get()).c() - this.a), Integer.valueOf(cnhVar.a));
        return cnm.b(null, null);
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
    }
}
