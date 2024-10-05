package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.presenter.DismissalFollowUpDialogFragmentController;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrk extends ajpc {
    mrj a;
    private final Context b;
    private final aahd c;
    private final gma d;
    private final DismissalFollowUpDialogFragmentController e;
    private final FrameLayout f;
    private mrj g;
    private mrj h;
    private final aadw i;

    public mrk(Context context, aahd aahdVar, gma gmaVar, DismissalFollowUpDialogFragmentController dismissalFollowUpDialogFragmentController, aadw aadwVar) {
        context.getClass();
        this.b = context;
        aahdVar.getClass();
        this.c = aahdVar;
        this.d = gmaVar;
        dismissalFollowUpDialogFragmentController.getClass();
        this.e = dismissalFollowUpDialogFragmentController;
        this.i = aadwVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        gmaVar.c(frameLayout);
        frameLayout.setBackground(new fyl(wbs.Q(context, R.attr.ytSeparator), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public static String f(aqyg aqygVar) {
        if (aqygVar == null) {
            return null;
        }
        aqyh aqyhVar = aqygVar.f;
        if (aqyhVar == null) {
            aqyhVar = aqyh.a;
        }
        if ((aqyhVar.b & 1) == 0) {
            return null;
        }
        aqyh aqyhVar2 = aqygVar.f;
        if (aqyhVar2 == null) {
            aqyhVar2 = aqyh.a;
        }
        aots aotsVar = aqyhVar2.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }

    protected static final byte[] g(atnz atnzVar) {
        return (byte[]) atnzVar.f.I().clone();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if (this.a != null) {
            this.a = null;
        }
        this.f.removeAllViews();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        atnz atnzVar = (atnz) obj;
        this.f.removeAllViews();
        if (fav.h(ajokVar)) {
            if (this.g == null) {
                this.g = new mrj(LayoutInflater.from(this.b).inflate(true != evr.av(this.i) ? R.layout.video_dismissed_entry_tablet : R.layout.video_dismissed_entry_tablet_v2, (ViewGroup) null), this.c, ajokVar.a, this.e);
            }
            this.a = this.g;
        } else {
            if (this.h == null) {
                this.h = new mrj(LayoutInflater.from(this.b).inflate(R.layout.video_dismissed_entry, (ViewGroup) null), this.c, ajokVar.a, this.e);
            }
            mrj mrjVar = this.h;
            this.a = mrjVar;
            mrjVar.a.setBackgroundColor(wbs.Q(this.b, R.attr.ytGeneralBackgroundA));
            int al = aobq.al(atnzVar.g);
            if (al != 0 && al == 2) {
                this.a.a.setBackgroundColor(wbs.Q(this.b, R.attr.ytBorderedButtonChipBackground));
                TextView textView = (TextView) this.a.a.findViewById(R.id.undo_text);
                TextView textView2 = (TextView) this.a.a.findViewById(R.id.dismissal_reasons_text);
                textView.setTextColor(wbs.Q(this.b, R.attr.ytCallToAction));
                textView2.setTextColor(wbs.Q(this.b, R.attr.ytCallToAction));
            }
        }
        this.a.oB(ajokVar, atnzVar);
        this.f.addView(this.a.a);
        FrameLayout frameLayout = this.f;
        frameLayout.post(new mrf(frameLayout, 0));
        this.d.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return g((atnz) obj);
    }
}
