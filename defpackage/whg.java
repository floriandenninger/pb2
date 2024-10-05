package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whg implements ajom {
    public final View a;
    public aata b;
    public boolean c;
    private final acra d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    private final ajkj h;

    public whg(Context context, ajjs ajjsVar, acra acraVar, wia wiaVar) {
        this.d = acraVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.account_item, (ViewGroup) null);
        this.a = inflate;
        final TextView textView = (TextView) inflate.findViewById(R.id.name);
        this.e = textView;
        final TextView textView2 = (TextView) inflate.findViewById(R.id.byline);
        this.f = textView2;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = imageView;
        this.h = new ajkj(ajjsVar, imageView);
        inflate.setOnClickListener(new whd(this, wiaVar));
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new whe(this));
        wbs.Y(context, R.attr.ytTextAppearanceBody2a).ifPresent(new IntConsumer() { // from class: whc
            @Override // j$.util.function.IntConsumer
            public final void accept(int i) {
                TextView textView3 = textView;
                TextView textView4 = textView2;
                jm.s(textView3, i);
                jm.s(textView4, i);
            }

            @Override // j$.util.function.IntConsumer
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer.CC.$default$andThen(this, intConsumer);
            }
        });
        Optional U = wbs.U(context, R.attr.accountSwitcherNameTextColor);
        textView.getClass();
        U.ifPresent(new whh(textView, 1));
        Optional U2 = wbs.U(context, R.attr.accountSwitcherBylineTextColor);
        textView2.getClass();
        U2.ifPresent(new whh(textView2, 1));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aata aataVar = (aata) obj;
        this.c = false;
        if (aataVar.q() != null) {
            this.d.u(new acqx(aataVar.q()), null);
        }
        this.e.setText(aataVar.a());
        Spanned b = aataVar.b();
        if (!TextUtils.isEmpty(b)) {
            this.f.setText(b);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        this.h.j(aataVar.c());
        this.e.setSelected(aataVar.o());
        if (aataVar.o()) {
            this.a.requestFocus();
        }
        boolean z = aataVar.a.i;
        boolean z2 = !z;
        this.a.setEnabled(z2);
        this.e.setEnabled(z2);
        this.f.setEnabled(z2);
        this.g.setAlpha(true != z ? 1.0f : 0.6f);
        this.b = aataVar;
    }
}
