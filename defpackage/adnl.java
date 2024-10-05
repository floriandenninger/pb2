package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adnl extends Handler {
    private final WeakReference a;

    public adnl(adnm adnmVar) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(adnmVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        final adnm adnmVar = (adnm) this.a.get();
        if (adnmVar == null || !adnmVar.i) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            adnmVar.o();
            if (hasMessages(0)) {
                return;
            }
            sendEmptyMessageDelayed(0, 5000L);
            return;
        }
        if (i == 1) {
            adnmVar.n();
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessageDelayed(1, 10000L);
            return;
        }
        if (i != 2) {
            return;
        }
        Set<adfy> set = (Set) message.obj;
        if (set.isEmpty()) {
            return;
        }
        for (final adfy adfyVar : set) {
            adgn adgnVar = adfyVar.n;
            Integer num = (Integer) adnmVar.e.get(adgnVar);
            adlm g = ((adlt) adnmVar.d.get()).g();
            if (g == null || !adfyVar.j(g.k()) || ((num == null || num.intValue() >= 5) && adnmVar.h.aD)) {
                final Uri uri = adfyVar.b;
                if (uri != null) {
                    String.valueOf(adfyVar.d).length();
                    adnmVar.f.execute(new Runnable() { // from class: adnk
                        @Override // java.lang.Runnable
                        public final void run() {
                            adnm adnmVar2 = adnm.this;
                            adfy adfyVar2 = adfyVar;
                            adnmVar2.i(adfyVar2, adnmVar2.g.a(uri, adfyVar2.n()));
                        }
                    });
                } else {
                    adnmVar.i(adfyVar, AppStatus.d(-2));
                }
            } else if (num != null) {
                String str = adfyVar.d;
                String valueOf = String.valueOf(num);
                String.valueOf(str).length();
                String.valueOf(valueOf).length();
                adnmVar.e.put(adgnVar, Integer.valueOf(num.intValue() + 1));
            }
        }
    }
}
