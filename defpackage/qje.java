package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qje implements qlb {
    final /* synthetic */ qjg a;

    public qje(qjg qjgVar) {
        this.a = qjgVar;
    }

    @Override // defpackage.qlb
    public final void a(long j, int i, Object obj) {
        try {
            this.a.n(new qji(new Status(i)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }

    @Override // defpackage.qlb
    public final void b(long j) {
        try {
            this.a.n(qjg.d(new Status(2103)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }
}
