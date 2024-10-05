package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wjc {
    private final wjb a;
    private final boolean b;
    private final apxf c;

    public wjc(wjb wjbVar, boolean z) {
        this(wjbVar, z, null);
    }

    public wjc(wjb wjbVar, boolean z, apxf apxfVar) {
        this.a = wjbVar;
        this.b = z;
        this.c = apxfVar;
    }

    public wjb a() {
        return this.a;
    }

    public apxf b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wjc)) {
            return false;
        }
        wjc wjcVar = (wjc) obj;
        return this.b == wjcVar.b && this.a == wjcVar.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }
}
