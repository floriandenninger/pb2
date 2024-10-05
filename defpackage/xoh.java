package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xoh {
    public final Context a;
    public final aahd b;
    public final ysy c;
    public final aahv d;
    public final afsy e;
    public final ajsa f;
    public final ajzc g;
    public xoi h;
    public DialogInterface.OnCancelListener i;
    public DialogInterface.OnCancelListener j;
    public String k;
    public xyt l;
    public final etw m;
    public final ajun n;
    private final Activity o;
    private final ajjs p;
    private final ajut q;
    private final zaw r;
    private final zbi s;
    private final ajyo t;
    private ayqx u;
    private final aadw v;
    private final abie w;
    private final yfl x;

    public xoh(Activity activity, Context context, ajjs ajjsVar, aahd aahdVar, ajut ajutVar, zaw zawVar, ysy ysyVar, zbi zbiVar, etw etwVar, ajun ajunVar, yfl yflVar, abie abieVar, ajyw ajywVar, akht akhtVar, ajzc ajzcVar, aadw aadwVar, aahv aahvVar, afsy afsyVar, ajsa ajsaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.o = activity;
        context.getClass();
        this.a = context;
        ajjsVar.getClass();
        this.p = ajjsVar;
        aahdVar.getClass();
        this.b = aahdVar;
        this.q = ajutVar;
        zawVar.getClass();
        this.r = zawVar;
        this.c = ysyVar;
        this.s = zbiVar;
        this.m = etwVar;
        this.n = ajunVar;
        this.x = yflVar;
        this.w = abieVar;
        this.v = aadwVar;
        aahvVar.getClass();
        this.d = aahvVar;
        this.e = afsyVar;
        ajsaVar.getClass();
        this.f = ajsaVar;
        ajzcVar.getClass();
        this.t = akhtVar.a(new xog(this, ajywVar));
        this.g = ajzcVar;
        ajzcVar.f = new xnu(this);
    }

    public static final CharSequence p(apyv apyvVar) {
        audq audqVar;
        apjn apjnVar = apyvVar.B;
        if (apjnVar == null) {
            apjnVar = apjn.a;
        }
        aqyg aqygVar = null;
        if (apjnVar.b != 99391126) {
            return null;
        }
        apjn apjnVar2 = apyvVar.B;
        if (apjnVar2 == null) {
            apjnVar2 = apjn.a;
        }
        if (apjnVar2.b == 99391126) {
            audqVar = (audq) apjnVar2.c;
        } else {
            audqVar = audq.a;
        }
        for (audo audoVar : audqVar.f) {
            if (audoVar.d) {
                if ((audoVar.b & 1) != 0 && (aqygVar = audoVar.c) == null) {
                    aqygVar = aqyg.a;
                }
                return ajcq.b(aqygVar);
            }
        }
        return null;
    }

    public final acra a() {
        ComponentCallbacks2 componentCallbacks2 = this.o;
        if (componentCallbacks2 instanceof acqz) {
            return ((acqz) componentCallbacks2).mM();
        }
        return null;
    }

    public final apmg b(apmg apmgVar) {
        acra a = a();
        if (a == null) {
            return apmgVar;
        }
        aone createBuilder = aupf.a.createBuilder();
        String k = a.k();
        createBuilder.copyOnWrite();
        aupf aupfVar = (aupf) createBuilder.instance;
        k.getClass();
        aupfVar.b |= 1;
        aupfVar.c = k;
        aupf aupfVar2 = (aupf) createBuilder.build();
        aong aongVar = (aong) apmgVar.toBuilder();
        apxf apxfVar = apmgVar.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aong aongVar2 = (aong) apxfVar.toBuilder();
        aongVar2.e(aupg.b, aupfVar2);
        aongVar.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar.instance;
        apxf apxfVar2 = (apxf) aongVar2.build();
        apxfVar2.getClass();
        apmgVar2.n = apxfVar2;
        apmgVar2.b |= 8192;
        return (apmg) aongVar.build();
    }

    public final apzd c(apzd apzdVar) {
        if (a() == null) {
            return apzdVar;
        }
        apmh apmhVar = apzdVar.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        aone builder = apmhVar.toBuilder();
        apmh apmhVar2 = apzdVar.f;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        apmg b = b(apmgVar);
        builder.copyOnWrite();
        apmh apmhVar3 = (apmh) builder.instance;
        b.getClass();
        apmhVar3.c = b;
        apmhVar3.b |= 1;
        apmh apmhVar4 = (apmh) builder.build();
        aone builder2 = apzdVar.toBuilder();
        builder2.copyOnWrite();
        apzd apzdVar2 = (apzd) builder2.instance;
        apmhVar4.getClass();
        apzdVar2.f = apmhVar4;
        apzdVar2.b |= 32;
        return (apzd) builder2.build();
    }

    public final void d(CharSequence charSequence, ammv ammvVar, int i, final xoo xooVar, final ajvc ajvcVar, final xyt xytVar, final Long l, boolean z, final boolean z2) {
        final boolean z3;
        if (xytVar.k()) {
            z3 = z;
        } else {
            if (!z || xytVar.m()) {
                if (z2) {
                    this.g.w();
                }
                if (this.k != null) {
                    wcy.v(this.d.a(this.e.c()), this.k, false);
                    return;
                }
                return;
            }
            z3 = true;
        }
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this.a).setMessage(charSequence).setNegativeButton(R.string.comments_discard_negative_button, new DialogInterface.OnClickListener() { // from class: xoc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                xoh xohVar = xoh.this;
                xoo xooVar2 = xooVar;
                ajvc ajvcVar2 = ajvcVar;
                xyt xytVar2 = xytVar;
                Long l2 = l;
                boolean z4 = z3;
                dialogInterface.dismiss();
                xohVar.e(xooVar2, ajvcVar2, xytVar2.a(), l2, true, z4);
            }
        }).setPositiveButton(i, new DialogInterface.OnClickListener() { // from class: xod
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                xoh xohVar = xoh.this;
                boolean z4 = z2;
                dialogInterface.dismiss();
                if (z4) {
                    xohVar.g.w();
                }
                if (xohVar.k != null) {
                    wcy.v(xohVar.d.a(xohVar.e.c()), xohVar.k, false);
                }
            }
        }).setCancelable(false);
        if (ammvVar.h()) {
            cancelable.setTitle((CharSequence) ammvVar.c());
        }
        AlertDialog create = cancelable.create();
        create.setOnShowListener(new xof(this, 1));
        create.setOnDismissListener(new xoe(this, 2));
        create.show();
        ((Button) create.findViewById(android.R.id.button1)).setTextColor(wbs.W(this.a, R.attr.ytCallToAction).orElse(0));
        ((Button) create.findViewById(android.R.id.button2)).setTextColor(wbs.W(this.a, R.attr.ytCallToAction).orElse(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final void e(final xoo xooVar, final ajvc ajvcVar, CharSequence charSequence, final Long l, final boolean z, final boolean z2) {
        ?? r3;
        if (z || this.c.o()) {
            apxs apxsVar = this.v.b().z;
            if (apxsVar == null) {
                apxsVar = apxs.a;
            }
            if (!apxsVar.e) {
                final xyh xyhVar = new xyh(this.a, this.o, this.p, this.t, this.q, xooVar.i, xooVar.j, this.v, this.f);
                this.l = xyhVar;
                xyhVar.d(charSequence, z);
                new ajkj(xyhVar.d, new yzw(), xyhVar.s ? xyhVar.p : xyhVar.o, false).k(xooVar.a);
                Spanned spanned = xooVar.e;
                if (!TextUtils.isEmpty(spanned)) {
                    xyhVar.f.setHint(spanned);
                }
                awjz awjzVar = xooVar.f;
                if (awjzVar != null) {
                    aqyg aqygVar = awjzVar.b;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    xyhVar.j.setText(ajcq.b(aqygVar));
                    whu.I(xyhVar.j, !TextUtils.isEmpty(r0));
                    aqyg aqygVar2 = xooVar.f.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    xyhVar.m.setText(aahk.a(aqygVar2, this.b, false));
                    whu.I(xyhVar.n, !TextUtils.isEmpty(r0));
                    whu.I(xyhVar.m, !TextUtils.isEmpty(r0));
                } else {
                    Spanned spanned2 = xooVar.d;
                    if (spanned2 != null) {
                        xyhVar.k.setText(spanned2);
                        whu.I(xyhVar.k, !TextUtils.isEmpty(spanned2));
                        whu.I(xyhVar.l, !TextUtils.isEmpty(spanned2));
                    }
                }
                final int i = 1;
                this.i = new DialogInterface.OnCancelListener(this) { // from class: xnw
                    public final /* synthetic */ xoh a;

                    {
                        this.a = this;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        if (i == 0) {
                            xoh xohVar = this.a;
                            xohVar.d(xohVar.a.getText(R.string.comments_discard_get_membership), ammv.j(xohVar.a.getText(R.string.comments_discard_get_membership_title)), R.string.comments_discard_get_membership_button, xooVar, ajvcVar, xyhVar, l, z2, true);
                            return;
                        }
                        xoh xohVar2 = this.a;
                        xohVar2.d(xohVar2.a.getText(R.string.comments_discard), amlr.a, R.string.comments_discard_positive_button, xooVar, ajvcVar, xyhVar, l, z2, false);
                    }
                };
                final int i2 = 0;
                this.j = new DialogInterface.OnCancelListener(this) { // from class: xnw
                    public final /* synthetic */ xoh a;

                    {
                        this.a = this;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        if (i2 == 0) {
                            xoh xohVar = this.a;
                            xohVar.d(xohVar.a.getText(R.string.comments_discard_get_membership), ammv.j(xohVar.a.getText(R.string.comments_discard_get_membership_title)), R.string.comments_discard_get_membership_button, xooVar, ajvcVar, xyhVar, l, z2, true);
                            return;
                        }
                        xoh xohVar2 = this.a;
                        xohVar2.d(xohVar2.a.getText(R.string.comments_discard), amlr.a, R.string.comments_discard_positive_button, xooVar, ajvcVar, xyhVar, l, z2, false);
                    }
                };
                xyhVar.e(this.i);
                xyhVar.y = new xnp(this, xyhVar, xooVar, ajvcVar, l, z2);
                apmg apmgVar = xooVar.h;
                if (apmgVar != null) {
                    int i3 = apmgVar.b;
                    if ((i3 & 32) != 0 && (i3 & 16384) != 0) {
                        ajut ajutVar = this.q;
                        arfs arfsVar = apmgVar.g;
                        if (arfsVar == null) {
                            arfsVar = arfs.a;
                        }
                        arfr b = arfr.b(arfsVar.c);
                        if (b == null) {
                            b = arfr.UNKNOWN;
                        }
                        int a = ajutVar.a(b);
                        xyhVar.u = new Runnable() { // from class: xny
                            @Override // java.lang.Runnable
                            public final void run() {
                                xoh.this.i(xooVar, xyhVar);
                            }
                        };
                        xyhVar.r.setVisibility(0);
                        xyhVar.q.setVisibility(0);
                        xyhVar.q.setImageResource(a);
                    }
                }
                apxs apxsVar2 = this.v.b().z;
                if (apxsVar2 == null) {
                    apxsVar2 = apxs.a;
                }
                if (!apxsVar2.d || this.m.d() == null) {
                    r3 = 1;
                } else {
                    boolean booleanValue = this.m.c().booleanValue();
                    xyhVar.v = new Runnable() { // from class: xoa
                        @Override // java.lang.Runnable
                        public final void run() {
                            xoh xohVar = xoh.this;
                            xyh xyhVar2 = xyhVar;
                            if (xohVar.m.c().booleanValue()) {
                                return;
                            }
                            bajo b2 = bajo.b(xohVar.m.d().longValue());
                            bajo c = bajo.c((b2.b + 500) / 1000);
                            int i4 = b2.a() > 0 ? 2 : 1;
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
                            xyhVar2.f.append(String.valueOf(banhVar.a().a(c.e())).concat(" "));
                        }
                    };
                    if (xyhVar.i.getVisibility() == 4) {
                        xyhVar.i.setVisibility(8);
                    }
                    xyhVar.h.setVisibility(0);
                    xyhVar.h.setEnabled(!booleanValue);
                    Drawable c = gl.c(nz.b(xyhVar.b, R.drawable.ic_timestamp));
                    r3 = 1;
                    c.setTint(wbs.W(xyhVar.b, true != booleanValue ? R.attr.ytTextSecondary : R.attr.ytTextDisabled).orElse(0));
                    xyhVar.h.setImageDrawable(c);
                    whu.F(xyhVar.h, null, 1);
                }
                xyhVar.a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xno
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        acra a2;
                        xoh xohVar = xoh.this;
                        xoo xooVar2 = xooVar;
                        boolean z3 = z;
                        if (xooVar2.f != null && !z3 && (a2 = xohVar.a()) != null) {
                            a2.n(new acqx(xooVar2.f.d));
                        }
                        xohVar.k();
                    }
                });
                xyhVar.a.setOnDismissListener(new xoe(this, r3));
                if (z2) {
                    xyhVar.x = r3;
                    xyhVar.c(r3);
                }
                if (!xyhVar.a.isShowing() && !xyhVar.c.isDestroyed() && !xyhVar.c.isFinishing()) {
                    xyhVar.a.show();
                    Window window = xyhVar.a.getWindow();
                    if (xyhVar.s) {
                        ((View) window.findViewById(android.R.id.custom).getParent()).setMinimumHeight(0);
                    }
                    window.setLayout(-1, -2);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.gravity = 80;
                    window.setAttributes(attributes);
                    window.setBackgroundDrawable(xyhVar.t);
                    window.setSoftInputMode(5);
                    xyhVar.f.requestFocus();
                }
            } else {
                avgg avggVar = xooVar.a;
                aqyg aqygVar3 = xooVar.l;
                aqyg aqygVar4 = xooVar.m;
                awjz awjzVar2 = xooVar.f;
                apmg apmgVar2 = xooVar.h;
                apmg apmgVar3 = xooVar.i;
                aqsv aqsvVar = xooVar.j;
                apyj apyjVar = xooVar.n;
                apzd apzdVar = xooVar.o;
                final xyr xyrVar = new xyr();
                Bundle bundle = new Bundle();
                amkq.cn(bundle, "profile_photo", avggVar);
                if (aqygVar3 != null) {
                    amkq.cn(bundle, "caption", aqygVar3);
                }
                if (aqygVar4 != null) {
                    amkq.cn(bundle, "hint", aqygVar4);
                }
                if (awjzVar2 != null) {
                    amkq.cn(bundle, "zero_step", awjzVar2);
                }
                if (apmgVar2 != null) {
                    amkq.cn(bundle, "camera_button", apmgVar2);
                }
                if (apmgVar3 != null) {
                    amkq.cn(bundle, "emoji_picker_button", apmgVar3);
                }
                if (aqsvVar != null) {
                    amkq.cn(bundle, "emoji_picker_renderer", aqsvVar);
                }
                if (apyjVar != null) {
                    amkq.cn(bundle, "comment_dialog_renderer", apyjVar);
                }
                if (apzdVar != null) {
                    amkq.cn(bundle, "reply_dialog_renderer", apzdVar);
                }
                if (charSequence != null) {
                    bundle.putCharSequence("comment_text", charSequence);
                }
                bundle.putBoolean("retry", z);
                xyrVar.af(bundle);
                this.l = xyrVar;
                if (z2) {
                    xyrVar.aA = true;
                    xyrVar.aF(true);
                }
                final int i4 = 1;
                this.i = new DialogInterface.OnCancelListener(this) { // from class: xob
                    public final /* synthetic */ xoh a;

                    {
                        this.a = this;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        if (i4 == 0) {
                            xoh xohVar = this.a;
                            xohVar.d(xohVar.a.getText(R.string.comments_discard_get_membership), ammv.j(xohVar.a.getText(R.string.comments_discard_get_membership_title)), R.string.comments_discard_get_membership_button, xooVar, ajvcVar, xyrVar, l, z2, true);
                            return;
                        }
                        xoh xohVar2 = this.a;
                        xohVar2.d(xohVar2.a.getText(R.string.comments_discard), amlr.a, R.string.comments_discard_positive_button, xooVar, ajvcVar, xyrVar, l, z2, false);
                    }
                };
                final int i5 = 0;
                this.j = new DialogInterface.OnCancelListener(this) { // from class: xob
                    public final /* synthetic */ xoh a;

                    {
                        this.a = this;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        if (i5 == 0) {
                            xoh xohVar = this.a;
                            xohVar.d(xohVar.a.getText(R.string.comments_discard_get_membership), ammv.j(xohVar.a.getText(R.string.comments_discard_get_membership_title)), R.string.comments_discard_get_membership_button, xooVar, ajvcVar, xyrVar, l, z2, true);
                            return;
                        }
                        xoh xohVar2 = this.a;
                        xohVar2.d(xohVar2.a.getText(R.string.comments_discard), amlr.a, R.string.comments_discard_positive_button, xooVar, ajvcVar, xyrVar, l, z2, false);
                    }
                };
                xyrVar.aw = this.i;
                xyrVar.aG = new xnq(this, xyrVar, xooVar, ajvcVar, l, z2);
                xyrVar.at = new Runnable() { // from class: xnz
                    @Override // java.lang.Runnable
                    public final void run() {
                        xoh.this.i(xooVar, xyrVar);
                    }
                };
                xyrVar.ax = new xof(this, 0);
                xyrVar.av = new xoe(this, 0);
                dd supportFragmentManager = ((ci) this.o).getSupportFragmentManager();
                ce f = supportFragmentManager.f("comment_dialog_fragment");
                if (f != null) {
                    ((xys) f).dismiss();
                }
                if (!xyrVar.ar() && !supportFragmentManager.Y()) {
                    xyrVar.qi(supportFragmentManager, "comment_dialog_fragment");
                }
            }
            aahu a2 = this.d.a(this.e.c());
            if (!TextUtils.isEmpty(xooVar.k)) {
                ayqx ayqxVar = this.u;
                if (ayqxVar != null && !ayqxVar.e()) {
                    ayrz.c((AtomicReference) this.u);
                }
                this.u = null;
                final int i6 = 1;
                this.u = a2.h(xooVar.k, false).ab(ayqr.a()).ax(new ayrs(this) { // from class: xnx
                    public final /* synthetic */ xoh a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        aakt aaktVar;
                        xyt xytVar;
                        int i7 = i6;
                        if (i7 == 0) {
                            xoh xohVar = this.a;
                            xohVar.f.g(((apyh) obj).getCustomEmojis());
                            xohVar.l.g();
                            xohVar.l.j();
                            return;
                        }
                        if (i7 == 1) {
                            xoh xohVar2 = this.a;
                            aakz aakzVar = (aakz) obj;
                            if (aakzVar == null || (aaktVar = aakzVar.c) == null) {
                                return;
                            }
                            xohVar2.f.g(((apyh) aaktVar).getCustomEmojis());
                            if (!xohVar2.f.h() || (xytVar = xohVar2.l) == null) {
                                return;
                            }
                            xytVar.g();
                            xohVar2.l.i();
                            return;
                        }
                        this.a.f.g(null);
                        zga.d("Cound not fetch emojis for comments in the entity store.", (Throwable) obj);
                    }
                });
                final int i7 = 0;
                ayps o = a2.f(xooVar.k).g(apyh.class).o(new ayrs(this) { // from class: xnx
                    public final /* synthetic */ xoh a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        aakt aaktVar;
                        xyt xytVar;
                        int i72 = i7;
                        if (i72 == 0) {
                            xoh xohVar = this.a;
                            xohVar.f.g(((apyh) obj).getCustomEmojis());
                            xohVar.l.g();
                            xohVar.l.j();
                            return;
                        }
                        if (i72 == 1) {
                            xoh xohVar2 = this.a;
                            aakz aakzVar = (aakz) obj;
                            if (aakzVar == null || (aaktVar = aakzVar.c) == null) {
                                return;
                            }
                            xohVar2.f.g(((apyh) aaktVar).getCustomEmojis());
                            if (!xohVar2.f.h() || (xytVar = xohVar2.l) == null) {
                                return;
                            }
                            xytVar.g();
                            xohVar2.l.i();
                            return;
                        }
                        this.a.f.g(null);
                        zga.d("Cound not fetch emojis for comments in the entity store.", (Throwable) obj);
                    }
                });
                final int i8 = 2;
                o.m(new ayrs(this) { // from class: xnx
                    public final /* synthetic */ xoh a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        aakt aaktVar;
                        xyt xytVar;
                        int i72 = i8;
                        if (i72 == 0) {
                            xoh xohVar = this.a;
                            xohVar.f.g(((apyh) obj).getCustomEmojis());
                            xohVar.l.g();
                            xohVar.l.j();
                            return;
                        }
                        if (i72 == 1) {
                            xoh xohVar2 = this.a;
                            aakz aakzVar = (aakz) obj;
                            if (aakzVar == null || (aaktVar = aakzVar.c) == null) {
                                return;
                            }
                            xohVar2.f.g(((apyh) aaktVar).getCustomEmojis());
                            if (!xohVar2.f.h() || (xytVar = xohVar2.l) == null) {
                                return;
                            }
                            xytVar.g();
                            xohVar2.l.i();
                            return;
                        }
                        this.a.f.g(null);
                        zga.d("Cound not fetch emojis for comments in the entity store.", (Throwable) obj);
                    }
                }).l(new ayrm() { // from class: xnv
                    @Override // defpackage.ayrm
                    public final void a() {
                        xoh.this.f.g(null);
                    }
                }).T();
                return;
            }
            this.f.g(null);
            return;
        }
        this.s.b();
    }

    public final void f(aqab aqabVar, ajvc ajvcVar) {
        awjz awjzVar;
        aqyg aqygVar;
        apmg apmgVar;
        aoti aotiVar;
        if ((aqabVar.b & 524288) != 0 && !aqabVar.n.isEmpty() && (aotiVar = (aoti) this.d.a(this.e.c()).f(aqabVar.n).g(aoti.class).X()) != null && aotiVar.getShouldRequireViewerAck().booleanValue()) {
            aahd aahdVar = this.b;
            apxf apxfVar = aqabVar.m;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
            return;
        }
        if ((aqabVar.b & 32) == 0) {
            if (!this.n.t(aqabVar)) {
                zga.b("No button renderer specified for comment simplebox.");
                return;
            }
            apmg r = this.n.r(aqabVar);
            if ((r.b & 8192) == 0) {
                zga.b("No service endpoint specified for comment simplebox.");
                return;
            }
            Long d = this.m.d();
            this.n.s(aqabVar, b(r));
            awkb awkbVar = aqabVar.i;
            if (awkbVar == null) {
                awkbVar = awkb.a;
            }
            aqyg aqygVar2 = null;
            if ((awkbVar.b & 1) != 0) {
                awkb awkbVar2 = aqabVar.i;
                if (awkbVar2 == null) {
                    awkbVar2 = awkb.a;
                }
                awjz awjzVar2 = awkbVar2.c;
                if (awjzVar2 == null) {
                    awjzVar2 = awjz.a;
                }
                awjzVar = awjzVar2;
            } else {
                awjzVar = null;
            }
            avgg avggVar = aqabVar.e;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            avgg avggVar2 = avggVar;
            if ((aqabVar.b & 16) != 0) {
                aqygVar = aqabVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b = ajcq.b(aqygVar);
            apxf apxfVar2 = this.n.r(aqabVar).n;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            apxf apxfVar3 = apxfVar2;
            if ((aqabVar.b & 1024) != 0) {
                apmh apmhVar = aqabVar.h;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                apmg apmgVar2 = apmhVar.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apmgVar = apmgVar2;
            } else {
                apmgVar = null;
            }
            apmh apmhVar2 = aqabVar.j;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar3 = apmhVar2.c;
            if (apmgVar3 == null) {
                apmgVar3 = apmg.a;
            }
            apmg apmgVar4 = apmgVar3;
            aulq aulqVar = aqabVar.k;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aulq aulqVar2 = aulqVar;
            String str = aqabVar.l;
            if ((aqabVar.b & 16) != 0 && (aqygVar2 = aqabVar.f) == null) {
                aqygVar2 = aqyg.a;
            }
            e(new xoo(1, avggVar2, null, null, null, b, awjzVar, apxfVar3, apmgVar, apmgVar4, aulqVar2, str, null, aqygVar2, null, null), ajvcVar, null, d, false, false);
            return;
        }
        aahd aahdVar2 = this.b;
        apxf apxfVar4 = aqabVar.g;
        if (apxfVar4 == null) {
            apxfVar4 = apxf.a;
        }
        aahdVar2.a(apxfVar4);
    }

    public final void g(aqab aqabVar, xpa xpaVar) {
        aqyg aqygVar;
        apmg apmgVar;
        aqyg aqygVar2;
        aoti aotiVar;
        if ((aqabVar.b & 524288) != 0 && !aqabVar.n.isEmpty() && (aotiVar = (aoti) this.d.a(this.e.c()).f(aqabVar.n).g(aoti.class).X()) != null && aotiVar.getShouldRequireViewerAck().booleanValue()) {
            aahd aahdVar = this.b;
            apxf apxfVar = aqabVar.m;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
            return;
        }
        if ((aqabVar.b & 32) == 0) {
            if (!this.n.t(aqabVar)) {
                zga.b("No button renderer specified for comment detail simplebox.");
                return;
            }
            if ((this.n.r(aqabVar).b & 8192) == 0) {
                zga.b("No service endpoint specified for comment detail simplebox.");
                return;
            }
            ajun ajunVar = this.n;
            ajunVar.s(aqabVar, b(ajunVar.r(aqabVar)));
            avgg avggVar = aqabVar.e;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            avgg avggVar2 = avggVar;
            if ((aqabVar.b & 16) != 0) {
                aqygVar = aqabVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b = ajcq.b(aqygVar);
            apxf apxfVar2 = this.n.r(aqabVar).n;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            apxf apxfVar3 = apxfVar2;
            apmh apmhVar = aqabVar.h;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((apmhVar.b & 1) != 0) {
                apmh apmhVar2 = aqabVar.h;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar2 = apmhVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apmgVar = apmgVar2;
            } else {
                apmgVar = null;
            }
            apmh apmhVar3 = aqabVar.j;
            if (apmhVar3 == null) {
                apmhVar3 = apmh.a;
            }
            apmg apmgVar3 = apmhVar3.c;
            if (apmgVar3 == null) {
                apmgVar3 = apmg.a;
            }
            apmg apmgVar4 = apmgVar3;
            aulq aulqVar = aqabVar.k;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aulq aulqVar2 = aulqVar;
            String str = aqabVar.l;
            if ((aqabVar.b & 16) != 0) {
                aqyg aqygVar3 = aqabVar.f;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                aqygVar2 = aqygVar3;
            } else {
                aqygVar2 = null;
            }
            e(new xoo(1, avggVar2, xpaVar, null, null, b, null, apxfVar3, apmgVar, apmgVar4, aulqVar2, str, null, aqygVar2, null, null), null, null, null, false, false);
            return;
        }
        aahd aahdVar2 = this.b;
        apxf apxfVar4 = aqabVar.g;
        if (apxfVar4 == null) {
            apxfVar4 = apxf.a;
        }
        aahdVar2.a(apxfVar4);
    }

    public final void h(apzd apzdVar, xpa xpaVar, apyv apyvVar, boolean z) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apmg apmgVar;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        aqyg aqygVar6;
        if ((apzdVar.b & 32) == 0) {
            zga.b("No reply button specified for comment reply dialog.");
            return;
        }
        apmh apmhVar = apzdVar.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            zga.b("No button renderer specified for comment reply dialog.");
            return;
        }
        apmh apmhVar2 = apzdVar.f;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar2 = apmhVar2.c;
        if (apmgVar2 == null) {
            apmgVar2 = apmg.a;
        }
        if ((apmgVar2.b & 8192) == 0) {
            zga.b("No service endpoint specified for comment reply dialog.");
            return;
        }
        apzd c = c(apzdVar);
        avgg avggVar = c.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        avgg avggVar2 = avggVar;
        if ((c.b & 4096) != 0) {
            aqygVar = c.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((c.b & 16) != 0) {
            aqygVar2 = c.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        apmh apmhVar3 = c.f;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        apmg apmgVar3 = apmhVar3.c;
        if (apmgVar3 == null) {
            apmgVar3 = apmg.a;
        }
        apxf apxfVar = apmgVar3.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        apxf apxfVar2 = apxfVar;
        if ((c.b & 128) != 0) {
            apmh apmhVar4 = c.g;
            if (apmhVar4 == null) {
                apmhVar4 = apmh.a;
            }
            apmg apmgVar4 = apmhVar4.c;
            if (apmgVar4 == null) {
                apmgVar4 = apmg.a;
            }
            apmgVar = apmgVar4;
        } else {
            apmgVar = null;
        }
        apmh apmhVar5 = c.i;
        if (apmhVar5 == null) {
            apmhVar5 = apmh.a;
        }
        apmg apmgVar5 = apmhVar5.c;
        if (apmgVar5 == null) {
            apmgVar5 = apmg.a;
        }
        apmg apmgVar6 = apmgVar5;
        aulq aulqVar = c.j;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aulq aulqVar2 = aulqVar;
        String str = c.k;
        if ((c.b & 4096) != 0) {
            aqyg aqygVar7 = c.h;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
            aqygVar3 = aqygVar7;
        } else {
            aqygVar3 = null;
        }
        if ((c.b & 16) != 0) {
            aqyg aqygVar8 = c.e;
            if (aqygVar8 == null) {
                aqygVar8 = aqyg.a;
            }
            aqygVar4 = aqygVar8;
        } else {
            aqygVar4 = null;
        }
        xoo xooVar = new xoo(1, avggVar2, xpaVar, apyvVar, b, b2, null, apxfVar2, apmgVar, apmgVar6, aulqVar2, str, aqygVar3, aqygVar4, null, c);
        if ((c.b & 8) != 0) {
            aqygVar6 = c.d;
            aqygVar5 = aqygVar6 == null ? aqyg.a : null;
            e(xooVar, null, aahk.a(aqygVar6, this.b, false), null, false, z);
        }
        aqygVar6 = aqygVar5;
        e(xooVar, null, aahk.a(aqygVar6, this.b, false), null, false, z);
    }

    public final void j() {
        xoi xoiVar = this.h;
        if (xoiVar != null) {
            xoiVar.a();
        }
    }

    public final void k() {
        xoi xoiVar = this.h;
        if (xoiVar != null) {
            xoiVar.b();
        }
    }

    public final void l(final String str, final ajvc ajvcVar, final xoo xooVar, final xyt xytVar, final Long l) {
        if (xooVar.g != null) {
            zfi zfiVar = new zfi() { // from class: xnt
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    xoh.this.n(xytVar, (cnq) obj, xooVar, ajvcVar, str, l);
                }
            };
            abie abieVar = this.w;
            Activity activity = (Activity) abieVar.f.get();
            activity.getClass();
            xnm xnmVar = (xnm) abieVar.c.get();
            xnmVar.getClass();
            yal yalVar = (yal) abieVar.e.get();
            yalVar.getClass();
            xpu xpuVar = (xpu) abieVar.d.get();
            xpuVar.getClass();
            vak vakVar = (vak) abieVar.b.get();
            vakVar.getClass();
            ajfh ajfhVar = (ajfh) abieVar.a.get();
            xytVar.getClass();
            str.getClass();
            xpq xpqVar = new xpq(activity, xnmVar, yalVar, xpuVar, vakVar, ajfhVar, ajvcVar, xooVar, xytVar, str, l, zfiVar, null);
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xpqVar);
            this.b.c(xooVar.g, hashMap);
            return;
        }
        whu.K(this.a, R.string.error_comment_failed, 1);
        xytVar.dismiss();
    }

    public final void m(final ajvc ajvcVar, final String str, final xoo xooVar, final xyt xytVar) {
        if (xooVar.g != null) {
            zfi zfiVar = new zfi() { // from class: xns
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    xoh.this.n(xytVar, (cnq) obj, xooVar, ajvcVar, str, null);
                }
            };
            yfl yflVar = this.x;
            aahd aahdVar = this.b;
            Activity activity = (Activity) yflVar.b.get();
            activity.getClass();
            xnm xnmVar = (xnm) yflVar.a.get();
            xnmVar.getClass();
            xytVar.getClass();
            str.getClass();
            xqj xqjVar = new xqj(activity, xnmVar, ajvcVar, xooVar, xytVar, str, zfiVar, aahdVar);
            adz adzVar = new adz();
            adzVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xqjVar);
            this.b.c(xooVar.g, adzVar);
            return;
        }
        whu.K(this.a, R.string.error_comment_failed, 1);
        xytVar.dismiss();
    }

    public final void n(xyt xytVar, cnq cnqVar, xoo xooVar, ajvc ajvcVar, CharSequence charSequence, Long l) {
        xytVar.dismiss();
        if (cnqVar != null) {
            this.r.e(cnqVar);
        } else {
            whu.K(this.a, R.string.error_comment_failed, 1);
        }
        e(xooVar, ajvcVar, charSequence, l, true, false);
    }

    public final void o(apzd apzdVar, xpa xpaVar, apyv apyvVar, boolean z) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apmg apmgVar;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        aqyg aqygVar6;
        if ((apzdVar.b & 32) == 0) {
            zga.b("No reply button specified for comment dialog.");
            return;
        }
        apmh apmhVar = apzdVar.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            zga.b("No button renderer specified for comment dialog.");
            return;
        }
        apmh apmhVar2 = apzdVar.f;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar2 = apmhVar2.c;
        if (apmgVar2 == null) {
            apmgVar2 = apmg.a;
        }
        if ((apmgVar2.b & 8192) == 0) {
            zga.b("No service endpoint specified for comment dialog.");
            return;
        }
        apzd c = c(apzdVar);
        avgg avggVar = c.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        avgg avggVar2 = avggVar;
        if ((c.b & 4096) != 0) {
            aqygVar = c.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((c.b & 16) != 0) {
            aqygVar2 = c.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        apmh apmhVar3 = c.f;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        apmg apmgVar3 = apmhVar3.c;
        if (apmgVar3 == null) {
            apmgVar3 = apmg.a;
        }
        apxf apxfVar = apmgVar3.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        apxf apxfVar2 = apxfVar;
        if ((c.b & 128) != 0) {
            apmh apmhVar4 = c.g;
            if (apmhVar4 == null) {
                apmhVar4 = apmh.a;
            }
            apmg apmgVar4 = apmhVar4.c;
            if (apmgVar4 == null) {
                apmgVar4 = apmg.a;
            }
            apmgVar = apmgVar4;
        } else {
            apmgVar = null;
        }
        apmh apmhVar5 = c.i;
        if (apmhVar5 == null) {
            apmhVar5 = apmh.a;
        }
        apmg apmgVar5 = apmhVar5.c;
        if (apmgVar5 == null) {
            apmgVar5 = apmg.a;
        }
        apmg apmgVar6 = apmgVar5;
        aulq aulqVar = c.j;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aulq aulqVar2 = aulqVar;
        String str = c.k;
        if ((c.b & 4096) != 0) {
            aqyg aqygVar7 = c.h;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
            aqygVar3 = aqygVar7;
        } else {
            aqygVar3 = null;
        }
        if ((c.b & 16) != 0) {
            aqyg aqygVar8 = c.e;
            if (aqygVar8 == null) {
                aqygVar8 = aqyg.a;
            }
            aqygVar4 = aqygVar8;
        } else {
            aqygVar4 = null;
        }
        xoo xooVar = new xoo(2, avggVar2, xpaVar, apyvVar, b, b2, null, apxfVar2, apmgVar, apmgVar6, aulqVar2, str, aqygVar3, aqygVar4, null, c);
        if ((c.b & 8) != 0) {
            aqygVar6 = c.d;
            aqygVar5 = aqygVar6 == null ? aqyg.a : null;
            e(xooVar, null, aahk.a(aqygVar6, this.b, false), null, false, z);
        }
        aqygVar6 = aqygVar5;
        e(xooVar, null, aahk.a(aqygVar6, this.b, false), null, false, z);
    }

    public final void i(xoo xooVar, xyt xytVar) {
        apxf apxfVar;
        apmg apmgVar = xooVar.h;
        if (apmgVar == null) {
            apxfVar = null;
        } else {
            apxfVar = apmgVar.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        if (apxfVar != null) {
            xnr xnrVar = new ykj() { // from class: xnr
                @Override // defpackage.ykj
                public final void kD(int i, int i2, Intent intent) {
                }
            };
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xnrVar);
            this.b.c(apxfVar, hashMap);
            return;
        }
        whu.K(this.a, R.string.error_video_attachment_failed, 1);
        xytVar.dismiss();
    }
}
