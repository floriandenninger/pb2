package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afux implements afve {
    private final owe a;

    public afux(owe oweVar) {
        this.a = oweVar;
    }

    @Override // defpackage.afve
    public final boolean a(asuq asuqVar) {
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next()).intValue() == asuqVar.g) {
                return true;
            }
        }
        return false;
    }
}
