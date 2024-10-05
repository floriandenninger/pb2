package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaio implements aalc {
    public final aaih a;
    private final List c = new ArrayList();
    private final AtomicBoolean d = new AtomicBoolean();
    public aoqa b = aalj.a;

    public aaio(aaih aaihVar) {
        this.a = aaihVar;
    }

    private static ayph l() {
        return ayph.s(new IllegalStateException("already committed"));
    }

    @Override // defpackage.aalc
    public final aalc a(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aalc
    public final ayph b() {
        if (this.d.getAndSet(true)) {
            return l();
        }
        return this.a.l(this.c, true);
    }

    @Override // defpackage.aalc
    public final ayph c() {
        if (this.d.getAndSet(true)) {
            return l();
        }
        return this.a.l(this.c, false);
    }

    @Override // defpackage.aalc
    public final void d(final aakt aaktVar) {
        final aoqa aoqaVar = this.b;
        this.c.add(new aain() { // from class: aaij
            @Override // defpackage.aain
            public final void a() {
                aaio aaioVar = aaio.this;
                aakt aaktVar2 = aaktVar;
                aoqa aoqaVar2 = aoqaVar;
                aaih aaihVar = aaioVar.a;
                aahs b = aaihVar.c.b(aaktVar2.d());
                if (aaih.p(b.b, aoqaVar2)) {
                    aoqa aoqaVar3 = b.b.d;
                    if (aoqaVar3 == null) {
                        aoqaVar3 = aoqa.a;
                    }
                    aoqa c = aalj.c(aoqaVar2, aoqaVar3);
                    aaht aahtVar = aaihVar.c;
                    aakt b2 = aalj.b(aaihVar.b, b.a, aaktVar2);
                    aone builder = b.b.toBuilder();
                    builder.copyOnWrite();
                    awuh awuhVar = (awuh) builder.instance;
                    c.getClass();
                    awuhVar.d = c;
                    awuhVar.b |= 2;
                    aahtVar.h(b2, (awuh) builder.build());
                }
            }
        });
    }

    @Override // defpackage.aalc
    public final void e(final aakt aaktVar, final aaku aakuVar) {
        final aoqa aoqaVar = this.b;
        this.c.add(new aain() { // from class: aaii
            @Override // defpackage.aain
            public final void a() {
                aaio aaioVar = aaio.this;
                aakt aaktVar2 = aaktVar;
                aaku aakuVar2 = aakuVar;
                aoqa aoqaVar2 = aoqaVar;
                aaih aaihVar = aaioVar.a;
                aahs b = aaihVar.c.b(aaktVar2.d());
                if (aaih.p(b.b, aoqaVar2)) {
                    aoqa aoqaVar3 = b.b.d;
                    if (aoqaVar3 == null) {
                        aoqaVar3 = aoqa.a;
                    }
                    aoqa c = aalj.c(aoqaVar2, aoqaVar3);
                    aaht aahtVar = aaihVar.c;
                    aakt b2 = aalj.b(aaihVar.b, b.a, aaktVar2);
                    aone builder = b.b.toBuilder();
                    builder.copyOnWrite();
                    awuh awuhVar = (awuh) builder.instance;
                    c.getClass();
                    awuhVar.d = c;
                    awuhVar.b |= 2;
                    aqud aqudVar = aakuVar2.b;
                    builder.copyOnWrite();
                    awuh awuhVar2 = (awuh) builder.instance;
                    awuhVar2.c = aqudVar;
                    awuhVar2.b |= 1;
                    aahtVar.h(b2, (awuh) builder.build());
                }
            }
        });
    }

    @Override // defpackage.aalc
    public final void f(final String str, final aaku aakuVar) {
        final aoqa aoqaVar = this.b;
        this.c.add(new aain() { // from class: aaik
            @Override // defpackage.aain
            public final void a() {
                aaio aaioVar = aaio.this;
                String str2 = str;
                aaku aakuVar2 = aakuVar;
                aoqa aoqaVar2 = aoqaVar;
                aaih aaihVar = aaioVar.a;
                aahs b = aaihVar.c.b(str2);
                if (b.a == null) {
                    throw new aall("Cannot commit metadata without an existing entity");
                }
                if (aaih.p(b.b, aoqaVar2)) {
                    aoqa aoqaVar3 = b.b.d;
                    if (aoqaVar3 == null) {
                        aoqaVar3 = aoqa.a;
                    }
                    aoqa c = aalj.c(aoqaVar2, aoqaVar3);
                    aaht aahtVar = aaihVar.c;
                    aakt aaktVar = b.a;
                    aone builder = b.b.toBuilder();
                    builder.copyOnWrite();
                    awuh awuhVar = (awuh) builder.instance;
                    c.getClass();
                    awuhVar.d = c;
                    awuhVar.b |= 2;
                    aqud aqudVar = aakuVar2.b;
                    builder.copyOnWrite();
                    awuh awuhVar2 = (awuh) builder.instance;
                    awuhVar2.c = aqudVar;
                    awuhVar2.b |= 1;
                    aahtVar.h(aaktVar, (awuh) builder.build());
                }
            }
        });
    }

    @Override // defpackage.aalc
    public final void g(final String str) {
        final aoqa aoqaVar = this.b;
        this.c.add(new aain() { // from class: aail
            @Override // defpackage.aain
            public final void a() {
                aaio aaioVar = aaio.this;
                String str2 = str;
                aoqa aoqaVar2 = aoqaVar;
                aaih aaihVar = aaioVar.a;
                if (aaih.p(aaihVar.c.b(str2).b, aoqaVar2)) {
                    aaihVar.c.a.set(str2, null);
                }
            }
        });
    }

    @Override // defpackage.aalc
    public final /* synthetic */ void h(aakt aaktVar) {
        whu.ae(this, aaktVar);
    }

    @Override // defpackage.aalc
    public final void i(final String str, final aqua aquaVar, byte[] bArr) {
        final aomf x = aomf.x(bArr);
        final aoqa aoqaVar = this.b;
        this.c.add(new aain() { // from class: aaim
            @Override // defpackage.aain
            public final void a() {
                aaio aaioVar = aaio.this;
                String str2 = str;
                aqua aquaVar2 = aquaVar;
                aomf aomfVar = x;
                aoqa aoqaVar2 = aoqaVar;
                aaih aaihVar = aaioVar.a;
                aahs b = aaihVar.c.b(str2);
                if (aaih.p(b.b, aoqaVar2)) {
                    aoqa aoqaVar3 = b.b.d;
                    if (aoqaVar3 == null) {
                        aoqaVar3 = aoqa.a;
                    }
                    aoqa c = aalj.c(aoqaVar2, aoqaVar3);
                    aakt a = aalj.a(aaihVar.a, aquaVar2, str2, b.a, aomfVar.I());
                    if (a != null) {
                        aaht aahtVar = aaihVar.c;
                        aakt b2 = aalj.b(aaihVar.b, b.a, a);
                        aone builder = b.b.toBuilder();
                        builder.copyOnWrite();
                        awuh awuhVar = (awuh) builder.instance;
                        c.getClass();
                        awuhVar.d = c;
                        awuhVar.b |= 2;
                        aahtVar.h(b2, (awuh) builder.build());
                        return;
                    }
                    throw new aall("update could not be applied");
                }
            }
        });
    }

    @Override // defpackage.aalc
    public final /* synthetic */ void j(Iterable iterable) {
        whu.ad(this, iterable);
    }

    @Override // defpackage.aalc
    public final void k(whu whuVar) {
        d(whuVar.a(this.a));
    }
}
