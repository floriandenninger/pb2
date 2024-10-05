package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiti extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        deque.pop();
    }

    @Override // defpackage.wbs
    public final void G(Deque deque, Attributes attributes) {
        aitc b = aitp.b(deque);
        if (b == null) {
            return;
        }
        aito aitoVar = new aito(b);
        aitoVar.c = b.a;
        aitoVar.d = Long.parseLong(attributes.getValue("presentationTimeOffset"));
        aitoVar.b = b.b;
        aitoVar.e = Integer.parseInt(attributes.getValue("startNumber"));
        deque.push(aitoVar);
    }
}
