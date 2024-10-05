package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ris implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ rjj c;

    public ris(rjj rjjVar, AtomicReference atomicReference, AppMetadata appMetadata) {
        this.c = rjjVar;
        this.a = atomicReference;
        this.b = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.a) {
            try {
                try {
                } catch (RemoteException e) {
                    this.c.aF().c.b("Failed to get app instance id", e);
                    atomicReference = this.a;
                }
                if (!this.c.M().b().h()) {
                    this.c.aF().h.a("Analytics storage consent denied; will not get app instance id");
                    this.c.j().B(null);
                    this.c.M().f.b(null);
                    this.a.set(null);
                    return;
                }
                rjj rjjVar = this.c;
                rfg rfgVar = rjjVar.c;
                if (rfgVar == null) {
                    rjjVar.aF().c.a("Failed to get app instance id");
                    return;
                }
                this.a.set(rfgVar.a(this.b));
                String str = (String) this.a.get();
                if (str != null) {
                    this.c.j().B(str);
                    this.c.M().f.b(str);
                }
                this.c.t();
                atomicReference = this.a;
                atomicReference.notify();
            } finally {
                this.a.notify();
            }
        }
    }
}
