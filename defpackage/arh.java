package defpackage;

import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class arh implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ResultReceiver b;
    final /* synthetic */ arj c;
    final /* synthetic */ ark d;
    private final /* synthetic */ int e;

    public arh(arj arjVar, ark arkVar, String str, ResultReceiver resultReceiver, int i) {
        this.e = i;
        this.c = arjVar;
        this.d = arkVar;
        this.a = str;
        this.b = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            if (((aqp) this.c.a.c.get(this.d.a())) == null) {
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.a);
                return;
            }
            String str = this.a;
            aqn aqnVar = new aqn(str, this.b);
            aqnVar.h = 4;
            aqnVar.b(null);
            if (aqnVar.c()) {
                return;
            }
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
        if (((aqp) this.c.a.c.get(this.d.a())) == null) {
            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.a);
            return;
        }
        String str2 = this.a;
        aqm aqmVar = new aqm(str2, this.b);
        arm.c(aqmVar);
        if (aqmVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str2);
    }
}
