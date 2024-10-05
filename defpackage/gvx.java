package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AccountUnlinkCommandOuterClass$AccountUnlinkCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvx implements aaha {
    public final rsg a;
    public final aahd b;
    private final ci c;
    private final afsy d;
    private final wcf e;

    public gvx(ci ciVar, rsg rsgVar, wcf wcfVar, afsy afsyVar, aahd aahdVar) {
        this.c = ciVar;
        this.a = rsgVar;
        this.e = wcfVar;
        this.d = afsyVar;
        this.b = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        final apxf apxfVar2;
        apxfVar.getClass();
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) apxfVar.pX(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
        final apxf apxfVar3 = null;
        String str = (accountUnlinkCommandOuterClass$AccountUnlinkCommand.b & 4) != 0 ? accountUnlinkCommandOuterClass$AccountUnlinkCommand.e : null;
        if (!TextUtils.isEmpty(str)) {
            AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand2 = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) apxfVar.pX(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
            final int i = 1;
            if ((accountUnlinkCommandOuterClass$AccountUnlinkCommand2.b & 1) != 0) {
                apxfVar2 = accountUnlinkCommandOuterClass$AccountUnlinkCommand2.c;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
            } else {
                apxfVar2 = null;
            }
            AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand3 = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) apxfVar.pX(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
            if ((accountUnlinkCommandOuterClass$AccountUnlinkCommand3.b & 2) != 0 && (apxfVar3 = accountUnlinkCommandOuterClass$AccountUnlinkCommand3.d) == null) {
                apxfVar3 = apxf.a;
            }
            if (!this.d.t()) {
                this.b.a(apxfVar3);
                this.a.c();
                return;
            }
            try {
                final int i2 = 0;
                ynm.n(this.c, anfq.h(this.a.e.a.a(rsg.a(), this.e.a(this.d.c()), str, 0), rtp.c, angq.a), new zfi(this) { // from class: gvw
                    public final /* synthetic */ gvx a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i == 0) {
                            gvx gvxVar = this.a;
                            gvxVar.b.a(apxfVar3);
                            gvxVar.a.c();
                            return;
                        }
                        gvx gvxVar2 = this.a;
                        apxf apxfVar4 = apxfVar3;
                        zga.d("Error unlinking account", (Throwable) obj);
                        gvxVar2.b.a(apxfVar4);
                        gvxVar2.a.c();
                    }
                }, new zfi(this) { // from class: gvw
                    public final /* synthetic */ gvx a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i2 == 0) {
                            gvx gvxVar = this.a;
                            gvxVar.b.a(apxfVar2);
                            gvxVar.a.c();
                            return;
                        }
                        gvx gvxVar2 = this.a;
                        apxf apxfVar4 = apxfVar2;
                        zga.d("Error unlinking account", (Throwable) obj);
                        gvxVar2.b.a(apxfVar4);
                        gvxVar2.a.c();
                    }
                });
                return;
            } catch (RemoteException | qnk | qnl unused) {
                this.b.a(apxfVar3);
                this.a.c();
                return;
            }
        }
        zga.b("No third party id in AccountUnlinkCommand.");
        this.a.c();
    }
}
