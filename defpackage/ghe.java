package defpackage;

import android.app.Activity;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ghe implements axqr {
    public static ghd a(Activity activity, afsy afsyVar, aftn aftnVar, aayg aaygVar, zaw zawVar, ypa ypaVar, ysy ysyVar, zbi zbiVar, aahd aahdVar, Executor executor) {
        return new ghd(activity, afsyVar, aftnVar, aaygVar, zawVar, ypaVar, ysyVar, zbiVar, aahdVar, executor);
    }

    public static zil b() {
        return zil.a(R.attr.ytSuggestedAction);
    }

    public static iew c(Context context, aahd aahdVar, acra acraVar, ajut ajutVar) {
        return new iew(context, aahdVar, acraVar, ajutVar);
    }

    public static iez d(iip iipVar, gru gruVar) {
        return new iez(iipVar, gruVar);
    }

    public static ifa e(iip iipVar) {
        return new ifa(iipVar, 0);
    }

    public static iff f(ing ingVar, zgj zgjVar, amnv amnvVar, hav havVar) {
        return new iff(ingVar, zgjVar, amnvVar, havVar);
    }

    public static ifk g(ifz ifzVar) {
        return new ifk(ifzVar);
    }

    public static its h() {
        return new its(ivj.class, iwa.class);
    }

    public static jdu i() {
        return new jdu();
    }

    public static Integer j() {
        return 155;
    }

    public static oqz k() {
        return new oqz();
    }

    public static CookieManager l() {
        CookieManager cookieManager = CookieManager.getInstance();
        ayaw.k(cookieManager);
        return cookieManager;
    }

    public static ifa m(iip iipVar) {
        return new ifa(iipVar, 1);
    }

    public static ezn n() {
        return new ezn(4);
    }

    public static abwz o(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15) {
        return new abwz(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, (byte[]) null);
    }

    public static gru p(ci ciVar, aahd aahdVar, ajut ajutVar, ajoy ajoyVar, lyp lypVar, acqz acqzVar, aalw aalwVar, lru lruVar, ajdh ajdhVar) {
        return new gru(ciVar, aahdVar, ajutVar, ajoyVar, lypVar, acqzVar, aalwVar, lruVar, ajdhVar, null, null);
    }

    public static gfw q() {
        return new gfw();
    }

    public static lkb r() {
        return new lkb(iye.class);
    }

    public static lkb s() {
        return new lkb(iwe.class);
    }

    public static lmt t(Activity activity, aahd aahdVar, SettingsDataAccess settingsDataAccess, acra acraVar, aloh alohVar) {
        return new lmt(activity, aahdVar, settingsDataAccess, acraVar, alohVar, null, null, null, null);
    }

    public static hbu u(ci ciVar, SfvAudioItemPlaybackController sfvAudioItemPlaybackController, aahd aahdVar, hav havVar, inp inpVar, aoae aoaeVar, Map map, acqz acqzVar) {
        return new hbu(ciVar, sfvAudioItemPlaybackController, aahdVar, havVar, inpVar, aoaeVar, map, acqzVar, null, null, null, null, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        throw null;
    }
}
