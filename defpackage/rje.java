package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rje implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMetadata d;
    final /* synthetic */ boolean e;
    final /* synthetic */ rjj f;

    public rje(rjj rjjVar, AtomicReference atomicReference, String str, String str2, AppMetadata appMetadata, boolean z) {
        this.f = rjjVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = appMetadata;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        rjj rjjVar;
        rfg rfgVar;
        synchronized (this.a) {
            try {
                try {
                    rjjVar = this.f;
                    rfgVar = rjjVar.c;
                } catch (RemoteException e) {
                    this.f.aF().c.d("(legacy) Failed to get user properties; remote exception", null, this.b, e);
                    this.a.set(Collections.emptyList());
                    atomicReference = this.a;
                }
                if (rfgVar != null) {
                    if (TextUtils.isEmpty(null)) {
                        this.a.set(rfgVar.h(this.b, this.c, this.e, this.d));
                    } else {
                        this.a.set(rfgVar.i(null, this.b, this.c, this.e));
                    }
                    this.f.t();
                    atomicReference = this.a;
                    atomicReference.notify();
                    return;
                }
                rjjVar.aF().c.d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                this.a.set(Collections.emptyList());
            } finally {
                this.a.notify();
            }
        }
    }
}
