package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbc extends ce {
    public final dac a;
    public final dax b;
    public cor c;
    private final Set d;
    private dbc e;

    public dbc() {
        dac dacVar = new dac();
        this.b = new dbb(this);
        this.d = new HashSet();
        this.a = dacVar;
    }

    private final void a() {
        dbc dbcVar = this.e;
        if (dbcVar != null) {
            dbcVar.d.remove(this);
            this.e = null;
        }
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.a.b();
        a();
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        ce ceVar = this;
        while (true) {
            ce ceVar2 = ceVar.C;
            if (ceVar2 == null) {
                break;
            } else {
                ceVar = ceVar2;
            }
        }
        dd ddVar = ceVar.z;
        if (ddVar == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            Context qR = qR();
            a();
            dbc d = cnv.b(qR).e.d(ddVar);
            this.e = d;
            if (equals(d)) {
                return;
            }
            this.e.d.add(this);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // defpackage.ce
    public final void lY() {
        super.lY();
        a();
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.a.d();
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        this.a.c();
    }

    @Override // defpackage.ce
    public final String toString() {
        String ceVar = super.toString();
        ce ceVar2 = this.C;
        if (ceVar2 == null) {
            ceVar2 = null;
        }
        String valueOf = String.valueOf(ceVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(ceVar).length() + 9 + String.valueOf(valueOf).length());
        sb.append(ceVar);
        sb.append("{parent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
