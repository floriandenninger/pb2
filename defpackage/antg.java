package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class antg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;

    public antg(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        qip.aw(!qtq.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.g = str6;
        this.d = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof antg)) {
            return false;
        }
        antg antgVar = (antg) obj;
        return qar.j(this.b, antgVar.b) && qar.j(this.a, antgVar.a) && qar.j(this.e, antgVar.e) && qar.j(this.f, antgVar.f) && qar.j(this.c, antgVar.c) && qar.j(this.g, antgVar.g) && qar.j(this.d, antgVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, this.f, this.c, this.g, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("applicationId", this.b, arrayList);
        qar.l("apiKey", this.a, arrayList);
        qar.l("databaseUrl", this.e, arrayList);
        qar.l("gcmSenderId", this.c, arrayList);
        qar.l("storageBucket", this.g, arrayList);
        qar.l("projectId", this.d, arrayList);
        return qar.k(arrayList, this);
    }
}
