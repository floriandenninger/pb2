package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajjg extends tby implements ajol {
    public ajjg(int i, float f) {
        super(i, f);
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        tcf tcfVar = null;
        if (!this.j.isEmpty()) {
            if (this.h == 0 && this.i == 0) {
                super.e();
            }
            int b = super.b(i);
            if (b < this.j.size()) {
                tbw tbwVar = (tbw) this.j.get(b);
                if (tbwVar.a == i) {
                    tcfVar = tbwVar.c;
                }
            }
        }
        if (tcfVar != null) {
            ajokVar.f("PresenterPreparerContextDecoratorKey", tcfVar);
        }
    }
}
