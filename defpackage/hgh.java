package defpackage;

import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hgh {
    final View a;
    public long e;
    private final Runnable g;
    private final Runnable h;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    private final Handler f = new Handler();

    public hgh(final View view) {
        final int i = 0;
        this.a = view;
        final int i2 = 1;
        this.g = new Runnable(this) { // from class: hgg
            public final /* synthetic */ hgh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i2 == 0) {
                    hgh hghVar = this.a;
                    fhe.J(view);
                    hghVar.b = false;
                    hghVar.d = false;
                    return;
                }
                hgh hghVar2 = this.a;
                fhe.I(view);
                hghVar2.b = true;
                hghVar2.c = false;
                hghVar2.e = System.currentTimeMillis();
            }
        };
        this.h = new Runnable(this) { // from class: hgg
            public final /* synthetic */ hgh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i == 0) {
                    hgh hghVar = this.a;
                    fhe.J(view);
                    hghVar.b = false;
                    hghVar.d = false;
                    return;
                }
                hgh hghVar2 = this.a;
                fhe.I(view);
                hghVar2.b = true;
                hghVar2.c = false;
                hghVar2.e = System.currentTimeMillis();
            }
        };
    }

    public final void a() {
        if (!this.b) {
            this.f.removeCallbacks(this.g);
            this.c = false;
        } else {
            if (this.d) {
                return;
            }
            this.d = true;
            long currentTimeMillis = System.currentTimeMillis() - this.e;
            if (currentTimeMillis >= 300) {
                this.f.post(this.h);
            } else {
                this.f.postDelayed(this.h, 300 - currentTimeMillis);
            }
        }
    }

    public final void b() {
        this.f.removeCallbacks(this.g);
        this.f.removeCallbacks(this.h);
        this.c = false;
        this.d = false;
        this.b = false;
        fhe.J(this.a);
    }

    public final void c() {
        if (this.b) {
            this.f.removeCallbacks(this.h);
            this.d = false;
        } else {
            if (this.c) {
                return;
            }
            this.c = true;
            this.f.postDelayed(this.g, 300L);
        }
    }
}
