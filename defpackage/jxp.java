package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jxp implements ykl {
    final /* synthetic */ jxq a;
    private final /* synthetic */ int b;

    public jxp(jxq jxqVar, int i) {
        this.b = i;
        this.a = jxqVar;
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void a(Object obj, Exception exc) {
        if (this.b != 0) {
        }
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void b(Object obj, Object obj2) {
        if (this.b == 0) {
            Future future = this.a.k;
            if (future == null || future.isCancelled() || !"PPSV".equals(this.a.i)) {
                this.a.k = null;
                return;
            } else {
                jxq jxqVar = this.a;
                jxqVar.b(jxqVar.c.a());
                return;
            }
        }
        String str = (String) obj;
        agni agniVar = (agni) obj2;
        Future future2 = this.a.k;
        if (future2 == null || future2.isCancelled() || !str.equals(this.a.i)) {
            this.a.k = null;
        } else if (agniVar != null) {
            jxq jxqVar2 = this.a;
            jxqVar2.b(jxqVar2.c.b(((agof) jxqVar2.d.get()).a().i().d(str)));
        }
    }
}
