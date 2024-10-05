package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajjo implements zae {
    final /* synthetic */ ajjv a;
    final /* synthetic */ ajkc b;
    final /* synthetic */ avgg c;
    final /* synthetic */ ajkj d;
    public final /* synthetic */ ajjp e;

    public ajjo(ajjp ajjpVar, ajjv ajjvVar, ajkc ajkcVar, avgg avggVar, ajkj ajkjVar) {
        this.e = ajjpVar;
        this.a = ajjvVar;
        this.b = ajkcVar;
        this.c = avggVar;
        this.d = ajkjVar;
    }

    public final void a(ImageView imageView) {
        ajjx ajjxVar = this.a.h;
        if (ajjxVar != null) {
            ajjxVar.b(imageView);
        }
        this.b.e(imageView, this.a, this.c);
    }

    @Override // defpackage.zae
    public final void d(ImageView imageView) {
        ajjv ajjvVar = this.a;
        ajjx ajjxVar = ajjvVar.h;
        int i = ajjvVar.e;
        if (i > 0) {
            this.d.g(i);
        }
        if (ajjxVar != null) {
            ajjxVar.a(imageView);
        }
        this.b.d(imageView, this.a, this.c);
    }

    @Override // defpackage.zae
    public final void e(ImageView imageView) {
        ajjx ajjxVar = this.a.h;
        if (ajjxVar != null) {
            ajjxVar.c(imageView);
        }
        this.b.f(imageView, this.a, this.c);
    }

    @Override // defpackage.zae
    public final void f(ImageView imageView) {
        ajjx ajjxVar = this.a.h;
        if (ajjxVar != null) {
            ajjxVar.b(imageView);
        }
        this.b.g(imageView, this.a, this.c);
    }

    @Override // defpackage.zae
    public final void g() {
    }
}
