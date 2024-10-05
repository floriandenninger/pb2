package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qmt implements ServiceConnection {
    public boolean a = false;
    public final BlockingQueue b = new LinkedBlockingQueue();
    private final /* synthetic */ int c;

    public qmt(int i) {
        this.c = i;
    }

    public qmt(int i, byte[] bArr) {
        this.c = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.c == 0) {
            this.b.add(iBinder);
        } else {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
