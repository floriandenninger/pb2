package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xyr extends xzd implements DialogInterface.OnShowListener {
    private static final Pattern aJ = Pattern.compile("^\\s*$");
    private static final Pattern aK = Pattern.compile("^\\s*");
    private static final Pattern aL = Pattern.compile("\\s*$");
    public boolean aA;
    public boolean aB;
    public int aC;
    public String aD;
    public Long aE;
    public aadw aF;
    public xnq aG;
    public etw aH;
    public akht aI;
    private avgg aM;
    private awjz aN;
    private apmg aO;
    private CharSequence aP;
    private boolean aQ;
    private apmg aR;
    private aqsv aS;
    private apyj aT;
    private apzd aU;
    private Spanned aV;
    private Spanned aW;
    private boolean aX;
    private boolean aY;
    private boolean aZ;
    public aahd ae;
    public ajsa af;
    public ajyw ag;
    public ajjs ah;
    public ajut ai;
    public acra aj;
    public akbv ak;
    public akcy al;
    public Context am;
    public ajyo an;
    public EditText ao;
    public View ap;
    public ImageView aq;
    public View ar;
    public View as;
    public Runnable at;
    public Runnable au;
    public DialogInterface.OnDismissListener av;
    public DialogInterface.OnCancelListener aw;
    public DialogInterface.OnShowListener ax;
    public Dialog ay;
    public boolean az;
    private View ba;
    private ImageView bb;
    private View bc;
    private ImageView bd;
    private ImageView be;
    private TextView bf;
    private TextView bg;
    private View bh;
    private TextView bi;
    private View bj;
    private ImageView bk;
    private ImageView bl;
    private TextWatcher bm;
    private String bn;
    private ayqw bo;

    private static aooy aN(Bundle bundle, String str, aooy aooyVar) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        try {
            return amkq.ck(bundle, str, aooyVar, aomw.b());
        } catch (RuntimeException unused) {
            zga.b(str.length() != 0 ? "Failed to merge proto for ".concat(str) : new String("Failed to merge proto for "));
            return null;
        }
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        if (this.aB) {
            dismiss();
        }
    }

    @Override // defpackage.xyt
    public final Spanned a() {
        EditText editText = this.ao;
        return editText == null ? new SpannedString("") : new SpannedString(editText.getText());
    }

    public final void aF(boolean z) {
        if (m()) {
            z = false;
        } else if (this.aA) {
            z = true;
        }
        this.az = z;
        aH(z);
    }

    public final void aG(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.ao.getText().clear();
        this.ao.append(charSequence);
        aF(z);
        if (!this.az) {
            String charSequence2 = charSequence.toString();
            this.bn = charSequence2;
            String replaceAll = charSequence2.replaceAll(aK.toString(), "");
            this.bn = replaceAll;
            this.bn = replaceAll.replaceAll(aL.toString(), "");
        } else {
            this.bn = "";
        }
        yaf[] yafVarArr = (yaf[]) this.ao.getText().getSpans(0, this.ao.getText().length(), yaf.class);
        if (yafVarArr == null || yafVarArr.length == 0) {
            this.ao.getText().setSpan(new yaf(), 0, this.ao.getText().length(), 18);
        }
    }

    public final void aH(boolean z) {
        this.bb.setVisibility(z ? 0 : this.aq.getVisibility() == 0 || (this.aY && this.be.getVisibility() == 0) ? 8 : 4);
        whu.F(this.bb, null, 1);
    }

    public final void aI(boolean z) {
        this.be.setEnabled(!z);
        Drawable c = gl.c(nz.b(this.am, R.drawable.ic_timestamp));
        c.setTint(wbs.W(this.am, true != z ? R.attr.ytTextSecondary : R.attr.ytTextDisabled).orElse(0));
        this.be.setImageDrawable(c);
    }

    public final void aJ() {
        ajyo ajyoVar = this.an;
        if (ajyoVar != null) {
            ajyoVar.f((ViewGroup) this.ba, this.aS, this.ao, new xyq(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aK() {
        return TextUtils.isEmpty(this.bn) ? !m() : !a().toString().replaceAll(aK.toString(), "").replaceAll(aL.toString(), "").equals(this.bn);
    }

    @Override // defpackage.xyt
    public final void b() {
        this.ay.cancel();
    }

    @Override // defpackage.bv
    public final void dismiss() {
        dd ddVar = this.z;
        if (ddVar == null || ddVar.Y()) {
            return;
        }
        super.dismiss();
    }

    @Override // defpackage.xyt
    public final void e(DialogInterface.OnCancelListener onCancelListener) {
        this.aw = onCancelListener;
    }

    @Override // defpackage.xyt
    public final void g() {
        this.aq.setVisibility(0);
    }

    @Override // defpackage.xyt
    public final void i() {
        if (this.an.h) {
            aJ();
        }
    }

    @Override // defpackage.xyt
    public final void j() {
        TextWatcher textWatcher = this.bm;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(this.ao.getText());
        }
    }

    @Override // defpackage.xyt
    public final boolean k() {
        return this.az;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lZ() {
        super.lZ();
        ayqw ayqwVar = this.bo;
        if (ayqwVar != null) {
            ayqwVar.c();
        }
    }

    @Override // defpackage.xyt
    public final boolean m() {
        String obj = a().toString();
        return TextUtils.isEmpty(obj) || aJ.matcher(obj).find();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        if (r5 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    @Override // defpackage.bv, defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mR(android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xyr.mR(android.os.Bundle):void");
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setLayout(-1, -2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        window.setAttributes(attributes);
        window.setSoftInputMode(5);
        this.ao.requestFocus();
        if (this.aZ) {
            window.setFlags(32, 32);
            window.clearFlags(2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View decorView = C().getWindow().getDecorView();
            final int height = decorView.getHeight();
            final Window window2 = this.ay.getWindow();
            decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xyi
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    xyr xyrVar = xyr.this;
                    int i = height;
                    Window window3 = window2;
                    int systemWindowInsetTop = i - (((windowInsets.getSystemWindowInsetTop() + windowInsets.getSystemWindowInsetBottom()) + xyrVar.am.getApplicationContext().getResources().getDimensionPixelSize(R.dimen.comment_dialog_scrubber_offset)) + xyrVar.aC);
                    if (systemWindowInsetTop > xyrVar.as.getHeight()) {
                        xyrVar.ar.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                        window3.setLayout(-1, systemWindowInsetTop);
                    } else {
                        xyrVar.ar.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 0.0f));
                        window3.setLayout(-1, -2);
                    }
                    return windowInsets;
                }
            });
            decorView.requestApplyInsets();
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(wbs.W(this.am, R.attr.ytGeneralBackgroundA).orElse(0)));
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aqsv aqsvVar;
        super.mg(layoutInflater, viewGroup, bundle);
        final int i = 1;
        final int i2 = 0;
        View inflate = LayoutInflater.from(this.am).inflate(true != this.aZ ? R.layout.comment_dialog : R.layout.comment_dialog_with_dismiss_button, viewGroup, false);
        this.ba = inflate;
        this.al.g(inflate);
        this.ao = (EditText) this.ba.findViewById(R.id.comment);
        this.bb = (ImageView) this.ba.findViewById(R.id.send_button);
        this.ap = this.ba.findViewById(R.id.progress_bar);
        this.bc = this.ba.findViewById(R.id.actions);
        this.bd = (ImageView) this.ba.findViewById(R.id.video_reply_button);
        this.aq = (ImageView) this.ba.findViewById(R.id.toggle_emoji_picker_icon);
        this.be = (ImageView) this.ba.findViewById(R.id.timestamp_button);
        this.bf = (TextView) this.ba.findViewById(R.id.header_text);
        this.bg = (TextView) this.ba.findViewById(R.id.caption_text);
        this.bh = this.ba.findViewById(R.id.caption_divider);
        this.bi = (TextView) this.ba.findViewById(R.id.footer_text);
        this.bj = this.ba.findViewById(R.id.footer_divider);
        this.bk = (ImageView) this.ba.findViewById(R.id.profile_photo);
        this.bl = (ImageView) this.ba.findViewById(R.id.profile_photo_compact);
        this.ay = this.d;
        this.bn = "";
        if (this.aX) {
            this.bk.setVisibility(8);
            this.bl.setVisibility(0);
        } else {
            this.bk.setVisibility(0);
            this.bl.setVisibility(8);
        }
        new ajkj(this.ah, new yzw(), this.aX ? this.bl : this.bk, false).k(this.aM);
        final int i3 = 2;
        if (this.aY) {
            this.be.setEnabled(true);
            this.be.setOnClickListener(new View.OnClickListener(this) { // from class: xyl
                public final /* synthetic */ xyr a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            this.a.ay.cancel();
                            return;
                        }
                        if (i4 != 2) {
                            Runnable runnable = this.a.at;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                        Runnable runnable2 = this.a.au;
                        if (runnable2 != null) {
                            runnable2.run();
                            return;
                        }
                        return;
                    }
                    xyr xyrVar = this.a;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xyrVar.a());
                    wcy.n(spannableStringBuilder);
                    if (!xyrVar.m() && (xyrVar.aA || xyrVar.aK())) {
                        xyrVar.ay.setCancelable(false);
                        xyrVar.ay.setCanceledOnTouchOutside(false);
                        xyrVar.aF(xyrVar.az);
                        xyrVar.aH(false);
                        xyrVar.ap.setVisibility(0);
                        xyrVar.ao.setEnabled(false);
                        xyrVar.aB = true;
                        xnq xnqVar = xyrVar.aG;
                        if (xnqVar != null) {
                            String spannableStringBuilder2 = spannableStringBuilder.toString();
                            xoh xohVar = xnqVar.a;
                            xys xysVar = xnqVar.b;
                            xoo xooVar = xnqVar.c;
                            ajvc ajvcVar = xnqVar.d;
                            Long l = xnqVar.e;
                            boolean z = xnqVar.f;
                            if (!xohVar.c.o()) {
                                xysVar.dismiss();
                                xohVar.d(xohVar.a.getText(R.string.common_error_connection), amlr.a, R.string.comments_discard_positive_button, xooVar, ajvcVar, xysVar, l, z, false);
                                return;
                            } else if (xooVar.p - 1 != 0) {
                                xohVar.m(ajvcVar, spannableStringBuilder2, xooVar, xysVar);
                                return;
                            } else {
                                xohVar.l(spannableStringBuilder2, ajvcVar, xooVar, xysVar, l);
                                return;
                            }
                        }
                        return;
                    }
                    xyrVar.dismiss();
                }
            });
            final acra mM = C() instanceof acqz ? ((acqz) C()).mM() : null;
            final acsc c = acsb.c(this.aT != null ? 113255 : 113430);
            if (mM != null) {
                mM.n(new acqx(c));
            }
            if (this.aY && this.aH.d() != null) {
                boolean booleanValue = this.aH.c().booleanValue();
                this.au = new Runnable() { // from class: xyk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Long l;
                        xyr xyrVar = xyr.this;
                        acra acraVar = mM;
                        acsc acscVar = c;
                        if (xyrVar.aH.c().booleanValue() || (l = xyrVar.aE) == null) {
                            return;
                        }
                        bajo b = bajo.b(l.longValue());
                        Editable text = xyrVar.ao.getText();
                        int selectionStart = Selection.getSelectionStart(text);
                        int selectionEnd = Selection.getSelectionEnd(text);
                        boolean z = false;
                        if (selectionStart != 0) {
                            if (" \n\r-_".indexOf(text.charAt(selectionStart - 1)) == -1) {
                                z = true;
                            }
                        }
                        bajo c2 = bajo.c((b.b + 500) / 1000);
                        int i4 = b.a() > 0 ? 2 : 1;
                        banh banhVar = new banh();
                        banhVar.e();
                        banhVar.i(":");
                        banhVar.h();
                        banhVar.a = i4;
                        banhVar.f();
                        banhVar.i(":");
                        banhVar.h();
                        banhVar.a = 2;
                        banhVar.g();
                        String a = banhVar.a().a(c2.e());
                        String str = true != z ? "" : " ";
                        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(a).length());
                        sb.append(str);
                        sb.append(a);
                        sb.append(" ");
                        text.replace(selectionStart, selectionEnd, sb.toString());
                        if (acraVar != null) {
                            acraVar.I(3, new acqx(acscVar), null);
                        }
                    }
                };
                if (this.bb.getVisibility() == 4) {
                    this.bb.setVisibility(8);
                }
                this.be.setVisibility(0);
                aI(booleanValue);
                whu.F(this.be, null, 1);
                apyj apyjVar = this.aT;
                if (apyjVar != null) {
                    aulq aulqVar = apyjVar.j;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    if (aulqVar.pY(HintRendererOuterClass.hintRenderer)) {
                        akbv akbvVar = this.ak;
                        aulq aulqVar2 = this.aT.j;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        akbvVar.b((arej) aulqVar2.pX(HintRendererOuterClass.hintRenderer), this.be, this.aT, this.aj);
                    }
                }
                apzd apzdVar = this.aU;
                if (apzdVar != null) {
                    aulq aulqVar3 = apzdVar.l;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    if (aulqVar3.pY(HintRendererOuterClass.hintRenderer)) {
                        akbv akbvVar2 = this.ak;
                        aulq aulqVar4 = this.aU.l;
                        if (aulqVar4 == null) {
                            aulqVar4 = aulq.a;
                        }
                        akbvVar2.b((arej) aulqVar4.pX(HintRendererOuterClass.hintRenderer), this.be, this.aU, this.aj);
                    }
                }
            }
        }
        TextWatcher c2 = this.an.c(this.ao);
        this.bm = c2;
        this.ao.addTextChangedListener(c2);
        this.ao.addTextChangedListener(new yag());
        this.ao.addTextChangedListener(new xyp(this));
        this.ao.post(new Runnable() { // from class: xyj
            @Override // java.lang.Runnable
            public final void run() {
                xyr xyrVar = xyr.this;
                if (xyrVar.ao == null) {
                    return;
                }
                SpannableString spannableString = new SpannableString(xyrVar.a());
                if (TextUtils.isEmpty(spannableString)) {
                    return;
                }
                wcy.m(spannableString, xyrVar.am.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_corner_radius), xyrVar.am.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_horizontal_padding), xyrVar.ao.getMeasuredWidth() * 0.9f, wbs.W(xyrVar.am, R.attr.ytBadgeChipBackground).orElse(0));
                ajtg[] ajtgVarArr = (ajtg[]) spannableString.getSpans(0, spannableString.length(), ajtg.class);
                if (ajtgVarArr == null || ajtgVarArr.length <= 0) {
                    return;
                }
                xyrVar.aG(spannableString, xyrVar.az);
            }
        });
        aG(this.aP, this.aQ);
        Spanned spanned = this.aW;
        if (!TextUtils.isEmpty(spanned)) {
            this.ao.setHint(spanned);
        }
        awjz awjzVar = this.aN;
        if (awjzVar != null) {
            aqyg aqygVar = awjzVar.b;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            this.bf.setText(ajcq.b(aqygVar));
            whu.I(this.bf, !TextUtils.isEmpty(r8));
            aqyg aqygVar2 = this.aN.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            this.bi.setText(aahk.a(aqygVar2, this.ae, false));
            whu.I(this.bj, !TextUtils.isEmpty(r8));
            whu.I(this.bi, !TextUtils.isEmpty(r8));
        } else {
            Spanned spanned2 = this.aV;
            if (spanned2 != null) {
                this.bg.setText(spanned2);
                whu.I(this.bg, !TextUtils.isEmpty(spanned2));
                whu.I(this.bh, !TextUtils.isEmpty(spanned2));
            }
        }
        this.bd.setEnabled(true);
        final int i4 = 3;
        this.bd.setOnClickListener(new View.OnClickListener(this) { // from class: xyl
            public final /* synthetic */ xyr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                if (i42 != 0) {
                    if (i42 == 1) {
                        this.a.ay.cancel();
                        return;
                    }
                    if (i42 != 2) {
                        Runnable runnable = this.a.at;
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    Runnable runnable2 = this.a.au;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                xyr xyrVar = this.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xyrVar.a());
                wcy.n(spannableStringBuilder);
                if (!xyrVar.m() && (xyrVar.aA || xyrVar.aK())) {
                    xyrVar.ay.setCancelable(false);
                    xyrVar.ay.setCanceledOnTouchOutside(false);
                    xyrVar.aF(xyrVar.az);
                    xyrVar.aH(false);
                    xyrVar.ap.setVisibility(0);
                    xyrVar.ao.setEnabled(false);
                    xyrVar.aB = true;
                    xnq xnqVar = xyrVar.aG;
                    if (xnqVar != null) {
                        String spannableStringBuilder2 = spannableStringBuilder.toString();
                        xoh xohVar = xnqVar.a;
                        xys xysVar = xnqVar.b;
                        xoo xooVar = xnqVar.c;
                        ajvc ajvcVar = xnqVar.d;
                        Long l = xnqVar.e;
                        boolean z = xnqVar.f;
                        if (!xohVar.c.o()) {
                            xysVar.dismiss();
                            xohVar.d(xohVar.a.getText(R.string.common_error_connection), amlr.a, R.string.comments_discard_positive_button, xooVar, ajvcVar, xysVar, l, z, false);
                            return;
                        } else if (xooVar.p - 1 != 0) {
                            xohVar.m(ajvcVar, spannableStringBuilder2, xooVar, xysVar);
                            return;
                        } else {
                            xohVar.l(spannableStringBuilder2, ajvcVar, xooVar, xysVar, l);
                            return;
                        }
                    }
                    return;
                }
                xyrVar.dismiss();
            }
        });
        apmg apmgVar = this.aO;
        if (apmgVar != null) {
            int i5 = apmgVar.b;
            if ((i5 & 32) != 0 && (i5 & 16384) != 0) {
                ajut ajutVar = this.ai;
                arfs arfsVar = apmgVar.g;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                int a = ajutVar.a(b);
                this.bc.setVisibility(0);
                this.bd.setVisibility(0);
                this.bd.setImageResource(a);
            }
        }
        this.bb.setOnClickListener(new View.OnClickListener(this) { // from class: xyl
            public final /* synthetic */ xyr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i2;
                if (i42 != 0) {
                    if (i42 == 1) {
                        this.a.ay.cancel();
                        return;
                    }
                    if (i42 != 2) {
                        Runnable runnable = this.a.at;
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    Runnable runnable2 = this.a.au;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                xyr xyrVar = this.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xyrVar.a());
                wcy.n(spannableStringBuilder);
                if (!xyrVar.m() && (xyrVar.aA || xyrVar.aK())) {
                    xyrVar.ay.setCancelable(false);
                    xyrVar.ay.setCanceledOnTouchOutside(false);
                    xyrVar.aF(xyrVar.az);
                    xyrVar.aH(false);
                    xyrVar.ap.setVisibility(0);
                    xyrVar.ao.setEnabled(false);
                    xyrVar.aB = true;
                    xnq xnqVar = xyrVar.aG;
                    if (xnqVar != null) {
                        String spannableStringBuilder2 = spannableStringBuilder.toString();
                        xoh xohVar = xnqVar.a;
                        xys xysVar = xnqVar.b;
                        xoo xooVar = xnqVar.c;
                        ajvc ajvcVar = xnqVar.d;
                        Long l = xnqVar.e;
                        boolean z = xnqVar.f;
                        if (!xohVar.c.o()) {
                            xysVar.dismiss();
                            xohVar.d(xohVar.a.getText(R.string.common_error_connection), amlr.a, R.string.comments_discard_positive_button, xooVar, ajvcVar, xysVar, l, z, false);
                            return;
                        } else if (xooVar.p - 1 != 0) {
                            xohVar.m(ajvcVar, spannableStringBuilder2, xooVar, xysVar);
                            return;
                        } else {
                            xohVar.l(spannableStringBuilder2, ajvcVar, xooVar, xysVar, l);
                            return;
                        }
                    }
                    return;
                }
                xyrVar.dismiss();
            }
        });
        ayqw ayqwVar = new ayqw();
        this.bo = ayqwVar;
        if (this.aY) {
            ayqwVar.g(this.aH.a().X(new ayrs(this) { // from class: xyn
                public final /* synthetic */ xyr a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i6 = i3;
                    if (i6 == 0) {
                        this.a.aE = Long.valueOf(((aheg) obj).e());
                        return;
                    }
                    if (i6 == 1) {
                        xyr xyrVar = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf d = ahcxVar.d();
                        if (d == aigf.FULLSCREEN || d == aigf.MINIMIZED) {
                            xyrVar.ay.hide();
                        } else if (d == aigf.DEFAULT) {
                            xyrVar.ay.show();
                        }
                        xyrVar.aC = ahcxVar.a();
                        return;
                    }
                    if (i6 == 2) {
                        xyr xyrVar2 = this.a;
                        xyrVar2.aI(xyrVar2.aH.c().booleanValue());
                    } else {
                        xyr xyrVar3 = this.a;
                        PlaybackStartDescriptor g = ((ahel) obj).a().g();
                        if (g == null || TextUtils.equals(g.l(), xyrVar3.aD)) {
                            return;
                        }
                        xyrVar3.dismiss();
                    }
                }
            }), this.aH.b().X(new ayrs(this) { // from class: xyn
                public final /* synthetic */ xyr a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i6 = i2;
                    if (i6 == 0) {
                        this.a.aE = Long.valueOf(((aheg) obj).e());
                        return;
                    }
                    if (i6 == 1) {
                        xyr xyrVar = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf d = ahcxVar.d();
                        if (d == aigf.FULLSCREEN || d == aigf.MINIMIZED) {
                            xyrVar.ay.hide();
                        } else if (d == aigf.DEFAULT) {
                            xyrVar.ay.show();
                        }
                        xyrVar.aC = ahcxVar.a();
                        return;
                    }
                    if (i6 == 2) {
                        xyr xyrVar2 = this.a;
                        xyrVar2.aI(xyrVar2.aH.c().booleanValue());
                    } else {
                        xyr xyrVar3 = this.a;
                        PlaybackStartDescriptor g = ((ahel) obj).a().g();
                        if (g == null || TextUtils.equals(g.l(), xyrVar3.aD)) {
                            return;
                        }
                        xyrVar3.dismiss();
                    }
                }
            }));
        }
        if (this.aZ) {
            this.ar = this.ba.findViewById(R.id.dismiss_button);
            this.as = this.ba.findViewById(R.id.comment_dialog_wrapper);
            View view = this.ar;
            if (view != null) {
                view.setEnabled(true);
                this.ar.setVisibility(0);
                this.ar.setOnClickListener(new View.OnClickListener(this) { // from class: xyl
                    public final /* synthetic */ xyr a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i42 = i;
                        if (i42 != 0) {
                            if (i42 == 1) {
                                this.a.ay.cancel();
                                return;
                            }
                            if (i42 != 2) {
                                Runnable runnable = this.a.at;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                            }
                            Runnable runnable2 = this.a.au;
                            if (runnable2 != null) {
                                runnable2.run();
                                return;
                            }
                            return;
                        }
                        xyr xyrVar = this.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xyrVar.a());
                        wcy.n(spannableStringBuilder);
                        if (!xyrVar.m() && (xyrVar.aA || xyrVar.aK())) {
                            xyrVar.ay.setCancelable(false);
                            xyrVar.ay.setCanceledOnTouchOutside(false);
                            xyrVar.aF(xyrVar.az);
                            xyrVar.aH(false);
                            xyrVar.ap.setVisibility(0);
                            xyrVar.ao.setEnabled(false);
                            xyrVar.aB = true;
                            xnq xnqVar = xyrVar.aG;
                            if (xnqVar != null) {
                                String spannableStringBuilder2 = spannableStringBuilder.toString();
                                xoh xohVar = xnqVar.a;
                                xys xysVar = xnqVar.b;
                                xoo xooVar = xnqVar.c;
                                ajvc ajvcVar = xnqVar.d;
                                Long l = xnqVar.e;
                                boolean z = xnqVar.f;
                                if (!xohVar.c.o()) {
                                    xysVar.dismiss();
                                    xohVar.d(xohVar.a.getText(R.string.common_error_connection), amlr.a, R.string.comments_discard_positive_button, xooVar, ajvcVar, xysVar, l, z, false);
                                    return;
                                } else if (xooVar.p - 1 != 0) {
                                    xohVar.m(ajvcVar, spannableStringBuilder2, xooVar, xysVar);
                                    return;
                                } else {
                                    xohVar.l(spannableStringBuilder2, ajvcVar, xooVar, xysVar, l);
                                    return;
                                }
                            }
                            return;
                        }
                        xyrVar.dismiss();
                    }
                });
            }
            this.bo.g(this.aH.a.ab().X(new ayrs(this) { // from class: xyn
                public final /* synthetic */ xyr a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i6 = i4;
                    if (i6 == 0) {
                        this.a.aE = Long.valueOf(((aheg) obj).e());
                        return;
                    }
                    if (i6 == 1) {
                        xyr xyrVar = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf d = ahcxVar.d();
                        if (d == aigf.FULLSCREEN || d == aigf.MINIMIZED) {
                            xyrVar.ay.hide();
                        } else if (d == aigf.DEFAULT) {
                            xyrVar.ay.show();
                        }
                        xyrVar.aC = ahcxVar.a();
                        return;
                    }
                    if (i6 == 2) {
                        xyr xyrVar2 = this.a;
                        xyrVar2.aI(xyrVar2.aH.c().booleanValue());
                    } else {
                        xyr xyrVar3 = this.a;
                        PlaybackStartDescriptor g = ((ahel) obj).a().g();
                        if (g == null || TextUtils.equals(g.l(), xyrVar3.aD)) {
                            return;
                        }
                        xyrVar3.dismiss();
                    }
                }
            }), this.aH.a.t().b.X(new ayrs(this) { // from class: xyn
                public final /* synthetic */ xyr a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i6 = i;
                    if (i6 == 0) {
                        this.a.aE = Long.valueOf(((aheg) obj).e());
                        return;
                    }
                    if (i6 == 1) {
                        xyr xyrVar = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf d = ahcxVar.d();
                        if (d == aigf.FULLSCREEN || d == aigf.MINIMIZED) {
                            xyrVar.ay.hide();
                        } else if (d == aigf.DEFAULT) {
                            xyrVar.ay.show();
                        }
                        xyrVar.aC = ahcxVar.a();
                        return;
                    }
                    if (i6 == 2) {
                        xyr xyrVar2 = this.a;
                        xyrVar2.aI(xyrVar2.aH.c().booleanValue());
                    } else {
                        xyr xyrVar3 = this.a;
                        PlaybackStartDescriptor g = ((ahel) obj).a().g();
                        if (g == null || TextUtils.equals(g.l(), xyrVar3.aD)) {
                            return;
                        }
                        xyrVar3.dismiss();
                    }
                }
            }));
        }
        apmg apmgVar2 = this.aR;
        ajut ajutVar2 = this.ai;
        if (apmgVar2 != null && (aqsvVar = this.aS) != null && aqsvVar.c.size() != 0 && (apmgVar2.b & 32) != 0) {
            arfs arfsVar2 = apmgVar2.g;
            if (arfsVar2 == null) {
                arfsVar2 = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar2.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            if (b2 != arfr.UNKNOWN) {
                arfs arfsVar3 = apmgVar2.g;
                if (arfsVar3 == null) {
                    arfsVar3 = arfs.a;
                }
                arfr b3 = arfr.b(arfsVar3.c);
                if (b3 == null) {
                    b3 = arfr.UNKNOWN;
                }
                int a2 = ajutVar2.a(b3);
                final Drawable c3 = gl.c(nz.b(this.am, a2));
                c3.setTint(wbs.W(this.am, R.attr.ytIconInactive).orElse(0));
                final Drawable c4 = gl.c(nz.b(this.am, a2));
                c4.setTint(wbs.W(this.am, R.attr.ytCallToAction).orElse(0));
                this.aq.setImageDrawable(c3);
                ImageView imageView = this.aq;
                aott aottVar = apmgVar2.s;
                if (aottVar == null) {
                    aottVar = aott.a;
                }
                aots aotsVar = aottVar.c;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                imageView.setContentDescription(aotsVar.c);
                if (this.af.h()) {
                    this.aq.setVisibility(0);
                } else {
                    this.aq.setVisibility(4);
                }
                this.aq.setOnClickListener(new View.OnClickListener() { // from class: xym
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        xyr xyrVar = xyr.this;
                        Drawable drawable = c3;
                        Drawable drawable2 = c4;
                        ajyo ajyoVar = xyrVar.an;
                        if (ajyoVar.h) {
                            ajyoVar.d();
                            xyrVar.ao.requestFocus();
                            whu.J(xyrVar.ao);
                            xyrVar.aq.setImageDrawable(drawable);
                            return;
                        }
                        xyrVar.aJ();
                        xyrVar.aq.setImageDrawable(drawable2);
                    }
                });
            }
        }
        return this.ba;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.aw;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        this.aj.t();
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.av;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.aj.t();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        acra acraVar;
        DialogInterface.OnShowListener onShowListener = this.ax;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
        awjz awjzVar = this.aN;
        if (awjzVar == null || this.aQ || (acraVar = this.aj) == null) {
            return;
        }
        acraVar.n(new acqx(awjzVar.d));
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        oq.setOnShowListener(this);
        return oq;
    }
}
