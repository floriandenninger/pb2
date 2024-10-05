package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zsh {
    public ztz c;
    private final Executor d;
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    private boolean e = true;

    public zsh(Executor executor) {
        executor.getClass();
        this.d = executor;
    }

    private final void g(final zsj zsjVar) {
        this.d.execute(new Runnable() { // from class: zsg
            @Override // java.lang.Runnable
            public final void run() {
                zsh zshVar = zsh.this;
                zsj zsjVar2 = zsjVar;
                ztz ztzVar = zshVar.c;
                if (ztzVar != null) {
                    String[] i = ztzVar.i();
                    synchronized (zshVar) {
                        zshVar.b.remove(zsjVar2);
                        Set set = (Set) zshVar.a.get(zsjVar2);
                        if (set != null) {
                            Collections.addAll(set, i);
                        }
                        zshVar.c();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(zsj zsjVar) {
        if (zsjVar == null) {
            return;
        }
        if (!this.a.containsKey(zsjVar)) {
            this.b.add(zsjVar);
            this.a.put(zsjVar, new HashSet());
        }
        g(zsjVar);
    }

    public final synchronized void b(boolean z) {
        this.e = z;
        c();
    }

    public final synchronized void c() {
        if (this.e) {
            for (zsj zsjVar : this.a.keySet()) {
                if (!this.b.contains(zsjVar)) {
                    Set set = (Set) this.a.get(zsjVar);
                    if (set != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            zsjVar.a((String) it.next());
                        }
                    }
                    this.a.put(zsjVar, new HashSet());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(String str) {
        for (Set set : this.a.values()) {
            if (set != null) {
                set.add(str);
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(zsj zsjVar) {
        if (zsjVar == null) {
            return;
        }
        this.a.remove(zsjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(ztz ztzVar) {
        if (this.c != null) {
            zga.b("Only a single VideoEffectsFileManager is supported.");
        }
        ztzVar.getClass();
        this.c = ztzVar;
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            g((zsj) it.next());
        }
    }
}
