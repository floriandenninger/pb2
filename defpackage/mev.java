package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mev {
    public aqdh a;
    private final ajjz b;
    private final acra c;
    private View d;
    private TextView e;
    private ImageView f;
    private final View.OnClickListener g;

    public mev(ajjz ajjzVar, wzq wzqVar, aahd aahdVar, acra acraVar) {
        this.b = ajjzVar;
        this.c = acraVar;
        this.g = new meu(this, wzqVar, aahdVar);
    }

    public final void a(View view, aqdh aqdhVar) {
        if (view == null) {
            return;
        }
        this.a = aqdhVar;
        this.d = view;
        this.e = (TextView) view.findViewById(R.id.button_text);
        this.f = (ImageView) view.findViewById(R.id.button_image);
        if (aqdhVar == null) {
            this.d.setVisibility(8);
        } else {
            TextView textView = this.e;
            aqyg aqygVar = aqdhVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.G(textView, ajcq.b(aqygVar));
            if ((aqdhVar.b & 2) == 0) {
                this.f.setVisibility(8);
            } else {
                ajjz ajjzVar = this.b;
                ImageView imageView = this.f;
                avgg avggVar = aqdhVar.d;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                ajjzVar.h(imageView, avggVar);
                this.f.setVisibility(0);
            }
            this.d.setVisibility(0);
            this.c.u(new acqx(aqdhVar.f), null);
        }
        this.d.setOnClickListener(this.g);
    }

    public final void b() {
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
        }
        this.a = null;
    }
}
