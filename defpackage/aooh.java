package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aooh {
    protected volatile aooy a;
    public volatile aomf b;

    static {
        aomw.a();
    }

    public final aomf a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = aomf.b;
            } else {
                this.b = this.a.toByteString();
            }
            return this.b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aooh)) {
            return false;
        }
        aooh aoohVar = (aooh) obj;
        aooy aooyVar = this.a;
        aooy aooyVar2 = aoohVar.a;
        if (aooyVar == null && aooyVar2 == null) {
            return a().equals(aoohVar.a());
        }
        if (aooyVar != null && aooyVar2 != null) {
            return aooyVar.equals(aooyVar2);
        }
        if (aooyVar != null) {
            return aooyVar.equals(aoohVar.b(aooyVar.getDefaultInstanceForType()));
        }
        return b(aooyVar2.getDefaultInstanceForType()).equals(aooyVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final aooy b(aooy aooyVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = aooyVar;
                        this.b = aomf.b;
                    } catch (aoob unused) {
                        this.a = aooyVar;
                        this.b = aomf.b;
                    }
                }
            }
        }
        return this.a;
    }
}
