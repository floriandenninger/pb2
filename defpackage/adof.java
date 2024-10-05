package defpackage;

import com.google.android.libraries.youtube.mdx.model.AppStatus;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adof extends admk {
    public static final String k = zga.a("MDX.DialRecoverer");
    public final acyg l;
    public anhy m;
    private final Executor n;
    private final anib o;
    private final adlj p;
    private final acun q;

    public adof(bpw bpwVar, bph bphVar, addy addyVar, ysy ysyVar, acyg acygVar, ypa ypaVar, Executor executor, anib anibVar, adlj adljVar, acun acunVar) {
        super(bpwVar, bphVar, addyVar, ysyVar, ypaVar, 3, true);
        this.l = acygVar;
        this.n = executor;
        this.o = anibVar;
        this.p = adljVar;
        this.q = acunVar;
    }

    @Override // defpackage.admk
    protected final void a() {
        anhy anhyVar = this.m;
        if (anhyVar != null) {
            anhyVar.cancel(true);
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.admk
    public final void b(final bpv bpvVar) {
        final Optional findFirst;
        String q = adgb.q(bpvVar.q);
        if (q == null) {
            findFirst = Optional.empty();
        } else {
            findFirst = Collection.EL.stream(this.p.b()).filter(new opz(q, 13)).findFirst();
        }
        if (!findFirst.isPresent()) {
            zga.m(k, "Non DIAL route was passed in for recovery.");
            return;
        }
        if (this.q.aA) {
            c(bpvVar);
            return;
        }
        if (((adfy) findFirst.get()).b == null) {
            zga.m(k, "dial app uri is null");
            return;
        }
        anhy anhyVar = this.m;
        if (anhyVar != null) {
            anhyVar.cancel(true);
            zga.h(k, "cancelling running app status task and retrying");
        }
        anhy submit = this.o.submit(new Callable() { // from class: adoe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                adof adofVar = adof.this;
                Optional optional = findFirst;
                return adofVar.l.a(((adfy) optional.get()).b, ((adfy) optional.get()).n());
            }
        });
        this.m = submit;
        ynm.k(submit, this.n, new ynk() { // from class: adoc
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                adof adofVar = adof.this;
                zga.f(adof.k, "DIAL Error.", th);
                adofVar.h();
                adofVar.m = null;
            }
        }, new ynl() { // from class: adod
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                adof adofVar = adof.this;
                bpv bpvVar2 = bpvVar;
                int a = ((AppStatus) obj).a();
                if (a == -2) {
                    adofVar.h();
                } else if (a == -1) {
                    zga.m(adof.k, "DIAL screen found but app is not found");
                    adofVar.g();
                } else if (a == 0) {
                    zga.m(adof.k, "DIAL screen found but app is installable");
                    adofVar.g();
                } else if (a == 1) {
                    adofVar.c(bpvVar2);
                } else if (a == 2) {
                    adofVar.g();
                } else {
                    amkq.O(false, "invalid status");
                }
                adofVar.m = null;
            }
        });
    }
}
