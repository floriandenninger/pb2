package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ejg extends eiy {
    public ci a;
    public fyb ae;
    public ejl af;
    public YouTubeTextView ag;
    public YouTubeTextView ah;
    public ViewGroup ai;
    public ViewGroup aj;
    public ViewGroup ak;
    public Map al;
    public boolean am;
    aati an;
    public akpq ao;
    public jgp ap;
    private View aq;
    private View ar;
    private YouTubeTextView as;
    private YouTubeTextView at;
    private View au;
    private ajok av;
    public aahd b;
    public ajjz c;
    public acra d;
    public ajut e;

    public final void aF(Throwable th, String str, View.OnClickListener onClickListener) {
        ViewGroup viewGroup = this.ai;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        s();
        this.at.setText(this.ae.b(th));
        this.at.setVisibility(0);
        this.as.setText(str);
        this.as.setVisibility(0);
        this.au.setOnClickListener(onClickListener);
        this.au.setVisibility(0);
    }

    public final void aG() {
        ViewGroup viewGroup = this.ai;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        YouTubeTextView youTubeTextView = this.at;
        if (youTubeTextView != null) {
            youTubeTextView.setVisibility(8);
        }
        View view = this.au;
        if (view != null) {
            view.setVisibility(8);
        }
        YouTubeTextView youTubeTextView2 = this.as;
        if (youTubeTextView2 != null) {
            youTubeTextView2.setVisibility(8);
        }
        View view2 = this.ar;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // defpackage.acri
    protected final acra mM() {
        return this.d;
    }

    @Override // defpackage.acri, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.required_sign_in, viewGroup, false);
        this.aq = inflate;
        this.ai = (ViewGroup) inflate.findViewById(R.id.sign_in_layout);
        this.aj = (ViewGroup) this.aq.findViewById(R.id.feedback_layout);
        this.ak = (ViewGroup) this.aq.findViewById(R.id.learn_more_layout);
        this.at = (YouTubeTextView) this.aq.findViewById(R.id.error_message_text);
        this.as = (YouTubeTextView) this.aq.findViewById(R.id.error_title_text);
        this.au = this.aq.findViewById(R.id.error_retry_button);
        this.ag = (YouTubeTextView) this.aq.findViewById(R.id.title);
        this.ah = (YouTubeTextView) this.aq.findViewById(R.id.description);
        super.mg(layoutInflater, viewGroup, bundle);
        ajok ajokVar = new ajok();
        this.av = ajokVar;
        ajokVar.a(this.d);
        this.al = new HashMap();
        this.ar = this.aq.findViewById(R.id.load_progress);
        aG();
        return this.aq;
    }

    @Override // defpackage.acri
    protected final acsc p() {
        return acsb.b(76980);
    }

    public final void q(apmg apmgVar, ViewGroup viewGroup, acsc acscVar) {
        r(apmgVar, viewGroup, acscVar, null, 0);
    }

    public final void r(apmg apmgVar, ViewGroup viewGroup, acsc acscVar, final ajyc ajycVar, int i) {
        frg d;
        final acqx acqxVar = acscVar != null ? new acqx(acscVar) : null;
        ajyc ajycVar2 = new ajyc() { // from class: eje
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                ejg ejgVar = ejg.this;
                acsa acsaVar = acqxVar;
                ajyc ajycVar3 = ajycVar;
                if (acsaVar != null) {
                    ejgVar.d.I(3, acsaVar, null);
                }
                if (ajycVar3 != null) {
                    ajycVar3.oC(aongVar);
                }
            }
        };
        if (i != 0) {
            d = this.ap.e(ajycVar2, this.al, i);
        } else {
            d = this.ap.d(ajycVar2, this.al);
        }
        d.oB(this.av, apmgVar);
        d.b.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.addView(d.b);
        if (acqxVar != null) {
            this.d.n(acqxVar);
        }
    }

    public final void s() {
        View view = this.ar;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
