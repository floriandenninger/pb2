package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class arf implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ arj d;
    final /* synthetic */ ark e;
    private final /* synthetic */ int f;

    public arf(arj arjVar, ark arkVar, int i, String str, int i2, int i3) {
        this.f = i3;
        this.d = arjVar;
        this.e = arkVar;
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public arf(arj arjVar, ark arkVar, String str, int i, int i2, int i3) {
        this.f = i3;
        this.d = arjVar;
        this.e = arkVar;
        this.b = str;
        this.c = i;
        this.a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f == 0) {
            IBinder a = this.e.a();
            this.d.a.c.remove(a);
            Iterator it = this.d.a.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aqp aqpVar = (aqp) it.next();
                if (aqpVar.c == this.a) {
                    r3 = (TextUtils.isEmpty(this.b) || this.c <= 0) ? new aqp(this.d.a, aqpVar.a, aqpVar.b, aqpVar.c, this.e) : null;
                    it.remove();
                }
            }
            if (r3 == null) {
                r3 = new aqp(this.d.a, this.b, this.c, this.a, this.e);
            }
            this.d.a.c.put(a, r3);
            try {
                a.linkToDeath(r3, 0);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "IBinder is already dead.");
                return;
            }
        }
        IBinder a2 = this.e.a();
        this.d.a.c.remove(a2);
        aqp aqpVar2 = new aqp(this.d.a, this.b, this.c, this.a, this.e);
        aqpVar2.g = this.d.a.e(this.b);
        if (aqpVar2.g == null) {
            getClass().getName();
            try {
                this.e.b(2, null);
                return;
            } catch (RemoteException unused2) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.b);
                return;
            }
        }
        try {
            this.d.a.c.put(a2, aqpVar2);
            a2.linkToDeath(aqpVar2, 0);
            MediaSessionCompat$Token mediaSessionCompat$Token = this.d.a.e;
            if (mediaSessionCompat$Token != null) {
                ark arkVar = this.e;
                ypn ypnVar = aqpVar2.g;
                String str = ypnVar.a;
                Bundle bundle = ypnVar.b;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", "__EMPTY_ROOT__");
                bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                bundle2.putBundle("data_root_hints", bundle);
                arkVar.b(1, bundle2);
            }
        } catch (RemoteException unused3) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.b);
            this.d.a.c.remove(a2);
        }
    }
}
