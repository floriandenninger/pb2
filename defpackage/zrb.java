package defpackage;

import android.os.Handler;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.ProcessorBase;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zrb implements ProcessorBase.Callback {
    public final /* synthetic */ zrs a;
    public final /* synthetic */ Effect b;

    public /* synthetic */ zrb(zrs zrsVar, Effect effect) {
        this.a = zrsVar;
        this.b = effect;
    }

    @Override // com.google.research.xeno.effect.ProcessorBase.Callback
    public final void onCompletion(boolean z, String str) {
        zrs zrsVar = this.a;
        Effect effect = this.b;
        if (!z) {
            String valueOf = String.valueOf(str);
            zga.b(valueOf.length() != 0 ? "Error setting Xeno effect. ".concat(valueOf) : new String("Error setting Xeno effect. "));
            String obj = effect.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 58 + String.valueOf(str).length());
            sb.append("VideoEffectPipelineDrishti::setXenoEffect ERROR: ");
            sb.append(obj);
            sb.append(", error: ");
            sb.append(str);
            zrsVar.s(sb.toString());
            return;
        }
        if (effect == null || effect.a() == null) {
            return;
        }
        boolean z2 = zrsVar.b;
        int intValue = effect.a().intValue();
        Handler handler = zrsVar.i.b;
        handler.sendMessage(handler.obtainMessage(12, Integer.valueOf(intValue + (!z2 ? 1 : 0))));
        String valueOf2 = String.valueOf(effect.toString());
        zrsVar.s(valueOf2.length() != 0 ? "VideoEffectPipelineDrishti::setXenoEffect SUCCESS: ".concat(valueOf2) : new String("VideoEffectPipelineDrishti::setXenoEffect SUCCESS: "));
    }
}
