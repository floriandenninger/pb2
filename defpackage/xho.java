package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xho {
    private final xhk a;
    private final afsy b;
    private final Executor c;
    private final afxf d;

    public xho(xhk xhkVar, afsy afsyVar, Executor executor, afxf afxfVar) {
        this.a = xhkVar;
        this.b = afsyVar;
        this.c = executor;
        this.d = afxfVar;
    }

    public final xhi a() {
        return new xhn(this.b, this.c, this.d, this.a, null);
    }

    public final xhi b(aamp aampVar) {
        return new xhn(this.b, this.c, this.d, this.a, aampVar);
    }

    public final xhi c(aamp aampVar) {
        return new xhn(this.b, this.c, this.d, this.a, aampVar);
    }
}
