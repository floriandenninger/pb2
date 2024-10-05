package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akjm implements aaha {
    public final Context a;
    public final aahd b;
    public final abde c;
    private final acra d;

    public akjm(Context context, abde abdeVar, aahd aahdVar, acra acraVar, byte[] bArr) {
        this.a = context;
        abdeVar.getClass();
        this.c = abdeVar;
        aahdVar.getClass();
        this.b = aahdVar;
        this.d = acraVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aone createBuilder = aqdt.a.createBuilder();
        aqyg h = ajcq.h(this.a.getString(R.string.publish_and_share_confirm_dialog_title));
        createBuilder.copyOnWrite();
        aqdt aqdtVar = (aqdt) createBuilder.instance;
        h.getClass();
        aqdtVar.c = h;
        aqdtVar.b |= 1;
        createBuilder.ad(ajcq.h(this.a.getString(R.string.publish_and_share_confirm_dialog_body)));
        aone createBuilder2 = apmh.a.createBuilder();
        aong aongVar = (aong) apmg.a.createBuilder();
        aqyg h2 = ajcq.h(this.a.getString(R.string.publish_and_share_confirm_dialog_confirm_button));
        aongVar.copyOnWrite();
        apmg apmgVar = (apmg) aongVar.instance;
        h2.getClass();
        apmgVar.i = h2;
        apmgVar.b |= 256;
        createBuilder2.copyOnWrite();
        apmh apmhVar = (apmh) createBuilder2.instance;
        apmg apmgVar2 = (apmg) aongVar.build();
        apmgVar2.getClass();
        apmhVar.c = apmgVar2;
        apmhVar.b |= 1;
        createBuilder.copyOnWrite();
        aqdt aqdtVar2 = (aqdt) createBuilder.instance;
        apmh apmhVar2 = (apmh) createBuilder2.build();
        apmhVar2.getClass();
        aqdtVar2.h = apmhVar2;
        aqdtVar2.b |= 32;
        aone createBuilder3 = apmh.a.createBuilder();
        aong aongVar2 = (aong) apmg.a.createBuilder();
        aqyg h3 = ajcq.h(this.a.getString(R.string.cancel));
        aongVar2.copyOnWrite();
        apmg apmgVar3 = (apmg) aongVar2.instance;
        h3.getClass();
        apmgVar3.i = h3;
        apmgVar3.b |= 256;
        createBuilder3.copyOnWrite();
        apmh apmhVar3 = (apmh) createBuilder3.instance;
        apmg apmgVar4 = (apmg) aongVar2.build();
        apmgVar4.getClass();
        apmhVar3.c = apmgVar4;
        apmhVar3.b |= 1;
        createBuilder.copyOnWrite();
        aqdt aqdtVar3 = (aqdt) createBuilder.instance;
        apmh apmhVar4 = (apmh) createBuilder3.build();
        apmhVar4.getClass();
        aqdtVar3.i = apmhVar4;
        aqdtVar3.b |= 64;
        ajdf.c(this.a, (aqdt) createBuilder.build(), this.b, this.d, new akjk(this, apxfVar, map), map);
    }
}
