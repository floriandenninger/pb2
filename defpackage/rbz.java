package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rbz extends rcb {
    private final rgt a;
    private final rid b;

    public rbz(rgt rgtVar) {
        qip.an(rgtVar);
        this.a = rgtVar;
        this.b = rgtVar.k();
    }

    @Override // defpackage.rie
    public final int a(String str) {
        this.b.W(str);
        return 25;
    }

    @Override // defpackage.rie
    public final long b() {
        return this.a.p().q();
    }

    @Override // defpackage.rie
    public final String c() {
        return this.b.e();
    }

    @Override // defpackage.rie
    public final String d() {
        return this.b.o();
    }

    @Override // defpackage.rie
    public final String e() {
        return this.b.p();
    }

    @Override // defpackage.rie
    public final String f() {
        return this.b.e();
    }

    @Override // defpackage.rie
    public final List g(String str, String str2) {
        rid ridVar = this.b;
        if (ridVar.aG().i()) {
            ridVar.aF().c.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        ridVar.P();
        if (ansv.d()) {
            ridVar.aF().c.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        ridVar.w.aG().a(atomicReference, 5000L, "get conditional user properties", new rhu(ridVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return rkm.B(list);
        }
        ridVar.aF().c.b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    @Override // defpackage.rie
    public final Map h(String str, String str2, boolean z) {
        rid ridVar = this.b;
        if (ridVar.aG().i()) {
            ridVar.aF().c.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        ridVar.P();
        if (ansv.d()) {
            ridVar.aF().c.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        ridVar.w.aG().a(atomicReference, 5000L, "get user properties", new rhv(ridVar, atomicReference, str, str2, z));
        List<UserAttributeParcel> list = (List) atomicReference.get();
        if (list == null) {
            ridVar.aF().c.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        adz adzVar = new adz(list.size());
        for (UserAttributeParcel userAttributeParcel : list) {
            Object a = userAttributeParcel.a();
            if (a != null) {
                adzVar.put(userAttributeParcel.b, a);
            }
        }
        return adzVar;
    }

    @Override // defpackage.rie
    public final void i(String str) {
        rdt b = this.a.b();
        qtl qtlVar = this.a.y;
        b.a(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.rie
    public final void j(String str, String str2, Bundle bundle) {
        this.a.k().r(str, str2, bundle);
    }

    @Override // defpackage.rie
    public final void k(String str) {
        rdt b = this.a.b();
        qtl qtlVar = this.a.y;
        b.b(str, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.rie
    public final void l(String str, String str2, Bundle bundle) {
        this.b.t(str, str2, bundle);
    }

    @Override // defpackage.rie
    public final void m(Bundle bundle) {
        rid ridVar = this.b;
        ridVar.Q();
        ridVar.C(bundle, System.currentTimeMillis());
    }
}
