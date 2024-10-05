package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class why extends ajpc {
    public final aahd a;
    public final View b;
    public final acra c;
    public apxf d;
    public byte[] e;
    private final Context f;
    private final ajjz g;
    private final TextView h;
    private final ImageView i;
    private final ajut j;
    private TextView k;
    private final ColorStateList l;

    public why(Context context, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, acqz acqzVar) {
        this.f = context;
        ajutVar.getClass();
        this.j = ajutVar;
        aahdVar.getClass();
        ajjzVar.getClass();
        this.g = ajjzVar;
        this.a = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.account_compact_link, (ViewGroup) null);
        this.b = inflate;
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.l = wbs.S(context, R.attr.ytTextPrimary);
        this.c = acqzVar.mM();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apxf apxfVar;
        acra acraVar;
        aqbs aqbsVar = (aqbs) obj;
        TextView textView = this.h;
        if ((aqbsVar.b & 16) != 0) {
            aqygVar = aqbsVar.j;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        if ((aqbsVar.b & 32) != 0) {
            aqygVar2 = aqbsVar.k;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b = ajcq.b(aqygVar2);
        if (!TextUtils.isEmpty(b) && this.k == null) {
            this.k = (TextView) ((ViewStub) this.b.findViewById(R.id.subtitle)).inflate().findViewById(R.id.subtitle);
        }
        TextView textView2 = this.k;
        if (textView2 != null) {
            whu.G(textView2, b);
        }
        boolean z = true;
        if ((aqbsVar.b & 1) == 0) {
            ajjz ajjzVar = this.g;
            ImageView imageView = this.i;
            avgg avggVar = aqbsVar.i;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            jj.h(this.i, null);
            this.i.setVisibility((aqbsVar.b & 4) != 0 ? 0 : 8);
        } else {
            ajut ajutVar = this.j;
            arfs arfsVar = aqbsVar.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            int a = ajutVar.a(b2);
            this.g.e(this.i);
            if (a == 0) {
                this.i.setVisibility(8);
            } else {
                this.i.setImageResource(a);
                ImageView imageView2 = this.i;
                imageView2.setImageDrawable(new zau(this.f).c(imageView2.getDrawable(), this.l));
                this.i.setVisibility(0);
            }
        }
        if (aqbsVar.e == 4) {
            apxfVar = (apxf) aqbsVar.f;
        } else {
            apxfVar = apxf.a;
        }
        this.d = apxfVar;
        apxf apxfVar2 = aqbsVar.e == 9 ? (apxf) aqbsVar.f : null;
        byte[] I = aqbsVar.n.I();
        this.e = I;
        if (I != null && (acraVar = this.c) != null) {
            acraVar.u(new acqx(I), null);
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: whx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acra acraVar2;
                why whyVar = why.this;
                byte[] bArr = whyVar.e;
                if (bArr != null && (acraVar2 = whyVar.c) != null) {
                    acraVar2.I(3, new acqx(bArr), null);
                }
                apxf apxfVar3 = whyVar.d;
                if (apxfVar3 != null) {
                    whyVar.a.a(apxfVar3);
                }
            }
        });
        View view = this.b;
        if (this.d == null && apxfVar2 == null) {
            z = false;
        }
        view.setClickable(z);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqbs) obj).n.I();
    }
}
