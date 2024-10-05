package defpackage;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qkl extends qks {
    private final AtomicReference a;
    private final Handler b;

    public qkl(qkm qkmVar) {
        this.a = new AtomicReference(qkmVar);
        this.b = new amcc(qkmVar.r, (byte[]) null);
    }

    @Override // defpackage.qkt
    public final void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        qkm qkmVar = (qkm) this.a.get();
        if (qkmVar == null) {
            return;
        }
        qkmVar.b = applicationMetadata;
        qkmVar.m = applicationMetadata.a;
        qkmVar.n = str2;
        qkmVar.e = str;
        synchronized (qkm.a) {
        }
    }

    @Override // defpackage.qkt
    public final void b(int i) {
        if (((qkm) this.a.get()) != null) {
            synchronized (qkm.a) {
            }
        }
    }

    @Override // defpackage.qkt
    public final void c(int i) {
        qkm qkmVar = (qkm) this.a.get();
        if (qkmVar == null) {
            return;
        }
        qkmVar.m = null;
        qkmVar.n = null;
        qkm.p();
        if (qkmVar.o != null) {
            this.b.post(new qkh(qkmVar, i));
        }
    }

    @Override // defpackage.qkt
    public final void d(int i) {
        if (((qkm) this.a.get()) == null) {
            return;
        }
        qkm.p();
    }

    @Override // defpackage.qkt
    public final void e(ApplicationStatus applicationStatus) {
        qkm qkmVar = (qkm) this.a.get();
        if (qkmVar == null) {
            return;
        }
        this.b.post(new qkj(qkmVar, applicationStatus));
    }

    @Override // defpackage.qkt
    public final void f(int i) {
        if (((qkm) this.a.get()) == null) {
            return;
        }
        qkm.p();
    }

    @Override // defpackage.qkt
    public final void g(int i) {
    }

    @Override // defpackage.qkt
    public final void h(DeviceStatus deviceStatus) {
        qkm qkmVar = (qkm) this.a.get();
        if (qkmVar == null) {
            return;
        }
        this.b.post(new qki(qkmVar, deviceStatus));
    }

    @Override // defpackage.qkt
    public final void i(int i) {
        qkm p = p();
        if (p == null || i == 0) {
            return;
        }
        p.I(2);
    }

    @Override // defpackage.qkt
    public final void j(int i) {
    }

    @Override // defpackage.qkt
    public final void k(String str, String str2) {
        qkm qkmVar = (qkm) this.a.get();
        if (qkmVar == null) {
            return;
        }
        this.b.post(new qkk(qkmVar, str, str2));
    }

    @Override // defpackage.qkt
    public final void l(long j) {
        qkm qkmVar = (qkm) this.a.get();
        if (qkmVar == null) {
            return;
        }
        qkmVar.n(j, 0);
    }

    @Override // defpackage.qkt
    public final void m(long j, int i) {
        qkm qkmVar = (qkm) this.a.get();
        if (qkmVar == null) {
            return;
        }
        qkmVar.n(j, i);
    }

    @Override // defpackage.qkt
    public final void n() {
        Object obj = qkm.a;
    }

    @Override // defpackage.qkt
    public final void o(byte[] bArr) {
        if (((qkm) this.a.get()) == null) {
            return;
        }
        Object obj = qkm.a;
        int length = bArr.length;
    }

    public final qkm p() {
        qkm qkmVar = (qkm) this.a.getAndSet(null);
        if (qkmVar == null) {
            return null;
        }
        qkmVar.k();
        return qkmVar;
    }
}
