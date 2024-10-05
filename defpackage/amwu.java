package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amwu extends amwn implements Set {
    private static final long serialVersionUID = 0;

    public amwu(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.amwn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set a() {
        return (Set) super.a();
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }
}
