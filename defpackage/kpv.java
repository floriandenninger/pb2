package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DecoratedPlayerBarRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kpv implements ayrs {
    public final /* synthetic */ kiw a;
    private final /* synthetic */ int b;

    public /* synthetic */ kpv(kiw kiwVar, int i) {
        this.b = i;
        this.a = kiwVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        final ammv ammvVar;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.a.ny(((Boolean) obj).booleanValue());
                    return;
                } else if (i == 3) {
                    this.a.c(((Boolean) obj).booleanValue());
                    return;
                } else {
                    this.a.d(((Boolean) obj).booleanValue());
                    return;
                }
            }
            kiw kiwVar = this.a;
            Rect rect = (Rect) obj;
            if (kiwVar.e && kiwVar.k()) {
                ((TextView) kiwVar.l.b).getGlobalVisibleRect(kiwVar.c);
                kiwVar.m.a(!kiwVar.c.intersect(rect), false);
                return;
            }
            return;
        }
        final kiw kiwVar2 = this.a;
        ((TextView) kiwVar2.n.b).setClickable(false);
        jw.M(kiwVar2.n.b, new kiu(kiwVar2));
        atzr atzrVar = ((WatchNextResponseModel) obj).i;
        if (atzrVar == null) {
            ammvVar = amlr.a;
        } else {
            aulq aulqVar = atzrVar.q;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aqit aqitVar = (aqit) aulqVar.pX(DecoratedPlayerBarRendererOuterClass.decoratedPlayerBarRenderer);
            if ((2 & aqitVar.b) != 0) {
                aulq aulqVar2 = aqitVar.d;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                ammvVar = ammv.j((apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer));
            } else {
                ammvVar = amlr.a;
            }
        }
        Drawable[] compoundDrawablesRelative = ((TextView) kiwVar2.n.b).getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative.length > 1 ? compoundDrawablesRelative[0] : null;
        if (!ammvVar.h()) {
            ((TextView) kiwVar2.n.b).setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        TextView textView = (TextView) kiwVar2.n.b;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, wbs.T(textView.getContext(), R.attr.chevronRightIcon), (Drawable) null);
        ((TextView) kiwVar2.n.b).setOnClickListener(new View.OnClickListener() { // from class: kit
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kiw kiwVar3 = kiw.this;
                ammv ammvVar2 = ammvVar;
                aahd aahdVar = kiwVar3.d;
                apxf apxfVar = ((apmg) ammvVar2.c()).p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
        });
        kiwVar2.a.n(new acqx(((apmg) ammvVar.c()).t));
    }
}
