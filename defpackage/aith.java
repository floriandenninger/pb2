package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aith extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        deque.pop();
    }

    @Override // defpackage.wbs
    public final void G(Deque deque, Attributes attributes) {
        long j;
        aitc b = aitp.b(deque);
        if (b == null) {
            return;
        }
        try {
            j = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS").parse(attributes.getValue("yt:segmentIngestTime")).getTime();
        } catch (ParseException unused) {
            j = 0;
        }
        b.a = pgz.h(attributes.getValue("start"));
        b.b = j;
    }
}
