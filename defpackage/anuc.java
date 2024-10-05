package defpackage;

import com.google.firebase.appindexing.internal.MutateRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anuc {
    public final MutateRequest a;
    public final rpv b = new rpv();
    final /* synthetic */ anud c;

    public anuc(anud anudVar, MutateRequest mutateRequest) {
        this.c = anudVar;
        this.a = mutateRequest;
    }

    public final void a() {
        synchronized (this.c.b) {
            qip.av(this.c.c == 0);
            this.c.c = 1;
        }
        this.c.a.w(new anub(this)).o(this.c, new rpl() { // from class: antz
            @Override // defpackage.rpl
            public final void c(Exception exc) {
                anuc anucVar;
                anuc anucVar2 = anuc.this;
                synchronized (anucVar2.c.b) {
                    if (anucVar2.c.b.peek() == anucVar2) {
                        anucVar2.c.b.remove();
                        anud anudVar = anucVar2.c;
                        anudVar.c = 0;
                        anucVar = (anuc) anudVar.b.peek();
                    } else {
                        anucVar = null;
                    }
                }
                anucVar2.b.c(exc);
                if (anucVar != null) {
                    anucVar.a();
                }
            }
        });
    }
}
