package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afry implements yqa {
    public final afrw a;
    public final afrz b;
    private yqi c;
    private final Application d;
    private final ynn e;

    public afry(ynn ynnVar, afrw afrwVar, afrz afrzVar, Application application) {
        this.a = afrwVar;
        this.b = afrzVar;
        this.d = application;
        this.e = ynnVar;
    }

    public void a() {
        if (this.c == null) {
            yqi yqiVar = new yqi();
            this.c = yqiVar;
            yqiVar.a(this.d);
            this.c.c(this);
            if (uon.c(this.d.getApplicationContext())) {
                return;
            }
            c();
        }
    }

    @Override // defpackage.yqa
    public final void c() {
        final int i = 1;
        this.e.a(1, new Runnable(this) { // from class: afrx
            public final /* synthetic */ afry a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i != 0) {
                    this.a.b.b();
                } else {
                    this.a.a.d();
                }
            }
        });
        final int i2 = 0;
        this.e.a(1, new Runnable(this) { // from class: afrx
            public final /* synthetic */ afry a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i2 != 0) {
                    this.a.b.b();
                } else {
                    this.a.a.d();
                }
            }
        });
    }
}
