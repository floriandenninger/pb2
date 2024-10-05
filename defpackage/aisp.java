package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisp extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        if ("3".equals(attributes.getValue("format"))) {
            aiub aiubVar = (aiub) deque.peekFirst();
            if (aiubVar == null) {
                return;
            }
            aiuc aiucVar = aiubVar.f;
            if (aiucVar != null) {
                aiubVar.g(aiucVar);
            }
        }
        deque.pollFirst();
    }

    @Override // defpackage.wbs
    public final void G(Deque deque, Attributes attributes) {
        if ("3".equals(attributes.getValue("format"))) {
            deque.offerFirst(new aiub());
        } else {
            deque.offerFirst(new aitz());
        }
    }
}
