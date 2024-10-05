package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qfd extends qks {
    final /* synthetic */ qfe a;

    public qfd(qfe qfeVar) {
        this.a = qfeVar;
    }

    @Override // defpackage.qkt
    public final void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        qfe qfeVar = this.a;
        qfeVar.j = applicationMetadata;
        qfeVar.k = str;
        qkg qkgVar = new qkg(new Status(0), applicationMetadata, str, str2, z);
        synchronized (qfeVar.h) {
            rpv rpvVar = qfeVar.e;
            if (rpvVar != null) {
                rpvVar.b(qkgVar);
            }
            qfeVar.e = null;
        }
    }

    @Override // defpackage.qkt
    public final void b(int i) {
        this.a.j(i);
    }

    @Override // defpackage.qkt
    public final void c(int i) {
        this.a.l(i);
        qfe qfeVar = this.a;
        if (qfeVar.v != null) {
            qfeVar.e().post(new qez(this, i, 1));
        }
    }

    @Override // defpackage.qkt
    public final void d(int i) {
        this.a.l(i);
    }

    @Override // defpackage.qkt
    public final void e(final ApplicationStatus applicationStatus) {
        this.a.e().post(new Runnable() { // from class: qfa
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                qfd qfdVar = qfd.this;
                ApplicationStatus applicationStatus2 = applicationStatus;
                qfe qfeVar = qfdVar.a;
                String str = applicationStatus2.a;
                if (qko.j(str, qfeVar.k)) {
                    z = false;
                } else {
                    qfeVar.k = str;
                    z = true;
                }
                prh prhVar = qfeVar.v;
                if (prhVar != null && (z || qfeVar.d)) {
                    prhVar.A();
                }
                qfeVar.d = false;
            }
        });
    }

    @Override // defpackage.qkt
    public final void f(int i) {
        this.a.l(i);
    }

    @Override // defpackage.qkt
    public final void g(int i) {
        this.a.e().post(new qez(this, i, 0));
    }

    @Override // defpackage.qkt
    public final void h(final DeviceStatus deviceStatus) {
        this.a.e().post(new Runnable() { // from class: qfb
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                boolean z2;
                qfd qfdVar = qfd.this;
                DeviceStatus deviceStatus2 = deviceStatus;
                qfe qfeVar = qfdVar.a;
                ApplicationMetadata applicationMetadata = deviceStatus2.d;
                if (!qko.j(applicationMetadata, qfeVar.j)) {
                    qfeVar.j = applicationMetadata;
                    qfeVar.v.z(qfeVar.j);
                }
                double d = deviceStatus2.a;
                boolean z3 = true;
                if (Double.isNaN(d) || Math.abs(d - qfeVar.l) <= 1.0E-7d) {
                    z = false;
                } else {
                    qfeVar.l = d;
                    z = true;
                }
                boolean z4 = deviceStatus2.b;
                if (z4 != qfeVar.m) {
                    qfeVar.m = z4;
                    z = true;
                }
                prh prhVar = qfeVar.v;
                if (prhVar != null && (z || qfeVar.c)) {
                    prhVar.C();
                }
                Double.isNaN(deviceStatus2.g);
                int i = deviceStatus2.c;
                int i2 = qfeVar.n;
                if (i != i2) {
                    qfeVar.n = i;
                    z2 = true;
                } else {
                    i = i2;
                    z2 = false;
                }
                prh prhVar2 = qfeVar.v;
                if (prhVar2 != null && (z2 || qfeVar.c)) {
                    prhVar2.x(i);
                }
                int i3 = deviceStatus2.e;
                int i4 = qfeVar.o;
                if (i3 != i4) {
                    qfeVar.o = i3;
                } else {
                    i3 = i4;
                    z3 = false;
                }
                prh prhVar3 = qfeVar.v;
                if (prhVar3 != null && (z3 || qfeVar.c)) {
                    prhVar3.B(i3);
                }
                if (!qko.j(qfeVar.p, deviceStatus2.f)) {
                    qfeVar.p = deviceStatus2.f;
                }
                qfeVar.c = false;
            }
        });
    }

    @Override // defpackage.qkt
    public final void i(int i) {
        this.a.e().post(new qez(this, i, 2));
    }

    @Override // defpackage.qkt
    public final void j(int i) {
        this.a.e().post(new qez(this, i, 3));
    }

    @Override // defpackage.qkt
    public final void k(final String str, final String str2) {
        qkw qkwVar = qfe.a;
        this.a.e().post(new Runnable() { // from class: qfc
            @Override // java.lang.Runnable
            public final void run() {
                qen qenVar;
                qfd qfdVar = qfd.this;
                String str3 = str;
                String str4 = str2;
                synchronized (qfdVar.a.s) {
                    qenVar = (qen) qfdVar.a.s.get(str3);
                }
                if (qenVar != null) {
                    qenVar.a(str3, str4);
                }
            }
        });
    }

    @Override // defpackage.qkt
    public final void l(long j) {
        this.a.k(j, 0);
    }

    @Override // defpackage.qkt
    public final void m(long j, int i) {
        this.a.k(j, i);
    }

    @Override // defpackage.qkt
    public final void n() {
        qkw qkwVar = qfe.a;
    }

    @Override // defpackage.qkt
    public final void o(byte[] bArr) {
        qkw qkwVar = qfe.a;
        int length = bArr.length;
    }
}
