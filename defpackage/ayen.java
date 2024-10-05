package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayen implements ServiceConnection, aydt {
    private static final Logger a = Logger.getLogger(ayen.class.getName());
    private final Intent b;
    private final int c;
    private final ayds d;
    private final Executor e;
    private Context f;
    private int g;
    private int h;

    public ayen(Executor executor, Context context, Intent intent, ayds aydsVar) {
        synchronized (this) {
            this.b = intent;
            this.c = 1;
            this.d = aydsVar;
            this.f = context;
            this.e = executor;
            this.g = 1;
            this.h = 1;
        }
    }

    @Override // defpackage.aydt
    public final synchronized void a() {
        Status withDescription;
        if (this.g == 1) {
            this.g = 2;
            Context context = this.f;
            Intent intent = this.b;
            try {
                if (!context.bindService(intent, this, this.c)) {
                    Status status = Status.m;
                    String valueOf = String.valueOf(intent);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb.append("bindService(");
                    sb.append(valueOf);
                    sb.append(") returned false");
                    withDescription = status.withDescription(sb.toString());
                } else {
                    withDescription = Status.b;
                }
            } catch (SecurityException e) {
                withDescription = Status.h.c(e).withDescription("SecurityException from bindService");
            } catch (RuntimeException e2) {
                withDescription = Status.n.c(e2).withDescription("RuntimeException from bindService");
            }
            if (!withDescription.f()) {
                this.g = 4;
                this.e.execute(new ayem(this, withDescription, 1));
            }
        }
    }

    public final void b(Status status) {
        Logger logger = a;
        logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", status);
        this.f = null;
        if (this.h != 4) {
            this.h = 4;
            logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.d.b(status);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Status status) {
        Context context;
        synchronized (this) {
            int i = this.g;
            if (i != 2 && i != 3) {
                context = null;
                this.g = 4;
            }
            context = this.f;
            this.g = 4;
        }
        this.e.execute(new ayem(this, status, 0));
        if (context != null) {
            context.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Status status = Status.o;
        String valueOf = String.valueOf(componentName);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("onBindingDied: ");
        sb.append(valueOf);
        c(status.withDescription(sb.toString()));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        Status status = Status.m;
        String valueOf = String.valueOf(componentName);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("onNullBinding: ");
        sb.append(valueOf);
        c(status.withDescription(sb.toString()));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.g == 2) {
                this.g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.h == 1) {
            this.h = 3;
            a.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.d.a(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Status status = Status.o;
        String valueOf = String.valueOf(componentName);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("onServiceDisconnected: ");
        sb.append(valueOf);
        c(status.withDescription(sb.toString()));
    }
}
