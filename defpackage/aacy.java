package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aacy {
    public boolean a;
    public final ajbh d;
    private final aacu e;
    final ayqw c = new ayqw();
    public final AtomicBoolean b = new AtomicBoolean(false);

    public aacy(aacu aacuVar, ajbh ajbhVar, byte[] bArr, byte[] bArr2) {
        this.e = aacuVar;
        this.d = ajbhVar;
    }

    public final void a(boolean z, int i) {
        final int i2 = 0;
        final int i3 = 1;
        if (this.b.compareAndSet(false, true)) {
            this.a = z;
            if (z) {
                this.d.i = i;
                this.c.d(this.e.a().x(new ayrs(this) { // from class: aacx
                    public final /* synthetic */ aacy a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i2 == 0) {
                            this.a.d.i = 1;
                        } else {
                            this.a.d.i = true == ((Boolean) obj).booleanValue() ? 2 : 1;
                        }
                    }
                }).V(new ayrs(this) { // from class: aacx
                    public final /* synthetic */ aacy a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i3 == 0) {
                            this.a.d.i = 1;
                        } else {
                            this.a.d.i = true == ((Boolean) obj).booleanValue() ? 2 : 1;
                        }
                    }
                }));
            } else {
                this.e.b(false);
            }
        }
    }
}
