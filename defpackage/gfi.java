package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gfi implements View.OnClickListener, gfj {
    public final Context a;
    public final akbu b;
    public FloatingActionButton d;
    public gfb e;
    public gfb f;
    public ObjectAnimator g;
    public ObjectAnimator h;
    public gfk i;
    public gfl j;
    public acra k;
    public boolean l;
    private final azrw m;
    private final ajut n;
    private int p;
    public final gfh c = new gfh();
    private final fxp o = new fxp();

    public gfi(Context context, azrw azrwVar, ajut ajutVar, akbu akbuVar) {
        this.a = context;
        this.m = azrwVar;
        this.n = ajutVar;
        this.b = akbuVar;
    }

    private final void i(gfb gfbVar) {
        this.e = gfbVar;
        b();
        if (gfbVar != null) {
            gfk a = a(gfbVar);
            if (a != null) {
                a.b();
                a.c(this.p);
                if (a instanceof gfl) {
                    gfl gflVar = (gfl) a;
                    gfh gfhVar = this.c;
                    int a2 = gfhVar.a(gfbVar);
                    gflVar.f((View) Optional.ofNullable(a2 != -1 ? (gnc) gfhVar.b.get(a2) : null).map(evy.n).orElse(null));
                }
            }
            final FloatingActionButton floatingActionButton = this.d;
            if (floatingActionButton != null) {
                Optional ofNullable = Optional.ofNullable(this.e);
                Optional map = ofNullable.map(evy.m).map(evy.j);
                final ajut ajutVar = this.n;
                ajutVar.getClass();
                Optional map2 = map.map(new Function() { // from class: gfe
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(ajut.this.a((arfr) obj));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                });
                if (map2.isPresent()) {
                    map2.ifPresent(new Consumer() { // from class: gfc
                        @Override // j$.util.function.Consumer
                        public final void accept(Object obj) {
                            FloatingActionButton.this.setImageResource(((Integer) obj).intValue());
                        }

                        @Override // j$.util.function.Consumer
                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer.CC.$default$andThen(this, consumer);
                        }
                    });
                } else {
                    floatingActionButton.setImageDrawable(null);
                }
                floatingActionButton.setContentDescription((CharSequence) ofNullable.map(evy.l).orElse(null));
            }
            g();
            return;
        }
        c(false);
    }

    private static final void j(ObjectAnimator objectAnimator) {
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        objectAnimator.cancel();
    }

    private static final boolean k(gfb gfbVar) {
        return (gfbVar instanceof gfa) || (gfbVar instanceof gfm);
    }

    public final gfk a(gfb gfbVar) {
        if (gfbVar instanceof gez) {
            return this.i;
        }
        if ((gfbVar instanceof gfa) || (gfbVar instanceof gfm)) {
            return this.j;
        }
        return null;
    }

    public final void b() {
        Optional.ofNullable(this.j).ifPresent(gfd.d);
    }

    @Override // defpackage.gfj
    public final void c(boolean z) {
        FloatingActionButton floatingActionButton = this.d;
        if (floatingActionButton == null) {
            return;
        }
        if (!z) {
            j(this.g);
            floatingActionButton.setScaleX(0.0f);
            floatingActionButton.setScaleY(0.0f);
            floatingActionButton.setVisibility(8);
            return;
        }
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator == null || objectAnimator.isStarted()) {
            return;
        }
        j(this.g);
        if (floatingActionButton.getVisibility() != 8) {
            objectAnimator.start();
        }
    }

    public final void d() {
        gfb gfbVar = this.f;
        if (gfbVar != null) {
            if (!k(gfbVar) || this.c.b(this.f)) {
                i(this.f);
                this.f = null;
            }
        }
    }

    public final void e() {
        FloatingActionButton floatingActionButton = this.d;
        if (floatingActionButton != null) {
            floatingActionButton.setTranslationY(0.0f);
            this.d.setScaleX(1.0f);
            this.d.setScaleY(1.0f);
            this.d.setVisibility(8);
        }
    }

    public final void f(gfb gfbVar) {
        if (this.l) {
            if (gfbVar != null) {
                if (this.e != gfbVar) {
                    if (((Boolean) Optional.ofNullable(this.g).map(evy.k).orElse(false)).booleanValue() || ((Boolean) Optional.ofNullable(this.h).map(evy.k).orElse(false)).booleanValue() || (k(gfbVar) && !this.c.b(gfbVar))) {
                        this.f = gfbVar;
                        return;
                    }
                } else {
                    g();
                    return;
                }
            }
            i(gfbVar);
            this.f = null;
        }
    }

    @Override // defpackage.gfj
    public final void g() {
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        j(this.h);
        if (((Boolean) Optional.ofNullable(this.d).map(evy.i).orElse(false)).booleanValue()) {
            c(false);
            objectAnimator.start();
        }
    }

    public final void h(int i, int i2) {
        gfk a;
        this.o.c(i, i2);
        int i3 = this.o.a;
        this.p = i3;
        gfb gfbVar = this.e;
        if (gfbVar == null || (a = a(gfbVar)) == null) {
            return;
        }
        a.c(i3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar;
        gfb gfbVar = this.e;
        if (gfbVar == null || (apxfVar = (apxf) Optional.ofNullable(gfbVar.a()).orElse(gfbVar.b())) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", gfbVar);
        ((aahd) this.m.get()).c(apxfVar, hashMap);
    }
}
