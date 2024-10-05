package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whb implements ajom {
    public aatb a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final Resources e;
    private final zaw f;

    public whb(Context context, zaw zawVar, wib wibVar) {
        this.f = zawVar;
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.account_item, (ViewGroup) null);
        this.b = inflate;
        this.e = from.getContext().getResources();
        final TextView textView = (TextView) inflate.findViewById(R.id.name);
        this.c = textView;
        final TextView textView2 = (TextView) inflate.findViewById(R.id.byline);
        this.d = textView2;
        Drawable a = aii.a(context, R.drawable.account_switcher_alert);
        a.getClass();
        Drawable mutate = a.mutate();
        Optional U = wbs.U(context, R.attr.ytTextPrimary);
        textView.getClass();
        textView.setTextColor((ColorStateList) U.orElseGet(new Supplier() { // from class: wgy
            @Override // j$.util.function.Supplier
            public final Object get() {
                return textView.getTextColors();
            }
        }));
        Optional U2 = wbs.U(context, R.attr.ytTextSecondary);
        textView2.getClass();
        textView2.setTextColor((ColorStateList) U2.orElseGet(new Supplier() { // from class: wgy
            @Override // j$.util.function.Supplier
            public final Object get() {
                return textView2.getTextColors();
            }
        }));
        mutate.setTint(wbs.W(context, R.attr.ytIconInactive).orElse(-7829368));
        mutate.setTintMode(PorterDuff.Mode.SRC_IN);
        ((ImageView) inflate.findViewById(R.id.thumbnail)).setImageDrawable(mutate);
        inflate.setOnClickListener(new wgz(this, wibVar));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        String string;
        aatb aatbVar = (aatb) obj;
        this.a = aatbVar;
        if (!aatbVar.b()) {
            Throwable th = aatbVar.b;
            if (th != null) {
                string = this.f.b(th);
            } else {
                string = this.e.getString(R.string.account_switcher_error_general_title);
            }
            this.c.setText(string);
            this.d.setText(this.e.getString(R.string.account_switcher_error_general_byline));
            return;
        }
        this.c.setText(this.e.getString(R.string.account_switcher_error_credentials_title));
        this.d.setText(this.e.getString(R.string.account_switcher_error_credentials_byline));
    }
}
