package defpackage;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aews extends aewz {
    final Set a;
    final aewr b;

    public aews(Set set, aewr aewrVar) {
        this.a = set;
        this.b = aewrVar;
    }

    @Override // defpackage.aewz, defpackage.bjc
    public final void t(pth pthVar, int i) {
        try {
            Set set = this.a;
            EventMessage c = ppe.c(pthVar);
            aesh aeshVar = (set.isEmpty() || set.contains(c.a)) ? new aesh(c.a, aesh.e(new pth(c.e))) : null;
            if (aeshVar != null) {
                this.b.i(aeshVar);
            }
        } catch (IOException e) {
            this.b.j(e);
        }
    }
}
