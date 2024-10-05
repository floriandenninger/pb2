package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class admh extends ji {
    final /* synthetic */ admk a;

    public admh(admk admkVar) {
        this.a = admkVar;
    }

    @Override // defpackage.ji
    public final void j(bpv bpvVar) {
        admk admkVar = this.a;
        if (admkVar.h != 1) {
            return;
        }
        Handler handler = admkVar.e;
        handler.sendMessage(handler.obtainMessage(2, bpvVar));
    }
}
