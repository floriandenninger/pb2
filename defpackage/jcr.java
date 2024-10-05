package defpackage;

import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Observable;
import java.util.Observer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jcr {
    public final addn a;
    public final jcm b;
    public final Observer c;
    public Optional d;
    private final Observer e;

    public jcr(final addn addnVar, jcm jcmVar) {
        addnVar.getClass();
        this.a = addnVar;
        jcmVar.getClass();
        this.b = jcmVar;
        this.d = Optional.empty();
        this.c = new Observer() { // from class: jco
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                jcr.this.b.d(addnVar.h());
            }
        };
        Observer observer = new Observer() { // from class: jcn
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                jcr.this.b();
            }
        };
        this.e = observer;
        jcmVar.addObserver(observer);
    }

    public static MediaRouteButton a(MenuItem menuItem) {
        return (MediaRouteButton) hm.c(menuItem);
    }

    public final void b() {
        final Optional optional = this.b.g;
        if (this.d.isPresent() && optional.isPresent() && this.d.get() == optional.get()) {
            return;
        }
        this.d.ifPresent(new jcp(this, 1));
        optional.ifPresent(new Consumer() { // from class: jcq
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                jcr jcrVar = jcr.this;
                Optional optional2 = optional;
                jcrVar.a.addObserver(jcrVar.c);
                jcrVar.a.b(jcr.a((MenuItem) obj));
                jcrVar.b.d(jcrVar.a.h());
                jcrVar.d = optional2;
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c() {
        this.d.ifPresent(new jcp(this, 0));
    }
}
