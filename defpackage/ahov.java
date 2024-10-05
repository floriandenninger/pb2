package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.vr.sdk.base.HeadsetSelector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahov extends ahog {
    public static final String ae = "ahov";
    public ywr af;
    public ahox ag;
    private TextView ah;

    @Override // defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        return null;
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return null;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return null;
    }

    @Override // defpackage.ce
    public final void aa(View view, Bundle bundle) {
        final int i = 0;
        view.setVisibility(0);
        view.findViewById(R.id.vr_speed_bump_icon).setVisibility(8);
        ((TextView) view.findViewById(R.id.vr_speed_bump_title)).setText(R.string.vr_watch_in_vr_title);
        this.ah = (TextView) view.findViewById(R.id.vr_speed_bump_message);
        Button button = (Button) view.findViewById(R.id.vr_speed_bump_dismiss_button);
        button.setText(R.string.vr_select_viewers_label);
        final int i2 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: ahou
            public final /* synthetic */ ahov a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (i2 == 0) {
                    ahov ahovVar = this.a;
                    ahox ahoxVar = ahovVar.ag;
                    if (ahoxVar != null) {
                        ahoxVar.a();
                    }
                    ahovVar.dismiss();
                    return;
                }
                ahov ahovVar2 = this.a;
                ahox ahoxVar2 = ahovVar2.ag;
                if (ahoxVar2 != null) {
                    ahoy ahoyVar = (ahoy) ahoxVar2;
                    ahoz ahozVar = ahoyVar.a;
                    ci ciVar = ahoyVar.c;
                    if (!ahozVar.ar() && !ahozVar.av()) {
                        ahozVar.ag = ahoxVar2;
                        ahozVar.qh(ciVar.getSupportFragmentManager(), ahoz.ae);
                    }
                }
                ahovVar2.dismiss();
            }
        });
        Button button2 = (Button) view.findViewById(R.id.vr_speed_bump_action_button);
        button2.setText(R.string.vr_welcome_continue);
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: ahou
            public final /* synthetic */ ahov a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (i == 0) {
                    ahov ahovVar = this.a;
                    ahox ahoxVar = ahovVar.ag;
                    if (ahoxVar != null) {
                        ahoxVar.a();
                    }
                    ahovVar.dismiss();
                    return;
                }
                ahov ahovVar2 = this.a;
                ahox ahoxVar2 = ahovVar2.ag;
                if (ahoxVar2 != null) {
                    ahoy ahoyVar = (ahoy) ahoxVar2;
                    ahoz ahozVar = ahoyVar.a;
                    ci ciVar = ahoyVar.c;
                    if (!ahozVar.ar() && !ahozVar.av()) {
                        ahozVar.ag = ahoxVar2;
                        ahozVar.qh(ciVar.getSupportFragmentManager(), ahoz.ae);
                    }
                }
                ahovVar2.dismiss();
            }
        });
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 2;
    }

    @Override // defpackage.ajxk, defpackage.uyt, defpackage.bv, defpackage.ce
    public final void mS() {
        Spanned fromHtml;
        super.mS();
        HeadsetSelector.HeadsetInfo a = ahot.a(qR(), this.af);
        String displayName = a != null ? a.getDisplayName() : "";
        if (Build.VERSION.SDK_INT <= 23) {
            fromHtml = Html.fromHtml(P(R.string.vr_watch_in_vr_message, displayName));
        } else {
            fromHtml = Html.fromHtml(P(R.string.vr_watch_in_vr_message, displayName), 63);
        }
        this.ah.setText(fromHtml);
    }

    @Override // defpackage.uyt, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vr_speed_bump, viewGroup, false);
    }
}
