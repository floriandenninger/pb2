package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwa {
    public apmg a;

    public mwa(apmg apmgVar) {
        this.a = apmgVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mwa) && amkq.b(((mwa) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
