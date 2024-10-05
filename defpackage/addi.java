package defpackage;

import android.app.Dialog;
import androidx.mediarouter.app.MediaRouteButton;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class addi implements ayqx {
    public final MediaRouteButton a;
    ayqx b;
    Dialog c;

    public addi(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        ayqx ayqxVar = this.b;
        return ayqxVar == null || ayqxVar.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        Object obj = this.b;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.b = null;
        }
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.cancel();
            this.c = null;
        }
    }
}
