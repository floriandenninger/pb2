package defpackage;

import com.google.protos.youtube.api.innertube.CommentShareboxRenderer;
import com.google.protos.youtube.api.innertube.ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ife implements aaha {
    public final fma a;
    public final ili b;
    private final xoh c;

    public ife(xoh xohVar, fma fmaVar, ili iliVar) {
        this.c = xohVar;
        this.a = fmaVar;
        this.b = iliVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.showCommentSimpleboxCommand)) {
            aulq aulqVar = ((ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand) apxfVar.pX(ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.showCommentSimpleboxCommand)).b;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aqab aqabVar = (aqab) aulqVar.pX(CommentShareboxRenderer.commentSimpleboxRenderer);
            this.c.h = new ifd(this);
            this.c.f(aqabVar, null);
        }
    }
}
