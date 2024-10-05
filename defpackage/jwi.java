package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwi extends agxo {
    private final jws f;
    private final agys g;
    private final jup h;
    private final axzf i;

    public jwi(Activity activity, afsy afsyVar, agof agofVar, aftn aftnVar, zaw zawVar, ysy ysyVar, agsg agsgVar, agzk agzkVar, agys agysVar, agyq agyqVar, zbi zbiVar, jws jwsVar, agsm agsmVar, agel agelVar, agzr agzrVar, jup jupVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(activity, afsyVar, agofVar, aftnVar, zawVar, ysyVar, agsgVar, agzkVar, agysVar, agyqVar, zbiVar, agsmVar, agelVar, agzrVar, new agya(agofVar, agzrVar));
        this.f = jwsVar;
        this.g = agysVar;
        this.h = jupVar;
        this.i = axzfVar;
    }

    @Override // defpackage.agxo, defpackage.agyr
    public final void a(String str, agyg agygVar) {
        super.a(str, agygVar);
        if (agygVar.a) {
            return;
        }
        this.f.d(R.string.offline_actions_playlist_deleted_snackbar_text);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agxo
    public final void b(final String str, final atsb atsbVar, final acra acraVar, atom atomVar) {
        atrx u;
        atol atolVar;
        byte[] bArr;
        atrx atrxVar;
        final byte[] I = (atsbVar.b & 128) != 0 ? atsbVar.i.I() : aaef.b;
        this.h.k(atomVar);
        if (this.h.m(atsbVar, atomVar)) {
            this.g.e(atsbVar, acraVar, new agzo() { // from class: jwh
                @Override // defpackage.agzo
                public final void a(atrx atrxVar2, atol atolVar2) {
                    jwi jwiVar = jwi.this;
                    atsb atsbVar2 = atsbVar;
                    acra acraVar2 = acraVar;
                    String str2 = str;
                    byte[] bArr2 = I;
                    ahbj.k(atsbVar2, acraVar2, null, str2, atrxVar2, false, agno.OFFLINE_IMMEDIATELY, atolVar2);
                    jwiVar.k(str2, atrxVar2, agno.OFFLINE_IMMEDIATELY, bArr2);
                }
            }, str);
            return;
        }
        if (this.i.h().booleanValue()) {
            atrxVar = (atrx) Optional.ofNullable(atomVar).filter(ghv.t).map(iur.t).orElse(this.h.v(atrx.UNKNOWN_FORMAT_TYPE));
            fav.I(Optional.ofNullable(atomVar), atrxVar, atsbVar, acraVar, Optional.empty(), Optional.of(str));
            bArr = I;
        } else {
            if (atomVar == null || (atomVar.b & 1) == 0) {
                u = this.h.u();
            } else {
                u = atrx.b(atomVar.c);
                if (u == null) {
                    u = atrx.UNKNOWN_FORMAT_TYPE;
                }
            }
            agno agnoVar = agno.OFFLINE_IMMEDIATELY;
            if (atomVar == null || (atomVar.b & 2) == 0) {
                atolVar = null;
            } else {
                atolVar = atol.b(atomVar.d);
                if (atolVar == null) {
                    atolVar = atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
                }
            }
            bArr = I;
            ahbj.k(atsbVar, acraVar, null, str, u, true, agnoVar, atolVar);
            atrxVar = u;
        }
        k(str, atrxVar, agno.OFFLINE_IMMEDIATELY, bArr);
    }

    @Override // defpackage.agxo
    public final void c(int i) {
        jws jwsVar = this.f;
        jwsVar.b.o(jwsVar.a(i).b());
    }
}
