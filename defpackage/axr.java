package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axr extends Handler {
    final /* synthetic */ axt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axr(axt axtVar, Looper looper) {
        super(looper);
        this.a = axtVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            axt axtVar = this.a;
            if (obj == axtVar.l && axtVar.k()) {
                axtVar.l = null;
                if (obj2 instanceof Exception) {
                    axtVar.i((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] l = axtVar.b.l(axtVar.h, (byte[]) obj2);
                    if (axtVar.i != null && l != null && l.length != 0) {
                        axtVar.i = l;
                    }
                    axtVar.g = 4;
                    axtVar.f(axo.a);
                    return;
                } catch (Exception e) {
                    axtVar.i(e, true);
                    return;
                }
            }
            return;
        }
        axt axtVar2 = this.a;
        if (obj == axtVar2.k) {
            if (axtVar2.g == 2 || axtVar2.k()) {
                axtVar2.k = null;
                if (obj2 instanceof Exception) {
                    axtVar2.j.a((Exception) obj2, false);
                    return;
                }
                try {
                    axtVar2.b.e((byte[]) obj2);
                    ayb aybVar = axtVar2.j;
                    aybVar.b = null;
                    amru o = amru.o(aybVar.a);
                    aybVar.a.clear();
                    int size = o.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        axt axtVar3 = (axt) o.get(i2);
                        if (axtVar3.l()) {
                            axtVar3.g(true);
                        }
                    }
                } catch (Exception e2) {
                    axtVar2.j.a(e2, true);
                }
            }
        }
    }
}
