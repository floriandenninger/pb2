package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer.MediaFormat;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxl extends Handler {
    final /* synthetic */ oxm a;

    public oxl(oxm oxmVar) {
        this.a = oxmVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        oxm oxmVar = this.a;
        int i = message.what;
        if (i == 1) {
            Object obj = message.obj;
            MediaFormat[][] mediaFormatArr = oxmVar.c;
            System.arraycopy(obj, 0, mediaFormatArr, 0, mediaFormatArr.length);
            oxmVar.e = message.arg1;
            Iterator it = oxmVar.b.iterator();
            while (it.hasNext()) {
                ((oxj) it.next()).rD(oxmVar.d, oxmVar.e);
            }
            return;
        }
        if (i == 2) {
            oxmVar.e = message.arg1;
            Iterator it2 = oxmVar.b.iterator();
            while (it2.hasNext()) {
                ((oxj) it2.next()).rD(oxmVar.d, oxmVar.e);
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            oxh oxhVar = (oxh) message.obj;
            Iterator it3 = oxmVar.b.iterator();
            while (it3.hasNext()) {
                ((oxj) it3.next()).rC(oxhVar);
            }
            return;
        }
        int i2 = oxmVar.f - 1;
        oxmVar.f = i2;
        if (i2 == 0) {
            Iterator it4 = oxmVar.b.iterator();
            while (it4.hasNext()) {
                ((oxj) it4.next()).rB();
            }
        }
    }
}
