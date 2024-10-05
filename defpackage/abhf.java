package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AddBannerToLiveChatCommandOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.LiveChatBannerRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatItemRenderer;
import com.google.protos.youtube.api.innertube.RemoveBannerFromLiveChatCommandOuterClass;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abhf implements abgi, abgh {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final ArrayDeque b = new ArrayDeque();
    public abgh c;
    public asot d;
    public boolean e;
    private final Handler f;

    public abhf(Handler handler) {
        this.f = handler;
    }

    private final asps d() {
        asot asotVar = this.d;
        if (asotVar == null || (asotVar.b & 4) == 0) {
            return null;
        }
        aulq aulqVar = asotVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(LiveChatItemRenderer.liveChatTextMessageRenderer)) {
            return null;
        }
        aulq aulqVar2 = this.d.e;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (asps) aulqVar2.pX(LiveChatItemRenderer.liveChatTextMessageRenderer);
    }

    private final void f(final asot asotVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final abnz abnzVar = (abnz) it.next();
            this.f.post(new Runnable() { // from class: abhe
                @Override // java.lang.Runnable
                public final void run() {
                    abnz.this.e(asotVar);
                }
            });
        }
        this.d = asotVar;
        this.e = false;
    }

    @Override // defpackage.abgi
    public final void a(final apxf apxfVar) {
        boolean equals;
        asot asotVar;
        if (apxfVar.pY(AddBannerToLiveChatCommandOuterClass.addBannerToLiveChatCommand)) {
            aulq aulqVar = ((aozj) apxfVar.pX(AddBannerToLiveChatCommandOuterClass.addBannerToLiveChatCommand)).b;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (!aulqVar.pY(LiveChatBannerRendererOuterClass.liveChatBannerRenderer) || (asotVar = (asot) aulqVar.pX(LiveChatBannerRendererOuterClass.liveChatBannerRenderer)) == null) {
                return;
            }
            if (!asotVar.j) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    asot asotVar2 = (asot) it.next();
                    if (!asotVar2.j) {
                        arrayList.add(asotVar2);
                    }
                }
                this.b.removeAll(arrayList);
            }
            this.b.addFirst(asotVar);
            f(asotVar);
            return;
        }
        if (!apxfVar.pY(RemoveBannerFromLiveChatCommandOuterClass.removeBannerForLiveChatCommand) || this.d == null) {
            if (apxfVar.pY(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction) || apxfVar.pY(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
                if (apxfVar.pY(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
                    LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = (LiveChatAction.MarkChatItemAsDeletedAction) apxfVar.pX(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
                    asps d = d();
                    if (d == null) {
                        return;
                    } else {
                        equals = TextUtils.equals((markChatItemAsDeletedAction.b & 4) != 0 ? markChatItemAsDeletedAction.e : null, (d.b & 1) != 0 ? d.c : null);
                    }
                } else {
                    if (!apxfVar.pY(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
                        return;
                    }
                    LiveChatAction.MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = (LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) apxfVar.pX(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
                    asps d2 = d();
                    if (d2 == null) {
                        return;
                    } else {
                        equals = TextUtils.equals((markChatItemsByAuthorAsDeletedAction.b & 4) != 0 ? markChatItemsByAuthorAsDeletedAction.e : null, (d2.b & 8) != 0 ? d2.f : null);
                    }
                }
                if (equals) {
                    this.e = true;
                    Iterator it2 = this.a.iterator();
                    while (it2.hasNext()) {
                        final abnz abnzVar = (abnz) it2.next();
                        this.f.post(new Runnable() { // from class: abhd
                            @Override // java.lang.Runnable
                            public final void run() {
                                abnz abnzVar2 = abnz.this;
                                apxf apxfVar2 = apxfVar;
                                if (abnzVar2.p) {
                                    abnzVar2.f.removeAllViews();
                                    abnzVar2.j.f("live_chat_item_action", apxfVar2);
                                    abnzVar2.j(abnzVar2.m);
                                    abnzVar2.h();
                                }
                            }
                        });
                    }
                    return;
                }
                return;
            }
            return;
        }
        c(((auln) apxfVar.pX(RemoveBannerFromLiveChatCommandOuterClass.removeBannerForLiveChatCommand)).b);
    }

    public final void b(abnz abnzVar) {
        abnzVar.l = this;
        this.a.add(abnzVar);
        asot asotVar = this.d;
        if (asotVar == null || this.e) {
            return;
        }
        abnzVar.e(asotVar);
    }

    public final void c(String str) {
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                asot asotVar = (asot) it.next();
                if (TextUtils.equals(asotVar.c, str)) {
                    arrayList.add(asotVar);
                }
            }
            this.b.removeAll(arrayList);
            if (this.b.isEmpty()) {
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    abnz abnzVar = (abnz) it2.next();
                    Handler handler = this.f;
                    abnzVar.getClass();
                    handler.post(new abnw(abnzVar, 1));
                }
                this.d = null;
                return;
            }
            if (this.d.equals(this.b.peekFirst())) {
                return;
            }
            f((asot) this.b.peekFirst());
        }
    }

    @Override // defpackage.abgh
    public final void e() {
        abgh abghVar = this.c;
        if (abghVar != null) {
            ntb ntbVar = (ntb) abghVar;
            ntbVar.k = true;
            ntbVar.i();
        }
    }
}
