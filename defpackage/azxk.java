package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azxk extends azwe implements azww, azxe {
    public azxo b;

    @Override // defpackage.azww
    public final void d() {
        Object p;
        azxo e = e();
        do {
            p = e.p();
            if (!(p instanceof azxk)) {
                if (!(p instanceof azxe) || ((azxe) p).sp() == null) {
                    return;
                }
                m();
                return;
            }
            if (p != this) {
                return;
            }
        } while (!e.c.c(p, azxp.f));
    }

    public final azxo e() {
        azxo azxoVar = this.b;
        if (azxoVar != null) {
            return azxoVar;
        }
        azse azseVar = new azse(null);
        azul.e(azseVar, azul.class.getName());
        throw azseVar;
    }

    @Override // defpackage.azxe
    public final azxr sp() {
        return null;
    }

    @Override // defpackage.azxe
    public final boolean sq() {
        return true;
    }

    @Override // defpackage.azzt
    public final String toString() {
        return azth.g(this) + '@' + azth.h(this) + "[job@" + azth.h(e()) + ']';
    }
}
