package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rjc implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMetadata d;
    final /* synthetic */ rjj e;

    public rjc(rjj rjjVar, AtomicReference atomicReference, String str, String str2, AppMetadata appMetadata) {
        this.e = rjjVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        rjj rjjVar;
        rfg rfgVar;
        synchronized (this.a) {
            try {
                try {
                    rjjVar = this.e;
                    rfgVar = rjjVar.c;
                } catch (RemoteException e) {
                    this.e.aF().c.d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e);
                    this.a.set(Collections.emptyList());
                    atomicReference = this.a;
                }
                if (rfgVar != null) {
                    if (TextUtils.isEmpty(null)) {
                        this.a.set(rfgVar.f(this.b, this.c, this.d));
                    } else {
                        this.a.set(rfgVar.g(null, this.b, this.c));
                    }
                    this.e.t();
                    atomicReference = this.a;
                    atomicReference.notify();
                    return;
                }
                rjjVar.aF().c.d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.c);
                this.a.set(Collections.emptyList());
            } finally {
                this.a.notify();
            }
        }
    }
}
