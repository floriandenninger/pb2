package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wca extends wjn implements ypd {
    public wca(wiz wizVar, ypa ypaVar, afsy afsyVar, wjl wjlVar) {
        super(wizVar, ypaVar, afsyVar);
    }

    @Override // defpackage.wjn
    protected final void a(Activity activity, apxf apxfVar) {
        dd supportFragmentManager = ((ci) activity).getSupportFragmentManager();
        wcb wcbVar = (wcb) supportFragmentManager.f("new-fusion-sign-in-flow-fragment");
        dn k = supportFragmentManager.k();
        if (wcbVar != null) {
            wcbVar.aF(apxfVar);
            if (!wcbVar.av()) {
                k.n(wcbVar);
            }
        } else {
            k.r(wcb.aG(apxfVar), "new-fusion-sign-in-flow-fragment");
        }
        k.a();
    }

    @Override // defpackage.wjn, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != wca.class) {
            return whl.b(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{wja.class, wjc.class, aftm.class};
        }
        if (i == 0) {
            d((wja) obj);
            return null;
        }
        if (i == 1) {
            e((wjc) obj);
            return null;
        }
        if (i == 2) {
            h();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
