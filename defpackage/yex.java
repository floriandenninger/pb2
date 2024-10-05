package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yex implements aaha {
    public final zaw a;
    public final ycs b = new ycs();
    public final acpl c;
    public final aahd d;
    public final aoae e;
    private final Activity f;
    private final aaxn g;

    public yex(Activity activity, aaxn aaxnVar, zaw zawVar, aoae aoaeVar, acpl acplVar, aahd aahdVar, byte[] bArr, byte[] bArr2) {
        this.f = activity;
        this.g = aaxnVar;
        this.a = zawVar;
        this.e = aoaeVar;
        this.c = acplVar;
        this.d = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        arpp arppVar;
        YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand = (YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand) apxfVar.pX(YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.ypcPauseSubscriptionCommand);
        aomf aomfVar = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.d;
        if (aomfVar.H()) {
            arppVar = null;
        } else {
            yey yeyVar = new yey();
            yeyVar.a = aomfVar;
            arpn a = arpp.a();
            awga c = yeyVar.c();
            a.copyOnWrite();
            ((arpp) a.instance).eC(c);
            arppVar = (arpp) a.build();
        }
        aaxn aaxnVar = this.g;
        abee abeeVar = new abee(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        abeeVar.a = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.c;
        if ((ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.b & 4) != 0) {
            long j = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.e;
            if (j > 0) {
                abeeVar.b = j;
                abeeVar.l(apxfVar.c);
                this.b.show(this.f.getFragmentManager(), ycs.a);
                aaxn aaxnVar2 = this.g;
                aaxnVar2.b.e(abeeVar, new yew(this, aomfVar, arppVar));
            }
        }
        abeeVar.b = ((Long) map.get("pause_subscription_resume_time_ms_key")).longValue();
        abeeVar.l(apxfVar.c);
        this.b.show(this.f.getFragmentManager(), ycs.a);
        aaxn aaxnVar22 = this.g;
        aaxnVar22.b.e(abeeVar, new yew(this, aomfVar, arppVar));
    }
}
