package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.UserManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.accountmanagement.AccountsModelUpdater;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uhf extends nh implements ugs {
    public static final String ae = "uhf";
    public final ugt af = new ugt(this);
    public uik ag;
    public uim ah;
    public AccountsModelUpdater ai;
    public Runnable aj;

    public final void aF() {
        dismiss();
        Runnable runnable = this.aj;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.ce
    public final void aa(final View view, Bundle bundle) {
        ugt ugtVar = this.af;
        Runnable runnable = new Runnable() { // from class: uhc
            @Override // java.lang.Runnable
            public final void run() {
                tyo tyoVar;
                ufh ufhVar;
                Class cls;
                Boolean bool;
                ugn ugnVar;
                uhf uhfVar = uhf.this;
                View view2 = view;
                amkq.F((uhfVar.ag == null || uhfVar.ah == null) ? false : true, "Post initialization code ran without being initialized");
                final ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) view2.findViewById(R.id.express_sign_in_modal);
                final uik uikVar = uhfVar.ag;
                final uim uimVar = uhfVar.ah;
                expressSignInLayout.e = uikVar;
                final ujx ujxVar = uikVar.f;
                ujxVar.d(expressSignInLayout);
                expressSignInLayout.a(ujxVar);
                uis uisVar = uimVar.a;
                expressSignInLayout.d = uisVar.g;
                if (uisVar.e.h()) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                    layoutParams.gravity = 17;
                    FrameLayout frameLayout = (FrameLayout) expressSignInLayout.findViewById(R.id.express_sign_in_header_logo_container);
                    Context context = expressSignInLayout.getContext();
                    ImageView imageView = new ImageView(context);
                    int i = true != ywt.b(context) ? R.drawable.googlelogo_light_color_74x24_vd : R.drawable.googlelogo_standard_color_74x24_vd;
                    amkq.F(true, "An Activity Context is required to load Vector Drawables with SDK < LOLLIPOP");
                    imageView.setImageDrawable(nz.b(context, i));
                    frameLayout.addView(imageView, layoutParams);
                    frameLayout.setVisibility(0);
                }
                final uio uioVar = (uio) uisVar.f.f();
                ammv ammvVar = uisVar.a;
                if (uioVar != null) {
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: uhm
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ExpressSignInLayout expressSignInLayout2 = ExpressSignInLayout.this;
                            uio uioVar2 = uioVar;
                            expressSignInLayout2.e.f.e(tgc.c(), view3);
                            uioVar2.b.run();
                            expressSignInLayout2.d();
                        }
                    };
                    expressSignInLayout.o = new ugx(uioVar.a);
                    expressSignInLayout.k.setOnClickListener(onClickListener);
                    expressSignInLayout.k.setVisibility(0);
                    expressSignInLayout.requestLayout();
                }
                ammv ammvVar2 = uisVar.b;
                ammv ammvVar3 = uisVar.c;
                if (expressSignInLayout.c) {
                    expressSignInLayout.f.setVisibility(8);
                }
                uiq uiqVar = (uiq) uisVar.d.f();
                if (uiqVar != null) {
                    expressSignInLayout.findViewById(R.id.esi_custom_header_container).setVisibility(0);
                    TextView textView = (TextView) expressSignInLayout.findViewById(R.id.esi_custom_header_title);
                    TextView textView2 = (TextView) expressSignInLayout.findViewById(R.id.esi_custom_header_subtitle);
                    textView.setText(uiqVar.a);
                    if (uiqVar.b.h()) {
                        textView2.setText((CharSequence) uiqVar.b.c());
                    } else {
                        textView2.setVisibility(8);
                    }
                }
                if (uisVar.e.h()) {
                    ((ViewGroup.MarginLayoutParams) expressSignInLayout.i.getLayoutParams()).topMargin = expressSignInLayout.getResources().getDimensionPixelSize(R.dimen.og_sign_in_button_with_google_logo_top_margin);
                    expressSignInLayout.i.requestLayout();
                    View findViewById = expressSignInLayout.findViewById(R.id.esi_custom_header_container);
                    ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = 0;
                    findViewById.requestLayout();
                }
                ammv ammvVar4 = uisVar.a;
                if (uisVar.f.h()) {
                    ((ViewGroup.MarginLayoutParams) expressSignInLayout.i.getLayoutParams()).bottomMargin = 0;
                    expressSignInLayout.i.requestLayout();
                    ((ViewGroup.MarginLayoutParams) expressSignInLayout.j.getLayoutParams()).bottomMargin = 0;
                    expressSignInLayout.j.requestLayout();
                    ammv ammvVar5 = uisVar.b;
                    expressSignInLayout.findViewById(R.id.disclaimer_separator).setVisibility(8);
                    expressSignInLayout.findViewById(R.id.footer_bottom_padding).setVisibility(0);
                } else {
                    ammv ammvVar6 = uisVar.b;
                }
                expressSignInLayout.f.setOnClickListener(new View.OnClickListener() { // from class: uho
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ExpressSignInLayout expressSignInLayout2 = ExpressSignInLayout.this;
                        ujx ujxVar2 = ujxVar;
                        uim uimVar2 = uimVar;
                        if (!expressSignInLayout2.b) {
                            ammv ammvVar7 = uimVar2.a.c;
                            return;
                        }
                        ujxVar2.e(tgc.c(), view3);
                        expressSignInLayout2.h(aost.DID_CLOSE_CONTAINER_BY_CLICKING_SCRIM);
                        expressSignInLayout2.j(false);
                    }
                });
                SelectedAccountView selectedAccountView = expressSignInLayout.h;
                ued uedVar = uikVar.c;
                tyo tyoVar2 = uikVar.g.c;
                Class cls2 = uikVar.d;
                amlr amlrVar = amlr.a;
                selectedAccountView.p = amlrVar;
                selectedAccountView.i();
                selectedAccountView.n = new ufe(selectedAccountView, tyoVar2, amlrVar, null, null, null, null);
                selectedAccountView.i.g(uedVar, tyoVar2);
                selectedAccountView.o = false;
                selectedAccountView.j.setRotation(360.0f);
                uht uhtVar = new uht(expressSignInLayout, uikVar);
                Context context2 = expressSignInLayout.getContext();
                ugc ugcVar = new ugc();
                Class cls3 = uikVar.d;
                if (cls3 == null) {
                    throw new NullPointerException("Null accountClass");
                }
                ugcVar.c = cls3;
                tyo tyoVar3 = uikVar.g.c;
                if (tyoVar3 == null) {
                    throw new NullPointerException("Null accountConverter");
                }
                ugcVar.f = tyoVar3;
                ufn ufnVar = uikVar.b;
                if (ufnVar == null) {
                    throw new NullPointerException("Null accountsModel");
                }
                ugcVar.b = ufnVar;
                ugcVar.d = true;
                ued uedVar2 = uikVar.c;
                if (uedVar2 == null) {
                    throw new NullPointerException("Null avatarImageLoader");
                }
                ugcVar.a = uedVar2;
                uje ujeVar = uikVar.e;
                if (ujeVar == null) {
                    throw new NullPointerException("Null oneGoogleEventLogger");
                }
                ugcVar.e = ujeVar;
                ued uedVar3 = ugcVar.a;
                if (uedVar3 == null || (tyoVar = ugcVar.f) == null || (ufhVar = ugcVar.b) == null || (cls = ugcVar.c) == null || (bool = ugcVar.d) == null || ugcVar.e == null) {
                    StringBuilder sb = new StringBuilder();
                    if (ugcVar.a == null) {
                        sb.append(" avatarImageLoader");
                    }
                    if (ugcVar.f == null) {
                        sb.append(" accountConverter");
                    }
                    if (ugcVar.b == null) {
                        sb.append(" accountsModel");
                    }
                    if (ugcVar.c == null) {
                        sb.append(" accountClass");
                    }
                    if (ugcVar.d == null) {
                        sb.append(" allowRings");
                    }
                    if (ugcVar.e == null) {
                        sb.append(" oneGoogleEventLogger");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                ugd ugdVar = new ugd(uedVar3, tyoVar, ufhVar, cls, bool.booleanValue(), ugcVar.e, null, null, null, null);
                final ufn ufnVar2 = uikVar.b;
                final uhq uhqVar = new uhq(expressSignInLayout);
                Context context3 = expressSignInLayout.getContext();
                UserManager userManager = (UserManager) context3.getSystemService("user");
                if (userManager == null || !userManager.hasUserRestriction("no_modify_accounts")) {
                    ugm ugmVar = new ugm();
                    ugmVar.a(R.id.og_ai_not_set);
                    ugmVar.b(-1);
                    ugmVar.a(R.id.og_ai_add_another_account);
                    Drawable b = nz.b(context3, R.drawable.quantum_gm_ic_person_add_vd_theme_24);
                    b.getClass();
                    ugmVar.b = b;
                    String string = context3.getString(R.string.og_add_another_account);
                    if (string == null) {
                        throw new NullPointerException("Null label");
                    }
                    ugmVar.c = string;
                    ugmVar.e = new View.OnClickListener() { // from class: ugl
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            uhq uhqVar2 = uhq.this;
                            ufnVar2.a();
                            ExpressSignInLayout expressSignInLayout2 = uhqVar2.a;
                            expressSignInLayout2.i(view3);
                            expressSignInLayout2.j(false);
                        }
                    };
                    ugmVar.b(90141);
                    Integer num = ugmVar.a;
                    if (num == null) {
                        throw new IllegalStateException("Property \"id\" has not been set");
                    }
                    amkq.O(num.intValue() != R.id.og_ai_not_set, "Did you forget to setId()?");
                    Integer num2 = ugmVar.d;
                    if (num2 == null) {
                        throw new IllegalStateException("Property \"veId\" has not been set");
                    }
                    amkq.O(num2.intValue() != -1, "Did you forget to setVeId()?");
                    Integer num3 = ugmVar.a;
                    if (num3 == null || ugmVar.b == null || ugmVar.c == null || ugmVar.d == null || ugmVar.e == null) {
                        StringBuilder sb3 = new StringBuilder();
                        if (ugmVar.a == null) {
                            sb3.append(" id");
                        }
                        if (ugmVar.b == null) {
                            sb3.append(" icon");
                        }
                        if (ugmVar.c == null) {
                            sb3.append(" label");
                        }
                        if (ugmVar.d == null) {
                            sb3.append(" veId");
                        }
                        if (ugmVar.e == null) {
                            sb3.append(" onClickListener");
                        }
                        String valueOf2 = String.valueOf(sb3);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                        sb4.append("Missing required properties:");
                        sb4.append(valueOf2);
                        throw new IllegalStateException(sb4.toString());
                    }
                    ugnVar = new ugn(num3.intValue(), ugmVar.b, ugmVar.c, ugmVar.d.intValue(), ugmVar.e);
                } else {
                    ugnVar = null;
                }
                ugb ugbVar = new ugb(context2, ugdVar, new aow(ugnVar == null ? amru.q() : amru.r(ugnVar)), uhtVar, ExpressSignInLayout.c(), ujxVar, expressSignInLayout.getResources().getDimensionPixelSize(R.dimen.og_express_sign_in_account_management_extra_horizontal_padding), amlr.a, amlr.a);
                expressSignInLayout.e(ugbVar.b());
                ugbVar.u(new uhx(expressSignInLayout, ugbVar));
                RecyclerView recyclerView = expressSignInLayout.g;
                ugw ugwVar = new ugw(recyclerView, ugbVar);
                if (jw.aj(recyclerView)) {
                    ugwVar.onViewAttachedToWindow(recyclerView);
                }
                recyclerView.addOnAttachStateChangeListener(ugwVar);
                expressSignInLayout.j.setOnClickListener(new View.OnClickListener() { // from class: uhp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ExpressSignInLayout expressSignInLayout2 = ExpressSignInLayout.this;
                        ujx ujxVar2 = ujxVar;
                        uim uimVar2 = uimVar;
                        uik uikVar2 = uikVar;
                        ujxVar2.e(tgc.c(), view3);
                        expressSignInLayout2.f(uimVar2, uikVar2.b.a());
                    }
                });
                final uhs uhsVar = new uhs(expressSignInLayout, uimVar);
                expressSignInLayout.i.setOnClickListener(new View.OnClickListener() { // from class: uhn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ExpressSignInLayout expressSignInLayout2 = ExpressSignInLayout.this;
                        ujx ujxVar2 = ujxVar;
                        uik uikVar2 = uikVar;
                        uhs uhsVar2 = uhsVar;
                        ujxVar2.e(tgc.c(), view3);
                        uikVar2.b.g = uhsVar2;
                        expressSignInLayout2.i(view3);
                    }
                });
                uhy uhyVar = new uhy(expressSignInLayout, uikVar, new uec() { // from class: uhr
                    @Override // defpackage.uec
                    public final void a() {
                        ExpressSignInLayout.this.m();
                    }
                });
                expressSignInLayout.addOnAttachStateChangeListener(uhyVar);
                uhz uhzVar = new uhz(expressSignInLayout);
                expressSignInLayout.addOnAttachStateChangeListener(uhzVar);
                if (jw.aj(expressSignInLayout)) {
                    uhyVar.onViewAttachedToWindow(expressSignInLayout);
                    uhzVar.onViewAttachedToWindow(expressSignInLayout);
                }
                if (uhfVar.ai != null) {
                    uqq.j();
                    uhfVar.M().getLifecycle().b(uhfVar.ai);
                }
            }
        };
        uqq.j();
        ugtVar.a.add(runnable);
        if (ugtVar.b.b()) {
            ugtVar.a();
        }
    }

    @Override // defpackage.ugs
    public final boolean b() {
        return (this.ag == null || this.ah == null) ? false : true;
    }

    @Override // defpackage.bv
    public final void dismiss() {
        if (ar()) {
            if (au()) {
                super.kv();
            } else {
                super.dismiss();
            }
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Context qR = qR();
        qR.getClass();
        TypedValue typedValue = new TypedValue();
        o(1, qR.getTheme().resolveAttribute(R.attr.expressSignInDialogStyle, typedValue, true) ? typedValue.resourceId : R.style.Theme_OneGoogle_DayNight_ExpressSignInDialog);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.express_sign_in_dialog, viewGroup);
        ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) inflate.findViewById(R.id.express_sign_in_modal);
        expressSignInLayout.c = true;
        expressSignInLayout.p = new Runnable() { // from class: uhb
            @Override // java.lang.Runnable
            public final void run() {
                uhf.this.dismiss();
            }
        };
        inflate.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: uha
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uhf.this.aF();
            }
        });
        jw.M(expressSignInLayout, new uhe(this));
        expressSignInLayout.findViewById(R.id.content_container).setOnTouchListener(gpm.c);
        return inflate;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Runnable runnable = this.aj;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.nh, defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Context qR = qR();
        qR.getClass();
        return new uhd(qR, this.b);
    }
}
