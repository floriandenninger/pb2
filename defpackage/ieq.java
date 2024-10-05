package defpackage;

import com.google.protos.youtube.api.innertube.DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ieq implements aaha {
    private final ino a;

    public ieq(ino inoVar) {
        this.a = inoVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Optional empty;
        amkq.E(apxfVar.pY(DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.dismissBrowseElementsBottomSheetCommand));
        DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand = (DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand) apxfVar.pX(DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.dismissBrowseElementsBottomSheetCommand);
        ino inoVar = this.a;
        if ((dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.b & 1) != 0) {
            apxf apxfVar2 = dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.c;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            empty = Optional.of(apxfVar2);
        } else {
            empty = Optional.empty();
        }
        inoVar.f = empty;
        inoVar.d.qc();
        inoVar.z();
    }
}
