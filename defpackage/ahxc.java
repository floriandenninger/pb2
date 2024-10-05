package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahxc implements ahxe {
    private final List a;

    public ahxc(ahxe... ahxeVarArr) {
        this.a = Arrays.asList(ahxeVarArr);
    }

    @Override // defpackage.ahxe
    public final void b(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxe) it.next()).b(z);
        }
    }

    @Override // defpackage.ahxe
    public final void ne(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxe) it.next()).ne(z);
        }
    }

    @Override // defpackage.ahxe
    public final void pu(ahxd ahxdVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxe) it.next()).pu(ahxdVar);
        }
    }
}
