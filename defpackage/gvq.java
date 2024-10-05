package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.youtube.api.innertube.AccountLinkCommandOuterClass$AccountLinkCommand;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvq implements aaha {
    public final aahd a;
    private final ci b;
    private final gwg c;

    public gvq(ci ciVar, gwg gwgVar, aahd aahdVar) {
        this.b = ciVar;
        this.c = gwgVar;
        this.a = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        final apxf apxfVar2;
        anhy anhyVar;
        apxfVar.getClass();
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = (AccountLinkCommandOuterClass$AccountLinkCommand) apxfVar.pX(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
        final apxf apxfVar3 = null;
        String str = (accountLinkCommandOuterClass$AccountLinkCommand.b & 4) != 0 ? accountLinkCommandOuterClass$AccountLinkCommand.e : null;
        if (!TextUtils.isEmpty(str)) {
            aony aonyVar = ((AccountLinkCommandOuterClass$AccountLinkCommand) apxfVar.pX(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand)).f;
            AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand2 = (AccountLinkCommandOuterClass$AccountLinkCommand) apxfVar.pX(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
            if ((accountLinkCommandOuterClass$AccountLinkCommand2.b & 1) != 0) {
                apxfVar2 = accountLinkCommandOuterClass$AccountLinkCommand2.c;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
            } else {
                apxfVar2 = null;
            }
            AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand3 = (AccountLinkCommandOuterClass$AccountLinkCommand) apxfVar.pX(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
            if ((accountLinkCommandOuterClass$AccountLinkCommand3.b & 2) != 0 && (apxfVar3 = accountLinkCommandOuterClass$AccountLinkCommand3.d) == null) {
                apxfVar3 = apxf.a;
            }
            ci ciVar = this.b;
            gwg gwgVar = this.c;
            SettableFuture settableFuture = gwgVar.c;
            if (settableFuture != null) {
                settableFuture.cancel(true);
                anhyVar = anaf.M();
            } else {
                gwgVar.c = SettableFuture.f();
                Intent intent = new Intent(ciVar, (Class<?>) GalFlowActivity.class);
                intent.putExtra("thirdPartyId", str);
                if (!aonyVar.isEmpty()) {
                    intent.putStringArrayListExtra("galCapabilities", new ArrayList<>(aonyVar));
                }
                ciVar.startActivity(intent);
                anhyVar = gwgVar.c;
            }
            ynm.n(ciVar, anhyVar, new zfi() { // from class: gvo
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    gvq gvqVar = gvq.this;
                    apxf apxfVar4 = apxfVar3;
                    zga.d("Unable to link account.", (Throwable) obj);
                    gvqVar.a.a(apxfVar4);
                }
            }, new zfi() { // from class: gvp
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    gvq gvqVar = gvq.this;
                    apxf apxfVar4 = apxfVar2;
                    apxf apxfVar5 = apxfVar3;
                    gwf gwfVar = (gwf) obj;
                    if (gwfVar == gwf.SUCCESS) {
                        gvqVar.a.a(apxfVar4);
                    } else if (gwfVar == gwf.ERROR) {
                        gvqVar.a.a(apxfVar5);
                    }
                }
            });
            return;
        }
        zga.b("No third party id in AccountLinkCommand.");
    }
}
