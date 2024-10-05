package defpackage;

import android.view.View;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jby implements adjm, jcs {
    public final akch a;
    public final adjs b;
    public final adkb c;
    private final adgd d;
    private final euc e;
    private final azrw f;
    private Optional g;

    static {
        zga.a("MDX.CastTooltip");
    }

    public jby(adkb adkbVar, adgd adgdVar, euc eucVar, azrw azrwVar, adjs adjsVar, akch akchVar) {
        this.c = adkbVar;
        this.d = adgdVar;
        eucVar.getClass();
        this.e = eucVar;
        this.f = azrwVar;
        this.b = adjsVar;
        akchVar.getClass();
        this.a = akchVar;
        this.g = Optional.empty();
    }

    @Override // defpackage.adjm
    public final adgd a() {
        return this.d;
    }

    @Override // defpackage.adjm
    public final adkb b() {
        return this.c;
    }

    @Override // defpackage.adjm
    public final void c() {
        this.g.ifPresent(new Consumer() { // from class: jbw
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                jby.this.a.b((akcj) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.adjm
    public final void d(Runnable runnable) {
        yjk.f();
        Optional optional = (Optional) this.f.get();
        if (optional.isPresent()) {
            akci a = this.a.a();
            a.a = (View) optional.get();
            a.i(2);
            a.c(3);
            a.f(this.c.g);
            a.b = this.e.getString(R.string.cast_icon_tooltip_text);
            a.j(1);
            a.g(this.d == adgd.WATCH ? 2900 : 9900);
            a.f = new jbx(this, runnable);
            a.g = new View.OnClickListener() { // from class: jbv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jby jbyVar = jby.this;
                    jbyVar.b.a(jbyVar.c.h);
                }
            };
            Optional of = Optional.of(a.a());
            this.g = of;
            this.a.c((akcj) of.get());
        }
    }

    @Override // defpackage.adjm
    public final boolean e() {
        return ((Optional) this.f.get()).isPresent();
    }

    @Override // defpackage.jcs
    public final Optional f() {
        return (Optional) this.f.get();
    }
}
