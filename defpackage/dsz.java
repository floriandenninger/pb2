package defpackage;

import android.support.v7.widget.RecyclerView;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dsz {
    public dti a;
    public int b;
    private final Runnable c;

    public dsz(byte[] bArr) {
        this.c = new dsy(this);
        this.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    public final RecyclerView a() {
        dti dtiVar = this.a;
        if (dtiVar == null) {
            return null;
        }
        return dtiVar.l;
    }

    public final void b() {
        dti dtiVar = this.a;
        if (dtiVar == null || !dtiVar.b) {
            return;
        }
        if (did.t()) {
            dtiVar.l(false);
        } else {
            dtiVar.removeCallbacks(this.c);
            dtiVar.post(this.c);
        }
    }

    public dsz() {
        this.c = new dsy(this);
    }

    public final void c(int i, boolean z) {
        dti dtiVar = this.a;
        if (dtiVar == null) {
            return;
        }
        if (z) {
            dtiVar.l.ak(i);
        } else {
            dtiVar.l.aa(i);
        }
    }
}
