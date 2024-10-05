package defpackage;

import android.os.Message;
import android.view.View;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lw implements View.OnClickListener {
    final /* synthetic */ mg a;

    public lw(mg mgVar) {
        this.a = mgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        mg mgVar = this.a;
        Message message3 = null;
        if (view == mgVar.i && (message2 = mgVar.k) != null) {
            message3 = Message.obtain(message2);
        } else if (view != mgVar.l || (message = mgVar.n) == null) {
            Button button = mgVar.o;
        } else {
            message3 = Message.obtain(message);
        }
        if (message3 != null) {
            message3.sendToTarget();
        }
        mg mgVar2 = this.a;
        mgVar2.G.obtainMessage(1, mgVar2.b).sendToTarget();
    }
}
