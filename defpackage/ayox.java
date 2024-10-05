package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayox {
    private static final Logger b = Logger.getLogger(ayox.class.getName());
    static final axzn a = axzn.a("internal-stub-type");

    private ayox() {
    }

    public static anhy a(axzr axzrVar, Object obj) {
        ayos ayosVar = new ayos(axzrVar);
        d(axzrVar, obj, new ayow(ayosVar));
        return ayosVar;
    }

    public static aypb b(axzr axzrVar, aypb aypbVar) {
        ayor ayorVar = new ayor(axzrVar);
        e(axzrVar, new ayou(aypbVar, ayorVar));
        return ayorVar;
    }

    private static RuntimeException c(axzr axzrVar, Throwable th) {
        try {
            axzrVar.b(null, th);
        } catch (Throwable th2) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void d(axzr axzrVar, Object obj, ayot ayotVar) {
        e(axzrVar, ayotVar);
        try {
            axzrVar.e(obj);
            axzrVar.c();
        } catch (Error e) {
            throw c(axzrVar, e);
        } catch (RuntimeException e2) {
            throw c(axzrVar, e2);
        }
    }

    private static void e(axzr axzrVar, ayot ayotVar) {
        axzrVar.k(ayotVar, new aycd());
        ayotVar.w();
    }
}
