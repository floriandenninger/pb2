package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mug implements ajom {
    private final fyl a;
    private final View b;

    public mug(Context context) {
        fyl fylVar = new fyl(wbs.W(context, R.attr.ytSeparator).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.a = fylVar;
        fylVar.c(16);
        fylVar.e(true);
        View inflate = LayoutInflater.from(context).inflate(R.layout.separator_with_padding, (ViewGroup) null, false);
        this.b = inflate;
        whu.r(inflate, fylVar);
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
    }
}
