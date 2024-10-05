package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abtp implements abvr {
    public static final long a = TimeUnit.SECONDS.toNanos(60);
    public final Context b;
    public boolean d;
    public long e;
    public abwl o;
    public final Handler c = new Handler(Looper.getMainLooper());
    int f = -1;
    int g = -1;
    public final Runnable h = new omm(10);
    public final Runnable i = new abtm(this, 1);
    public final Runnable j = new abtm(this, 0);
    public final Runnable k = new abtm(this, 2);
    public final Runnable l = new omm(11);
    public final BroadcastReceiver m = new abtn(this);
    public final BroadcastReceiver n = new abto(this);

    public abtp(Context context) {
        this.b = context;
    }

    @Override // defpackage.abvr
    public final void a(Object obj) {
        if (this.d && (obj instanceof assa)) {
            assa assaVar = (assa) obj;
            int i = this.f;
            assaVar.copyOnWrite();
            assb assbVar = (assb) assaVar.instance;
            assb assbVar2 = assb.a;
            assbVar.b |= 16;
            assbVar.f = i;
            int i2 = this.g;
            if (i2 == 2) {
                assaVar.copyOnWrite();
                assb assbVar3 = (assb) assaVar.instance;
                assbVar3.e = 1;
                assbVar3.b |= 8;
                return;
            }
            if (i2 == 3) {
                assaVar.copyOnWrite();
                assb assbVar4 = (assb) assaVar.instance;
                assbVar4.e = 2;
                assbVar4.b |= 8;
                return;
            }
            if (i2 == 4) {
                assaVar.copyOnWrite();
                assb assbVar5 = (assb) assaVar.instance;
                assbVar5.e = 4;
                assbVar5.b |= 8;
                return;
            }
            if (i2 == 5) {
                assaVar.copyOnWrite();
                assb assbVar6 = (assb) assaVar.instance;
                assbVar6.e = 3;
                assbVar6.b |= 8;
                return;
            }
            assaVar.copyOnWrite();
            assb assbVar7 = (assb) assaVar.instance;
            assbVar7.e = 0;
            assbVar7.b |= 8;
        }
    }
}
