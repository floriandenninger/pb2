package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.lens.sdk.PendingIntentConsumer;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdd implements tde {
    public final tdf a;
    public PendingIntentConsumer b;
    private final Queue c = new ArrayDeque();

    public tdd(Context context, tda tdaVar) {
        this.a = new tdl(context, this, tdaVar);
    }

    private final boolean g() {
        edo a = a();
        return (a.b & 2) != 0 && this.a.b() >= a.d;
    }

    public final edo a() {
        rwh.U();
        rwh.V(this.a.f(), "getServerFlags() called before ready.");
        if (!this.a.f()) {
            return edo.a;
        }
        tdf tdfVar = this.a;
        rwh.U();
        tdl tdlVar = (tdl) tdfVar;
        rwh.V(tdlVar.l(), "Attempted to use ServerFlags before ready.");
        return tdlVar.f;
    }

    public final void b() {
        while (this.c.peek() != null) {
            ((tdc) this.c.remove()).a(this.a.g());
        }
    }

    public final boolean c(Bundle bundle) {
        rwh.U();
        if (!this.a.f()) {
            return false;
        }
        aong aongVar = (aong) edi.a.createBuilder();
        aongVar.copyOnWrite();
        edi ediVar = (edi) aongVar.instance;
        ediVar.c = 341;
        ediVar.b |= 1;
        try {
            this.a.c(((edi) aongVar.build()).toByteArray(), new SystemParcelableWrapper(bundle));
            return true;
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceBridge", "Failed to inject image.", e);
            return false;
        }
    }

    public final void d(tdc tdcVar) {
        rwh.U();
        if (this.a.f() || this.a.e()) {
            tdcVar.a(this.a.g());
            return;
        }
        this.c.add(tdcVar);
        tdl tdlVar = (tdl) this.a;
        if (tdlVar.j() || tdlVar.k()) {
            return;
        }
        tdlVar.m();
    }

    public final int e() {
        rwh.U();
        if (this.a.f()) {
            return g() ? 2 : 13;
        }
        return this.a.g();
    }

    public final int f() {
        rwh.U();
        if (!this.a.f()) {
            return this.a.g();
        }
        if (!g()) {
            return 13;
        }
        edo a = a();
        return ((a.b & 8) == 0 || this.a.b() < a.f) ? 13 : 2;
    }
}
