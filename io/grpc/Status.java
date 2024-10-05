package io.grpc;

import defpackage.amkq;
import defpackage.amme;
import defpackage.ammu;
import defpackage.amnz;
import defpackage.ayca;
import defpackage.aycc;
import defpackage.aydb;
import defpackage.aydc;
import defpackage.aydd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Status {
    public static final List a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public static final Status j;
    public static final Status k;
    public static final Status l;
    public static final Status m;
    public static final Status n;
    public static final Status o;
    public static final ayca p;
    public static final ayca q;
    private static final aycc s;
    public final Throwable r;
    private final Code t;
    private final String u;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        public final byte[] r;
        private final int t;

        Code(int i) {
            this.t = i;
            this.r = Integer.toString(i).getBytes(amme.a);
        }

        public final Status b() {
            return (Status) Status.a.get(this.t);
        }

        public int value() {
            return this.t;
        }
    }

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.value()), new Status(code, null, null));
            if (status != null) {
                String name = status.getCode().name();
                String name2 = code.name();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 34 + String.valueOf(name2).length());
                sb.append("Code value duplication between ");
                sb.append(name);
                sb.append(" & ");
                sb.append(name2);
                throw new IllegalStateException(sb.toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        b = Code.OK.b();
        c = Code.CANCELLED.b();
        d = Code.UNKNOWN.b();
        e = Code.INVALID_ARGUMENT.b();
        f = Code.DEADLINE_EXCEEDED.b();
        g = Code.NOT_FOUND.b();
        Code.ALREADY_EXISTS.b();
        h = Code.PERMISSION_DENIED.b();
        i = Code.UNAUTHENTICATED.b();
        j = Code.RESOURCE_EXHAUSTED.b();
        k = Code.FAILED_PRECONDITION.b();
        l = Code.ABORTED.b();
        Code.OUT_OF_RANGE.b();
        m = Code.UNIMPLEMENTED.b();
        n = Code.INTERNAL.b();
        o = Code.UNAVAILABLE.b();
        Code.DATA_LOSS.b();
        p = ayca.d("grpc-status", false, new aydb());
        aydc aydcVar = new aydc();
        s = aydcVar;
        q = ayca.d("grpc-message", false, aydcVar);
    }

    private Status(Code code, String str, Throwable th) {
        code.getClass();
        this.t = code;
        this.u = str;
        this.r = th;
    }

    public static Status b(Throwable th) {
        th.getClass();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof StatusException)) {
                if (th2 instanceof aydd) {
                    return ((aydd) th2).a;
                }
            } else {
                return ((StatusException) th2).a;
            }
        }
        return d.c(th);
    }

    public static String e(Status status) {
        if (status.u == null) {
            return status.t.toString();
        }
        String valueOf = String.valueOf(status.t);
        String str = status.u;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    public static Status fromCodeValue(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 <= list.size()) {
                return (Status) list.get(i2);
            }
        }
        Status status = d;
        StringBuilder sb = new StringBuilder(24);
        sb.append("Unknown code ");
        sb.append(i2);
        return status.withDescription(sb.toString());
    }

    public final Status a(String str) {
        if (str == null) {
            return this;
        }
        String str2 = this.u;
        if (str2 == null) {
            return new Status(this.t, str, this.r);
        }
        Code code = this.t;
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length());
        sb.append(str2);
        sb.append("\n");
        sb.append(str);
        return new Status(code, sb.toString(), this.r);
    }

    public StatusException asException() {
        return new StatusException(this);
    }

    public final Status c(Throwable th) {
        return amkq.b(this.r, th) ? this : new Status(this.t, this.u, th);
    }

    public final aydd d() {
        return new aydd(this);
    }

    public final boolean f() {
        return Code.OK == this.t;
    }

    public final aydd g() {
        return new aydd(this);
    }

    public Code getCode() {
        return this.t;
    }

    public String getDescription() {
        return this.u;
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("code", this.t.name());
        Y.b("description", this.u);
        Throwable th = this.r;
        Object obj = th;
        if (th != null) {
            obj = amnz.b(th);
        }
        Y.b("cause", obj);
        return Y.toString();
    }

    public Status withDescription(String str) {
        return amkq.b(this.u, str) ? this : new Status(this.t, str, this.r);
    }
}
