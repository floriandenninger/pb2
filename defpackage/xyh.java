package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xyh implements xyt {
    private final View C;
    private final aqsv D;
    private final boolean E;
    private String F;
    private final ajsa G;
    private final TextWatcher H;
    private boolean I;
    public final Dialog a;
    public final Context b;
    public final Activity c;
    public final ajjs d;
    public final ajyo e;
    public final EditText f;
    public final ImageView g;
    public final ImageView h;
    public final ImageView i;
    public final TextView j;
    public final TextView k;
    public final View l;
    public final TextView m;
    public final View n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final View r;
    public final boolean s;
    public final ColorDrawable t;
    public Runnable u;
    public Runnable v;
    public boolean w;
    public boolean x;
    public xnp y;
    private static final Pattern z = Pattern.compile("^\\s*$");
    private static final Pattern A = Pattern.compile("^\\s*");
    private static final Pattern B = Pattern.compile("\\s*$");

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xyh(android.content.Context r17, android.app.Activity r18, defpackage.ajjs r19, defpackage.ajyo r20, defpackage.ajut r21, defpackage.apmg r22, defpackage.aqsv r23, defpackage.aadw r24, defpackage.ajsa r25) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xyh.<init>(android.content.Context, android.app.Activity, ajjs, ajyo, ajut, apmg, aqsv, aadw, ajsa):void");
    }

    @Override // defpackage.xyt
    public final Spanned a() {
        EditText editText = this.f;
        return editText == null ? new SpannedString("") : new SpannedString(editText.getText());
    }

    @Override // defpackage.xyt
    public final void b() {
        this.a.cancel();
    }

    public final void c(boolean z2) {
        if (m()) {
            z2 = false;
        } else if (this.x) {
            z2 = true;
        }
        this.w = z2;
        f(z2);
    }

    public final void d(CharSequence charSequence, boolean z2) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f.getText().clear();
        this.f.append(charSequence);
        c(z2);
        if (!this.w) {
            String charSequence2 = charSequence.toString();
            this.F = charSequence2;
            String replaceAll = charSequence2.replaceAll(A.toString(), "");
            this.F = replaceAll;
            this.F = replaceAll.replaceAll(B.toString(), "");
        } else {
            this.F = "";
        }
        yaf[] yafVarArr = (yaf[]) this.f.getText().getSpans(0, this.f.getText().length(), yaf.class);
        if (yafVarArr == null || yafVarArr.length == 0) {
            this.f.getText().setSpan(new yaf(), 0, this.f.getText().length(), 18);
        }
    }

    @Override // defpackage.xyt
    public final void dismiss() {
        if (this.I || this.c.isDestroyed() || this.c.isFinishing()) {
            return;
        }
        this.a.dismiss();
        this.I = true;
    }

    @Override // defpackage.xyt
    public final void e(DialogInterface.OnCancelListener onCancelListener) {
        this.a.setOnCancelListener(onCancelListener);
    }

    public final void f(boolean z2) {
        this.i.setVisibility(z2 ? 0 : this.g.getVisibility() == 0 || (this.E && this.h.getVisibility() == 0) ? 8 : 4);
        whu.F(this.i, null, 1);
    }

    @Override // defpackage.xyt
    public final void g() {
        this.g.setVisibility(0);
    }

    public final void h() {
        this.e.f((ViewGroup) this.C, this.D, this.f, new xyg(this));
    }

    @Override // defpackage.xyt
    public final void i() {
        if (this.e.h) {
            h();
        }
    }

    @Override // defpackage.xyt
    public final void j() {
        TextWatcher textWatcher = this.H;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(this.f.getText());
        }
    }

    @Override // defpackage.xyt
    public final boolean k() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return TextUtils.isEmpty(this.F) ? !m() : !a().toString().replaceAll(A.toString(), "").replaceAll(B.toString(), "").equals(this.F);
    }

    @Override // defpackage.xyt
    public final boolean m() {
        String obj = a().toString();
        return TextUtils.isEmpty(obj) || z.matcher(obj).find();
    }
}
