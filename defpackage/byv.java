package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class byv {
    private static final String a = ajbh.S("InputMerger");

    public static byv b(String str) {
        try {
            return (byv) Class.forName(str).newInstance();
        } catch (Exception e) {
            ajbh.X();
            ajbh.U(a, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract byr a(List list);
}
