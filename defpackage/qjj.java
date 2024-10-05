package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjj {
    public final /* synthetic */ qjk a;

    public qjj(qjk qjkVar) {
        this.a = qjkVar;
    }

    public final void a(int[] iArr) {
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            ((qip) it.next()).a(iArr);
        }
    }
}
