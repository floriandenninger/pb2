package defpackage;

import android.widget.ImageView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajlv implements ajjy {
    final int a;
    private final ajjz b;
    private final ajzi c;
    private final int d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final aksl h;
    private int j;
    private final Map i = new ConcurrentHashMap();
    private boolean k = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajlv(ajjz ajjzVar, ajzi ajziVar, int i, int i2, int i3, boolean z, boolean z2, aksl akslVar) {
        this.b = ajjzVar;
        this.c = ajziVar;
        this.a = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.h = akslVar;
        this.g = z2;
    }

    private final void m(ImageView imageView) {
        this.i.remove(imageView);
        if (!this.i.isEmpty() || this.j < this.d) {
            return;
        }
        if (this.f || this.g) {
            a();
        } else {
            l();
        }
    }

    public abstract void a();

    public abstract void b(ajmo ajmoVar);

    public abstract void c(ajmp ajmpVar);

    @Override // defpackage.ajjy
    public final void d(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        aksl akslVar;
        Integer num = (Integer) this.i.get(imageView);
        if (num != null) {
            c(new ajmp(num.intValue()));
            m(imageView);
        }
        if (!this.f || (akslVar = this.h) == null) {
            return;
        }
        int i = this.a;
        if (i == 1) {
            akslVar.e("HOME");
            return;
        }
        if (i == 2) {
            akslVar.e("SEARCH");
            return;
        }
        if (i == 4) {
            akslVar.e("TRENDING");
        } else if (i == 5) {
            akslVar.e("SUBS");
        } else {
            akslVar.e("UNKNOWN");
        }
    }

    @Override // defpackage.ajjy
    public final void e(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        Integer num = (Integer) this.i.get(imageView);
        if (num != null) {
            b(new ajmo(num.intValue()));
            m(imageView);
        }
    }

    @Override // defpackage.ajjy
    public final void f(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        ajkb ajkbVar;
        avgf J2 = ahbw.J(avggVar);
        int i = 0;
        int i2 = J2 != null ? J2.d : 0;
        if (!this.k || this.j >= this.d) {
            return;
        }
        if (i2 >= this.e || imageView.getWidth() >= this.e) {
            this.i.put(imageView, Integer.valueOf(this.j));
            if (ajjvVar != null && (ajkbVar = ajjvVar.i) != null) {
                i = ajkbVar.a;
            }
            i(new ajmr(i, this.j));
            this.j++;
        }
    }

    @Override // defpackage.ajjy
    public final void g(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        aksl akslVar;
        Integer num = (Integer) this.i.get(imageView);
        if (num != null) {
            h(new ajmq(num.intValue()));
            m(imageView);
        }
        if (!this.g || (akslVar = this.h) == null) {
            return;
        }
        int i = this.a;
        if (i == 1) {
            akslVar.d("HOME");
            return;
        }
        if (i == 2) {
            akslVar.d("SEARCH");
            return;
        }
        if (i == 4) {
            akslVar.d("TRENDING");
        } else if (i == 5) {
            akslVar.d("SUBS");
        } else {
            akslVar.d("UNKNOWN");
        }
    }

    public abstract void h(ajmq ajmqVar);

    public abstract void i(ajmr ajmrVar);

    public abstract void j();

    public final void k() {
        j();
        this.i.clear();
        this.j = 0;
        ajzi ajziVar = this.c;
        if (ajziVar != null) {
            ajziVar.a(this);
        }
        this.b.d(this);
        this.k = true;
    }

    public final void l() {
        if (this.k) {
            a();
            ajzi ajziVar = this.c;
            if (ajziVar != null) {
                ajziVar.b(this);
            }
            this.b.o(this);
            this.i.clear();
            this.k = false;
        }
    }
}
