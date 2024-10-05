package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aitg extends wbs {
    @Override // defpackage.wbs
    public final void G(Deque deque, Attributes attributes) {
        aitc aitcVar = new aitc();
        try {
            Integer.parseInt(attributes.getValue("yt:earliestMediaSequence"));
        } catch (Exception unused) {
        }
        try {
            pgz.h(attributes.getValue("minimumUpdatePeriod"));
        } catch (Exception unused2) {
        }
        deque.push(aitcVar);
    }
}
