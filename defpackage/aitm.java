package defpackage;

import java.util.Deque;
import java.util.TreeMap;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aitm extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        aitn a = aitp.a(deque, false);
        if (a == null) {
            return;
        }
        if (((dsm) a.a.e.get(Integer.valueOf(a.c))) != null) {
            TreeMap treeMap = a.b.c;
            Integer valueOf = Integer.valueOf(a.c);
            int i = a.c;
            attributes.getValue("media");
            treeMap.put(valueOf, new aite(i));
        }
        a.c++;
    }
}
