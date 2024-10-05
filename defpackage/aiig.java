package defpackage;

import android.os.ConditionVariable;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiig implements ypd {
    final /* synthetic */ aiih a;

    public aiig(aiih aiihVar) {
        this.a = aiihVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        ConditionVariable conditionVariable;
        aowc l;
        ConditionVariable conditionVariable2;
        if (i == -1) {
            return new Class[]{ahef.class, aigr.class};
        }
        if (i != 0) {
            if (i == 1) {
                aiiz aiizVar = this.a.h;
                if (!aifk.w(this.a.b)) {
                    return null;
                }
                if (aiizVar != null) {
                    aiizVar.a();
                }
                aiih aiihVar = this.a;
                if (aiihVar.j == null || (conditionVariable2 = aiihVar.k) == null) {
                    return null;
                }
                conditionVariable2.open();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        ahef ahefVar = (ahef) obj;
        aiiz aiizVar2 = this.a.h;
        PlayerResponseModel b = ahefVar.b();
        if (!aifk.w(this.a.b)) {
            return null;
        }
        if (!ahefVar.c().a(aign.INTERSTITIAL_PLAYING, aign.VIDEO_PLAYING, aign.ENDED)) {
            if (ahefVar.c() != aign.PLAYBACK_INTERRUPTED || b == null || (l = b.l()) == null) {
                return null;
            }
            Iterator it = l.c.iterator();
            while (it.hasNext()) {
                if ((((aowd) it.next()).b & 4) != 0) {
                }
            }
            return null;
        }
        if (aiizVar2 != null) {
            aiizVar2.a();
        }
        aiih aiihVar2 = this.a;
        if (aiihVar2.j == null || (conditionVariable = aiihVar2.k) == null) {
            return null;
        }
        conditionVariable.open();
        return null;
    }
}
