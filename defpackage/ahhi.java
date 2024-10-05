package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahhi extends ahio implements Iterable {
    private ahim c;
    private final String b = getClass().getSimpleName();
    private final LinkedList a = new LinkedList();
    public boolean d = false;

    @Override // defpackage.ahim
    public void i() {
        String valueOf = String.valueOf(this.b);
        if (valueOf.length() != 0) {
            "Shutting down renderer on ".concat(valueOf);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahim) it.next()).i();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // defpackage.ahim
    public void l(float f, float f2, float f3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahim) it.next()).l(f, f2, f3);
        }
    }

    public final void n(ahim ahimVar) {
        o(this.a.size(), ahimVar);
    }

    public final void o(int i, ahim ahimVar) {
        if (this.a.contains(ahimVar)) {
            String str = this.b;
            String simpleName = ahimVar.getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(simpleName).length());
            sb.append(str);
            sb.append(" NOT adding child - already has been added ");
            sb.append(simpleName);
            zga.l(sb.toString());
            return;
        }
        String str2 = this.b;
        String simpleName2 = ahimVar.getClass().getSimpleName();
        String.valueOf(str2).length();
        String.valueOf(simpleName2).length();
        this.a.add(i, ahimVar);
        ahimVar.u(this);
    }

    @Override // defpackage.ahim
    public void p(ahjq ahjqVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahim) it.next()).p(ahjqVar);
        }
    }

    @Override // defpackage.ahim
    public void q(ahjq ahjqVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahim) it.next()).q(ahjqVar);
        }
    }

    @Override // defpackage.ahim
    public void qC(ahko ahkoVar) {
        if (v()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ahim ahimVar = (ahim) it.next();
            if (!ahimVar.v()) {
                ahimVar.qC(ahkoVar);
            }
        }
    }

    @Override // defpackage.ahim
    public void qD(boolean z, ahjq ahjqVar) {
        ahim ahimVar = this.c;
        ahim ahimVar2 = null;
        if (ahimVar != null) {
            ahimVar.qD(false, ahjqVar);
            this.c = null;
        }
        if (z) {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ahim ahimVar3 = (ahim) it.next();
                if (!ahimVar3.v() && ahimVar3.r(ahjqVar)) {
                    ahimVar2 = ahimVar3;
                    break;
                }
            }
            this.c = ahimVar2;
            if (ahimVar2 != null) {
                ahimVar2.qD(true, ahjqVar);
            }
        }
    }

    @Override // defpackage.ahim
    public boolean r(ahjq ahjqVar) {
        if (v()) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ahim ahimVar = (ahim) it.next();
            if (!ahimVar.v() && ahimVar.r(ahjqVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean s() {
        return this.c != null;
    }
}
