package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatAction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abiz {
    private LiveChatAction.MarkChatItemAsDeletedAction a;
    private LiveChatAction.MarkChatItemsByAuthorAsDeletedAction b;

    public abiz(apxf apxfVar) {
        if (apxfVar == null) {
            return;
        }
        if (apxfVar.pY(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
            this.a = (LiveChatAction.MarkChatItemAsDeletedAction) apxfVar.pX(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
        } else if (apxfVar.pY(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
            this.b = (LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) apxfVar.pX(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
        }
    }

    public final aqyg a() {
        LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = this.a;
        if (markChatItemAsDeletedAction != null) {
            aqyg aqygVar = markChatItemAsDeletedAction.c;
            return aqygVar == null ? aqyg.a : aqygVar;
        }
        LiveChatAction.MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = this.b;
        if (markChatItemsByAuthorAsDeletedAction == null) {
            return null;
        }
        aqyg aqygVar2 = markChatItemsByAuthorAsDeletedAction.c;
        return aqygVar2 == null ? aqyg.a : aqygVar2;
    }

    public final aqyg b() {
        LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = this.a;
        if (markChatItemAsDeletedAction != null) {
            aqyg aqygVar = markChatItemAsDeletedAction.d;
            return aqygVar == null ? aqyg.a : aqygVar;
        }
        LiveChatAction.MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = this.b;
        if (markChatItemsByAuthorAsDeletedAction == null) {
            return null;
        }
        aqyg aqygVar2 = markChatItemsByAuthorAsDeletedAction.d;
        return aqygVar2 == null ? aqyg.a : aqygVar2;
    }

    public final boolean c() {
        return (this.a == null && this.b == null) ? false : true;
    }

    public abiz(Object obj) {
        this(obj instanceof apxf ? (apxf) obj : null);
    }
}
