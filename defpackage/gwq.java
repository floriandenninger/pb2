package defpackage;

import com.google.protos.youtube.api.innertube.ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwq implements aaha {
    private final aahd a;
    private final tfq b;

    public gwq(tfq tfqVar, aahd aahdVar, byte[] bArr, byte[] bArr2) {
        this.a = aahdVar;
        this.b = tfqVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand = (ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand) apxfVar.pX(ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.showAccountLinkDialogFromDeepLinkCommand);
        int i = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.b;
        if ((i & 2) != 0) {
            tfq tfqVar = this.b;
            if (tfqVar.a == showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.d || (i & 1) == 0) {
                return;
            }
            aahd aahdVar = this.a;
            apxf apxfVar2 = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.c;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar.a(apxfVar2);
            this.b.a = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.d;
        }
    }
}
