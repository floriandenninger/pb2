package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpu {
    final bpd a;
    final List b = new ArrayList();
    public bpf c;
    private final bpb d;

    public bpu(bpd bpdVar) {
        this.a = bpdVar;
        this.d = bpdVar.f;
    }

    public final ComponentName a() {
        return this.d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bpv b(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((bpv) this.b.get(i)).b.equals(str)) {
                return (bpv) this.b.get(i);
            }
        }
        return null;
    }

    public final String c() {
        return this.d.a();
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + c() + " }";
    }
}
