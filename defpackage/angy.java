package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angy extends AtomicReference implements Executor, Runnable {
    anha a;
    Executor b;
    Runnable c;
    Thread d;

    public angy(Executor executor, anha anhaVar) {
        super(angx.NOT_RUN);
        this.b = executor;
        this.a = anhaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == angx.CANCELLED) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            anha anhaVar = this.a;
            anhaVar.getClass();
            angz angzVar = anhaVar.a;
            if (angzVar.a == this.d) {
                this.a = null;
                amkq.N(angzVar.b == null);
                angzVar.b = runnable;
                Executor executor = this.b;
                executor.getClass();
                angzVar.c = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.d = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.d) {
            Runnable runnable = this.c;
            runnable.getClass();
            this.c = null;
            runnable.run();
            return;
        }
        angz angzVar = new angz();
        angzVar.a = currentThread;
        anha anhaVar = this.a;
        anhaVar.getClass();
        anhaVar.a = angzVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = angzVar.b;
                boolean z = true;
                boolean z2 = runnable3 != null;
                Executor executor = angzVar.c;
                if (executor == null) {
                    z = false;
                }
                if (!z || !z2) {
                    return;
                }
                angzVar.b = null;
                angzVar.c = null;
                executor.execute(runnable3);
            }
        } finally {
            angzVar.a = null;
        }
    }
}
