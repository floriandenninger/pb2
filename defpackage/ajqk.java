package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajqk implements Serializable, ajql {
    private static final long serialVersionUID = 3447871915224247120L;
    private final Class a;
    private final Class b;

    public ajqk(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @Override // defpackage.ajql
    public final Class a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ajql.class;
    }

    @Override // defpackage.ajql
    public final Class b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajql) {
            ajql ajqlVar = (ajql) obj;
            if (this.a.equals(ajqlVar.a()) && this.b.equals(ajqlVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a.hashCode() ^ (-509967024)) + (this.b.hashCode() ^ 866579852);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.youtube.rendering.presenter.animation.dagger.PresenterClassPairKey(first=" + this.a + ", second=" + this.b + ')';
    }
}
