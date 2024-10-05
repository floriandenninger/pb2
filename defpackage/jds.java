package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jds implements aczr {
    public static final String a = zga.a("AutoconnectMealbar");
    private static final long k = TimeUnit.DAYS.toSeconds(90);
    public final adeg b;
    public final addy c;
    public final Context d;
    public final okf e;
    public final adlt f;
    public final aczv g;
    public final gov h;
    public akby i;
    public final adpl j;
    private final gbw l;
    private final Resources m;
    private final acqz n;

    public jds(gbw gbwVar, Context context, adeg adegVar, addy addyVar, acqz acqzVar, adpl adplVar, okf okfVar, adlt adltVar, aczv aczvVar, jgp jgpVar, byte[] bArr, byte[] bArr2) {
        this.l = gbwVar;
        this.m = context.getResources();
        this.b = adegVar;
        this.c = addyVar;
        this.d = context;
        this.n = acqzVar;
        this.j = adplVar;
        this.e = okfVar;
        this.f = adltVar;
        this.g = aczvVar;
        this.h = jgpVar.b(fav.RATE_LIMIT_SHOW_AUTOCONNECT_PROMPT_LAST_ALLOWED, k, TimeUnit.SECONDS);
    }

    public final acra a() {
        return this.n.mM();
    }

    public final void b(acrb acrbVar) {
        a().I(3, new acqx(acrbVar), null);
    }

    @Override // defpackage.aczr
    public final void c(final adfy adfyVar, apxf apxfVar, adah adahVar) {
        if (!adahVar.c || this.h.b()) {
            jdq jdqVar = new jdq(this, adahVar, apxfVar);
            gbw gbwVar = this.l;
            akbx d = akby.d();
            d.c = this.m.getString(true != adahVar.f ? R.string.autoconnect_title : R.string.autoconnect_title_new_copy, adfyVar.d);
            zil a2 = zil.a(R.attr.ytTextPrimary);
            d.k();
            d.h(R.drawable.yt_outline_youtube_linked_tv_gm_blue_24);
            d.k = Optional.of(a2);
            d.d = this.m.getString(true != adahVar.f ? R.string.autoconnect_details : R.string.autoconnect_details_new_copy);
            akbx c = d.a(this.m.getString(true != adahVar.f ? R.string.autoconnect_action_button : R.string.autoconnect_action_button_new_copy), new View.OnClickListener() { // from class: jdp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jds jdsVar = jds.this;
                    adfy adfyVar2 = adfyVar;
                    jdsVar.g.b();
                    if (adfyVar2 == null || adfyVar2.n == null) {
                        zga.m(jds.a, "MDx screen or its route is null.");
                    } else {
                        adeg adegVar = jdsVar.b;
                        aone createBuilder = atbe.a.createBuilder();
                        String str = adfyVar2.d;
                        createBuilder.copyOnWrite();
                        atbe atbeVar = (atbe) createBuilder.instance;
                        str.getClass();
                        atbeVar.b |= 1;
                        atbeVar.c = str;
                        String str2 = adfyVar2.n.c;
                        createBuilder.copyOnWrite();
                        atbe atbeVar2 = (atbe) createBuilder.instance;
                        atbeVar2.b |= 2;
                        atbeVar2.d = str2;
                        bpv a3 = adegVar.a((atbe) createBuilder.build(), jdsVar.d);
                        if (a3 == null) {
                            zga.m(jds.a, "Couldn't find the designated route to connect to.");
                        } else {
                            jdsVar.j.a.c(atbj.MDX_SESSION_SOURCE_AUTOCONNECT);
                            jdsVar.c.O(a3);
                            adlt adltVar = jdsVar.f;
                            adltVar.i(new jdr(adltVar, jdsVar.e));
                        }
                    }
                    jdsVar.b(acrb.MDX_AUTOCONNECT_PROMPT_ACTION_BUTTON);
                }
            }).c(this.m.getString(true != adahVar.e ? R.string.autoconnect_dismiss_button : R.string.autoconnect_dismiss_ninety_days_button), new View.OnClickListener() { // from class: jdo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jds jdsVar = jds.this;
                    jdsVar.g.b();
                    jdsVar.b(acrb.MDX_AUTOCONNECT_PROMPT_DISMISS_BUTTON);
                }
            });
            c.m = jdqVar;
            c.i(false);
            c.j();
            c.g(!adahVar.b);
            gbwVar.j(c.f());
        }
    }

    @Override // defpackage.aczr
    public final boolean d() {
        return this.i != null;
    }
}
