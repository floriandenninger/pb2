package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.presenter.DismissalFollowUpDialogFragmentController;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrj implements ajom {
    public final View a;
    public final aahd b;
    public final acra c;
    public final DismissalFollowUpDialogFragmentController d;
    private final TextView e;
    private final TextView f;
    private final TextView g;

    public mrj(View view, aahd aahdVar, acra acraVar, DismissalFollowUpDialogFragmentController dismissalFollowUpDialogFragmentController) {
        this.a = view;
        this.b = aahdVar;
        this.c = acraVar;
        this.d = dismissalFollowUpDialogFragmentController;
        this.e = (TextView) view.findViewById(R.id.success_response_text);
        final TextView textView = (TextView) view.findViewById(R.id.undo_text);
        this.f = textView;
        this.g = (TextView) view.findViewById(R.id.dismissal_reasons_text);
        final int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.notification_text_min_touch_area_height);
        final View view2 = (View) textView.getParent();
        view2.post(new Runnable() { // from class: mrg
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView2 = textView;
                int i = dimensionPixelSize;
                View view3 = view2;
                Rect rect = new Rect();
                textView2.getHitRect(rect);
                if (rect.height() >= i) {
                    return;
                }
                int height = (i - rect.height()) / 2;
                rect.top -= height;
                rect.bottom += height;
                view3.setTouchDelegate(new TouchDelegate(rect, textView2));
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, final atnz atnzVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        ajokVar.a.u(new acqx(atnzVar.f), null);
        TextView textView = this.e;
        aqyg aqygVar3 = atnzVar.c;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar3));
        TextView textView2 = this.e;
        aqyg aqygVar4 = atnzVar.c;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        textView2.setContentDescription(mrk.f(aqygVar4));
        TextView textView3 = this.f;
        aqyg aqygVar5 = atnzVar.d;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar5));
        TextView textView4 = this.f;
        aqyg aqygVar6 = atnzVar.d;
        if (aqygVar6 == null) {
            aqygVar6 = aqyg.a;
        }
        textView4.setContentDescription(mrk.f(aqygVar6));
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", atnzVar);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: mri
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mrj mrjVar = mrj.this;
                atnz atnzVar2 = atnzVar;
                Map map = hashMap;
                if ((atnzVar2.b & 4) != 0) {
                    aahd aahdVar = mrjVar.b;
                    apxf apxfVar = atnzVar2.e;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, map);
                }
            }
        });
        if (!atnzVar.pY(atny.b)) {
            whu.I(this.g, false);
            return;
        }
        arpw arpwVar = (arpw) atnzVar.pX(atny.b);
        TextView textView5 = this.g;
        if ((arpwVar.b & 4) != 0) {
            aqygVar = arpwVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView5, ajcq.b(aqygVar));
        TextView textView6 = this.g;
        if ((arpwVar.b & 4) != 0) {
            aqygVar2 = arpwVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView6.setContentDescription(mrk.f(aqygVar2));
        Object c = ajokVar.c("sectionController");
        final lxb lxbVar = c instanceof lxb ? (lxb) c : null;
        this.g.setOnClickListener(new View.OnClickListener() { // from class: mrh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mrj mrjVar = mrj.this;
                atnz atnzVar2 = atnzVar;
                lxb lxbVar2 = lxbVar;
                if ((atnzVar2.b & 16) != 0) {
                    mrjVar.c.I(3, new acqx(atnzVar2.f.I()), null);
                }
                if (lxbVar2 != null) {
                    lxbVar2.q(atnzVar2, atnzVar2.pX(atny.b));
                    return;
                }
                DismissalFollowUpDialogFragmentController dismissalFollowUpDialogFragmentController = mrjVar.d;
                dismissalFollowUpDialogFragmentController.a = atnzVar2;
                dismissalFollowUpDialogFragmentController.k();
                if (dismissalFollowUpDialogFragmentController.i() == null) {
                    mnu mnuVar = new mnu();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("notification_text_renderer", atnzVar2.toByteArray());
                    mnuVar.af(bundle);
                    amkq.N(true);
                    dismissalFollowUpDialogFragmentController.j(mnuVar);
                }
            }
        });
        ajokVar.a.F(new acqx(arpwVar.c), new acqx(atnzVar.f));
    }
}
