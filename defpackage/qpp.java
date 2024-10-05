package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qpp implements qoz {
    final /* synthetic */ qpy a;

    public qpp(qpy qpyVar) {
        this.a = qpyVar;
    }

    @Override // defpackage.qoz
    public final void a(boolean z) {
        Handler handler = this.a.o;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
