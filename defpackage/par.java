package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class par {
    public final long a;
    public final List b;

    public par(long j, List list, byte[] bArr) {
        this.a = j;
        this.b = list;
    }

    public par(List list) {
        List emptyList = Collections.emptyList();
        this.a = 0L;
        this.b = Collections.unmodifiableList(list);
        Collections.unmodifiableList(emptyList);
    }

    public par(long j, List list) {
        this.a = j;
        this.b = Collections.unmodifiableList(list);
    }
}
