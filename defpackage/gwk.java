package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwk extends ajdd {
    public final aahd a;
    public final acra b;
    public final ajut c;
    public apmg d;
    public apmg e;
    public Map f;
    private final ajjz j;

    public gwk(aahd aahdVar, acra acraVar, ajut ajutVar, ajjz ajjzVar, ajdh ajdhVar) {
        super(aahdVar, ajdhVar, null, null);
        aahdVar.getClass();
        this.a = aahdVar;
        this.b = acraVar;
        this.c = ajutVar;
        this.j = ajjzVar;
    }

    public static CharSequence b(apmg apmgVar) {
        aqyg aqygVar = null;
        if (apmgVar == null) {
            return null;
        }
        if ((apmgVar.b & 256) != 0 && (aqygVar = apmgVar.i) == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    public static CharSequence c(List list, aahd aahdVar) {
        CharSequence charSequence = null;
        if (list.isEmpty()) {
            return null;
        }
        CharSequence concat = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Spanned a = aahk.a((aqyg) it.next(), aahdVar, false);
            charSequence = charSequence != null ? TextUtils.concat(charSequence, concat, a) : a;
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajdd
    public final Map d() {
        Map d = super.d();
        Map map = this.f;
        if (map != null) {
            d.putAll(map);
        }
        return d;
    }

    @Override // defpackage.ajdd
    protected final void e() {
        apmg apmgVar = this.e;
        if (apmgVar != null) {
            if ((apmgVar.b & 1048576) != 0) {
                this.b.I(3, new acqx(apmgVar.t), null);
            }
            apmg apmgVar2 = this.e;
            int i = apmgVar2.b;
            if ((i & 16384) != 0) {
                aahd aahdVar = this.g;
                apxf apxfVar = apmgVar2.o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, d());
                return;
            }
            if ((i & 32768) != 0) {
                aahd aahdVar2 = this.g;
                apxf apxfVar2 = apmgVar2.p;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.c(apxfVar2, d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajdd
    public final void f() {
        apmg apmgVar = this.d;
        if (apmgVar != null) {
            if ((apmgVar.b & 1048576) != 0) {
                this.b.I(3, new acqx(apmgVar.t), null);
            }
            apmg apmgVar2 = this.d;
            if ((apmgVar2.b & 32768) != 0) {
                aahd aahdVar = this.g;
                apxf apxfVar = apmgVar2.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, d());
            }
        }
    }

    public final void g(Resources resources, ImageView imageView, avgg avggVar) {
        Uri B = ahbw.B(avggVar);
        if (B == null) {
            return;
        }
        this.j.l(B, new acef(resources, imageView, 1));
    }

    public final void h(Context context, int i, Spanned spanned, List list, avgg avggVar, avgg avggVar2, avgg avggVar3, arfs arfsVar, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(inflate);
        zau zauVar = new zau(context);
        int orElse = wbs.W(context, R.attr.ytCallToAction).orElse(0);
        if (avggVar == null || avggVar.c.size() <= 0) {
            inflate.findViewById(R.id.header_container).setVisibility(8);
        } else {
            this.j.h((ImageView) inflate.findViewById(R.id.header), avggVar);
            View findViewById = inflate.findViewById(R.id.link_icon_background);
            if (avggVar2 == null || avggVar3 == null || arfsVar == null) {
                findViewById.setVisibility(8);
            } else {
                g(context.getResources(), (ImageView) inflate.findViewById(R.id.user_avatar), avggVar3);
                g(context.getResources(), (ImageView) inflate.findViewById(R.id.third_party_avatar), avggVar2);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.link_icon);
                ajut ajutVar = this.c;
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                imageView.setImageResource(ajutVar.a(b));
                zauVar.b(findViewById.getBackground(), orElse);
            }
        }
        if (z) {
            inflate.findViewById(R.id.close_button).setOnClickListener(new gwj(this, 2));
            View findViewById2 = inflate.findViewById(R.id.link_button_container);
            findViewById2.setOnClickListener(new gwj(this, 3));
            findViewById2.setOnTouchListener(akaw.c());
            TextView textView = (TextView) inflate.findViewById(R.id.link_button);
            zauVar.b(textView.getBackground(), orElse);
            textView.setTextColor(wbs.W(context, R.attr.ytFilledButtonText).orElse(0));
            textView.setText(b(this.d));
            builder.setNegativeButton((CharSequence) null, this);
            builder.setPositiveButton((CharSequence) null, this);
        } else {
            builder.setNegativeButton(b(this.e), this);
            builder.setPositiveButton(b(this.d), this);
        }
        whu.G((TextView) inflate.findViewById(R.id.title), spanned);
        TextView textView2 = (TextView) inflate.findViewById(R.id.message);
        textView2.setText(c(list, this.a));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        j(builder.create());
        k();
        apmg apmgVar = this.e;
        if (apmgVar == null || (apmgVar.b & 1048576) == 0) {
            return;
        }
        ((acqq) this.b).D(new acqx(apmgVar.t));
    }
}
