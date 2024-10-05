package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adqa implements zfi {
    public final /* synthetic */ adqc a;
    private final /* synthetic */ int b;

    public /* synthetic */ adqa(adqc adqcVar, int i) {
        this.b = i;
        this.a = adqcVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        anhy b;
        anhy anhyVar;
        anhy anhyVar2;
        int i = 1;
        if (this.b != 0) {
            adqc adqcVar = this.a;
            Boolean bool = (Boolean) obj;
            if (bool == null || !bool.booleanValue()) {
                YouTubeTextView youTubeTextView = new YouTubeTextView(adqcVar.l);
                youTubeTextView.setText(R.string.mdx_smart_remote_cast_icon_tip);
                youTubeTextView.setTextSize(2, adqcVar.l.getResources().getDimension(R.dimen.mdx_smart_remote_tooltip_text_size));
                youTubeTextView.setWidth(adqcVar.l.getResources().getDimensionPixelSize(R.dimen.mdx_smart_remote_tooltip_width));
                youTubeTextView.setTextColor(adqcVar.l.getResources().getColor(R.color.yt_white2));
                final akcv akcvVar = new akcv(youTubeTextView, adqcVar.r, 2, 2);
                akcvVar.e(new View.OnClickListener() { // from class: adpz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        akcv akcvVar2 = akcv.this;
                        int i2 = adqc.E;
                        akcvVar2.b(1);
                    }
                });
                adqcVar.r.getViewTreeObserver().addOnGlobalLayoutListener(new adqb(adqcVar, akcvVar));
                ce ceVar = adqcVar.a;
                if (adqcVar.m()) {
                    anhyVar2 = ((vgz) adqcVar.i.get()).b(adpv.d, angq.a);
                } else {
                    adqcVar.g.edit().putBoolean("MDx.SmartRemote.isDisconnectTipAlreadyShown", true).apply();
                    anhyVar2 = anhv.a;
                }
                ynm.n(ceVar, anhyVar2, adpt.a, ynm.b);
                return;
            }
            return;
        }
        adqc adqcVar2 = this.a;
        Boolean bool2 = (Boolean) obj;
        boolean booleanValue = bool2 == null ? false : bool2.booleanValue();
        if (!booleanValue) {
            adqcVar2.f();
            ce ceVar2 = adqcVar2.a;
            if (adqcVar2.m()) {
                anhyVar = ((vgz) adqcVar2.i.get()).b(adpv.c, angq.a);
            } else {
                adqcVar2.g.edit().putBoolean("MDx.SmartRemote.isPrivacyDialogShown", true).apply();
                anhyVar = anhv.a;
            }
            ynm.n(ceVar2, anhyVar, adpt.c, ynm.b);
        }
        int i2 = adqcVar2.D;
        if (i2 != 4) {
            if (i2 == 3) {
                if (!booleanValue) {
                    adqcVar2.n(4, false, false);
                    return;
                } else {
                    adqcVar2.h();
                    return;
                }
            }
            return;
        }
        if (adqcVar2.y) {
            return;
        }
        ce ceVar3 = adqcVar2.a;
        if (adqcVar2.m()) {
            b = ynm.b(adqcVar2.a, ((vgz) adqcVar2.i.get()).a(), adpv.b);
        } else {
            b = ynm.b(adqcVar2.a, anaf.O(Boolean.valueOf(adqcVar2.g.getBoolean("MDx.SmartRemote.isDisconnectTipAlreadyShown", false))), adpv.f);
        }
        ynm.n(ceVar3, b, zxq.u, new adqa(adqcVar2, i));
    }
}
