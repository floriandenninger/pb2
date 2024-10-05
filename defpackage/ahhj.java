package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahhj extends Handler {
    private final WeakReference a;

    public ahhj(ahhk ahhkVar) {
        this.a = new WeakReference(ahhkVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        afkx afkxVar;
        ahhk ahhkVar = (ahhk) this.a.get();
        if (ahhkVar == null) {
            return;
        }
        if (message.what == 0) {
            ahhkVar.b = null;
            ahhkVar.c = null;
            ahhkVar.a = (Surface) message.obj;
            afkx afkxVar2 = ahhkVar.g;
            if (afkxVar2 != null) {
                afkxVar2.c();
                return;
            }
            return;
        }
        if (message.what == 1) {
            ahhkVar.a = null;
            ahhkVar.b = (pkd) message.obj;
            ahhkVar.c = (bgv) message.obj;
            afkx afkxVar3 = ahhkVar.g;
            if (afkxVar3 != null) {
                afkxVar3.a();
            }
            ahhkVar.I();
            return;
        }
        if (message.what == 2) {
            ahhkVar.i = message.arg1 > 0;
            ahhkVar.J(ahhkVar.getLeft(), ahhkVar.getTop(), ahhkVar.getRight(), ahhkVar.getBottom());
        } else {
            if (message.what == 3 && (afkxVar = ahhkVar.g) != null) {
                afkxVar.e();
            }
            super.handleMessage(message);
        }
    }
}
