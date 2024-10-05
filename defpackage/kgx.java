package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgx extends ahsh implements ypd {
    final /* synthetic */ kgy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgx(kgy kgyVar) {
        super(kgyVar);
        this.a = kgyVar;
    }

    @Override // defpackage.ahsh
    public final void a(ahee aheeVar) {
        kgy kgyVar = this.a;
        boolean z = kgyVar.d;
        boolean z2 = aheeVar.a;
        if (z == z2) {
            return;
        }
        kgyVar.d = z2;
        kgyVar.c();
    }

    @Override // defpackage.ahsh, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != kgx.class) {
            return ahbw.a(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{ahee.class};
        }
        if (i == 0) {
            a((ahee) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
