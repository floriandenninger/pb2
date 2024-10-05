package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acyw extends Handler {
    private static final acyx a = new acyx(-1, null, null);
    private final adht b;
    private final amru c;

    public acyw(Looper looper, adht adhtVar, amru amruVar) {
        super(looper);
        this.b = adhtVar;
        this.c = amruVar;
    }

    private static final void b(adny adnyVar, adfw adfwVar, int i) {
        if (adfwVar == null) {
            adnyVar.b(-1, 3, i);
        } else {
            adnyVar.a(adfwVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(acyx acyxVar) {
        acyx acyxVar2 = a;
        acyx acyxVar3 = acyxVar.a < this.c.size() + (-1) ? new acyx(acyxVar.a + 1, acyxVar.c, acyxVar.b) : acyxVar2;
        if (acyxVar3 == acyxVar2) {
            b(acyxVar.b, null, acyxVar.a);
        } else {
            sendMessageDelayed(Message.obtain(this, 1, acyxVar3), ((Integer) this.c.get(acyxVar3.a)).intValue());
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        acyx acyxVar = (acyx) message.obj;
        adgn adgnVar = acyxVar.c;
        adny adnyVar = acyxVar.b;
        adfw adfwVar = (adfw) this.b.a(adgnVar);
        if (adfwVar != null) {
            String str = acyz.a;
            String valueOf = String.valueOf(adfwVar.f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Found screen with id: ");
            sb.append(valueOf);
            zga.h(str, sb.toString());
            adfv g = adfwVar.g();
            g.c = new adgg(3);
            g.d = adgnVar;
            b(adnyVar, g.a(), acyxVar.a);
            return;
        }
        a(acyxVar);
    }
}
