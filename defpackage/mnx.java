package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.presenter.DismissalFollowUpDialogFragmentController;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnx extends ajpc implements moc {
    public final ypa a;
    public arpw b;
    public mnw c;
    private final Context d;
    private final View e;
    private final gma f;
    private final TextView g;
    private final LayoutInflater h;
    private final ImageView i;
    private final mob j;
    private final LinearLayout k;
    private final DismissalFollowUpDialogFragmentController l;

    public mnx(Context context, gma gmaVar, ypa ypaVar, mob mobVar, DismissalFollowUpDialogFragmentController dismissalFollowUpDialogFragmentController) {
        this.d = context;
        this.f = gmaVar;
        ypaVar.getClass();
        this.a = ypaVar;
        this.j = mobVar;
        this.l = dismissalFollowUpDialogFragmentController;
        LayoutInflater from = LayoutInflater.from(context);
        this.h = from;
        View inflate = from.inflate(R.layout.dismissal_reason_list_layout, (ViewGroup) null);
        this.e = inflate;
        this.g = (TextView) inflate.findViewById(R.id.title);
        this.k = (LinearLayout) inflate.findViewById(R.id.reasons);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close_button);
        this.i = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: mnv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mnx mnxVar = mnx.this;
                mnw mnwVar = mnxVar.c;
                if (mnwVar != null) {
                    ((mnu) mnwVar).dismiss();
                    return;
                }
                arpw arpwVar = mnxVar.b;
                if (arpwVar != null) {
                    mnxVar.a.d(new aaxb(null, arpwVar));
                }
            }
        });
        new ajuz(inflate, imageView);
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.j.e(this.k);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        arpw arpwVar = (arpw) obj;
        ajokVar.f("parent_renderer", arpwVar);
        this.b = arpwVar;
        yny.z(this.k, yny.x(ajokVar.j("dismissal_follow_up_dialog", false) ? this.d.getResources().getDimensionPixelSize(R.dimen.dismissal_dialog_min_width) : -1), ViewGroup.LayoutParams.class);
        arpx[] arpxVarArr = (arpx[]) arpwVar.e.toArray(new arpx[0]);
        ajokVar.f("selection_listener", this);
        this.k.removeAllViews();
        for (arpx arpxVar : arpxVarArr) {
            mob mobVar = this.j;
            this.k.addView(mobVar.c(mobVar.d(ajokVar), arpxVar));
        }
        TextView textView = this.g;
        if ((arpwVar.b & 4) != 0) {
            aqygVar = arpwVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        this.i.setVisibility(true == yjk.aa(this.d) ? 8 : 0);
        int al = aobq.al(arpwVar.f);
        if (al == 0 || al != 2) {
            etx.o(ajokVar, wbs.Q(this.d, R.attr.ytGeneralBackgroundA));
            this.g.setTextColor(wbs.Q(this.d, R.attr.ytTextPrimary));
        } else {
            etx.o(ajokVar, wbs.Q(this.d, R.attr.ytBorderedButtonChipBackground));
            this.g.setTextColor(wbs.Q(this.d, R.attr.ytTextSecondary));
        }
        this.f.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arpw) obj).c.I();
    }

    @Override // defpackage.moc
    public final void f() {
        this.a.d(new ajvf(this.b));
        atnz atnzVar = this.l.a;
        if (atnzVar != null) {
            this.a.d(new ajvf(atnzVar));
        }
        mnw mnwVar = this.c;
        if (mnwVar != null) {
            ((mnu) mnwVar).dismiss();
        }
    }
}
