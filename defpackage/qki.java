package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.DeviceStatus;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qki implements Runnable {
    final /* synthetic */ qkm a;
    final /* synthetic */ DeviceStatus b;

    public qki(qkm qkmVar, DeviceStatus deviceStatus) {
        this.a = qkmVar;
        this.b = deviceStatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        qkm qkmVar = this.a;
        DeviceStatus deviceStatus = this.b;
        ApplicationMetadata applicationMetadata = deviceStatus.d;
        if (!qko.j(applicationMetadata, qkmVar.b)) {
            qkmVar.b = applicationMetadata;
            qkmVar.o.z(qkmVar.b);
        }
        double d = deviceStatus.a;
        boolean z3 = true;
        if (Double.isNaN(d) || Math.abs(d - qkmVar.i) <= 1.0E-7d) {
            z = false;
        } else {
            qkmVar.i = d;
            z = true;
        }
        boolean z4 = deviceStatus.b;
        if (z4 != qkmVar.f) {
            qkmVar.f = z4;
            z = true;
        }
        Double.isNaN(deviceStatus.g);
        prh prhVar = qkmVar.o;
        if (prhVar != null && (z || qkmVar.h)) {
            prhVar.C();
        }
        int i = deviceStatus.c;
        int i2 = qkmVar.k;
        if (i != i2) {
            qkmVar.k = i;
            z2 = true;
        } else {
            i = i2;
            z2 = false;
        }
        prh prhVar2 = qkmVar.o;
        if (prhVar2 != null && (z2 || qkmVar.h)) {
            prhVar2.x(i);
        }
        int i3 = deviceStatus.e;
        int i4 = qkmVar.l;
        if (i3 != i4) {
            qkmVar.l = i3;
        } else {
            i3 = i4;
            z3 = false;
        }
        prh prhVar3 = qkmVar.o;
        if (prhVar3 != null && (z3 || qkmVar.h)) {
            prhVar3.B(i3);
        }
        if (!qko.j(qkmVar.j, deviceStatus.f)) {
            qkmVar.j = deviceStatus.f;
        }
        qkmVar.h = false;
    }
}
