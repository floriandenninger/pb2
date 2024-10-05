package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fsx {
    public final atdn a;

    public fsx(atdn atdnVar) {
        this.a = atdnVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fsx) && this.a.equals(((fsx) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
