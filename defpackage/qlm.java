package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qlm {

    @Deprecated
    public static final qnw a;
    public static final String[] b;
    public static final List c;
    public static volatile int d;
    public static final pse n;
    public static final qar o;
    public final Context e;
    public final String f;
    public final EnumSet g;
    public final qlj h;
    public final List i;
    public String j;
    public String k;
    public int l;
    final qls m;

    static {
        pse pseVar = new pse();
        n = pseVar;
        qlg qlgVar = new qlg();
        o = qlgVar;
        a = new qnw("ClearcutLogger.API", qlgVar, pseVar, null, null, null, null);
        b = new String[0];
        c = new CopyOnWriteArrayList();
        d = -1;
    }

    public qlm(Context context, String str, String str2) {
        this(context, str, str2, qll.e, qls.b(context), new qlw(context));
    }

    public static qlm d(Context context, String str) {
        return new qlm(context, str, null, qll.f, qls.b(context), new qlw(context));
    }

    public static String e(Iterable iterable) {
        return ammr.b(", ").d(iterable);
    }

    public static int[] g(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    public final qli a(qlh qlhVar) {
        return new qli(this, null, qlhVar);
    }

    public final qli c(byte[] bArr) {
        return new qli(this, bArr != null ? aomf.x(bArr) : null, null);
    }

    public final boolean f() {
        return this.g.equals(qll.f);
    }

    @Deprecated
    public final qli b(final qlk qlkVar) {
        return a(qlkVar == null ? null : new qlh() { // from class: qlf
            @Override // defpackage.qlh
            public final aomf a() {
                qlk qlkVar2 = qlk.this;
                qnw qnwVar = qlm.a;
                return aomf.x(qlkVar2.a());
            }
        });
    }

    public qlm(Context context, String str, String str2, EnumSet enumSet, qls qlsVar, qlj qljVar) {
        this.i = new CopyOnWriteArrayList();
        this.l = 1;
        if (!enumSet.contains(qll.ACCOUNT_NAME)) {
            qip.ap(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        if (enumSet.equals(qll.g) || enumSet.equals(qll.e) || enumSet.equals(qll.f)) {
            this.e = context.getApplicationContext();
            this.f = context.getPackageName();
            this.j = str;
            this.k = str2;
            this.g = enumSet;
            this.m = qlsVar;
            this.l = 1;
            this.h = qljVar;
            return;
        }
        throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or PIILevel.DEIDENTIFIED");
    }
}
