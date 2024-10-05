package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.ui.EditTextWithHelpIcon;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzn implements mzc {
    private static final uxv m = uxv.b();
    public final Context a;
    public final TextView b;
    public final EditTextWithHelpIcon c;
    public final aahd d;
    public final acra e;
    public final aqzc f;
    public final aqzd g;
    public final boolean h;
    public String i;
    public mi j;
    public boolean k = false;
    public boolean l = false;
    private final View n;
    private final TextView o;
    private final TextInputLayout p;
    private final TextWatcher q;
    private final Drawable r;
    private final boolean s;
    private TextWatcher t;
    private aqyg u;

    public mzn(Context context, aahd aahdVar, acra acraVar, ViewGroup viewGroup, aqzc aqzcVar, aqzd aqzdVar, aaea aaeaVar) {
        this.d = aahdVar;
        this.e = acraVar;
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.formfill_phone_number_input, viewGroup, false);
        this.n = inflate;
        this.b = (TextView) inflate.findViewById(R.id.region_text);
        this.o = (TextView) inflate.findViewById(R.id.region_text_label);
        this.c = (EditTextWithHelpIcon) inflate.findViewById(R.id.edit_text);
        this.p = (TextInputLayout) inflate.findViewById(R.id.text_input_layout);
        this.f = aqzcVar;
        this.g = aqzdVar;
        this.i = l(aqzdVar);
        this.q = new mzm(this);
        this.r = context.getResources().getDrawable(R.drawable.quantum_ic_help_outline_grey600_24);
        this.s = wbs.m(aaeaVar);
        this.h = wbs.u(aaeaVar);
    }

    private static String l(aqzd aqzdVar) {
        String str = aqzdVar.d;
        if (ammx.e(str)) {
            str = Locale.getDefault().getCountry();
            try {
                uxv uxvVar = m;
                str = uxvVar.h(uxvVar.e(aqzdVar.f, str));
            } catch (uxu unused) {
            }
        }
        Set j = m.j();
        return !j.contains(str) ? j.isEmpty() ? "" : (String) j.iterator().next() : str;
    }

    private final String m() {
        return this.l ? this.g.f : this.c.getText().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[Catch: uxu -> 0x00f0, TryCatch #0 {uxu -> 0x00f0, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x00eb, B:9:0x0022, B:11:0x002e, B:12:0x0033, B:16:0x0047, B:17:0x004c, B:18:0x0050, B:20:0x0056, B:22:0x0062, B:25:0x007c, B:31:0x00c0, B:33:0x00c7, B:35:0x00cf, B:37:0x00d3, B:38:0x00de, B:39:0x00e8, B:40:0x0093, B:43:0x00a7, B:45:0x00ad, B:46:0x00bc, B:53:0x004a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3 A[Catch: uxu -> 0x00f0, TryCatch #0 {uxu -> 0x00f0, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x00eb, B:9:0x0022, B:11:0x002e, B:12:0x0033, B:16:0x0047, B:17:0x004c, B:18:0x0050, B:20:0x0056, B:22:0x0062, B:25:0x007c, B:31:0x00c0, B:33:0x00c7, B:35:0x00cf, B:37:0x00d3, B:38:0x00de, B:39:0x00e8, B:40:0x0093, B:43:0x00a7, B:45:0x00ad, B:46:0x00bc, B:53:0x004a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[Catch: uxu -> 0x00f0, TryCatch #0 {uxu -> 0x00f0, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x00eb, B:9:0x0022, B:11:0x002e, B:12:0x0033, B:16:0x0047, B:17:0x004c, B:18:0x0050, B:20:0x0056, B:22:0x0062, B:25:0x007c, B:31:0x00c0, B:33:0x00c7, B:35:0x00cf, B:37:0x00d3, B:38:0x00de, B:39:0x00e8, B:40:0x0093, B:43:0x00a7, B:45:0x00ad, B:46:0x00bc, B:53:0x004a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093 A[Catch: uxu -> 0x00f0, TryCatch #0 {uxu -> 0x00f0, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x00eb, B:9:0x0022, B:11:0x002e, B:12:0x0033, B:16:0x0047, B:17:0x004c, B:18:0x0050, B:20:0x0056, B:22:0x0062, B:25:0x007c, B:31:0x00c0, B:33:0x00c7, B:35:0x00cf, B:37:0x00d3, B:38:0x00de, B:39:0x00e8, B:40:0x0093, B:43:0x00a7, B:45:0x00ad, B:46:0x00bc, B:53:0x004a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String n(java.lang.String r11, java.lang.String r12, int r13) {
        /*
            uxv r0 = defpackage.mzn.m     // Catch: defpackage.uxu -> Lf0
            uya r11 = r0.e(r12, r11)     // Catch: defpackage.uxu -> Lf0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: defpackage.uxu -> Lf0
            r2 = 20
            r1.<init>(r2)     // Catch: defpackage.uxu -> Lf0
            r2 = 0
            r1.setLength(r2)     // Catch: defpackage.uxu -> Lf0
            int r2 = r11.a     // Catch: defpackage.uxu -> Lf0
            java.lang.String r3 = r0.f(r11)     // Catch: defpackage.uxu -> Lf0
            r4 = 1
            if (r13 != r4) goto L22
            r1.append(r3)     // Catch: defpackage.uxu -> Lf0
            r0.o(r2, r4, r1)     // Catch: defpackage.uxu -> Lf0
            goto Leb
        L22:
            java.util.Map r4 = r0.e     // Catch: defpackage.uxu -> Lf0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: defpackage.uxu -> Lf0
            boolean r4 = r4.containsKey(r5)     // Catch: defpackage.uxu -> Lf0
            if (r4 != 0) goto L33
            r1.append(r3)     // Catch: defpackage.uxu -> Lf0
            goto Leb
        L33:
            java.lang.String r4 = r0.g(r2)     // Catch: defpackage.uxu -> Lf0
            uxx r4 = r0.d(r2, r4)     // Catch: defpackage.uxu -> Lf0
            java.util.List r5 = r4.t     // Catch: defpackage.uxu -> Lf0
            int r5 = r5.size()     // Catch: defpackage.uxu -> Lf0
            r6 = 3
            if (r5 == 0) goto L4a
            if (r13 != r6) goto L47
            goto L4a
        L47:
            java.util.List r5 = r4.t     // Catch: defpackage.uxu -> Lf0
            goto L4c
        L4a:
            java.util.List r5 = r4.s     // Catch: defpackage.uxu -> Lf0
        L4c:
            java.util.Iterator r5 = r5.iterator()     // Catch: defpackage.uxu -> Lf0
        L50:
            boolean r7 = r5.hasNext()     // Catch: defpackage.uxu -> Lf0
            if (r7 == 0) goto L8f
            java.lang.Object r7 = r5.next()     // Catch: defpackage.uxu -> Lf0
            uxw r7 = (defpackage.uxw) r7     // Catch: defpackage.uxu -> Lf0
            int r8 = r7.a()     // Catch: defpackage.uxu -> Lf0
            if (r8 == 0) goto L7c
            uyd r9 = r0.f     // Catch: defpackage.uxu -> Lf0
            int r8 = r8 + (-1)
            java.util.List r10 = r7.c     // Catch: defpackage.uxu -> Lf0
            java.lang.Object r8 = r10.get(r8)     // Catch: defpackage.uxu -> Lf0
            java.lang.String r8 = (java.lang.String) r8     // Catch: defpackage.uxu -> Lf0
            java.util.regex.Pattern r8 = r9.a(r8)     // Catch: defpackage.uxu -> Lf0
            java.util.regex.Matcher r8 = r8.matcher(r3)     // Catch: defpackage.uxu -> Lf0
            boolean r8 = r8.lookingAt()     // Catch: defpackage.uxu -> Lf0
            if (r8 == 0) goto L50
        L7c:
            uyd r8 = r0.f     // Catch: defpackage.uxu -> Lf0
            java.lang.String r9 = r7.a     // Catch: defpackage.uxu -> Lf0
            java.util.regex.Pattern r8 = r8.a(r9)     // Catch: defpackage.uxu -> Lf0
            java.util.regex.Matcher r8 = r8.matcher(r3)     // Catch: defpackage.uxu -> Lf0
            boolean r8 = r8.matches()     // Catch: defpackage.uxu -> Lf0
            if (r8 == 0) goto L50
            goto L90
        L8f:
            r7 = 0
        L90:
            if (r7 != 0) goto L93
            goto Lc0
        L93:
            java.lang.String r5 = r7.b     // Catch: defpackage.uxu -> Lf0
            uyd r8 = r0.f     // Catch: defpackage.uxu -> Lf0
            java.lang.String r9 = r7.a     // Catch: defpackage.uxu -> Lf0
            java.util.regex.Pattern r8 = r8.a(r9)     // Catch: defpackage.uxu -> Lf0
            java.util.regex.Matcher r3 = r8.matcher(r3)     // Catch: defpackage.uxu -> Lf0
            java.lang.String r7 = r7.d     // Catch: defpackage.uxu -> Lf0
            if (r13 != r6) goto Lbc
            if (r7 == 0) goto Lbc
            int r6 = r7.length()     // Catch: defpackage.uxu -> Lf0
            if (r6 <= 0) goto Lbc
            java.util.regex.Pattern r6 = defpackage.uxv.d     // Catch: defpackage.uxu -> Lf0
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: defpackage.uxu -> Lf0
            java.lang.String r5 = r5.replaceFirst(r7)     // Catch: defpackage.uxu -> Lf0
            java.lang.String r3 = r3.replaceAll(r5)     // Catch: defpackage.uxu -> Lf0
            goto Lc0
        Lbc:
            java.lang.String r3 = r3.replaceAll(r5)     // Catch: defpackage.uxu -> Lf0
        Lc0:
            r1.append(r3)     // Catch: defpackage.uxu -> Lf0
            boolean r3 = r11.c     // Catch: defpackage.uxu -> Lf0
            if (r3 == 0) goto Le8
            java.lang.String r3 = r11.d     // Catch: defpackage.uxu -> Lf0
            int r3 = r3.length()     // Catch: defpackage.uxu -> Lf0
            if (r3 <= 0) goto Le8
            boolean r3 = r4.n     // Catch: defpackage.uxu -> Lf0
            if (r3 == 0) goto Lde
            java.lang.String r3 = r4.o     // Catch: defpackage.uxu -> Lf0
            r1.append(r3)     // Catch: defpackage.uxu -> Lf0
            java.lang.String r11 = r11.d     // Catch: defpackage.uxu -> Lf0
            r1.append(r11)     // Catch: defpackage.uxu -> Lf0
            goto Le8
        Lde:
            java.lang.String r3 = " ext. "
            r1.append(r3)     // Catch: defpackage.uxu -> Lf0
            java.lang.String r11 = r11.d     // Catch: defpackage.uxu -> Lf0
            r1.append(r11)     // Catch: defpackage.uxu -> Lf0
        Le8:
            r0.o(r2, r13, r1)     // Catch: defpackage.uxu -> Lf0
        Leb:
            java.lang.String r11 = r1.toString()     // Catch: defpackage.uxu -> Lf0
            return r11
        Lf0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzn.n(java.lang.String, java.lang.String, int):java.lang.String");
    }

    @Override // defpackage.mzc
    public final View a() {
        return this.n;
    }

    @Override // defpackage.mzc
    public final asgz b(asgz asgzVar) {
        aone builder = asgzVar.toBuilder();
        if (h()) {
            builder.copyOnWrite();
            asgz.c((asgz) builder.instance);
        }
        if (this.g.f.length() > 0) {
            builder.copyOnWrite();
            asgz.f((asgz) builder.instance);
        }
        return (asgz) builder.build();
    }

    @Override // defpackage.mzc
    public final ashq c(ashq ashqVar) {
        aone builder = ashqVar.toBuilder();
        if (h()) {
            builder.copyOnWrite();
            ashq.c((ashq) builder.instance);
        }
        if (this.g.f.length() > 0) {
            builder.copyOnWrite();
            ashq.f((ashq) builder.instance);
        }
        return (ashq) builder.build();
    }

    @Override // defpackage.mzc
    public final View d() {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        this.c.setOnFocusChangeListener(new mzl(this));
        final int i = 1;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: mzh
            public final /* synthetic */ mzn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    this.a.j();
                    return;
                }
                mzn mznVar = this.a;
                View view2 = new mzs(mznVar.a, new mzj(mznVar)).c;
                mh mhVar = new mh(mznVar.a);
                mhVar.p(view2);
                mhVar.k(R.string.cancel, null);
                mznVar.j = mhVar.b();
                mznVar.j.show();
            }
        });
        this.c.setImeOptions(5);
        this.c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: mzi
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                mzn mznVar = mzn.this;
                ((InputMethodManager) mznVar.a.getSystemService("input_method")).hideSoftInputFromWindow(textView.getRootView().getWindowToken(), 2);
                mznVar.c.clearFocus();
                return true;
            }
        });
        TextInputLayout textInputLayout = this.p;
        aqzd aqzdVar = this.g;
        if ((aqzdVar.b & 4) != 0) {
            aqygVar = aqzdVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textInputLayout.B(ajcq.b(aqygVar));
        TextInputLayout textInputLayout2 = this.p;
        aqzd aqzdVar2 = this.g;
        if ((aqzdVar2.b & 64) != 0) {
            aqygVar2 = aqzdVar2.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textInputLayout2.z(ajcq.b(aqygVar2));
        TextView textView = this.o;
        aqzd aqzdVar3 = this.g;
        if ((aqzdVar3.b & 1) != 0) {
            aqygVar3 = aqzdVar3.c;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        textView.setText(ajcq.b(aqygVar3));
        k();
        aqzd aqzdVar4 = this.g;
        if ((aqzdVar4.b & 256) != 0) {
            this.l = true;
            this.c.setText(aqzdVar4.k);
        } else {
            this.c.setText(n(this.i, aqzdVar4.f, 3));
        }
        if ((this.g.b & 32) != 0) {
            this.c.b(this.r, new xmf() { // from class: mzk
                @Override // defpackage.xmf
                public final void a() {
                    mzn mznVar = mzn.this;
                    aahd aahdVar = mznVar.d;
                    apxf apxfVar = mznVar.g.h;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, acrc.g(mznVar.g));
                }
            });
        }
        this.c.addTextChangedListener(this.q);
        final int i2 = 0;
        this.b.setText(this.a.getResources().getString(R.string.region_with_calling_code, this.i, Integer.valueOf(m.a(this.i))));
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: mzh
            public final /* synthetic */ mzn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    this.a.j();
                    return;
                }
                mzn mznVar = this.a;
                View view2 = new mzs(mznVar.a, new mzj(mznVar)).c;
                mh mhVar = new mh(mznVar.a);
                mhVar.p(view2);
                mhVar.k(R.string.cancel, null);
                mznVar.j = mhVar.b();
                mznVar.j.show();
            }
        });
        this.e.u(new acqx(this.g.l), null);
        return this.n;
    }

    @Override // defpackage.mzc
    public final String f() {
        return n(this.i, m(), 1);
    }

    @Override // defpackage.mzc
    public final void g(boolean z) {
        if (z) {
            if (this.s) {
                this.p.y(ColorStateList.valueOf(wbs.Q(this.a, R.attr.ytErrorIndicator)));
                this.r.setTint(wbs.Q(this.a, R.attr.ytErrorIndicator));
            }
            aqyg aqygVar = this.u;
            if (aqygVar == null && (aqygVar = this.g.g) == null) {
                aqygVar = aqyg.a;
            }
            this.p.v(ajcq.b(aqygVar));
            this.p.setBackgroundColor(wbs.Q(this.a, true != this.s ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
            return;
        }
        if (this.s) {
            this.r.setTint(wbs.Q(this.a, R.attr.ytIcon1));
        }
        this.p.w(false);
        this.p.setBackgroundColor(0);
    }

    @Override // defpackage.mzc
    public final boolean h() {
        return !f().equals(n(l(this.g), this.g.f, 1));
    }

    public final void i() {
        this.c.setText(n(this.i, this.g.f, 3));
        this.l = false;
    }

    public final void j() {
        this.e.I(3, new acqx(this.g.l), null);
    }

    public final void k() {
        this.c.removeTextChangedListener(this.t);
        PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher = new PhoneNumberFormattingTextWatcher(this.i);
        this.t = phoneNumberFormattingTextWatcher;
        this.c.addTextChangedListener(phoneNumberFormattingTextWatcher);
        String normalizeNumber = PhoneNumberUtils.normalizeNumber(this.c.getEditableText().toString());
        this.c.getEditableText().clear();
        this.c.setText(normalizeNumber);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r6.m(r6.e(m(), r5.i)) != false) goto L13;
     */
    @Override // defpackage.mzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mzb e(boolean r6) {
        /*
            r5 = this;
            aqzd r0 = r5.g
            int r0 = r0.b
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L27
            java.lang.String r6 = r5.f()
            aqzd r0 = r5.g
            avvd r0 = r0.j
            if (r0 != 0) goto L14
            avvd r0 = defpackage.avvd.a
        L14:
            nab r6 = defpackage.nac.a(r6, r0)
            aqyg r0 = r6.b
            r5.u = r0
            boolean r0 = r6.a
            apxf r1 = r6.c
            ashb r6 = r6.d
            mzb r6 = defpackage.mzb.a(r0, r1, r6)
            return r6
        L27:
            r0 = 0
            r5.u = r0
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L3a
            java.lang.String r6 = r5.m()
            int r6 = r6.length()
            if (r6 != 0) goto L3a
        L38:
            r1 = 1
            goto L4d
        L3a:
            uxv r6 = defpackage.mzn.m     // Catch: defpackage.uxu -> L4d
            java.lang.String r3 = r5.m()     // Catch: defpackage.uxu -> L4d
            java.lang.String r4 = r5.i     // Catch: defpackage.uxu -> L4d
            uya r3 = r6.e(r3, r4)     // Catch: defpackage.uxu -> L4d
            boolean r6 = r6.m(r3)     // Catch: defpackage.uxu -> L4d
            if (r6 == 0) goto L4d
            goto L38
        L4d:
            mzb r6 = defpackage.mzb.a(r1, r0, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzn.e(boolean):mzb");
    }
}
