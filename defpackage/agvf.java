package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agvf {
    public final Context a;
    private final aypn b;
    private String c = null;
    private ayqx d = null;

    public agvf(Context context, aypn aypnVar) {
        this.a = context;
        this.b = aypnVar;
    }

    public final synchronized String a() {
        String str;
        str = this.c;
        Object obj = this.d;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.d = null;
            this.c = null;
        }
        return str;
    }

    public final synchronized void b(String str) {
        if (this.d == null) {
            this.c = str;
            this.d = this.b.X(new ayrs() { // from class: agve
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    String a;
                    agvf agvfVar = agvf.this;
                    if (!((Boolean) obj).booleanValue() || (a = agvfVar.a()) == null) {
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setClassName(agvfVar.a, a);
                    intent.setAction("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup");
                    agzy.a(agvfVar.a, intent);
                }
            });
        }
    }
}
