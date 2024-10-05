package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzy implements mzc {
    public final Context a;
    public final EditTextWithHelpIcon b;
    public final aahd c;
    public final acra d;
    public final aqzc e;
    public final aqzf f;
    public final boolean g;
    public boolean h = false;
    public boolean i = false;
    private final View j;
    private final TextInputLayout k;
    private final TextWatcher l;
    private final Drawable m;
    private final boolean n;
    private aqyg o;

    public mzy(Context context, aahd aahdVar, acra acraVar, ViewGroup viewGroup, aqzc aqzcVar, aqzf aqzfVar, aaea aaeaVar) {
        this.c = aahdVar;
        this.d = acraVar;
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.formfill_text_input, viewGroup, false);
        this.j = inflate;
        this.b = (EditTextWithHelpIcon) inflate.findViewById(R.id.edit_text);
        this.k = (TextInputLayout) inflate.findViewById(R.id.text_input_layout);
        this.l = new mzx(this);
        this.e = aqzcVar;
        this.f = aqzfVar;
        this.m = context.getResources().getDrawable(R.drawable.quantum_ic_help_outline_grey600_24);
        this.n = wbs.m(aaeaVar);
        this.g = wbs.u(aaeaVar);
    }

    @Override // defpackage.mzc
    public final View a() {
        return this.j;
    }

    @Override // defpackage.mzc
    public final asgz b(asgz asgzVar) {
        aone builder = asgzVar.toBuilder();
        if (h()) {
            int aK = aocz.aK(this.f.c);
            if (aK == 0 || aK != 2) {
                int aK2 = aocz.aK(this.f.c);
                if (aK2 != 0 && aK2 == 3) {
                    builder.copyOnWrite();
                    asgz.b((asgz) builder.instance);
                }
            } else {
                builder.copyOnWrite();
                asgz.a((asgz) builder.instance);
            }
        }
        if (this.f.e.length() > 0) {
            int aK3 = aocz.aK(this.f.c);
            if (aK3 == 0 || aK3 != 2) {
                int aK4 = aocz.aK(this.f.c);
                if (aK4 != 0 && aK4 == 3) {
                    builder.copyOnWrite();
                    asgz.e((asgz) builder.instance);
                }
            } else {
                builder.copyOnWrite();
                asgz.d((asgz) builder.instance);
            }
        }
        return (asgz) builder.build();
    }

    @Override // defpackage.mzc
    public final ashq c(ashq ashqVar) {
        aone builder = ashqVar.toBuilder();
        if (h()) {
            int aK = aocz.aK(this.f.c);
            if (aK == 0 || aK != 2) {
                int aK2 = aocz.aK(this.f.c);
                if (aK2 != 0 && aK2 == 3) {
                    builder.copyOnWrite();
                    ashq.b((ashq) builder.instance);
                }
            } else {
                builder.copyOnWrite();
                ashq.a((ashq) builder.instance);
            }
        }
        if (this.f.e.length() > 0) {
            int aK3 = aocz.aK(this.f.c);
            if (aK3 == 0 || aK3 != 2) {
                int aK4 = aocz.aK(this.f.c);
                if (aK4 != 0 && aK4 == 3) {
                    builder.copyOnWrite();
                    ashq.e((ashq) builder.instance);
                }
            } else {
                builder.copyOnWrite();
                ashq.d((ashq) builder.instance);
            }
        }
        return (ashq) builder.build();
    }

    @Override // defpackage.mzc
    public final View d() {
        aqyg aqygVar;
        aqyg aqygVar2;
        this.b.setOnFocusChangeListener(new mzw(this));
        this.b.setOnClickListener(new View.OnClickListener() { // from class: mzt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mzy.this.i();
            }
        });
        this.b.setImeOptions(5);
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: mzu
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                mzy mzyVar = mzy.this;
                ((InputMethodManager) mzyVar.a.getSystemService("input_method")).hideSoftInputFromWindow(textView.getRootView().getWindowToken(), 2);
                mzyVar.b.clearFocus();
                return true;
            }
        });
        TextInputLayout textInputLayout = this.k;
        aqzf aqzfVar = this.f;
        if ((aqzfVar.b & 2) != 0) {
            aqygVar = aqzfVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textInputLayout.B(ajcq.b(aqygVar));
        TextInputLayout textInputLayout2 = this.k;
        aqzf aqzfVar2 = this.f;
        if ((aqzfVar2.b & 16) != 0) {
            aqygVar2 = aqzfVar2.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textInputLayout2.z(ajcq.b(aqygVar2));
        aqzf aqzfVar3 = this.f;
        if ((aqzfVar3.b & 128) != 0) {
            this.i = true;
            this.b.setText(aqzfVar3.j);
        } else {
            this.b.setText(aqzfVar3.e);
        }
        this.b.addTextChangedListener(this.l);
        int aK = aocz.aK(this.f.c);
        if (aK == 0) {
            aK = 1;
        }
        int i = aK - 1;
        if (i == 1) {
            this.b.setInputType(33);
        } else {
            if (i != 2) {
                return null;
            }
            this.b.setInputType(1);
        }
        if ((this.f.b & 32) != 0) {
            this.b.b(this.m, new xmf() { // from class: mzv
                @Override // defpackage.xmf
                public final void a() {
                    mzy mzyVar = mzy.this;
                    aahd aahdVar = mzyVar.c;
                    apxf apxfVar = mzyVar.f.h;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, acrc.g(mzyVar.f));
                }
            });
        }
        this.d.u(new acqx(this.f.k), null);
        return this.j;
    }

    @Override // defpackage.mzc
    public final String f() {
        return this.i ? this.f.e : this.b.getText().toString();
    }

    @Override // defpackage.mzc
    public final void g(boolean z) {
        if (z) {
            if (this.n) {
                this.k.y(ColorStateList.valueOf(wbs.Q(this.a, R.attr.ytErrorIndicator)));
                this.m.setTint(wbs.Q(this.a, R.attr.ytErrorIndicator));
            }
            aqyg aqygVar = this.o;
            if (aqygVar == null && (aqygVar = this.f.f) == null) {
                aqygVar = aqyg.a;
            }
            this.k.v(ajcq.b(aqygVar));
            this.k.setBackgroundColor(wbs.Q(this.a, true != this.n ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
            return;
        }
        if (this.n) {
            this.m.setTint(wbs.Q(this.a, R.attr.ytIcon1));
        }
        this.k.w(false);
        this.k.setBackgroundColor(0);
    }

    @Override // defpackage.mzc
    public final boolean h() {
        return !this.f.e.contentEquals(f());
    }

    public final void i() {
        this.d.I(3, new acqx(this.f.k), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (f().length() <= 0) goto L26;
     */
    @Override // defpackage.mzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mzb e(boolean r5) {
        /*
            r4 = this;
            aqzf r0 = r4.f
            int r0 = r0.b
            r0 = r0 & 64
            if (r0 == 0) goto L27
            java.lang.String r5 = r4.f()
            aqzf r0 = r4.f
            avvd r0 = r0.i
            if (r0 != 0) goto L14
            avvd r0 = defpackage.avvd.a
        L14:
            nab r5 = defpackage.nac.a(r5, r0)
            aqyg r0 = r5.b
            r4.o = r0
            boolean r0 = r5.a
            apxf r1 = r5.c
            ashb r5 = r5.d
            mzb r5 = defpackage.mzb.a(r0, r1, r5)
            return r5
        L27:
            r0 = 0
            r4.o = r0
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L3a
            java.lang.String r5 = r4.f()
            int r5 = r5.length()
            if (r5 != 0) goto L3a
        L38:
            r1 = 1
            goto L66
        L3a:
            aqzf r5 = r4.f
            int r5 = r5.c
            int r5 = defpackage.aocz.aK(r5)
            if (r5 != 0) goto L45
            r5 = 1
        L45:
            int r5 = r5 + (-1)
            if (r5 == r2) goto L58
            r3 = 2
            if (r5 == r3) goto L4d
            goto L66
        L4d:
            java.lang.String r5 = r4.f()
            int r5 = r5.length()
            if (r5 <= 0) goto L66
            goto L38
        L58:
            java.util.regex.Pattern r5 = android.util.Patterns.EMAIL_ADDRESS
            java.lang.String r1 = r4.f()
            java.util.regex.Matcher r5 = r5.matcher(r1)
            boolean r1 = r5.matches()
        L66:
            mzb r5 = defpackage.mzb.a(r1, r0, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzy.e(boolean):mzb");
    }
}
