package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevi implements bae {
    private final aetw a;

    public aevi(aetw aetwVar) {
        this.a = aetwVar;
    }

    @Override // defpackage.bae
    public final synchronized List a(String str, boolean z, boolean z2) {
        PlayerConfigModel playerConfigModel;
        aezh aezhVar;
        baa L;
        aezf aezfVar = this.a.n;
        if (aezfVar != null) {
            playerConfigModel = aezfVar.a();
            aezhVar = aezfVar.f();
        } else {
            playerConfigModel = PlayerConfigModel.b;
            aezhVar = null;
        }
        Set X = (aezhVar == null || aezhVar.e != 3) ? amvs.a : playerConfigModel.X();
        afdt afdtVar = this.a.c;
        aeev aeevVar = aeev.NONE;
        if (afdtVar.a && psz.l(str)) {
            aeevVar = afdtVar.f;
        }
        L = adyu.L(str, z, playerConfigModel.W(), X, aeevVar.d);
        return L == null ? amru.q() : amru.r(L);
    }
}
