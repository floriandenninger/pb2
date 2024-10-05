package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aapo implements ypd {
    public final Executor a;
    public final afsm b;

    public aapo(Executor executor, afsm afsmVar) {
        executor.getClass();
        this.a = executor;
        afsmVar.getClass();
        this.b = afsmVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aapl.class};
        }
        if (i == 0) {
            aapl aaplVar = (aapl) obj;
            if (aaplVar.a() == null) {
                this.b.f();
                return null;
            }
            this.a.execute(new aapn(this, aaplVar));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
