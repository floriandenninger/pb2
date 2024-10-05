package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class leh extends ajpc {
    public final CardView a;
    private final Activity b;
    private final TextView c;
    private final ajoi d;
    private final ajut e;
    private final float f;

    public leh(Activity activity, aahd aahdVar, ajut ajutVar, ViewGroup viewGroup) {
        this.b = activity;
        float dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.refinement_chip_elevation_size);
        this.f = dimensionPixelSize;
        this.e = ajutVar;
        CardView cardView = (CardView) LayoutInflater.from(activity).inflate(R.layout.refinement_chip, viewGroup, false);
        this.a = cardView;
        ach.h(cardView.e, dimensionPixelSize);
        TextView textView = (TextView) cardView.findViewById(R.id.text);
        textView.getClass();
        this.c = textView;
        this.d = new ajoi(aahdVar, cardView);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.c();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aukx aukxVar = (aukx) obj;
        ajoi ajoiVar = this.d;
        acra acraVar = ajokVar.a;
        if ((aukxVar.b & 4) != 0) {
            apxfVar = aukxVar.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        auky aukyVar = aukxVar.f;
        if (aukyVar == null) {
            aukyVar = auky.a;
        }
        int bP = aobq.bP(aukyVar.b);
        if (bP == 0 || bP != 2) {
            this.c.setMaxWidth(this.b.getResources().getDimensionPixelSize(R.dimen.preview_card_refinement_chip_max_width));
        } else {
            this.c.setMaxWidth(this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_normal_max_width));
        }
        if ((aukxVar.b & 8) == 0) {
            jm.t(this.c, 0, 0);
        } else {
            Activity activity = this.b;
            ajut ajutVar = this.e;
            arfs arfsVar = aukxVar.e;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            Drawable a = aii.a(activity, ajutVar.a(b));
            a.setTint(aih.d(this.b, R.color.quantum_vanillablue500));
            jm.u(this.c, a, null, null);
        }
        TextView textView = this.c;
        if ((aukxVar.b & 1) != 0) {
            aqygVar = aukxVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        this.c.getBackground().setAlpha(PrivateKeyType.INVALID);
        this.a.d();
        this.c.setCompoundDrawablePadding(6);
        this.c.setPadding(this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_left_padding), this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_top_bottom_padding), this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_right_padding), this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_top_bottom_padding));
        this.c.getLayoutParams().height = this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_height);
        if (Build.VERSION.SDK_INT >= 23) {
            this.c.setForeground(null);
        }
        this.c.setIncludeFontPadding(false);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aukx) obj).g.I();
    }
}
