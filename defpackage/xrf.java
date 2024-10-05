package defpackage;

import com.google.protos.youtube.api.innertube.DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand;
import com.google.protos.youtube.api.innertube.ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xrf implements aaha {
    private final xuv a;
    private final /* synthetic */ int b;

    public xrf(xuv xuvVar, int i, byte[] bArr) {
        this.b = i;
        xuvVar.getClass();
        this.a = xuvVar;
    }

    public xrf(xuv xuvVar, int i) {
        this.b = i;
        xuvVar.getClass();
        this.a = xuvVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.b != 0) {
            if (!apxfVar.pY(DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.dismissPostCreationDialogFooterCommand)) {
                zga.b("DismissPostCreationDialogFooterCommandResolver receives an unknown command.");
                return;
            } else {
                this.a.a(amlr.a);
                return;
            }
        }
        if (!apxfVar.pY(ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.showPostCreationDialogFooterCommand)) {
            zga.b("ShowPostCreationDialogFooterCommandResolver receives an unknown command.");
            return;
        }
        ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand = (ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand) apxfVar.pX(ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.showPostCreationDialogFooterCommand);
        if ((showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.b & 1) == 0) {
            zga.b("Executed showPostCreationDialogFooterCommand without renderer.");
            return;
        }
        xuv xuvVar = this.a;
        aulq aulqVar = showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        xuvVar.a(ammv.j(aulqVar));
    }
}
