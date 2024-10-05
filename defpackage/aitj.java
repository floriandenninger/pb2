package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aitj extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        Object peek = deque.peek();
        aito aitoVar = null;
        if (peek != null && peek.getClass() == aito.class) {
            aitoVar = (aito) peek;
        }
        if (aitoVar == null) {
            return;
        }
        long parseLong = Long.parseLong(attributes.getValue("d"));
        aitoVar.b += attributes.getValue("yt:sid") != null ? Long.parseLong(attributes.getValue("yt:sid")) : 0L;
        aitc aitcVar = aitoVar.a;
        dsm dsmVar = new dsm(aitoVar.e);
        aitcVar.e.put(Integer.valueOf(dsmVar.c), dsmVar);
        aitoVar.b += parseLong;
        aitoVar.c += parseLong;
        aitoVar.d += parseLong;
        aitoVar.e++;
    }
}
