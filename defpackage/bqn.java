package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqn extends bpd implements ServiceConnection {
    public final ComponentName a;
    public final ArrayList b;
    public boolean c;
    public bqh d;
    public boolean m;
    public bqo n;
    final amcc o;
    private boolean p;

    public bqn(Context context, ComponentName componentName) {
        super(context, new bpb(componentName));
        this.b = new ArrayList();
        this.a = componentName;
        this.o = new amcc((byte[]) null);
    }

    private final bpc r(String str, String str2) {
        bpf bpfVar = this.j;
        if (bpfVar == null) {
            return null;
        }
        List list = bpfVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((bou) list.get(i)).n().equals(str)) {
                bqm bqmVar = new bqm(this, str, str2);
                this.b.add(bqmVar);
                if (this.m) {
                    bqmVar.e(this.d);
                }
                p();
                return bqmVar;
            }
        }
        return null;
    }

    @Override // defpackage.bpd
    public final void d(bov bovVar) {
        if (this.m) {
            this.d.c(bovVar);
        }
        p();
    }

    public final bqi e(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            bqi bqiVar = (bqi) arrayList.get(i2);
            i2++;
            if (bqiVar.d() == i) {
                return bqiVar;
            }
        }
        return null;
    }

    public final void f() {
        if (this.p) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.a);
        try {
            this.p = this.e.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    @Override // defpackage.bpd
    public final boz jL(String str) {
        if (str != null) {
            bpf bpfVar = this.j;
            bql bqlVar = null;
            if (bpfVar != null) {
                List list = bpfVar.a;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((bou) list.get(i)).n().equals(str)) {
                        bqlVar = new bql(this, str);
                        this.b.add(bqlVar);
                        if (this.m) {
                            bqlVar.e(this.d);
                        }
                        p();
                    } else {
                        i++;
                    }
                }
            }
            return bqlVar;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public final void k() {
        if (this.d != null) {
            jN(null);
            this.m = false;
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((bqi) this.b.get(i)).f();
            }
            bqh bqhVar = this.d;
            bqhVar.g(2, 0, 0, null, null);
            bqhVar.b.a.clear();
            bqhVar.a.getBinder().unlinkToDeath(bqhVar, 0);
            bqhVar.h.o.post(new bqg(bqhVar, 1));
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(bqh bqhVar, bpf bpfVar) {
        if (this.d == bqhVar) {
            jN(bpfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(bqi bqiVar) {
        this.b.remove(bqiVar);
        bqiVar.f();
        p();
    }

    public final void n() {
        if (this.c) {
            return;
        }
        this.c = true;
        p();
    }

    public final void o() {
        if (this.p) {
            this.p = false;
            k();
            try {
                this.e.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.p) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        bqh bqhVar = new bqh(this, messenger);
                        int i = bqhVar.c;
                        bqhVar.c = i + 1;
                        bqhVar.f = i;
                        if (bqhVar.g(1, i, 4, null, null)) {
                            try {
                                bqhVar.a.getBinder().linkToDeath(bqhVar, 0);
                                this.d = bqhVar;
                                return;
                            } catch (RemoteException unused) {
                                bqhVar.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k();
    }

    public final void p() {
        if (q()) {
            f();
        } else {
            o();
        }
    }

    public final boolean q() {
        if (this.c) {
            return (this.h == null && this.b.isEmpty()) ? false : true;
        }
        return false;
    }

    public final String toString() {
        return "Service connection " + this.a.flattenToShortString();
    }

    @Override // defpackage.bpd
    public final bpc b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        return r(str, null);
    }

    @Override // defpackage.bpd
    public final bpc jM(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        return r(str, str2);
    }
}
