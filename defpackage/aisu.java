package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisu extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        aiub aiubVar = (aiub) deque.peekFirst();
        if (aiubVar == null) {
            return;
        }
        aiue aiueVar = new aiue();
        aiueVar.b = ahbx.p(attributes, 0, "id");
        aiueVar.g = aiubVar.c(ahbx.p(attributes, 0, "p"));
        aiueVar.c = ahbx.r(attributes, 0L, "t");
        aiueVar.d = ahbx.r(attributes, Long.MAX_VALUE, "d");
        aiueVar.e = aiubVar.e(ahbx.p(attributes, 0, "wp"));
        aiueVar.f = aiubVar.f(ahbx.p(attributes, 0, "ws"));
        aiueVar.h = ahbx.p(attributes, 0, "rc");
        aiueVar.i = ahbx.p(attributes, 0, "cc");
        aiubVar.d.put(Integer.valueOf(aiueVar.b), aiueVar);
    }
}
