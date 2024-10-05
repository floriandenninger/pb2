package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayhf extends ayaw {
    public volatile boolean a;
    public List b = new ArrayList();
    public final ayaw c;

    public ayhf(ayaw ayawVar, byte[] bArr, byte[] bArr2) {
        this.c = ayawVar;
    }

    private final void w(Runnable runnable) {
        synchronized (this) {
            if (this.a) {
                runnable.run();
            } else {
                this.b.add(runnable);
            }
        }
    }

    @Override // defpackage.ayaw
    public final void c(Status status, aycd aycdVar) {
        w(new ayhd(this, status, aycdVar));
    }

    @Override // defpackage.ayaw
    public final void d(aycd aycdVar) {
        if (this.a) {
            this.c.d(aycdVar);
        } else {
            w(new ayhb(this, aycdVar));
        }
    }

    @Override // defpackage.ayaw
    public final void e(Object obj) {
        if (this.a) {
            this.c.e(obj);
        } else {
            w(new ayhc(this, obj));
        }
    }

    @Override // defpackage.ayaw
    public final void f() {
        if (this.a) {
            this.c.f();
        } else {
            w(new ayhe(this));
        }
    }
}
