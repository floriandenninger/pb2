package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.f;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ilb {
    private static final ila m = new ila();
    public final ajjz a;
    public final axze b;
    public final amnv c;
    public ImageView e;
    public ImageView f;
    public ikz g;
    public ajkj h;
    public avgg i;
    public boolean j;
    public boolean k;
    private final int n;
    public final yzw d = new ikx(this);
    public final ykl l = new f(1);

    public ilb(ajjz ajjzVar, amnv amnvVar, yqw yqwVar, axze axzeVar) {
        int i;
        this.a = ajjzVar;
        this.c = amnvVar;
        this.b = axzeVar;
        Object obj = amnvVar.get();
        if (obj == null || (i = ((aujz) obj).I) <= 0) {
            this.n = 720;
        } else {
            this.n = i;
        }
        yqwVar.h(new Callable() { // from class: ikw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ilb ilbVar = ilb.this;
                return ilbVar.b.a().ax(new ayrs() { // from class: ikv
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        ilb.this.k = ((Boolean) obj2).booleanValue();
                    }
                });
            }
        });
    }

    public final void a(afkl afklVar, Optional optional) {
        this.f.getClass();
        int e = afklVar.e();
        int c = afklVar.c();
        if (e == 0 || c == 0) {
            optional.ifPresent(gfd.m);
            return;
        }
        ila ilaVar = m;
        if (ilaVar.a == null) {
            int i = this.n;
            ilaVar.a = Bitmap.createBitmap(i, i, Bitmap.Config.RGB_565);
        }
        int i2 = this.n;
        if (e > i2 || c > i2) {
            double d = c;
            double d2 = e;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            if (e > c) {
                double d4 = i2;
                Double.isNaN(d4);
                c = (int) ((d4 * d3) + 0.5d);
                e = i2;
            } else {
                double d5 = i2;
                Double.isNaN(d5);
                e = (int) ((d5 / d3) + 0.5d);
                c = i2;
            }
        }
        if (e < 8 || c < 8) {
            optional.ifPresent(gfd.m);
            return;
        }
        this.f.setImageDrawable(null);
        ilaVar.a.reconfigure(e, c, Bitmap.Config.RGB_565);
        afklVar.l(ilaVar.a, new iky(this, optional));
    }

    public final void b() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            whu.I(this.f, false);
        }
    }

    public final void c() {
        this.j = false;
        this.k = false;
        this.i = null;
        this.h.a();
        whu.I(this.e, false);
    }

    public final void d(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        f(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        h();
    }

    public final void e() {
        whu.I(this.e, false);
    }

    public final void f(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        boolean z = true;
        if (!etx.ai(reelWatchEndpointOuterClass$ReelWatchEndpoint) && !etx.ab(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            z = false;
        }
        this.j = z;
        avgg avggVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        this.i = avggVar;
        this.h.k(avggVar);
    }

    public final void g() {
        whu.I(this.f, true);
    }

    public final void h() {
        whu.I(this.e, true);
    }
}
