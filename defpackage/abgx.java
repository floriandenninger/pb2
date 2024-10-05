package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abgx implements Runnable {
    final /* synthetic */ apxf a;
    final /* synthetic */ abha b;

    public abgx(abha abhaVar, apxf apxfVar) {
        this.b = abhaVar;
        this.a = apxfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.pY(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
            abgy abgyVar = (abgy) this.b.c.get(((LiveChatAction.MarkChatItemAsDeletedAction) this.a.pX(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)).e);
            if (abgyVar != null) {
                Object obj = abgyVar.a;
                if ((obj instanceof asrp) || (obj instanceof asrm) || (this.b.e.q() && (abgyVar.a instanceof asro))) {
                    this.b.a.removeCallbacks(abgyVar);
                    abgyVar.run();
                    return;
                } else {
                    abgyVar.d = this.a;
                    ajpd ajpdVar = this.b.b;
                    Object obj2 = abgyVar.a;
                    ajpdVar.o(obj2, obj2);
                    return;
                }
            }
            return;
        }
        if (this.a.pY(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
            String str = ((LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) this.a.pX(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)).e;
            ArrayList arrayList = new ArrayList();
            for (abgy abgyVar2 : this.b.c.values()) {
                if (TextUtils.equals(str, abgk.k(abgyVar2.a))) {
                    Object obj3 = abgyVar2.a;
                    if (!(obj3 instanceof asrp) && !(obj3 instanceof asrm) && (!this.b.e.q() || !(abgyVar2.a instanceof asro))) {
                        abgyVar2.d = this.a;
                        ajpd ajpdVar2 = this.b.b;
                        Object obj4 = abgyVar2.a;
                        ajpdVar2.o(obj4, obj4);
                    } else {
                        arrayList.add(abgyVar2);
                    }
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                abgy abgyVar3 = (abgy) arrayList.get(i);
                this.b.a.removeCallbacks(abgyVar3);
                abgyVar3.run();
            }
        }
    }
}
