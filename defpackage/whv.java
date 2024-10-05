package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whv implements ajom {
    private final View a;
    private final TextView b;
    private final ImageView c;

    public whv(Context context, wid widVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.manage_account_item, (ViewGroup) null);
        this.a = inflate;
        inflate.findViewById(R.id.byline).setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(R.id.name);
        this.b = textView;
        this.c = (ImageView) inflate.findViewById(R.id.thumbnail);
        inflate.setOnClickListener(new whs(widVar, 0));
        wbs.Y(context, R.attr.ytTextAppearanceBody2a).ifPresent(new whr(textView, 0));
        Optional U = wbs.U(context, R.attr.accountSwitcherNameTextColor);
        textView.getClass();
        U.ifPresent(new whh(textView, 2));
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
        this.b.setText(R.string.account_switcher_add_account);
        final Context context = this.a.getContext();
        final Drawable drawable = context.getResources().getDrawable(R.drawable.quantum_ic_add_grey600_18, null);
        this.c.setImageDrawable((Drawable) wbs.U(context, R.attr.ytTextSecondary).map(new Function() { // from class: whq
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj2) {
                return new zau(context).c(drawable, (ColorStateList) obj2);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(drawable));
    }
}
