package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qpf extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    protected final qmy c;
    private final Handler d;

    public qpf(qqf qqfVar, qmy qmyVar) {
        super(qqfVar);
        this.b = new AtomicReference(null);
        this.d = new amcc(Looper.getMainLooper(), (byte[]) null);
        this.c = qmyVar;
    }

    private static final int o(qpd qpdVar) {
        if (qpdVar == null) {
            return -1;
        }
        return qpdVar.a;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        qpd qpdVar = new qpd(connectionResult, i);
        if (this.b.compareAndSet(null, qpdVar)) {
            this.d.post(new qpe(this, qpdVar));
        }
    }

    public final void b(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        f(connectionResult, i);
    }

    public final void c() {
        this.b.set(null);
        g();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(int i, int i2, Intent intent) {
        qpd qpdVar = (qpd) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.c.g(l());
                if (g == 0) {
                    c();
                    return;
                } else {
                    if (qpdVar == null) {
                        return;
                    }
                    if (qpdVar.b.c == 18 && g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            c();
            return;
        } else if (i2 == 0) {
            if (qpdVar == null) {
                return;
            }
            b(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, qpdVar.b.toString()), o(qpdVar));
            return;
        }
        if (qpdVar != null) {
            b(qpdVar.b, qpdVar.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new qpd(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void f(ConnectionResult connectionResult, int i);

    protected abstract void g();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h(Bundle bundle) {
        qpd qpdVar = (qpd) this.b.get();
        if (qpdVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", qpdVar.a);
        bundle.putInt("failed_status", qpdVar.b.c);
        bundle.putParcelable("failed_resolution", qpdVar.b.d);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void i() {
        this.a = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        this.a = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        b(new ConnectionResult(13, null), o((qpd) this.b.get()));
    }
}
