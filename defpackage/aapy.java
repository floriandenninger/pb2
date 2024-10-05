package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aapy implements Executor {
    private final Executor c;
    public boolean b = false;
    public List a = new ArrayList();

    public aapy(Executor executor) {
        this.c = executor;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.a.add(runnable);
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.execute(new Runnable() { // from class: aapx
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                aapy aapyVar = aapy.this;
                while (true) {
                    synchronized (aapyVar) {
                        if (aapyVar.a.isEmpty()) {
                            aapyVar.b = false;
                            return;
                        } else {
                            list = aapyVar.a;
                            aapyVar.a = new ArrayList();
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            }
        });
    }
}
