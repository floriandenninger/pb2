package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class weo extends ajpc implements wfx {
    public final Resources a;
    public final ImageView b;
    public final TextView c;
    public final wed d;
    public int e;
    private final View f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final CheckBox k;
    private final wfz l;
    private final aahd m;
    private final Spanned n;
    private final Spanned o;

    public weo(Context context, wfz wfzVar, aahd aahdVar, wed wedVar, ViewGroup viewGroup) {
        this.a = context.getResources();
        this.d = wedVar;
        this.l = wfzVar;
        this.m = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_fingerprint_auth_layout, viewGroup, false);
        this.f = inflate;
        this.g = (TextView) inflate.findViewById(R.id.title);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.reauth_opt_out);
        this.k = checkBox;
        checkBox.setOnCheckedChangeListener(new wfq(wedVar, 1));
        inflate.findViewById(R.id.close_button).setOnClickListener(new wel(wedVar, 1));
        this.h = (TextView) inflate.findViewById(R.id.description);
        this.i = (TextView) inflate.findViewById(R.id.other_methods_field);
        this.b = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.c = (TextView) inflate.findViewById(R.id.error_message_field);
        TextView textView = (TextView) inflate.findViewById(R.id.use_password_field);
        this.j = textView;
        textView.setOnClickListener(new wel(wedVar, 0));
        this.n = h(R.string.other_methods_suffix);
        this.o = h(R.string.use_password_suffix);
    }

    private final Spanned h(int i) {
        String string = this.a.getString(i);
        String string2 = this.a.getString(R.string.fingerprint_other_methods_prefix, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new wen(this, i), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        g();
        this.e = 0;
        this.b.setImageResource(R.drawable.quantum_ic_fingerprint_grey600_48);
        this.l.c();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer = (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer) obj;
        TextView textView = this.g;
        aqyg aqygVar = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.h;
        aqyg aqygVar2 = null;
        if (fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.d.size() != 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            boolean z = true;
            for (aqyg aqygVar3 : fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.d) {
                if (!z) {
                    spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
                }
                spannableStringBuilder.append((CharSequence) aahk.a(aqygVar3, this.m, true));
                z = false;
            }
        } else {
            spannableStringBuilder = null;
        }
        whu.G(textView2, spannableStringBuilder);
        CheckBox checkBox = this.k;
        if ((fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.b & 32) != 0 && (aqygVar2 = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.h) == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(checkBox, aahk.a(aqygVar2, this.m, false));
        this.e = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.e;
        if (fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.f) {
            this.i.setText(this.n);
        } else {
            this.i.setText(this.o);
        }
        g();
        this.l.b(this);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((FingerprintAuthRendererOuterClass$FingerprintAuthRenderer) obj).g.I();
    }

    public final void f() {
        this.l.c();
        this.c.setText(this.a.getString(R.string.fingerprint_failed));
        whu.I(this.c, true);
        whu.I(this.j, true);
    }

    public final void g() {
        whu.I(this.c, false);
        whu.I(this.j, false);
    }
}
