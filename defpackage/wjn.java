package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wjn implements aftn, ypd {
    protected final wiz a;
    public aftl b;
    private final afsy c;

    public wjn(wiz wizVar, ypa ypaVar, afsy afsyVar) {
        this.a = wizVar;
        this.c = afsyVar;
        ypaVar.g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apxf g(byte[] bArr) {
        aong aongVar = (aong) apxf.a.createBuilder();
        if (bArr != null) {
            aomf x = aomf.x(bArr);
            aongVar.copyOnWrite();
            apxf apxfVar = (apxf) aongVar.instance;
            apxfVar.b |= 1;
            apxfVar.c = x;
        }
        return (apxf) aongVar.build();
    }

    protected void a(Activity activity, apxf apxfVar) {
        dd supportFragmentManager = ((ci) activity).getSupportFragmentManager();
        wab wabVar = (wab) supportFragmentManager.f("new-default-sign-in-flow-fragment");
        dn k = supportFragmentManager.k();
        if (wabVar == null) {
            Bundle bundle = new Bundle();
            if (apxfVar != null) {
                bundle.putByteArray("endpoint", apxfVar.toByteArray());
            }
            wjr wjrVar = new wjr();
            wjrVar.af(bundle);
            k.r(wjrVar, "new-default-sign-in-flow-fragment");
        } else {
            wabVar.aF(apxfVar);
            if (!wabVar.av()) {
                k.n(wabVar);
            }
        }
        k.a();
    }

    @Override // defpackage.aftn
    public final void b(Activity activity, apxf apxfVar, @Deprecated aftl aftlVar) {
        apxf g = whu.g(apxfVar);
        if (activity instanceof ci) {
            aftl aftlVar2 = this.b;
            if (aftlVar2 != null) {
                aftlVar2.a();
            }
            if (aftlVar == null) {
                aftlVar = aftl.g;
            }
            this.b = aftlVar;
            afsx c = this.c.c();
            if (wbs.e(c)) {
                return;
            }
            if (c.g()) {
                wbs.h(((ci) activity).getSupportFragmentManager(), new afsp() { // from class: wjm
                    @Override // defpackage.afsp
                    public final void a() {
                        aftl aftlVar3 = wjn.this.b;
                        if (aftlVar3 != null) {
                            aftlVar3.b();
                        }
                    }
                }, g);
                return;
            } else {
                a(activity, g);
                return;
            }
        }
        String name = getClass().getName();
        String name2 = ci.class.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 15 + String.valueOf(name2).length());
        sb.append(name);
        sb.append(" only supports ");
        sb.append(name2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aftn
    public final void c(Activity activity, byte[] bArr, @Deprecated aftl aftlVar) {
        b(activity, g(bArr), aftlVar);
    }

    public final void d(wja wjaVar) {
        aftl aftlVar = this.b;
        if (aftlVar != null) {
            aftlVar.c(wjaVar.a());
            this.b = null;
        }
    }

    public final void e(wjc wjcVar) {
        aftl aftlVar;
        if (wjcVar.a() != wjb.CANCELLED || (aftlVar = this.b) == null) {
            return;
        }
        aftlVar.a();
        this.b = null;
    }

    public final void h() {
        aftl aftlVar = this.b;
        if (aftlVar != null) {
            aftlVar.b();
            this.b = null;
        }
    }

    public Class[] kz(Class cls, Object obj, int i) {
        return whl.b(this, obj, i);
    }

    @Override // defpackage.aftn
    public final void qj(String str) {
        this.a.k(str);
    }
}
