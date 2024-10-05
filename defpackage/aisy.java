package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisy extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        aitz aitzVar = (aitz) deque.peekFirst();
        if (aitzVar == null) {
            return;
        }
        int p = ahbx.p(attributes, 0, "w", "win");
        String s = ahbx.s(attributes, "t", "start");
        if (s == null) {
            return;
        }
        int parseInt = Integer.parseInt(s);
        int p2 = ahbx.p(attributes, 0, "d", "dur");
        String replaceAll = str.replaceAll("\n", "<br/>");
        if (ahbx.s(attributes, "append") == null) {
            aitzVar.c(p, replaceAll, parseInt, p2 + parseInt);
        } else {
            aitzVar.b(p).c(replaceAll, parseInt, p2 + parseInt);
        }
    }
}
