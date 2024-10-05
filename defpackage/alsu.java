package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alsu {
    private static alsu a;
    private final Context c;
    private final ExecutorService d = alsm.a.c;
    private final ExecutorService e = alsm.b.c;
    private final long f = b;
    private static final ammr g = new ammr("SetupCompatServiceInvoker", (byte[]) null);
    private static final long b = TimeUnit.SECONDS.toMillis(10);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    private alsu(Context context) {
        this.c = context;
    }

    public static synchronized alsu a(Context context) {
        alsu alsuVar;
        synchronized (alsu.class) {
            if (a == null) {
                a = new alsu(context.getApplicationContext());
            }
            alsuVar = a;
        }
        return alsuVar;
    }

    public final void b(final String str, final Bundle bundle) {
        try {
            this.e.execute(new Runnable() { // from class: alst
                @Override // java.lang.Runnable
                public final void run() {
                    alsu.this.c(str, bundle);
                }
            });
        } catch (RejectedExecutionException e) {
            g.i(String.format("Screen %s bind back fail.", str), e);
        }
    }

    public final void c(String str, Bundle bundle) {
        try {
            alsj b2 = alsx.b(this.c, this.f, TimeUnit.MILLISECONDS);
            if (b2 != null) {
                Parcel pn = b2.pn();
                pn.writeString(str);
                ecr.g(pn, bundle);
                b2.pq(1, pn);
                return;
            }
            g.j("BindBack failed since service reference is null. Are the permissions valid?");
        } catch (RemoteException | InterruptedException | TimeoutException e) {
            g.i(String.format("Exception occurred while %s trying bind back to SetupWizard.", str), e);
        }
    }

    public final void d(int i, Bundle bundle) {
        try {
            alsj b2 = alsx.b(this.c, this.f, TimeUnit.MILLISECONDS);
            if (b2 != null) {
                Bundle bundle2 = Bundle.EMPTY;
                Parcel pn = b2.pn();
                pn.writeInt(i);
                ecr.g(pn, bundle);
                ecr.g(pn, bundle2);
                b2.pq(2, pn);
                return;
            }
            g.j("logMetric failed since service reference is null. Are the permissions valid?");
        } catch (RemoteException | IllegalStateException | InterruptedException | TimeoutException e) {
            g.i(String.format("Exception occurred while trying to log metric = [%s]", bundle), e);
        }
    }

    public final void e(final int i, final Bundle bundle) {
        try {
            this.d.execute(new Runnable() { // from class: alss
                @Override // java.lang.Runnable
                public final void run() {
                    alsu.this.d(i, bundle);
                }
            });
        } catch (RejectedExecutionException e) {
            g.i(String.format("Metric of type %d dropped since queue is full.", Integer.valueOf(i)), e);
        }
    }
}
