package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgb extends Handler implements Runnable {
    public final pgc a;
    public volatile Thread b;
    final /* synthetic */ pge c;
    private final pga d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgb(pge pgeVar, Looper looper, pgc pgcVar, pga pgaVar) {
        super(looper);
        this.c = pgeVar;
        this.a = pgcVar;
        this.d = pgaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 2) {
            pge pgeVar = this.c;
            pgeVar.b = false;
            pgeVar.a = null;
            if (this.a.l()) {
                this.d.p();
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.d.n(this.a);
                return;
            } else {
                if (i != 1) {
                    return;
                }
                this.d.o(this.a, (IOException) message.obj);
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b = Thread.currentThread();
            if (!this.a.l()) {
                String.valueOf(this.a.getClass().getSimpleName()).concat(".load()");
                int i = pgz.a;
                this.a.k();
            }
            sendEmptyMessage(0);
        } catch (IOException e) {
            obtainMessage(1, e).sendToTarget();
        } catch (Error e2) {
            Log.e("LoadTask", "Unexpected error loading stream", e2);
            obtainMessage(2, e2).sendToTarget();
            throw e2;
        } catch (InterruptedException unused) {
            opn.k(this.a.l());
            sendEmptyMessage(0);
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(1, new pgd(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(1, new pgd(e4)).sendToTarget();
        }
    }
}
