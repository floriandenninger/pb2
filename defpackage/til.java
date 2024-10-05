package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class til implements thk {
    private final thk a = acqb.b;
    private final thk b;
    private final Map c;

    public til(thk thkVar, Map map) {
        this.b = thkVar;
        this.c = map;
    }

    private final thk h(tfp tfpVar) {
        if (!(tfpVar instanceof thg)) {
            return this.a;
        }
        thg thgVar = (thg) tfpVar;
        if (!thgVar.a().pY(tin.a)) {
            return this.b;
        }
        String str = ((tim) thgVar.a().pX(tin.a)).c;
        thk thkVar = (thk) this.c.get(str);
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "No config for: ".concat(valueOf);
        }
        thkVar.getClass();
        return thkVar;
    }

    @Override // defpackage.thk
    public final ammv a(tfp tfpVar) {
        return h(tfpVar).a(tfpVar);
    }

    @Override // defpackage.thk
    public final ammv b(tfp tfpVar) {
        return h(tfpVar).b(tfpVar);
    }

    @Override // defpackage.thk
    public final anhy c(tfp tfpVar, anhy anhyVar) {
        return h(tfpVar).c(tfpVar, anhyVar);
    }

    @Override // defpackage.thk
    public final anhy d(tfp tfpVar, anhy anhyVar) {
        return h(tfpVar).d(tfpVar, anhyVar);
    }

    @Override // defpackage.thk
    public final String e(tfp tfpVar) {
        return h(tfpVar).e(tfpVar);
    }

    @Override // defpackage.thk
    public final anhy f() {
        return sgf.J();
    }

    @Override // defpackage.thk
    public final void g(tfp tfpVar) {
        h(tfpVar).g(tfpVar);
    }
}
