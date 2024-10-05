package defpackage;

import com.google.android.libraries.youtube.comment.endpoint.ChangeCommentsMarkersVisibilityCommandHelper;
import com.google.protos.youtube.api.innertube.ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand;
import com.google.protos.youtube.api.innertube.ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand;
import com.google.protos.youtube.api.innertube.ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqo implements aaha {
    private final ChangeCommentsMarkersVisibilityCommandHelper a;
    private final /* synthetic */ int b;

    public xqo(ChangeCommentsMarkersVisibilityCommandHelper changeCommentsMarkersVisibilityCommandHelper, int i) {
        this.b = i;
        this.a = changeCommentsMarkersVisibilityCommandHelper;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        int dD;
        boolean z = false;
        if (this.b == 0) {
            ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand = (ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand) apxfVar.pX(ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.changeCommentsSortModeCommand);
            ChangeCommentsMarkersVisibilityCommandHelper changeCommentsMarkersVisibilityCommandHelper = this.a;
            if ((changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.b & 1) != 0 && (dD = amkq.dD(changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.c)) != 0 && dD == 3) {
                z = true;
            }
            changeCommentsMarkersVisibilityCommandHelper.b = z;
            return;
        }
        ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand = (ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand) apxfVar.pX(ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.changeCommentsMarkersVisibilityCommand);
        int i = changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.b;
        String str = (i & 2) != 0 ? changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.d : null;
        ChangeCommentsMarkersVisibilityCommandHelper changeCommentsMarkersVisibilityCommandHelper2 = this.a;
        if ((i & 1) != 0 && changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.c) {
            z = true;
        }
        if (!z || changeCommentsMarkersVisibilityCommandHelper2.b) {
            aong aongVar = (aong) apxf.a.createBuilder();
            aonk aonkVar = ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.changeKeyedMarkersVisibilityCommand;
            aone createBuilder = ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.a.createBuilder();
            createBuilder.copyOnWrite();
            ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand = (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand) createBuilder.instance;
            changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.b = 1 | changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.b;
            changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.c = z;
            if (str == null) {
                str = "COMMENTS_MARKERS_KEY";
            }
            createBuilder.copyOnWrite();
            ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand2 = (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand) createBuilder.instance;
            changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand2.b |= 2;
            changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand2.d = str;
            aongVar.e(aonkVar, (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand) createBuilder.build());
            ((aahd) changeCommentsMarkersVisibilityCommandHelper2.a.get()).a((apxf) aongVar.build());
        }
    }
}
