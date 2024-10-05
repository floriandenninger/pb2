package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class esu extends ajpc {
    public final Context a;
    public final View b;
    public final GradientDrawable c;
    public final aahd d;
    public final ysy e;
    public final aahv f;
    public final asht g;
    public final asht h;
    public ajof i;
    public acra j;
    public apqt k;
    est l;
    private final ajjz m;
    private final akbu n;
    private final ajjv o;
    private final View p;
    private final ImageView q;
    private final TextView r;
    private final axpg s;
    private final View t;
    private ayqx u;

    public esu(Context context, ajjz ajjzVar, aahd aahdVar, akbu akbuVar, ysy ysyVar, aahv aahvVar, akbd akbdVar, axpg axpgVar) {
        this.a = context;
        ajjzVar.getClass();
        this.m = ajjzVar;
        akbuVar.getClass();
        this.n = akbuVar;
        this.d = aahdVar;
        this.e = ysyVar;
        this.f = aahvVar;
        axpgVar.getClass();
        this.s = axpgVar;
        aahdVar.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.channel_list_sub_menu_avatar, (ViewGroup) null);
        this.p = inflate;
        this.r = (TextView) inflate.findViewById(R.id.channel_avatar_title);
        this.q = (ImageView) inflate.findViewById(R.id.channel_avatar);
        View findViewById = inflate.findViewById(R.id.channel_status);
        this.b = findViewById;
        this.c = (GradientDrawable) findViewById.getBackground();
        this.t = inflate.findViewById(R.id.channel_info);
        ajju a = ajjv.a();
        a.b(R.drawable.missing_avatar);
        this.o = a.a();
        this.l = est.DEFAULT;
        this.g = k(2);
        this.h = k(3);
        akbdVar.b(inflate, akbdVar.a(inflate, null));
    }

    private final void g() {
        apqt apqtVar = this.k;
        if (apqtVar != null && (apqtVar.b & 1024) != 0) {
            ((akcp) this.s.get()).g(this.k.k);
        }
        this.j = null;
        this.k = null;
        Object obj = this.u;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.u = null;
        }
    }

    private static boolean h(apqt apqtVar) {
        int az;
        return apqtVar.pY(apqq.b) && (az = anaf.az(((apqu) apqtVar.pX(apqq.b)).b)) != 0 && az == 3;
    }

    private static boolean j(apqt apqtVar) {
        int az;
        return apqtVar.pY(apqq.b) && (az = anaf.az(((apqu) apqtVar.pX(apqq.b)).b)) != 0 && az == 4;
    }

    private static asht k(int i) {
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashk.a.createBuilder();
        createBuilder2.copyOnWrite();
        ashk ashkVar = (ashk) createBuilder2.instance;
        ashkVar.c = i - 1;
        ashkVar.b |= 1;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashk ashkVar2 = (ashk) createBuilder2.build();
        ashkVar2.getClass();
        ashtVar.m = ashkVar2;
        ashtVar.b |= 32768;
        return (asht) createBuilder.build();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.p;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        g();
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(final ajok ajokVar, Object obj) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int i;
        int i2;
        final apqx apqxVar;
        arej arejVar;
        aqyg aqygVar;
        final apqt apqtVar = (apqt) obj;
        g();
        this.k = apqtVar;
        this.j = ajokVar.a;
        View view = this.p;
        if (j(apqtVar)) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_width);
        } else if (h(apqtVar)) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_large_width);
        } else {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_small_width);
        }
        yny.B(view, dimensionPixelSize, -2);
        boolean j = j(apqtVar);
        if (j(apqtVar)) {
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_larger_avatar_size);
        } else if (h(apqtVar)) {
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_large_avatar_size);
        } else {
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_small_avatar_size);
        }
        yny.z(this.q, yny.h(yny.y(dimensionPixelSize2, dimensionPixelSize2), yny.v(j ? this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_avatar_top_margin) : 0)), ViewGroup.MarginLayoutParams.class);
        if (j) {
            i = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_status_margin);
            i2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_status_margin);
        } else {
            i = 0;
            i2 = 0;
        }
        yny.z(this.b, yny.h(yny.q(i), yny.k(i2)), ViewGroup.MarginLayoutParams.class);
        this.r.setVisibility(true != j ? 8 : 0);
        String str = null;
        if (j(apqtVar)) {
            TextView textView = this.r;
            if ((apqtVar.b & 256) != 0) {
                aqygVar = apqtVar.j;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
        } else {
            this.r.setText("");
        }
        ajjz ajjzVar = this.m;
        ImageView imageView = this.q;
        avgg avggVar = apqtVar.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.k(imageView, avggVar, this.o);
        ImageView imageView2 = this.q;
        aott aottVar = apqtVar.h;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        aots aotsVar = aottVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) != 0) {
            aott aottVar2 = apqtVar.h;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar2 = aottVar2.c;
            if (aotsVar2 == null) {
                aotsVar2 = aots.a;
            }
            str = aotsVar2.c;
        }
        imageView2.setContentDescription(str);
        if (!(apqtVar.c == 10 ? (String) apqtVar.d : "").isEmpty()) {
            apht aphtVar = (apht) this.f.c().f(apqtVar.c == 10 ? (String) apqtVar.d : "").g(apht.class).X();
            if (aphtVar == null) {
                apqxVar = apqx.CHANNEL_STATUS_UNKNOWN;
            } else {
                apqxVar = aphtVar.getStatus();
            }
        } else {
            apqxVar = apqx.CHANNEL_STATUS_UNKNOWN;
        }
        esv.b(this.b, this.c, apqxVar, this.a.getResources());
        if ((apqtVar.b & 128) != 0) {
            akbu akbuVar = this.n;
            apqs apqsVar = apqtVar.i;
            if (apqsVar == null) {
                apqsVar = apqs.a;
            }
            if (apqsVar.b == 102716411) {
                arejVar = (arej) apqsVar.c;
            } else {
                arejVar = arej.a;
            }
            akbuVar.b(arejVar, this.p, apqtVar, ajokVar.a);
        }
        if ((apqtVar.b & 1024) != 0) {
            ((akcp) this.s.get()).d(apqtVar.k, this.p);
        }
        this.i = (ajof) ajokVar.c("CHANNEL_LIST_SUB_MENU_AVATAR_ON_CLICK_INTERCEPT_KEY");
        this.p.setOnClickListener(new View.OnClickListener() { // from class: esr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                esu esuVar = esu.this;
                apqt apqtVar2 = apqtVar;
                apqx apqxVar2 = apqxVar;
                ajok ajokVar2 = ajokVar;
                ajof ajofVar = esuVar.i;
                if ((ajofVar == null || !ajofVar.h(view2)) && (apqtVar2.b & 8) != 0) {
                    if (apqxVar2 == apqx.CHANNEL_STATUS_UNREAD && esuVar.e.o()) {
                        apqx apqxVar3 = apqx.CHANNEL_STATUS_UNKNOWN;
                        aahu c = esuVar.f.c();
                        apht aphtVar2 = (apht) c.b(apqtVar2.c == 10 ? (String) apqtVar2.d : "");
                        if (aphtVar2 != null) {
                            aaio c2 = ((aaih) c).c();
                            aphs e = aphtVar2.e();
                            aone aoneVar = e.a;
                            aoneVar.copyOnWrite();
                            aphu aphuVar = (aphu) aoneVar.instance;
                            aphu aphuVar2 = aphu.a;
                            aphuVar.d = apqxVar3.d;
                            aphuVar.b |= 2;
                            c2.k(e);
                            c2.b();
                        }
                        esv.b(esuVar.b, esuVar.c, apqx.CHANNEL_STATUS_UNKNOWN, esuVar.a.getResources());
                    }
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("sectionListController", ajokVar2.c("sectionListController"));
                    aahd aahdVar = esuVar.d;
                    apxf apxfVar = apqtVar2.f;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, hashMap);
                }
            }
        });
        f((est) ajokVar.d("CHANNEL_LIST_SUB_MENU_AVATAR_CURRENT_STATE_KEY", est.DEFAULT));
        aypy aypyVar = (aypy) ajokVar.c("CHANNEL_LIST_SUB_MENU_AVATAR_STATE_CHANGED_OBSERVABLE_KEY");
        if (aypyVar != null) {
            this.u = aypyVar.ay(new ayrs() { // from class: ess
                @Override // defpackage.ayrs
                public final void a(Object obj2) {
                    apqt apqtVar2;
                    esu esuVar = esu.this;
                    est estVar = (est) obj2;
                    est estVar2 = esuVar.l;
                    if (!esuVar.f(estVar) || esuVar.j == null || (apqtVar2 = esuVar.k) == null || (apqtVar2.b & 32) == 0) {
                        return;
                    }
                    if (estVar2 == est.SELECTED || estVar == est.SELECTED) {
                        esuVar.j.w(new acqx(esuVar.k.g.I()), esuVar.l == est.SELECTED ? esuVar.g : esuVar.h);
                    }
                }
            }, eoo.c);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apqt) obj).g.I();
    }

    public final boolean f(est estVar) {
        if (estVar == this.l) {
            return false;
        }
        est estVar2 = est.DEFAULT;
        int ordinal = estVar.ordinal();
        if (ordinal == 0) {
            this.t.setAlpha(1.0f);
            this.t.setBackground(null);
        } else if (ordinal == 1) {
            this.t.setAlpha(1.0f);
            this.t.setBackgroundColor(akbg.a(this.a, avez.THEME_ATTRIBUTE_SUGGESTED_ACTION, 0));
        } else if (ordinal == 2) {
            this.t.setAlpha(0.3f);
            this.t.setBackground(null);
        }
        this.l = estVar;
        return true;
    }
}
