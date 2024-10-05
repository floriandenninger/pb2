package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfg {
    public long a;
    public final List b = new ArrayList();

    public final String toString() {
        long j = this.a;
        int size = this.b.size();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
        sb.append("SampleEntry{sampleDelta=");
        sb.append(j);
        sb.append(", subsampleCount=");
        sb.append(size);
        sb.append(", subsampleEntries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
