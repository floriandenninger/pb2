package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jle implements ypd {
    public final Executor a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public Future c;
    private final azrw d;
    private final juy e;

    public jle(azrw azrwVar, Executor executor, juy juyVar) {
        this.d = azrwVar;
        this.a = executor;
        this.e = juyVar;
    }

    public final void a() {
        int i = 1;
        if (((agzz) this.d.get()).a() != 1) {
            return;
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
            this.c = null;
        }
        juy juyVar = this.e;
        this.c = juyVar.d.submit(new jut(juyVar, new jld(this), i));
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agkl.class, agko.class};
        }
        if (i == 0) {
            a();
            return null;
        }
        if (i == 1) {
            a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
