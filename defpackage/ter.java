package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ter implements Handler.Callback {
    final /* synthetic */ tet a;

    public ter(tet tetVar) {
        this.a = tetVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.a.b.isEmpty()) {
            return true;
        }
        for (tdx tdxVar : this.a.b) {
            if (tdxVar instanceof tey) {
                this.a.a((tey) tdxVar, null);
            } else if (tdxVar instanceof teb) {
                this.a.d((teb) tdxVar);
            }
        }
        this.a.a.sendEmptyMessageDelayed(0, 200L);
        return true;
    }
}
