package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.ui.bottomui.Mealbar;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gcd implements gbj {
    private final Mealbar a;
    private final ajjz b;
    private final ajyg c;

    public gcd(Mealbar mealbar, ajjz ajjzVar, ajyg ajygVar) {
        this.a = mealbar;
        mealbar.setOnClickListener(null);
        this.b = ajjzVar;
        this.c = ajygVar;
    }

    private static final View.OnClickListener b(final View.OnClickListener onClickListener, final gat gatVar) {
        if (onClickListener == null) {
            return new View.OnClickListener() { // from class: gcb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gat.this.a(1);
                }
            };
        }
        return new View.OnClickListener() { // from class: gca
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                View.OnClickListener onClickListener2 = onClickListener;
                gat gatVar2 = gatVar;
                onClickListener2.onClick(view);
                gatVar2.a(1);
            }
        };
    }

    @Override // defpackage.gbj
    public final /* synthetic */ View a(gbi gbiVar, gat gatVar) {
        akby akbyVar = (akby) gbiVar;
        Mealbar mealbar = this.a;
        whu.G(mealbar.g, akbyVar.a);
        Mealbar mealbar2 = this.a;
        whu.G(mealbar2.h, akbyVar.b);
        avgg avggVar = akbyVar.i;
        if (avggVar != null) {
            ImageView imageView = this.a.k;
            imageView.setVisibility(0);
            this.b.h(imageView, avggVar);
        } else {
            int i = akbyVar.j;
            if (i != 0) {
                Optional optional = akbyVar.k;
                final ImageView imageView2 = this.a.k;
                this.b.e(imageView2);
                imageView2.setVisibility(0);
                optional.ifPresent(new Consumer() { // from class: gcc
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        ImageView imageView3 = imageView2;
                        imageView3.setImageTintList(wbs.S(imageView3.getContext(), ((zil) obj).a));
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
                imageView2.setImageResource(i);
            } else {
                this.a.k.setVisibility(8);
            }
        }
        if (this.c != null && akbyVar.e != null) {
            Mealbar mealbar3 = this.a;
            View.OnClickListener b = b(akbyVar.d, gatVar);
            this.c.a(mealbar3.i).b(akbyVar.e, null);
            mealbar3.i.setOnClickListener(b);
        } else {
            Mealbar mealbar4 = this.a;
            CharSequence charSequence = akbyVar.c;
            View.OnClickListener b2 = b(akbyVar.d, gatVar);
            whu.G(mealbar4.i, charSequence);
            Button button = mealbar4.i;
            whu.E(button, button.getBackground());
            mealbar4.i.setOnClickListener(b2);
        }
        if (this.c == null || akbyVar.h == null) {
            Mealbar mealbar5 = this.a;
            CharSequence charSequence2 = akbyVar.f;
            View.OnClickListener b3 = b(akbyVar.g, gatVar);
            whu.G(mealbar5.j, charSequence2);
            mealbar5.j.setOnClickListener(b3);
        } else {
            Mealbar mealbar6 = this.a;
            View.OnClickListener b4 = b(akbyVar.g, gatVar);
            this.c.a(mealbar6.j).b(akbyVar.h, null);
            mealbar6.j.setOnClickListener(b4);
        }
        return this.a;
    }
}
