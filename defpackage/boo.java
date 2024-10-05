package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class boo extends boz {
    final String a;
    final MediaRouter2.RoutingController b;
    final Messenger c;
    final Messenger d;
    final Handler f;
    bou i;
    final SparseArray e = new SparseArray();
    final AtomicInteger g = new AtomicInteger(1);
    private final Runnable o = new Runnable() { // from class: bom
        @Override // java.lang.Runnable
        public final void run() {
            boo.this.h = -1;
        }
    };
    int h = -1;

    public boo(MediaRouter2.RoutingController routingController, String str) {
        Bundle controlHints;
        this.b = routingController;
        this.a = str;
        Messenger messenger = (routingController == null || (controlHints = routingController.getControlHints()) == null) ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.c = messenger;
        this.d = messenger != null ? new Messenger(new bon(this)) : null;
        this.f = new Handler(Looper.getMainLooper());
    }

    private final void j() {
        this.f.removeCallbacks(this.o);
        this.f.postDelayed(this.o, 1000L);
    }

    @Override // defpackage.bpc
    public final void a() {
        this.b.release();
    }

    @Override // defpackage.bpc
    public final void b(int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.h = i;
        j();
    }

    @Override // defpackage.bpc
    public final void c(int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null) {
            return;
        }
        int i2 = this.h;
        if (i2 < 0) {
            i2 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i2 + i, this.b.getVolumeMax()));
        this.h = max;
        this.b.setVolume(max);
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null || routingController.isReleased() || this.c == null) {
            return;
        }
        int andIncrement = this.g.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.d;
        try {
            this.c.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str, int i) {
        MediaRouter2.RoutingController routingController = this.b;
        if (routingController == null || routingController.isReleased() || this.c == null) {
            return;
        }
        int andIncrement = this.g.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 8;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = this.d;
        try {
            this.c.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }
}
