package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xxz extends xzc {
    public static final /* synthetic */ int ar = 0;
    private static final ColorDrawable as = new ColorDrawable(0);
    public ajjz ae;
    public acra af;
    public ayqi ag;
    public aahd ah;
    public afsy ai;
    public aahv aj;
    public apjm ak;
    public EditText al;
    public xzt am;
    public boolean an;
    public vgz ao;
    public xnh ap;
    public ajyw aq;
    private amru at;

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        aooy aooyVar;
        super.mR(bundle);
        try {
            aooyVar = amkq.ck(this.m, "renderer", apjm.a, aomw.b());
        } catch (RuntimeException unused) {
            zga.b("Failed to merge proto for renderer");
            aooyVar = null;
        }
        this.ak = (apjm) aooyVar;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(as);
        window.setSoftInputMode(5);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        int i = 1;
        this.d.getWindow().requestFeature(1);
        View inflate = layoutInflater.inflate(R.layout.backstage_repost_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.repost_header_title);
        aqyg aqygVar = this.ak.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        ((LinearLayout) inflate.findViewById(R.id.repost_header)).setOnClickListener(new xxv(this, 1));
        ((LinearLayout) inflate.findViewById(R.id.repost_description_top)).setOnClickListener(new xxv(this, 0));
        ((LinearLayout) inflate.findViewById(R.id.repost_scroll_content)).setOnClickListener(new xxv(this, 2));
        TextView textView2 = (TextView) inflate.findViewById(R.id.repost_author_text);
        aqyg aqygVar2 = this.ak.f;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = (TextView) inflate.findViewById(R.id.repost_privacy);
        aqyg aqygVar3 = this.ak.h;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
        EditText editText = (EditText) inflate.findViewById(R.id.content);
        this.al = editText;
        aqyg aqygVar4 = this.ak.g;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        editText.setHint(ajcq.b(aqygVar4));
        this.al.requestFocus();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.repost_avatar);
        imageView.setImageBitmap(null);
        avgg avggVar = this.ak.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        Uri D = ahbw.D(avggVar, 24);
        if (D != null) {
            this.ae.g(imageView, D);
        }
        aulq aulqVar = this.ak.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg apmgVar = aulqVar.pY(ButtonRendererOuterClass.buttonRenderer) ? (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer) : null;
        TextView textView4 = (TextView) inflate.findViewById(R.id.repost_character_count);
        int i2 = this.ak.i;
        StringBuilder sb = new StringBuilder(13);
        sb.append("0/");
        sb.append(i2);
        whu.G(textView4, sb.toString());
        textView4.setVisibility(4);
        apjm apjmVar = this.ak;
        if ((apjmVar.b & 128) == 0) {
            BottomSheetBehavior.x(inflate.findViewById(R.id.user_mention_suggestions_bottom_sheet)).G(5);
        } else {
            apxf apxfVar = apjmVar.j;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            this.am = this.aq.p((CoordinatorLayout) inflate.findViewById(R.id.repost_coordinator_layout), this.al, (ViewGroup) inflate.findViewById(R.id.user_mention_suggestions_bottom_sheet), apxfVar, this.af, avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_BACKSTAGE_POST, true);
        }
        YouTubeButton youTubeButton = (YouTubeButton) inflate.findViewById(R.id.repost_button);
        aqyg aqygVar5 = apmgVar.i;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        youTubeButton.setText(ajcq.b(aqygVar5));
        youTubeButton.setTextColor(wbs.W(qR(), R.attr.ytIconDisabled).orElse(0));
        youTubeButton.setEnabled(false);
        youTubeButton.setOnClickListener(new xxv(this, 3));
        this.al.addTextChangedListener(new xxw(this, youTubeButton, textView4));
        this.al.setOnFocusChangeListener(new xxx(this));
        this.al.setOnClickListener(new xxv(this, 4));
        amrp f = amru.f();
        if ((this.ak.b & 1024) != 0) {
            f.h(this.aj.a(this.ai.c()).i(this.ak.l).L(oht.j).Y(suj.o).k(aoti.class).ab(this.ag).ax(new ayrs() { // from class: xxu
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    xxz xxzVar = xxz.this;
                    boolean booleanValue = ((aoti) obj).getShouldRequireViewerAck().booleanValue();
                    xxzVar.an = booleanValue;
                    if (booleanValue) {
                        return;
                    }
                    ynm.n(xxzVar, xxzVar.ao.b(new xxt(xxzVar, 0), angq.a), oph.n, oph.p);
                }
            }));
        }
        this.at = f.g();
        if ((this.ak.b & 1024) != 0) {
            ynm.n(this, anfq.h(this.ao.a(), new xxt(this, i), angq.a), oph.o, new zfi() { // from class: xxs
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    xxz xxzVar = xxz.this;
                    ammv ammvVar = (ammv) obj;
                    boolean z = true;
                    if (ammvVar.h() && ((Boolean) ammvVar.c()).booleanValue()) {
                        z = false;
                    }
                    xxzVar.an = z;
                }
            });
        }
        inflate.findViewById(R.id.repost_cancel).setOnClickListener(new xxv(this, 5));
        return inflate;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        amru amruVar = this.at;
        if (amruVar != null) {
            int i = ((amvj) amruVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                ((ayqx) amruVar.get(i2)).qc();
            }
        }
    }
}
