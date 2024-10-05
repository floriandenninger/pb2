package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gck {
    public atcf a;
    public apxi b;

    public static boolean c(PlayerAd playerAd, xce xceVar) {
        if (playerAd == null) {
            return false;
        }
        return playerAd.ae() ? xceVar == xce.USER_SKIPPED || xceVar == xce.USER_MUTED : xceVar != xce.VIDEO_ERROR;
    }

    public final void a(apxi apxiVar) {
        if (apxiVar != null) {
            awdy awdyVar = apxiVar.e;
            if (awdyVar == null) {
                awdyVar = awdy.a;
            }
            int N = awxr.N(awdyVar.b);
            if (N == 0 || N != 3) {
                return;
            }
        }
        this.b = apxiVar;
    }

    public final void b(atcf atcfVar) {
        int cL;
        if (atcfVar == null || ((cL = amkq.cL(atcfVar.h)) != 0 && cL == 3)) {
            this.a = atcfVar;
        }
    }

    public final boolean d(apxi apxiVar) {
        if (amkq.b(this.b, apxiVar)) {
            return false;
        }
        this.b = apxiVar;
        return true;
    }

    public final boolean e(atcf atcfVar) {
        if (amkq.b(this.a, atcfVar)) {
            return false;
        }
        this.a = atcfVar;
        return true;
    }
}
