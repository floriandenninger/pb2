package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aygp {
    private ArrayList a = new ArrayList();
    private volatile ayae b = ayae.IDLE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ayae ayaeVar) {
        ayaeVar.getClass();
        if (this.b == ayaeVar || this.b == ayae.SHUTDOWN) {
            return;
        }
        this.b = ayaeVar;
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        this.a = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
