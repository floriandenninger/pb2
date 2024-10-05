package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qfx extends prh {
    final /* synthetic */ qfy a;

    public qfx(qfy qfyVar) {
        this.a = qfyVar;
    }

    @Override // defpackage.prh
    public final void t() {
        qfy qfyVar = this.a;
        if (qfyVar.b != null) {
            try {
                qjk qjkVar = qfyVar.d;
                if (qjkVar != null) {
                    qjkVar.i();
                }
                this.a.b.k();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.prh
    public final void u(int i) {
        qgf qgfVar = this.a.b;
        if (qgfVar != null) {
            try {
                qgfVar.g(new ConnectionResult(i));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.prh
    public final void v(int i) {
        qgf qgfVar = this.a.b;
        if (qgfVar != null) {
            try {
                qgfVar.h(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.prh
    public final void w(int i) {
        qgf qgfVar = this.a.b;
        if (qgfVar != null) {
            try {
                qgfVar.g(new ConnectionResult(i));
            } catch (RemoteException unused) {
            }
        }
    }
}
