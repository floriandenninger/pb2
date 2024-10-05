package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class yty {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public yty(String str) {
        this.a = String.valueOf(str).concat(" gzip");
    }

    protected abstract boolean a(String str);

    public final void b(UrlRequest.Builder builder, Collection collection) {
        Iterator it = collection.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (a(str)) {
                builder.addHeader(str, (String) entry.getValue());
            }
            if (z && "User-Agent".equals(str)) {
                z = false;
            }
        }
        if (z) {
            builder.addHeader("User-Agent", this.a);
        }
    }
}
