package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpq {
    public final ArrayDeque a = new ArrayDeque();
    final /* synthetic */ cps b;

    public cpq(cps cpsVar) {
        this.b = cpsVar;
    }

    public final synchronized cpp a(cvo cvoVar) {
        cpp cppVar;
        cppVar = (cpp) this.a.poll();
        if (cppVar == null) {
            cppVar = new cpp(this.b);
        }
        System.currentTimeMillis();
        cppVar.b = cvoVar;
        return cppVar;
    }
}
