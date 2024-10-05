package defpackage;

import android.text.Spanned;
import android.text.SpannedString;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduk implements aioa {
    final /* synthetic */ adul a;
    private final /* synthetic */ int b;

    public aduk(adul adulVar, int i) {
        this.b = i;
        this.a = adulVar;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        if (this.b == 0) {
            return new ayqx[]{aiocVar.ao().X(new ayrs() { // from class: aduj
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    WatchNextResponseModel watchNextResponseModel;
                    aubs aubsVar;
                    aduk adukVar = aduk.this;
                    ahdv ahdvVar = (ahdv) obj;
                    adul adulVar = adukVar.a;
                    adua b = adulVar.i.b();
                    b.f(ahdvVar.c());
                    adulVar.m(b);
                    if (ahdvVar.c() == aigk.VIDEO_WATCH_LOADED) {
                        adul adulVar2 = adukVar.a;
                        adua b2 = adulVar2.i.b();
                        b2.d = ahdvVar.a();
                        adulVar2.m(b2);
                        adul adulVar3 = adukVar.a;
                        if (!adulVar3.i.l.isEmpty() && (watchNextResponseModel = adulVar3.i.g) != null && (aubsVar = watchNextResponseModel.g) != null) {
                            Iterator it = aubsVar.i.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                aubr aubrVar = (aubr) it.next();
                                if ((aubrVar.b & 1) != 0) {
                                    aubw aubwVar = aubrVar.c;
                                    if (aubwVar == null) {
                                        aubwVar = aubw.a;
                                    }
                                    if (aubwVar.o.equals(adulVar3.i.l)) {
                                        aubw aubwVar2 = aubrVar.c;
                                        if (aubwVar2 == null) {
                                            aubwVar2 = aubw.a;
                                        }
                                        aqyg aqygVar = aubwVar2.c;
                                        if (aqygVar == null) {
                                            aqygVar = aqyg.a;
                                        }
                                        Spanned b3 = ajcq.b(aqygVar);
                                        if (b3 instanceof SpannedString) {
                                            adulVar3.g(b3.toString());
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    adukVar.a.b(5);
                }
            })};
        }
        final byte[] bArr = null;
        return new ayqx[]{aiocVar.G().a.X(new ayrs(bArr) { // from class: adug
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aduk adukVar = aduk.this;
                ahef ahefVar = (ahef) obj;
                adul adulVar = adukVar.a;
                adua b = adulVar.i.b();
                b.h(ahefVar.c());
                adulVar.m(b);
                adukVar.a.b(6);
                aign aignVar = aign.NEW;
                int ordinal = ahefVar.c().ordinal();
                if (ordinal == 0) {
                    adukVar.a.f(0);
                    adukVar.a.g(null);
                    adukVar.a.e("");
                } else if (ordinal == 2 || ordinal == 8) {
                    adukVar.a.f(1);
                    PlayerResponseModel b2 = ahefVar.b();
                    if (b2 != null) {
                        adukVar.a.g(b2.x());
                        adukVar.a.e(b2.y());
                    }
                }
            }
        })};
    }
}
