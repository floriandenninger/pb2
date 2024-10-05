package defpackage;

import android.graphics.PorterDuff;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mqa {
    final /* synthetic */ mqb a;
    private final ImageView b;
    private final int c;
    private final int d;

    public mqa(mqb mqbVar, ImageView imageView, int i, int i2) {
        this.a = mqbVar;
        this.b = imageView;
        this.c = i;
        this.d = i2;
    }

    public final void a() {
        this.b.getDrawable().mutate().setColorFilter(this.a.f, PorterDuff.Mode.SRC_IN);
    }

    public final void b() {
        this.b.setImageResource(this.c);
        this.b.setTag("default");
        a();
    }

    public final void c() {
        this.b.setImageResource(this.d);
        this.b.setTag("on");
        a();
    }
}
