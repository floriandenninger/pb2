package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zcd {
    public View a;
    public zcb b;
    public zcc c;
    private final ViewTreeObserver.OnPreDrawListener e;
    private WeakReference f;
    private boolean h;
    private zby g = new zby();
    public zby d = new zby();

    public zcd(View view) {
        view.getClass();
        this.a = view;
        this.e = new ViewTreeObserver.OnPreDrawListener() { // from class: zbz
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                zcd.this.b();
                return true;
            }
        };
        this.h = false;
    }

    public final View a() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void b() {
        View a = a();
        if (a != null) {
            zby zbyVar = this.g;
            this.g = this.d;
            zby.c(zbyVar, a, this.a);
            this.d = zbyVar;
            if (this.c != null) {
                zby zbyVar2 = this.g;
                boolean e = zbyVar.e();
                boolean e2 = zbyVar2.e();
                if ((e || e2) && !zbyVar.equals(zbyVar2)) {
                    this.c.rV(this.d);
                }
            }
        }
    }

    public final void c(View view) {
        if (view == a()) {
            b();
            return;
        }
        this.f = new WeakReference(view);
        zcb zcbVar = this.b;
        if (zcbVar != null) {
            zcbVar.e(view);
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (view != null && !this.h) {
            viewTreeObserver.addOnPreDrawListener(this.e);
            this.h = true;
        }
        if (view == null && this.h) {
            viewTreeObserver.removeOnPreDrawListener(this.e);
            this.h = false;
        }
        if (view == null) {
            if (this.d.e()) {
                this.d.d();
                Optional.ofNullable(this.c).ifPresent(new Consumer() { // from class: zca
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        ((zcc) obj).rV(zcd.this.d);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            return;
        }
        b();
    }

    public final void d() {
        c(null);
    }
}
