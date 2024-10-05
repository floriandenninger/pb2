package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ypc {
    public final Class a;
    public final ypb b;
    public final int c;
    private final WeakReference d;
    private final int e;

    public ypc(Object obj, Class cls, Object obj2, ypb ypbVar) {
        this.d = new WeakReference(obj);
        cls.getClass();
        this.a = cls;
        this.b = ypbVar;
        this.e = Arrays.hashCode(new Object[]{obj, cls, obj2, ypbVar});
        this.c = obj2.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a() {
        return this.d.get();
    }

    public final boolean equals(Object obj) {
        ypb ypbVar;
        ypb ypbVar2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ypc) {
            ypc ypcVar = (ypc) obj;
            if (this.d.get() != ypcVar.d.get() || !this.a.equals(ypcVar.a) || this.c != ypcVar.c || (ypbVar = this.b) == (ypbVar2 = ypcVar.b) || !ypbVar.equals(ypbVar2)) {
                if (this.d.get() == ypcVar.d.get() && this.a.equals(ypcVar.a) && this.c == ypcVar.c && this.b == ypcVar.b) {
                    return true;
                }
            } else {
                Object obj2 = this.d.get();
                if ((this.b instanceof ypg) && obj2 != null) {
                    String simpleName = obj2.getClass().getSimpleName();
                    String name = ((ypg) this.b).a.getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 76 + String.valueOf(name).length());
                    sb.append("Potential duplicate subscribers at ");
                    sb.append(simpleName);
                    sb.append("#");
                    sb.append(name);
                    sb.append(", did you forget to unregister properly?");
                    Log.w("EventBus", sb.toString());
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}
