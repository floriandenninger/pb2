package defpackage;

import com.google.protos.youtube.api.innertube.DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iex implements aaha {
    private final inp a;

    public iex(inp inpVar) {
        this.a = inpVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Optional empty;
        amkq.E(apxfVar.pY(DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.dismissSfvElementsBottomSheetCommand));
        DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand = (DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand) apxfVar.pX(DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.dismissSfvElementsBottomSheetCommand);
        inp inpVar = this.a;
        if ((dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.b & 2) != 0) {
            apxf apxfVar2 = dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.c;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            empty = Optional.of(apxfVar2);
        } else {
            empty = Optional.empty();
        }
        inpVar.h = empty;
        inpVar.z();
    }
}
