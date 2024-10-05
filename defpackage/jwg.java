package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwg implements agyq {
    private final Activity a;
    private final Context b;
    private final aahd c;
    private final agxh d;
    private final ajdh e;
    private final trp f;

    public jwg(Activity activity, Context context, aahd aahdVar, agxh agxhVar, trp trpVar, ajdh ajdhVar, byte[] bArr, byte[] bArr2) {
        this.a = activity;
        this.b = context;
        this.c = aahdVar;
        this.d = agxhVar;
        this.f = trpVar;
        this.e = ajdhVar;
    }

    @Override // defpackage.agyq
    public final void a(Object obj, acra acraVar, Pair pair, agzm agzmVar) {
        ajde jwfVar;
        if (this.a.isFinishing()) {
            return;
        }
        if (!(obj instanceof aqdt) || acraVar == null) {
            if (!(obj instanceof aqkv) || acraVar == null) {
                this.d.a(obj, acraVar, pair, null);
                return;
            }
            aqkv aqkvVar = (aqkv) obj;
            trp trpVar = this.f;
            aone createBuilder = aqdt.a.createBuilder();
            if ((aqkvVar.b & 2) != 0) {
                aqyg g = ajcq.g(aqkvVar.d);
                createBuilder.copyOnWrite();
                aqdt aqdtVar = (aqdt) createBuilder.instance;
                g.getClass();
                aqdtVar.c = g;
                aqdtVar.b |= 1;
            }
            if ((aqkvVar.b & 4) == 0) {
                if (!aqkvVar.f.isEmpty()) {
                    aony aonyVar = aqkvVar.f;
                    createBuilder.copyOnWrite();
                    aqdt aqdtVar2 = (aqdt) createBuilder.instance;
                    aqdtVar2.a();
                    aolo.addAll((Iterable) aonyVar, (List) aqdtVar2.g);
                }
            } else {
                createBuilder.ad(ajcq.g(aqkvVar.e));
            }
            arfs arfsVar = aqkvVar.c;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            createBuilder.copyOnWrite();
            aqdt aqdtVar3 = (aqdt) createBuilder.instance;
            arfsVar.getClass();
            aqdtVar3.e = arfsVar;
            aqdtVar3.b |= 8;
            aomf aomfVar = aqkvVar.h;
            createBuilder.copyOnWrite();
            aqdt aqdtVar4 = (aqdt) createBuilder.instance;
            aomfVar.getClass();
            aqdtVar4.b |= 262144;
            aqdtVar4.n = aomfVar;
            aota aotaVar = aqkvVar.g;
            if (aotaVar == null) {
                aotaVar = aota.a;
            }
            createBuilder.copyOnWrite();
            aqdt aqdtVar5 = (aqdt) createBuilder.instance;
            aotaVar.getClass();
            aqdtVar5.j = aotaVar;
            aqdtVar5.b |= 1024;
            apmh g2 = trp.g(trpVar.a.getResources().getText(R.string.dismiss).toString());
            createBuilder.copyOnWrite();
            aqdt aqdtVar6 = (aqdt) createBuilder.instance;
            g2.getClass();
            aqdtVar6.i = g2;
            aqdtVar6.b |= 64;
            if (pair != null) {
                apmh g3 = trp.g((String) pair.first);
                createBuilder.copyOnWrite();
                aqdt aqdtVar7 = (aqdt) createBuilder.instance;
                g3.getClass();
                aqdtVar7.h = g3;
                aqdtVar7.b |= 32;
            }
            aqdt aqdtVar8 = (aqdt) createBuilder.build();
            Context context = this.b;
            aahd aahdVar = this.c;
            ajdh ajdhVar = this.e;
            if (pair != null) {
                jwfVar = new jwe(pair);
            } else {
                jwfVar = new jwf(0);
            }
            ajdf.p(context, aqdtVar8, aahdVar, acraVar, ajdhVar, jwfVar, null);
            return;
        }
        ajdf.p(this.b, (aqdt) obj, this.c, acraVar, this.e, new jwf(1), null);
    }
}
