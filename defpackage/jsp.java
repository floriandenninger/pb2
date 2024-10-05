package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsp implements Serializable, jtd {
    private static final long serialVersionUID = -4019560255984295982L;
    private final Class a;
    private final Class b;

    public jsp(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @Override // defpackage.jtd
    public final Class a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return jtd.class;
    }

    @Override // defpackage.jtd
    public final Class b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtd) {
            jtd jtdVar = (jtd) obj;
            if (this.a.equals(jtdVar.a()) && this.b.equals(jtdVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a.hashCode() ^ 1192979616) + (this.b.hashCode() ^ 399516643);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.apps.youtube.app.offline.renderergenerator.OfflineModelToRendererGeneratorKey(offlineModelType=" + this.a + ", rendererType=" + this.b + ')';
    }
}
