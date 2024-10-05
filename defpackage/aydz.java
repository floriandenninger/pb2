package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aydz implements IBinder.DeathRecipient, ayeg {
    public static final Logger e = Logger.getLogger(aydz.class.getName());
    public static final axzi f = axzi.a("remote-uid");
    public static final axzi g = axzi.a("inbound-parcelable-policy");
    private final aybc a;
    private long d;
    public final ScheduledExecutorService h;
    protected axzj k;
    protected Status l;
    public IBinder m;
    public volatile boolean n;
    public final aynz o;
    private long p;
    private int q = 1;
    public final ayeh i = new ayeh(this);
    protected final ConcurrentHashMap j = new ConcurrentHashMap();
    private final AtomicLong b = new AtomicLong();
    private final AtomicLong c = new AtomicLong();

    public aydz(aynz aynzVar, axzj axzjVar, aybc aybcVar) {
        this.o = aynzVar;
        this.k = axzjVar;
        this.a = aybcVar;
        this.h = (ScheduledExecutorService) aynzVar.b();
    }

    private final void a() {
        IBinder iBinder = this.m;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            Parcel obtain = Parcel.obtain();
            try {
                this.m.transact(2, obtain, null, 1);
            } catch (RemoteException unused2) {
            }
            obtain.recycle();
        }
    }

    public static Status n(RemoteException remoteException) {
        if ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) {
            return Status.o.c(remoteException);
        }
        return Status.n.c(remoteException);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        p(Status.o.withDescription("binderDied"), true);
    }

    public final aybc c() {
        return this.a;
    }

    protected void e(Parcel parcel) {
    }

    protected void f(Parcel parcel) {
    }

    public abstract void g(Status status);

    public abstract void h();

    public void i() {
        throw null;
    }

    public final synchronized axzj m() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i, Parcel parcel) {
        int dataSize = parcel.dataSize();
        try {
            if (this.m.transact(i, parcel, null, 1)) {
                long addAndGet = this.b.addAndGet(dataSize);
                if (addAndGet - this.d > 131072) {
                    Logger logger = e;
                    Level level = Level.FINE;
                    long j = this.d;
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 89);
                    sb.append("transmist window full. Outgoing=");
                    sb.append(addAndGet);
                    sb.append(" Ack'd Outgoing=");
                    sb.append(j);
                    sb.append(" ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.binder.internal.BinderTransport", "sendTransaction", sb.toString());
                    this.n = true;
                    return;
                }
                return;
            }
            throw Status.o.withDescription("Failed sending transaction").asException();
        } catch (RemoteException e2) {
            throw n(e2).asException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(final Status status, boolean z) {
        if (!r()) {
            this.l = status;
            s(4);
            g(status);
        }
        if (t(5)) {
            return;
        }
        if (z || this.j.isEmpty()) {
            this.i.a = null;
            s(5);
            a();
            final ArrayList arrayList = new ArrayList(this.j.values());
            this.j.clear();
            this.h.execute(new Runnable() { // from class: aydv
                @Override // java.lang.Runnable
                public final void run() {
                    aydz aydzVar = aydz.this;
                    ArrayList arrayList2 = arrayList;
                    Status status2 = status;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ayef ayefVar = (ayef) arrayList2.get(i);
                        synchronized (ayefVar) {
                            ayefVar.g(status2);
                        }
                    }
                    aydzVar.h();
                    aydzVar.i();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return t(4) || t(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(int i) {
        int i2 = this.q;
        int i3 = i - 1;
        if (i3 == 1) {
            amkq.N(i2 == 1);
        } else if (i3 == 2) {
            amkq.N(i2 == 1 || i2 == 2);
        } else if (i3 != 3) {
            amkq.N(i2 == 4);
        } else {
            amkq.N(i2 == 1 || i2 == 2 || i2 == 3);
        }
        this.q = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t(int i) {
        return this.q == i;
    }

    @Override // defpackage.ayeg
    public final boolean q(int i, Parcel parcel) {
        ayek ayekVar;
        ayod ayodVar;
        if (i < 1001) {
            synchronized (this) {
                if (i == 1) {
                    f(parcel);
                } else if (i == 2) {
                    p(Status.o.withDescription("transport shutdown by peer"), true);
                } else if (i == 3) {
                    long readLong = parcel.readLong();
                    long j = this.d;
                    if (j - readLong >= 0) {
                        readLong = j;
                    }
                    this.d = readLong;
                    if (this.b.get() - this.d < 131072 && this.n) {
                        Logger logger = e;
                        Level level = Level.FINE;
                        String valueOf = String.valueOf(this);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
                        sb.append("handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ");
                        sb.append(valueOf);
                        logger.logp(level, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", sb.toString());
                        this.n = false;
                        for (ayef ayefVar : this.j.values()) {
                            synchronized (ayefVar) {
                                ayekVar = ayefVar.e;
                                ayodVar = ayefVar.g;
                            }
                            if (ayodVar != null) {
                                ayodVar.e();
                            }
                            if (ayekVar != null) {
                                try {
                                    synchronized (ayekVar) {
                                        ayekVar.f();
                                    }
                                } catch (StatusException e2) {
                                    synchronized (ayefVar) {
                                        ayefVar.g(e2.a);
                                    }
                                }
                            }
                        }
                    }
                } else if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    e(parcel);
                } else if (this.q == 3) {
                    try {
                        this.m.transact(5, parcel, null, 1);
                    } catch (RemoteException unused) {
                    }
                }
                return true;
            }
        }
        int dataSize = parcel.dataSize();
        ayef ayefVar2 = (ayef) this.j.get(Integer.valueOf(i));
        if (ayefVar2 == null) {
            synchronized (this) {
            }
            ayefVar2 = null;
        }
        if (ayefVar2 != null) {
            ayefVar2.j(parcel);
        }
        if (this.c.addAndGet(dataSize) - this.p > 16384) {
            synchronized (this) {
                IBinder iBinder = this.m;
                iBinder.getClass();
                long j2 = this.c.get();
                this.p = j2;
                Parcel obtain = Parcel.obtain();
                obtain.writeLong(j2);
                try {
                    if (!iBinder.transact(3, obtain, null, 1)) {
                        p(Status.o.withDescription("Failed sending ack bytes transaction"), true);
                    }
                } catch (RemoteException e3) {
                    p(n(e3), true);
                }
                obtain.recycle();
            }
        }
        return true;
    }
}
