package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamm implements bamw, bams {
    public static final bamm a;
    static final Set b;
    static final int c;
    private static final /* synthetic */ bamm[] d;

    static {
        bamm bammVar = new bamm();
        a = bammVar;
        int i = 0;
        d = new bamm[]{bammVar};
        Set set = bajn.b;
        b = set;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i = Math.max(i, ((String) it.next()).length());
        }
        c = i;
    }

    private bamm() {
    }

    public static bamm[] values() {
        return (bamm[]) d.clone();
    }

    @Override // defpackage.bams
    public final int a() {
        return c;
    }

    @Override // defpackage.bamw
    public final int b() {
        return c;
    }

    @Override // defpackage.bams
    public final int c(bamv bamvVar, String str, int i) {
        String substring = str.substring(i);
        String str2 = null;
        for (String str3 : b) {
            if (substring.startsWith(str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        if (str2 == null) {
            return i ^ (-1);
        }
        bamvVar.f(bajn.i(str2));
        return i + str2.length();
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        stringBuffer.append(bajnVar != null ? bajnVar.c : "");
    }
}
