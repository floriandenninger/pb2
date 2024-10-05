package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qkf {
    public final qkw a;
    public final String b;
    public qjb c;
    public final List d;

    public qkf(String str) {
        qko.i(str);
        this.b = str;
        qkw qkwVar = new qkw("MediaControlChannel");
        this.a = qkwVar;
        if (!TextUtils.isEmpty(null)) {
            qkwVar.b = TextUtils.isEmpty(null) ? null : String.format("[%s] ", null);
        }
        this.d = Collections.synchronizedList(new ArrayList());
    }

    public final long a() {
        qjb qjbVar = this.c;
        if (qjbVar != null) {
            return qjbVar.b.getAndIncrement();
        }
        this.a.b("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }

    public void b() {
        throw null;
    }

    public final void c(String str, final long j) {
        final qjb qjbVar = this.c;
        if (qjbVar == null) {
            this.a.b("Attempt to send text message without a sink", new Object[0]);
            return;
        }
        String str2 = this.b;
        qep qepVar = qjbVar.a;
        if (qepVar == null) {
            throw new IllegalStateException("Device is not connected");
        }
        qepVar.a(str2, str).n(new rpl() { // from class: qja
            @Override // defpackage.rpl
            public final void c(Exception exc) {
                qjb qjbVar2 = qjb.this;
                long j2 = j;
                int a = exc instanceof qnx ? ((qnx) exc).a() : 13;
                Iterator it = qjbVar2.c.b.d.iterator();
                while (it.hasNext()) {
                    ((qld) it.next()).e(j2, a);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(qld qldVar) {
        this.d.add(qldVar);
    }
}
