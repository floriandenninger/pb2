package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jgs implements aakt {
    public static final aaks a = new jgq();
    public final boolean b;
    private final String c;

    public jgs() {
    }

    public jgs(String str, boolean z) {
        this.c = str;
        this.b = z;
    }

    public static String b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "InboxNotificationEntity".concat(valueOf) : new String("InboxNotificationEntity");
    }

    @Override // defpackage.aakt
    public final /* synthetic */ amsx a() {
        return amvs.a;
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        String valueOf = String.valueOf(getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("toByteArray is not supported by ");
        sb.append(valueOf);
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c;
    }

    @Override // defpackage.aakt
    public final /* synthetic */ whu e() {
        jgr jgrVar = new jgr();
        jgrVar.c(this.c);
        jgrVar.d(this.b);
        return jgrVar;
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jgs) {
            jgs jgsVar = (jgs) obj;
            if (this.c.equals(jgsVar.c) && this.b == jgsVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aakt
    public aaks getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return ((this.c.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("entityKey", this.c);
        Y.g("shouldIndicate", this.b);
        return Y.toString();
    }
}
