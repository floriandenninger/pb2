package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduf implements ypd {
    final /* synthetic */ adul a;

    public aduf(adul adulVar) {
        this.a = adulVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        int i2 = 2;
        if (i == -1) {
            return new Class[]{adjb.class, adlg.class};
        }
        if (i == 0) {
            if (((adjb) obj) != adjb.CONNECTED_ONLY) {
                return null;
            }
            this.a.h(0, 0);
            adul adulVar = this.a;
            adua b = adulVar.i.b();
            b.d = null;
            adulVar.m(b);
            return null;
        }
        if (i == 1) {
            adul adulVar2 = this.a;
            adlf a = ((adlg) obj).a();
            if (a == adlf.UNSTARTED) {
                i2 = 0;
            } else if (!a.b()) {
                i2 = 1;
            }
            adulVar2.f(i2);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
