package defpackage;

import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aehs {
    private final aaea a;
    private final aef b = new aef(10);
    private final Executor c;

    public aehs(aaea aaeaVar, Executor executor) {
        this.a = aaeaVar;
        this.c = executor;
    }

    public final aeht a(String str) {
        return (aeht) this.b.c(str);
    }

    public final void b(final aesn aesnVar, String str) {
        if (str != null && this.b.c(str) == null) {
            auij t = afhs.t(this.a);
            boolean z = false;
            boolean z2 = t.i || (!t.j.isEmpty() && Pattern.compile(t.j).matcher(str).find());
            auij t2 = afhs.t(this.a);
            if (t2.k || (!t2.l.isEmpty() && Pattern.compile(t2.l).matcher(str).find())) {
                z = true;
            }
            if (z2 || z) {
                this.b.d(str, new aeht(aesnVar, z2, z));
                this.c.execute(new Runnable() { // from class: aehr
                    @Override // java.lang.Runnable
                    public final void run() {
                        aesn.this.i("cat", aeqs.b);
                    }
                });
            }
        }
    }
}
