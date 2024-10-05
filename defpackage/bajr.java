package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bajr implements Serializable {
    public static final bajr a = new bajq("eras", (byte) 1);
    public static final bajr b = new bajq("centuries", (byte) 2);
    public static final bajr c = new bajq("weekyears", (byte) 3);
    public static final bajr d = new bajq("years", (byte) 4);
    public static final bajr e = new bajq("months", (byte) 5);
    public static final bajr f = new bajq("weeks", (byte) 6);
    public static final bajr g = new bajq("days", (byte) 7);
    public static final bajr h = new bajq("halfdays", (byte) 8);
    public static final bajr i = new bajq("hours", (byte) 9);
    public static final bajr j = new bajq("minutes", (byte) 10);
    public static final bajr k = new bajq("seconds", (byte) 11);
    public static final bajr l = new bajq("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final String m;

    /* JADX INFO: Access modifiers changed from: protected */
    public bajr(String str) {
        this.m = str;
    }

    public abstract bajp a(bajf bajfVar);

    public final String toString() {
        return this.m;
    }
}
