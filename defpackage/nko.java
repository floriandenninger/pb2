package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nko implements fwi {
    public final fwo a;
    public final nkt b;
    public final gnv c;
    public fwh d;
    public fwh e;
    public fwh f;
    public fwh g;
    public fwh h;
    private final SharedPreferences i;
    private final akch j;

    public nko(fwo fwoVar, SharedPreferences sharedPreferences, akch akchVar, fxj fxjVar, nkt nktVar, gnv gnvVar) {
        this.a = fwoVar;
        this.i = sharedPreferences;
        this.j = akchVar;
        this.b = nktVar;
        this.c = gnvVar;
        if (!sharedPreferences.contains(fav.TIME_FUSION_ENABLED)) {
            sharedPreferences.edit().putLong(fav.TIME_FUSION_ENABLED, System.currentTimeMillis()).apply();
        }
        if (sharedPreferences.getBoolean(fav.SHOW_SUBSCRIBERS_TAB_TUTORIAL, true)) {
            fwh fwhVar = new fwh(fwoVar, sharedPreferences, 5602, fav.SHOW_SUBSCRIBERS_TAB_TUTORIAL, R.string.subs_tab_tutorial_description, akchVar);
            this.d = fwhVar;
            fwoVar.b(fwhVar);
        }
        if (sharedPreferences.getBoolean(fav.SHOW_ACCOUNT_TAB_TUTORIAL, true)) {
            fwh fwhVar2 = new fwh(fwoVar, sharedPreferences, 5601, fav.SHOW_ACCOUNT_TAB_TUTORIAL, R.string.account_tab_tutorial_description, akchVar);
            this.e = fwhVar2;
            fwoVar.b(fwhVar2);
        }
        if (sharedPreferences.getBoolean(fav.SHOW_SUBS_CHANNELS_TUTORIAL, true)) {
            fwh fwhVar3 = new fwh(fwoVar, sharedPreferences, 5600, fav.SHOW_SUBS_CHANNELS_TUTORIAL, R.string.subs_channel_tutorial_description, akchVar);
            this.f = fwhVar3;
            fwoVar.b(fwhVar3);
        }
        if (sharedPreferences.getBoolean(fav.SHOW_CHANNELS_NOTIFICATIONS_TUTORIAL, true)) {
            fwh fwhVar4 = new fwh(fwoVar, sharedPreferences, 4500, fav.SHOW_CHANNELS_NOTIFICATIONS_TUTORIAL, R.string.channels_notification_tutorial_description, akchVar);
            this.g = fwhVar4;
            fwoVar.b(fwhVar4);
        }
        if (sharedPreferences.getBoolean(fav.SHOW_TRENDING_TAB_TUTORIAL, true)) {
            fwh fwhVar5 = new fwh(fwoVar, sharedPreferences, 5603, fav.SHOW_TRENDING_TAB_TUTORIAL, R.string.trending_tab_tutorial_description, akchVar);
            this.h = fwhVar5;
            fwoVar.b(fwhVar5);
        }
        nkn nknVar = new nkn(this);
        if (fxjVar.a == null) {
            fxjVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        fxjVar.a.add(nknVar);
    }

    public static boolean d(apxf apxfVar, String str) {
        return (apxfVar == null || (((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).b & 1) == 0 || !amkq.e(((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c, str)) ? false : true;
    }

    @Override // defpackage.fwi
    public final void a(Object obj, View view) {
        if (this.f != null && (obj instanceof apqv)) {
            Iterator it = ((apqv) obj).e.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((apqw) it.next()).b == 48474525) {
                    i++;
                }
            }
            if (i >= 5) {
                this.f.a = view;
            }
        } else if (this.g == null || !(obj instanceof esi)) {
            if (obj instanceof atqr) {
                this.b.a(view);
                this.b.d = new nkn(this);
            }
        } else {
            esi esiVar = (esi) obj;
            if (esiVar.f() != null && esiVar.f().a() != null && view.isShown()) {
                this.g.a = view;
            }
        }
        this.a.c();
    }

    public final void b(boolean z) {
        if (!z) {
            this.a.f(this.b);
        } else if (this.b.b()) {
            this.a.b(this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.aveh r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L2b
            apxf r4 = r4.d
            if (r4 != 0) goto La
            apxf r4 = defpackage.apxf.a
        La:
            java.lang.String r2 = "FEsubscriptions"
            boolean r2 = d(r4, r2)
            if (r2 == 0) goto L15
            java.lang.String r0 = "show_subscribers_tab_tutorial"
            goto L2b
        L15:
            java.lang.String r2 = "FEaccount"
            boolean r2 = d(r4, r2)
            if (r2 == 0) goto L21
            r4 = 1
            java.lang.String r0 = "show_accounts_tab_tutorial"
            goto L2c
        L21:
            java.lang.String r2 = "FEtrending"
            boolean r4 = d(r4, r2)
            if (r4 == 0) goto L2b
            java.lang.String r0 = "show_trending_tab_tutorial"
        L2b:
            r4 = 0
        L2c:
            if (r0 == 0) goto L3b
            android.content.SharedPreferences r2 = r3.i
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r2.putBoolean(r0, r1)
            r0.apply()
        L3b:
            nkt r0 = r3.b
            r0.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nko.c(aveh):void");
    }

    public final boolean e() {
        if (!this.c.b()) {
            return false;
        }
        this.c.d();
        return true;
    }
}
