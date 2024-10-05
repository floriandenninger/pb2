package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dnp extends dns {
    private final dnn a;
    private final dos b;

    public dnp(dnn dnnVar, dos dosVar) {
        this.a = dnnVar;
        this.b = dosVar;
    }

    @Override // defpackage.dni
    public final void b(ArrayList arrayList) {
        arrayList.add(this.a);
    }

    @Override // defpackage.dns
    protected final void k(dmp dmpVar) {
        don donVar = new don(this.b);
        dof dofVar = new dof(dmpVar.a(this.a.a));
        dof dofVar2 = new dof(this.a.b);
        m(dofVar, donVar, "initial");
        m(dofVar2, donVar, "end");
        l(donVar, dmpVar.b(this.a.a));
    }
}
