package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvj implements muz, jky {
    public final jla a;
    public final Context b;
    public final ypa c;
    public final aahd d;
    public final View e;
    public final TextView f;
    public final OfflineArrowView g;
    public final jkz h;
    public final ainy i;
    public final jrz j;
    public final View.OnClickListener k;
    public final ColorStateList l;
    public final ColorStateList m;
    public acra n;
    public auvo o;
    public String p;
    public apmg q;
    public final aoae r;
    private final azrw s;

    public mvj(agzj agzjVar, ainy ainyVar, azrw azrwVar, jlb jlbVar, Context context, ypa ypaVar, aahd aahdVar, fka fkaVar, aoae aoaeVar, jwb jwbVar, azrw azrwVar2, ViewGroup viewGroup, byte[] bArr) {
        this.s = azrwVar;
        this.i = ainyVar;
        Activity activity = (Activity) jlbVar.a.get();
        activity.getClass();
        jkv jkvVar = (jkv) jlbVar.b.get();
        jkvVar.getClass();
        acra acraVar = (acra) jlbVar.c.get();
        acraVar.getClass();
        jws jwsVar = (jws) jlbVar.d.get();
        jwsVar.getClass();
        azrw azrwVar3 = jlbVar.e;
        fiu fiuVar = (fiu) jlbVar.f.get();
        fiuVar.getClass();
        jla jlaVar = new jla(activity, jkvVar, acraVar, jwsVar, azrwVar3, fiuVar, this);
        this.a = jlaVar;
        this.b = context;
        this.c = ypaVar;
        this.d = aahdVar;
        this.r = aoaeVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.slim_metadata_offline_button, viewGroup, false);
        this.e = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.button_text);
        this.f = textView;
        OfflineArrowView offlineArrowView = (OfflineArrowView) inflate.findViewById(R.id.button_icon);
        this.g = offlineArrowView;
        this.l = textView.getTextColors();
        this.m = offlineArrowView.c;
        this.h = new jkx(context, jlaVar, agzjVar, azrwVar, ainyVar, new azrw() { // from class: mvi
            @Override // defpackage.azrw
            public final Object get() {
                return mvj.this.n;
            }
        }, fkaVar, aahdVar, jwbVar, azrwVar2);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: mvh
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, acra] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, acra] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerResponseModel a;
                mvj mvjVar = mvj.this;
                apmg d = mvj.d(mvjVar.i);
                if (d != null && (d.b & 16384) != 0) {
                    aahd aahdVar2 = mvjVar.d;
                    apxf apxfVar = d.o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar2.c(apxfVar, null);
                    return;
                }
                apmg apmgVar = mvjVar.q;
                if ((apmgVar.b & 16384) == 0) {
                    jkz jkzVar = mvjVar.h;
                    String str = mvjVar.p;
                    jkx jkxVar = (jkx) jkzVar;
                    final fka fkaVar2 = jkxVar.i;
                    anaf.Y(anfq.i(anht.q(anfq.h(fkaVar2.b.a(), fjw.c, angq.a)), new anfz() { // from class: fas
                        @Override // defpackage.anfz
                        public final anhy a(Object obj) {
                            fka fkaVar3 = fka.this;
                            if (!((Boolean) obj).booleanValue()) {
                                return anhv.a;
                            }
                            return fkaVar3.c(true);
                        }
                    }, angq.a), ynm.a(ept.e), angq.a);
                    String q = jkxVar.h.q();
                    if (q == null || !q.equals(str) || (a = fkc.a(jkxVar.h)) == null) {
                        return;
                    }
                    jla jlaVar2 = jkxVar.c;
                    apmg apmgVar2 = jlaVar2 != null ? jlaVar2.g : null;
                    if (apmgVar2 != null && (apmgVar2.b & 8192) != 0) {
                        apxf apxfVar2 = apmgVar2.n;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("YpcGetOfflineUpsellResponse_videoIdKey", str);
                        jkxVar.f.c(apxfVar2, hashMap);
                        if (apxfVar2.pY(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint)) {
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        whu.K(jkxVar.a, R.string.add_video_to_offline_error, 1);
                        return;
                    }
                    atsb h = ahbx.h(a.q());
                    agnv e = ((agof) jkxVar.b.get()).a().m().e(str);
                    if (e == null || e.s()) {
                        jkxVar.d.n(str, h, jkxVar.c, jkxVar.e.get(), null);
                        return;
                    }
                    if (e.i() == agnq.PLAYABLE || e.A() || e.C()) {
                        jkxVar.g.a(str);
                        return;
                    }
                    if (e.u()) {
                        if (jkxVar.a(e)) {
                            jkxVar.d.m(null, str, jkxVar.c, true);
                            return;
                        }
                        if (e.r()) {
                            whu.K(jkxVar.a, R.string.add_video_to_offline_error, 1);
                            return;
                        }
                        if (e.x()) {
                            agnu agnuVar = e.j;
                            if (agnuVar.f()) {
                                jkxVar.d.e(agnuVar, true);
                                return;
                            }
                            Object d2 = agnuVar.d();
                            if (d2 != null) {
                                jkxVar.d.q(str, d2, jkxVar.e.get());
                                return;
                            }
                            return;
                        }
                        jkxVar.d.c(str, true);
                        return;
                    }
                    return;
                }
                aahd aahdVar3 = mvjVar.d;
                apxf apxfVar3 = apmgVar.o;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar3.c(apxfVar3, null);
            }
        };
        this.k = onClickListener;
        offlineArrowView.getClass();
        this.j = new jrz(offlineArrowView, onClickListener);
    }

    public static apmg d(ainy ainyVar) {
        PlayerResponseModel a = fkc.a(ainyVar);
        if (a == null || a.q() == null) {
            return null;
        }
        aryd arydVar = a.q().l;
        if (arydVar == null) {
            arydVar = aryd.a;
        }
        if (arydVar.b != 65153809) {
            return null;
        }
        aryd arydVar2 = a.q().l;
        if (arydVar2 == null) {
            arydVar2 = aryd.a;
        }
        if (arydVar2.b == 65153809) {
            return (apmg) arydVar2.c;
        }
        return apmg.a;
    }

    private final void f() {
        this.e.setContentDescription(this.g.getContentDescription());
    }

    @Override // defpackage.jky
    public final void a(agnv agnvVar, atsb atsbVar) {
        if ((agnvVar != null && !agnvVar.x()) || atsbVar == null || atsbVar.c) {
            this.j.b(true);
            this.j.i(agnvVar);
            e(agnvVar);
            f();
            return;
        }
        this.j.b(false);
        jrz jrzVar = this.j;
        jrzVar.a();
        OfflineArrowView offlineArrowView = jrzVar.b;
        offlineArrowView.b(offlineArrowView.a);
        jrzVar.b.k();
    }

    @Override // defpackage.muz
    public final void b() {
        this.p = null;
        this.o = null;
        this.n = null;
        this.q = null;
        this.a.h = null;
        this.e.setOnClickListener(null);
        this.e.setAlpha(0.5f);
        this.e.setClickable(false);
        this.g.setClickable(false);
        this.c.m(this.a);
    }

    public final agnv c() {
        if (TextUtils.isEmpty(this.p)) {
            return null;
        }
        return ((agof) this.s.get()).a().m().e(this.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.agnv r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L59
            agnq r1 = r4.i()
            agnq r2 = defpackage.agnq.PLAYABLE
            if (r1 != r2) goto L20
            auvo r4 = r3.o
            int r1 = r4.b
            r1 = r1 & 4
            if (r1 == 0) goto L1a
            aqyg r4 = r4.e
            if (r4 != 0) goto L1b
            aqyg r4 = defpackage.aqyg.a
            goto L1b
        L1a:
            r4 = r0
        L1b:
            android.text.Spanned r4 = defpackage.ajcq.b(r4)
            goto L5a
        L20:
            boolean r1 = r4.z()
            if (r1 != 0) goto L41
            agnf r1 = r4.l
            agnf r2 = defpackage.agnf.ACTIVE
            if (r1 != r2) goto L41
            auvo r4 = r3.o
            int r1 = r4.b
            r1 = r1 & 2
            if (r1 == 0) goto L3b
            aqyg r4 = r4.d
            if (r4 != 0) goto L3c
            aqyg r4 = defpackage.aqyg.a
            goto L3c
        L3b:
            r4 = r0
        L3c:
            android.text.Spanned r4 = defpackage.ajcq.b(r4)
            goto L5a
        L41:
            boolean r4 = r4.C()
            if (r4 == 0) goto L59
            android.content.Context r4 = r3.b
            r1 = 2132018709(0x7f140615, float:1.9675732E38)
            java.lang.String r4 = r4.getString(r1)
            aqyg r4 = defpackage.ajcq.h(r4)
            android.text.Spanned r4 = defpackage.ajcq.b(r4)
            goto L5a
        L59:
            r4 = r0
        L5a:
            if (r4 != 0) goto L6e
            apmg r4 = r3.q
            int r1 = r4.b
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L6a
            aqyg r0 = r4.i
            if (r0 != 0) goto L6a
            aqyg r0 = defpackage.aqyg.a
        L6a:
            android.text.Spanned r4 = defpackage.ajcq.b(r0)
        L6e:
            android.widget.TextView r0 = r3.f
            r0.setText(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvj.e(agnv):void");
    }

    @Override // defpackage.muz
    public final View oE() {
        return this.e;
    }

    @Override // defpackage.jky
    public final void oF(agnv agnvVar) {
        this.j.b(true);
        this.j.i(agnvVar);
        e(agnvVar);
        f();
    }
}
