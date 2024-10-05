package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ailk extends aild implements ypd {
    private final afsy a;
    private final azrw e;
    private final aili f;

    public ailk(Context context, aifs aifsVar, afsy afsyVar, azrw azrwVar, aili ailiVar) {
        super(context, aifsVar);
        afsyVar.getClass();
        this.a = afsyVar;
        azrwVar.getClass();
        this.e = azrwVar;
        this.f = ailiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aild
    public final void b(aryi aryiVar, ykl yklVar, String str) {
        ailf j = j();
        if (j == null) {
            aile.a(yklVar, h(aryiVar, str));
        } else {
            ((aftn) this.e.get()).c(j.a(), null, new ailj(this, aryiVar, yklVar, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aild
    public final void e() {
        if (this.a.t()) {
            this.f.e(this.a.c(), true);
        }
    }

    public final void g() {
        anhy O;
        if (this.a.t()) {
            O = this.f.a(this.a.c());
        } else {
            O = anaf.O(false);
        }
        this.b = O;
        this.c = false;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            g();
            return null;
        }
        if (i == 1) {
            g();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
