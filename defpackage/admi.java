package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class admi implements Handler.Callback {
    final /* synthetic */ admk a;

    public admi(admk admkVar) {
        this.a = admkVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        yjk.f();
        admk admkVar = this.a;
        adlp adlpVar = admkVar.i;
        if (adlpVar == null) {
            return true;
        }
        if (admkVar.g && !admkVar.c.r()) {
            admk admkVar2 = this.a;
            if (!admkVar2.j) {
                admkVar2.d.g(admkVar2.f);
                this.a.j = true;
            }
            return true;
        }
        ArrayList arrayList = new ArrayList();
        bpv bpvVar = message.what == 2 ? (bpv) message.obj : null;
        if (bpvVar == null) {
            arrayList.addAll(bpw.i());
        } else {
            arrayList.add(bpvVar);
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            bpv bpvVar2 = (bpv) arrayList.get(i);
            i++;
            if (adeg.c(bpvVar2.c, adlpVar.d)) {
                this.a.b(bpvVar2);
                break;
            }
        }
        return true;
    }
}
