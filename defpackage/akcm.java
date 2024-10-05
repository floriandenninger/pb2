package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcm {
    private final acqz a;
    private final ajyg b;

    public akcm(acqz acqzVar, ajyg ajygVar) {
        this.a = acqzVar;
        this.b = ajygVar;
    }

    public static void a(TextView textView, apmg apmgVar) {
        if (apmgVar == null && TextUtils.isEmpty(null)) {
            textView.setVisibility(8);
        }
    }

    public final void b(TextView textView, final akcv akcvVar, apmg apmgVar, final int i) {
        int aJ;
        if (textView.getVisibility() == 8) {
            return;
        }
        if (apmgVar != null || TextUtils.isEmpty(null)) {
            ajyf a = this.b.a(textView);
            a.b(apmgVar, this.a.mM());
            a.c = new ajyc() { // from class: akcl
                @Override // defpackage.ajyc
                public final void oC(aong aongVar) {
                    akcv.this.b(i != 1 ? 0 : 1);
                }
            };
            if (a.h && apmgVar.c == 1 && (aJ = anaf.aJ(((Integer) apmgVar.d).intValue())) != 0 && aJ == 14) {
                if (a.g) {
                    TextView textView2 = a.f;
                    ajyf.c(textView2, nz.b(textView2.getContext(), R.drawable.tooltip_button_background), true);
                } else {
                    TextView textView3 = a.f;
                    whu.F(textView3, nz.b(textView3.getContext(), R.drawable.tooltip_button_background), a.j);
                }
                a.i = true;
                a.h = false;
                return;
            }
            return;
        }
        throw null;
    }
}
