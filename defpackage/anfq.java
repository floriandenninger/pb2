package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anfq extends anhb implements Runnable {
    anhy a;
    Object b;

    public anfq(anhy anhyVar, Object obj) {
        anhyVar.getClass();
        this.a = anhyVar;
        obj.getClass();
        this.b = obj;
    }

    public static anhy h(anhy anhyVar, amml ammlVar, Executor executor) {
        ammlVar.getClass();
        anfp anfpVar = new anfp(anhyVar, ammlVar);
        anhyVar.d(anfpVar, anaf.F(executor, anfpVar));
        return anfpVar;
    }

    public static anhy i(anhy anhyVar, anfz anfzVar, Executor executor) {
        executor.getClass();
        anfo anfoVar = new anfo(anhyVar, anfzVar);
        anhyVar.d(anfoVar, anaf.F(executor, anfoVar));
        return anfoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final String b() {
        String str;
        anhy anhyVar = this.a;
        Object obj = this.b;
        String b = super.b();
        if (anhyVar != null) {
            String valueOf = String.valueOf(anhyVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj == null) {
            if (b == null) {
                return null;
            }
            String valueOf2 = String.valueOf(str);
            return b.length() != 0 ? valueOf2.concat(b) : new String(valueOf2);
        }
        String valueOf3 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf3).length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(valueOf3);
        sb2.append("]");
        return sb2.toString();
    }

    public abstract Object f(Object obj, Object obj2);

    public abstract void g(Object obj);

    @Override // defpackage.anfm
    protected final void qf() {
        n(this.a);
        this.a = null;
        this.b = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        anhy anhyVar = this.a;
        Object obj = this.b;
        if ((isCancelled() | (anhyVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (anhyVar.isCancelled()) {
            qK(anhyVar);
            return;
        }
        try {
            try {
                Object f = f(obj, anaf.W(anhyVar));
                this.b = null;
                g(f);
            } catch (Throwable th) {
                try {
                    e(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            e(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            e(e2);
        } catch (ExecutionException e3) {
            e(e3.getCause());
        }
    }
}
