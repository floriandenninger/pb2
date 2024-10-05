package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfd extends mel implements wmy {
    public mfd(ajjz ajjzVar, ajuw ajuwVar, aahd aahdVar, acra acraVar, Context context, aabq aabqVar, met metVar) {
        super(ajjzVar, ajuwVar, aahdVar, acraVar, context, aabqVar, metVar);
    }

    @Override // defpackage.wmy
    public final boolean g(String str, PlayerResponseModel playerResponseModel, ashd ashdVar) {
        auta autaVar = null;
        aryr aryrVar = playerResponseModel != null ? playerResponseModel.a : null;
        if (aryrVar == null) {
            return false;
        }
        atyh atyhVar = aryrVar.A;
        if (atyhVar == null) {
            atyhVar = atyh.a;
        }
        if (atyhVar.b == 114449537) {
            atyh atyhVar2 = aryrVar.A;
            if (atyhVar2 == null) {
                atyhVar2 = atyh.a;
            }
            if (atyhVar2.b == 114449537) {
                autaVar = (auta) atyhVar2.c;
            } else {
                autaVar = auta.a;
            }
        }
        this.f = autaVar;
        auta autaVar2 = this.f;
        return autaVar2 != null && autaVar2.f.size() > 0;
    }

    @Override // defpackage.wmz
    public final void h(xad xadVar) {
    }
}
