package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afpy implements cnk {
    private final cnk a;
    private final afqn b;

    public afpy(cnk cnkVar, afqn afqnVar) {
        cnkVar.getClass();
        this.a = cnkVar;
        this.b = afqnVar;
    }

    @Override // defpackage.cnk
    public final void kY(final cnq cnqVar) {
        this.a.kY(cnqVar);
        if (cnqVar.b != null) {
            ynm.i(this.b.c(), new ynl() { // from class: afpx
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    cnq cnqVar2 = cnq.this;
                    if (((Boolean) obj).booleanValue()) {
                        zga.g(String.format(Locale.US, "Full response from error: %s", new String(cnqVar2.b.b)));
                    }
                }
            });
        }
    }
}
