package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwk extends ajpc {
    public final aahd a;
    public avgq b;
    public Map c;
    private final ajut d;
    private final gma e;
    private final GridLayout f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;

    public mwk(Context context, ajut ajutVar, aahd aahdVar, gma gmaVar) {
        this.d = ajutVar;
        this.a = aahdVar;
        this.e = gmaVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.tile_button, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.card_view);
        this.f = (GridLayout) inflate.findViewById(R.id.content);
        this.g = (ImageView) inflate.findViewById(R.id.icon);
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (TextView) inflate.findViewById(R.id.info);
        this.j = (TextView) inflate.findViewById(R.id.description);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: mwj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mwk mwkVar = mwk.this;
                avgq avgqVar = mwkVar.b;
                apxf apxfVar = null;
                if (avgqVar != null) {
                    int i = avgqVar.c;
                    if (i == 6) {
                        apxfVar = (apxf) avgqVar.d;
                    } else if (i == 5) {
                        apxfVar = (apxf) avgqVar.d;
                    }
                }
                if (apxfVar != null) {
                    mwkVar.a.c(apxfVar, mwkVar.c);
                }
            }
        });
        gmaVar.c(inflate);
    }

    private static GridLayout.LayoutParams f(int i, int i2, int i3) {
        return new GridLayout.LayoutParams(GridLayout.spec(i, i3, GridLayout.CENTER), GridLayout.spec(i2, 1));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* synthetic */ void d(ajok ajokVar, Object obj) {
        amrz c;
        aqyg aqygVar;
        aqyg aqygVar2;
        avgq avgqVar = (avgq) obj;
        this.b = avgqVar;
        aqyg aqygVar3 = null;
        if (ajokVar == null) {
            c = null;
        } else {
            amrw h = amrz.h();
            h.g("sectionListController", ajokVar.c("sectionListController"));
            h.i(ajokVar.e());
            c = h.c();
        }
        this.c = c;
        GridLayout gridLayout = this.f;
        int ap = awxr.ap(avgqVar.i);
        if (ap == 0) {
            ap = 1;
        }
        int i = ap + (-1) != 2 ? 8388611 : 1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gridLayout.getLayoutParams();
        layoutParams.gravity = i;
        gridLayout.setLayoutParams(layoutParams);
        int i2 = avgqVar.b;
        int i3 = i2 & 4;
        boolean z = i3 == 0 || (i2 & 1) == 0;
        if (i3 == 0) {
            this.h.setLayoutParams(f(0, 1, 2));
        } else if ((i2 & 1) == 0) {
            this.j.setLayoutParams(f(0, 1, 2));
        } else {
            this.h.setLayoutParams(f(0, 1, 1));
            this.j.setLayoutParams(f(1, 1, 1));
        }
        if (z) {
            this.i.setLayoutParams(f(0, 2, 2));
        } else {
            this.i.setLayoutParams(f(0, 2, 1));
        }
        whu.I(this.g, (avgqVar.b & 8) != 0);
        if ((avgqVar.b & 8) != 0) {
            ImageView imageView = this.g;
            ajut ajutVar = this.d;
            arfs arfsVar = avgqVar.h;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ajutVar.a(b));
        }
        TextView textView = this.h;
        if ((avgqVar.b & 1) != 0) {
            aqygVar = avgqVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.i;
        if ((avgqVar.b & 2) != 0) {
            aqygVar2 = avgqVar.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = this.j;
        if ((avgqVar.b & 4) != 0 && (aqygVar3 = avgqVar.g) == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
        this.e.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avgq) obj).j.I();
    }
}
