package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abgv extends abgg {
    public final Handler c;
    public final Queue d;
    public long e;
    public long f;
    private long g;
    private final Runnable h;

    public abgv(Handler handler, abge abgeVar, abgd abgdVar) {
        super(abgeVar, abgdVar);
        this.d = new ArrayDeque();
        this.e = 224L;
        this.h = new abgt(this);
        this.c = handler;
    }

    @Override // defpackage.abgg
    public void a(List list, long j) {
        abgk abgkVar = ((abht) this.a).b;
        if (abgkVar == null || abgkVar.a() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            String str = null;
            while (it.hasNext()) {
                apxf apxfVar = (apxf) it.next();
                if (apxfVar.pY(LiveChatAction.AddChatItemAction.addChatItemAction)) {
                    LiveChatAction.AddChatItemAction addChatItemAction = (LiveChatAction.AddChatItemAction) apxfVar.pX(LiveChatAction.AddChatItemAction.addChatItemAction);
                    if (addChatItemAction.d.isEmpty()) {
                        aspl asplVar = addChatItemAction.c;
                        if (asplVar == null) {
                            asplVar = aspl.a;
                        }
                        str = abgk.l(asplVar);
                    } else {
                        str = addChatItemAction.d;
                    }
                } else if (!apxfVar.pY(LiveChatAction.AddLiveChatTextMessageFromTemplateAction.addLiveChatTextMessageFromTemplateAction)) {
                    if (apxfVar.pY(LiveChatAction.RemoveChatItemAction.removeChatItemAction)) {
                        str = ((LiveChatAction.RemoveChatItemAction) apxfVar.pX(LiveChatAction.RemoveChatItemAction.removeChatItemAction)).b;
                    } else if (apxfVar.pY(LiveChatAction.AddLiveChatTickerItemAction.addLiveChatTickerItemAction)) {
                        asrn asrnVar = ((LiveChatAction.AddLiveChatTickerItemAction) apxfVar.pX(LiveChatAction.AddLiveChatTickerItemAction.addLiveChatTickerItemAction)).c;
                        if (asrnVar == null) {
                            asrnVar = asrn.a;
                        }
                        int i = asrnVar.b;
                        if (i == 132600952) {
                            str = ((asro) asrnVar.c).c;
                        } else if (i == 132600924) {
                            str = ((asrp) asrnVar.c).c;
                        } else {
                            str = i == 201730354 ? ((asrm) asrnVar.c).b : null;
                        }
                    } else if (apxfVar.pY(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
                        str = ((LiveChatAction.MarkChatItemAsDeletedAction) apxfVar.pX(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)).e;
                    } else {
                        apxfVar.pY(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
                    }
                }
                abgu abguVar = (abgu) linkedHashMap.get(str);
                if (abguVar == null) {
                    abguVar = new abgu(new ArrayList());
                    linkedHashMap.put(str, abguVar);
                }
                abguVar.a.add(apxfVar);
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                this.d.add((abgu) ((Map.Entry) it2.next()).getValue());
            }
            if (j == 0) {
                j = 500;
            }
            int size = this.d.size();
            if (size > 0) {
                long max = Math.max(1L, ((j + 15) / size) / 16);
                long min = Math.min(Math.max(7L, max), 30L);
                this.f = Math.max(1L, (long) Math.ceil(min / max));
                this.e = min * 16;
                abgd abgdVar = this.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis >= this.g) {
                    abjp abjpVar = ((abht) abgdVar).e;
                    if (abjpVar != null) {
                        abjpVar.g(max >= 14);
                    }
                    this.g = currentTimeMillis + 60000;
                }
                if (size == linkedHashMap.size()) {
                    this.c.post(this.h);
                    return;
                }
                return;
            }
            return;
        }
        this.b.a(list, this.a, false);
        abgkVar.v();
    }

    public final void h(abgu abguVar) {
        this.b.a(abguVar.a, this.a, true);
    }

    @Override // defpackage.abgg, defpackage.abqd
    public void mU() {
        this.c.removeCallbacks(this.h);
        while (!this.d.isEmpty()) {
            h((abgu) this.d.remove());
        }
    }

    @Override // defpackage.abgg, defpackage.abqd
    public void mW() {
        this.g = 0L;
    }

    @Override // defpackage.abgg, defpackage.abqd
    public void mX() {
        this.c.removeCallbacks(this.h);
        this.d.clear();
    }
}
