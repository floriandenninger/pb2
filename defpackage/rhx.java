package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhx implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ rid b;
    private final /* synthetic */ int c;

    public rhx(rid ridVar, AtomicReference atomicReference, int i) {
        this.c = i;
        this.b = ridVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        double doubleValue;
        int i = this.c;
        if (i == 0) {
            synchronized (this.a) {
                try {
                    AtomicReference atomicReference = this.a;
                    rem J2 = this.b.J();
                    String p = this.b.h().p();
                    rfc rfcVar = rfd.L;
                    if (p == null) {
                        str = (String) rfcVar.a();
                    } else {
                        str = (String) rfcVar.b(J2.a.a(p, rfcVar.a));
                    }
                    atomicReference.set(str);
                } finally {
                }
            }
            return;
        }
        if (i == 1) {
            synchronized (this.a) {
                try {
                    this.a.set(Boolean.valueOf(this.b.J().p(this.b.h().p(), rfd.K)));
                } finally {
                }
            }
            return;
        }
        if (i == 2) {
            synchronized (this.a) {
                try {
                    this.a.set(Long.valueOf(this.b.J().h(this.b.h().p(), rfd.M)));
                } finally {
                }
            }
            return;
        }
        if (i != 3) {
            synchronized (this.a) {
                try {
                    AtomicReference atomicReference2 = this.a;
                    rem J3 = this.b.J();
                    String p2 = this.b.h().p();
                    rfc rfcVar2 = rfd.O;
                    if (p2 == null) {
                        doubleValue = ((Double) rfcVar2.a()).doubleValue();
                    } else {
                        String a = J3.a.a(p2, rfcVar2.a);
                        if (TextUtils.isEmpty(a)) {
                            doubleValue = ((Double) rfcVar2.a()).doubleValue();
                        } else {
                            try {
                                doubleValue = ((Double) rfcVar2.b(Double.valueOf(Double.parseDouble(a)))).doubleValue();
                            } catch (NumberFormatException unused) {
                                doubleValue = ((Double) rfcVar2.a()).doubleValue();
                            }
                        }
                    }
                    atomicReference2.set(Double.valueOf(doubleValue));
                } finally {
                }
            }
            return;
        }
        synchronized (this.a) {
            try {
                this.a.set(Integer.valueOf(this.b.J().e(this.b.h().p(), rfd.N)));
            } finally {
            }
        }
    }
}
