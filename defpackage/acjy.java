package defpackage;

import android.app.Activity;
import android.support.v7.widget.SwitchCompat;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acjy implements View.OnClickListener {
    private final ajut a;
    private final aahd b;
    private final Activity c;
    private final View d;
    private final TextView e;
    private final SwitchCompat f;
    private final asge g;

    public acjy(Activity activity, ajut ajutVar, aahd aahdVar, View view, TextView textView, SwitchCompat switchCompat, asge asgeVar) {
        aqyg aqygVar;
        activity.getClass();
        this.c = activity;
        aahdVar.getClass();
        this.b = aahdVar;
        ajutVar.getClass();
        this.a = ajutVar;
        view.getClass();
        this.d = view;
        textView.getClass();
        this.e = textView;
        switchCompat.getClass();
        this.f = switchCompat;
        asgeVar.getClass();
        this.g = asgeVar;
        view.setOnClickListener(this);
        d(asgeVar.g, false);
        switchCompat.setChecked(asgeVar.g);
        if ((asgeVar.b & 2) != 0) {
            aqygVar = asgeVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned a = aahk.a(aqygVar, aahdVar, true);
        if (a != null && zev.e(view.getContext())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            for (aahi aahiVar : (aahi[]) spannableStringBuilder.getSpans(0, a.length(), aahi.class)) {
                apxf apxfVar = aahiVar.c;
                if (apxfVar != null && apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
                    int spanStart = spannableStringBuilder.getSpanStart(aahiVar);
                    int spanEnd = spannableStringBuilder.getSpanEnd(aahiVar);
                    spannableStringBuilder.removeSpan(aahiVar);
                    spannableStringBuilder.setSpan(new URLSpan(wbs.aj(((avuo) aahiVar.c.pX(UrlEndpointOuterClass.urlEndpoint)).c).toString()), spanStart, spanEnd, 33);
                }
            }
            spannableStringBuilder.append((CharSequence) " ");
            a = spannableStringBuilder;
        }
        this.e.setText(a);
    }

    public final void a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void b() {
        this.f.toggle();
    }

    public final boolean c() {
        return this.f.isChecked();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f.toggle();
        d(c(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L22
            asge r1 = r5.g
            int r2 = r1.b
            r2 = r2 & 8
            if (r2 == 0) goto L22
            ajut r2 = r5.a
            arfs r1 = r1.e
            if (r1 != 0) goto L13
            arfs r1 = defpackage.arfs.a
        L13:
            int r1 = r1.c
            arfr r1 = defpackage.arfr.b(r1)
            if (r1 != 0) goto L1d
            arfr r1 = defpackage.arfr.UNKNOWN
        L1d:
            int r1 = r2.a(r1)
            goto L44
        L22:
            if (r6 != 0) goto L43
            asge r1 = r5.g
            int r2 = r1.b
            r2 = r2 & 16
            if (r2 == 0) goto L43
            ajut r2 = r5.a
            arfs r1 = r1.f
            if (r1 != 0) goto L34
            arfs r1 = defpackage.arfs.a
        L34:
            int r1 = r1.c
            arfr r1 = defpackage.arfr.b(r1)
            if (r1 != 0) goto L3e
            arfr r1 = defpackage.arfr.UNKNOWN
        L3e:
            int r1 = r2.a(r1)
            goto L44
        L43:
            r1 = 0
        L44:
            r2 = 0
            if (r1 == 0) goto L52
            android.widget.TextView r3 = r5.e
            android.app.Activity r4 = r5.c
            android.graphics.drawable.Drawable r1 = defpackage.aii.a(r4, r1)
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r2, r2)
        L52:
            android.view.View r1 = r5.d
            r3 = 1
            if (r3 == r6) goto L5b
            r4 = 1058642330(0x3f19999a, float:0.6)
            goto L5d
        L5b:
            r4 = 1065353216(0x3f800000, float:1.0)
        L5d:
            r1.setAlpha(r4)
            if (r7 == 0) goto L8a
            android.view.View r7 = r5.d
            android.content.Context r7 = r7.getContext()
            boolean r7 = defpackage.zev.e(r7)
            if (r7 == 0) goto L8a
            android.view.View r7 = r5.d
            android.content.Context r7 = r7.getContext()
            android.view.View r1 = r5.d
            android.content.Context r4 = r1.getContext()
            if (r3 == r6) goto L80
            r6 = 2132018189(0x7f14040d, float:1.9674678E38)
            goto L83
        L80:
            r6 = 2132018190(0x7f14040e, float:1.967468E38)
        L83:
            java.lang.String r6 = r4.getString(r6)
            defpackage.zev.c(r7, r1, r6)
        L8a:
            asge r6 = r5.g
            int r7 = r6.b
            r7 = r7 & 64
            if (r7 == 0) goto L9e
            aott r6 = r6.h
            if (r6 != 0) goto L98
            aott r6 = defpackage.aott.a
        L98:
            aots r2 = r6.c
            if (r2 != 0) goto L9e
            aots r2 = defpackage.aots.a
        L9e:
            if (r2 == 0) goto La9
            int r6 = r2.b
            r6 = r6 & 2
            if (r6 == 0) goto La9
            java.lang.String r6 = r2.c
            goto Lb9
        La9:
            asge r6 = r5.g
            aqyg r6 = r6.c
            if (r6 != 0) goto Lb1
            aqyg r6 = defpackage.aqyg.a
        Lb1:
            android.text.Spanned r6 = defpackage.ajcq.b(r6)
            java.lang.String r6 = r6.toString()
        Lb9:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto Ldd
            android.view.View r7 = r5.d
            android.content.Context r1 = r7.getContext()
            boolean r2 = r5.c()
            if (r3 == r2) goto Lcf
            r2 = 2132018229(0x7f140435, float:1.9674759E38)
            goto Ld2
        Lcf:
            r2 = 2132018230(0x7f140436, float:1.967476E38)
        Ld2:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            java.lang.String r6 = r1.getString(r2, r3)
            r7.setContentDescription(r6)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acjy.d(boolean, boolean):void");
    }
}
