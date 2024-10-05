package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aych {
    public final aycg a;
    public final String b;
    public final String c;
    public final aycf d;
    private final aycf e;
    private final boolean f;

    public aych(aycg aycgVar, String str, aycf aycfVar, aycf aycfVar2, boolean z) {
        new AtomicReferenceArray(2);
        aycgVar.getClass();
        this.a = aycgVar;
        str.getClass();
        this.b = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        aycfVar.getClass();
        this.e = aycfVar;
        aycfVar2.getClass();
        this.d = aycfVar2;
        this.f = z;
    }

    public static ayce a() {
        ayce ayceVar = new ayce();
        ayceVar.a = null;
        ayceVar.b = null;
        return ayceVar;
    }

    public static String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputStream b(Object obj) {
        return new ayok(obj, ((ayol) this.e).b);
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("fullMethodName", this.b);
        Y.b("type", this.a);
        Y.g("idempotent", false);
        Y.g("safe", false);
        Y.g("sampledToLocalTracing", this.f);
        Y.b("requestMarshaller", this.e);
        Y.b("responseMarshaller", this.d);
        Y.b("schemaDescriptor", null);
        Y.a = true;
        return Y.toString();
    }
}
