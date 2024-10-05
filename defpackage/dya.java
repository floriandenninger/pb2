package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dya {
    public dxz a;
    public dxz b;
    public final List c;

    public dya() {
        this.a = new dxz("", 0L, null);
        this.b = new dxz("", 0L, null);
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        dya dyaVar = new dya(this.a.clone());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            dyaVar.c.add(((dxz) it.next()).clone());
        }
        return dyaVar;
    }

    public dya(dxz dxzVar) {
        this.a = dxzVar;
        this.b = dxzVar.clone();
        this.c = new ArrayList();
    }
}
