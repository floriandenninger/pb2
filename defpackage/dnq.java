package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dnq extends dns {
    private final int a;
    private final dnn b;
    private final Interpolator c;

    public dnq(int i, dnn dnnVar, Interpolator interpolator) {
        this.a = i;
        this.b = dnnVar;
        this.c = interpolator;
    }

    @Override // defpackage.dni
    public final void b(ArrayList arrayList) {
        arrayList.add(this.b);
    }

    @Override // defpackage.dns
    protected final void k(dmp dmpVar) {
        doo dooVar = new doo(this.a);
        dof dofVar = new dof(dmpVar.a(this.b.a));
        dof dofVar2 = new dof(this.b.b);
        dol dolVar = new dol();
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            dok dokVar = new dok(interpolator);
            l(dooVar, dokVar);
            l(dokVar, dolVar);
        } else {
            l(dooVar, dolVar);
        }
        m(dofVar, dolVar, "initial");
        m(dofVar2, dolVar, "end");
        l(dolVar, dmpVar.b(this.b.a));
    }
}
