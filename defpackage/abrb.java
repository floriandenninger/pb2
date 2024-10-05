package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abrb implements abqx, abrp {
    public int a;
    public int b;
    public abro c;
    public Handler d;
    public int e;
    private final abqy f = new abqy(this);

    @Override // defpackage.abqx
    public final void a(int i) {
        this.e = i;
    }

    @Override // defpackage.abqx
    public final void b() {
        abro abroVar = this.c;
        if (abroVar != null) {
            Handler handler = this.d;
            if (handler != null) {
                handler.post(new Runnable() { // from class: abra
                    @Override // java.lang.Runnable
                    public final void run() {
                        abrb.this.c.a();
                    }
                });
            } else {
                abroVar.a();
            }
        }
    }

    @Override // defpackage.abrp
    public final void c(abqu abquVar) {
        this.f.a();
        this.a = 0;
        this.b = 0;
        this.e = 0;
    }

    @Override // defpackage.abrp
    public final boolean e(boolean z, abrr abrrVar, abqu abquVar) {
        int i;
        int i2 = this.a;
        if (i2 == 0 || (i = this.b) == 0) {
            return false;
        }
        this.f.b(i2, i);
        this.f.e(z, abrrVar, abquVar);
        return true;
    }
}
