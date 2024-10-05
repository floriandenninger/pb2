package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisv extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        aiuf aiufVar;
        aiub aiubVar = (aiub) deque.peekFirst();
        if (aiubVar == null) {
            return;
        }
        int p = ahbx.p(attributes, 0, "wp");
        if (p != 0) {
            aiufVar = new aiuf(aiubVar.e(p));
        } else {
            aiufVar = new aiuf();
        }
        aiufVar.b = ahbx.p(attributes, 0, "id");
        aiufVar.c = ahbx.o(ahbx.p(attributes, 7, "ap"));
        aiufVar.d = ahbx.p(attributes, 100, "av");
        aiufVar.e = ahbx.p(attributes, 50, "ah");
        aiufVar.f = ahbx.p(attributes, 0, "rc");
        aiufVar.g = ahbx.p(attributes, 0, "cc");
        aiubVar.c.put(Integer.valueOf(aiufVar.b), aiufVar);
    }
}
