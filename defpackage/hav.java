package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntry;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntryStack;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hav {
    public static final /* synthetic */ int f = 0;
    private static final String g = String.valueOf(hav.class.getName()).concat("$ARG_BACKSTACK_POSITION");
    private static final String h = String.valueOf(hav.class.getName()).concat("$ARG_TRIGGERED_ACTION");
    private static final String i = hav.class.getCanonicalName();
    public final aaea a;
    public ReelWatchBackstack$BackstackEntryStack b;
    public final Deque c;
    public final azrs d;
    public final ayph e;
    private final ci j;
    private final amrz k;
    private final azrw l;
    private final shf m;
    private final aadw n;

    public hav(final aadw aadwVar, aaea aaeaVar, ci ciVar, yqw yqwVar, Map map, azrw azrwVar, shf shfVar, final ayqi ayqiVar) {
        final ayph A;
        ReelWatchBackstack$BackstackEntryStack reelWatchBackstack$BackstackEntryStack;
        azrs aT = azrh.aN(Optional.empty()).aT();
        this.d = aT;
        this.n = aadwVar;
        this.a = aaeaVar;
        this.j = ciVar;
        this.k = amrz.j(map);
        this.b = new ReelWatchBackstack$BackstackEntryStack();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        this.l = azrwVar;
        this.m = shfVar;
        buc savedStateRegistry = ciVar.getSavedStateRegistry();
        String str = i;
        savedStateRegistry.b(str, new bub() { // from class: hal
            @Override // defpackage.bub
            public final Bundle a() {
                hav havVar = hav.this;
                Bundle bundle = new Bundle();
                int a = havVar.b.a() - havVar.c.size();
                Iterator it = havVar.c.iterator();
                while (it.hasNext()) {
                    havVar.f((ce) it.next(), a);
                    a++;
                }
                aujs aujsVar = havVar.a.a().u;
                if (aujsVar == null) {
                    aujsVar = aujs.a;
                }
                aujz aujzVar = aujsVar.d;
                if (aujzVar == null) {
                    aujzVar = aujz.a;
                }
                if (!aujzVar.A || havVar.b.a() <= 10) {
                    bundle.putParcelable("BUNDLE_STACK_KEY", havVar.b);
                } else {
                    ReelWatchBackstack$BackstackEntryStack reelWatchBackstack$BackstackEntryStack2 = new ReelWatchBackstack$BackstackEntryStack();
                    int a2 = havVar.b.a() - 10;
                    while (reelWatchBackstack$BackstackEntryStack2.a() < 10) {
                        reelWatchBackstack$BackstackEntryStack2.e(havVar.b.b(a2));
                        a2++;
                    }
                    bundle.putParcelable("BUNDLE_STACK_KEY", reelWatchBackstack$BackstackEntryStack2);
                }
                return bundle;
            }
        });
        aujl aujlVar = aadwVar.b().E;
        if ((aujlVar == null ? aujl.a : aujlVar).b) {
            A = aT.aj(new ayrv() { // from class: hap
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    final hav havVar = hav.this;
                    return ((ayph) ((Optional) obj).map(ham.d).orElse(ayph.A())).M(aypy.R(new Callable() { // from class: har
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(hav.this.h());
                        }
                    }));
                }
            }).al(gsv.c).h().e();
        } else {
            A = ayph.A();
        }
        this.e = A;
        A.getClass();
        yqwVar.f(new Callable() { // from class: hat
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ayph.this.Q();
            }
        });
        yqwVar.f(new Callable() { // from class: has
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final hav havVar = hav.this;
                final aadw aadwVar2 = aadwVar;
                final ayqi ayqiVar2 = ayqiVar;
                return havVar.d.aj(new ayrv() { // from class: haq
                    @Override // defpackage.ayrv
                    public final Object a(Object obj) {
                        aadw aadwVar3 = aadw.this;
                        ayqi ayqiVar3 = ayqiVar2;
                        int i2 = hav.f;
                        aypy aypyVar = (aypy) ((Optional) obj).map(ham.a).orElse(aypy.I());
                        aujl aujlVar2 = aadwVar3.b().E;
                        if (aujlVar2 == null) {
                            aujlVar2 = aujl.a;
                        }
                        return aypyVar.af(true != aujlVar2.b ? 1L : 0L).ab(ayqiVar3);
                    }
                }).ax(new ayrs() { // from class: hao
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        hav havVar2 = hav.this;
                        ReelWatchBackstack$BackstackEntry d = havVar2.b.d();
                        havVar2.b.e(ReelWatchBackstack$BackstackEntry.a((apxf) obj, d.b, d.c, d.d));
                    }
                });
            }
        });
        Bundle a = ciVar.getSavedStateRegistry().a(str);
        if (a == null || (reelWatchBackstack$BackstackEntryStack = (ReelWatchBackstack$BackstackEntryStack) a.getParcelable("BUNDLE_STACK_KEY")) == null) {
            return;
        }
        this.b = reelWatchBackstack$BackstackEntryStack;
        arrayDeque.clear();
        if (this.b.f()) {
            return;
        }
        k(this.b.d());
    }

    public static Optional c(Bundle bundle) {
        if (bundle == null) {
            return Optional.empty();
        }
        return haw.a(bundle.getInt(h, -1));
    }

    public static OptionalInt d(Bundle bundle) {
        if (bundle == null) {
            return OptionalInt.empty();
        }
        String str = g;
        if (!bundle.containsKey(str)) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(bundle.getInt(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ce i(ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry, haw hawVar, int i2) {
        apxf apxfVar = reelWatchBackstack$BackstackEntry.a;
        Bundle bundle = reelWatchBackstack$BackstackEntry.b;
        if (!bundle.containsKey("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY")) {
            bundle.putLong("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", this.m.c());
        }
        bundle.putInt(g, i2);
        bundle.putInt(h, hawVar.ordinal());
        Object a = aahe.a(apxfVar);
        a.getClass();
        hay hayVar = (hay) this.k.get(a.getClass());
        hayVar.getClass();
        ce a2 = hayVar.a(apxfVar, bundle);
        if (a2 instanceof hax) {
        }
        a2.ah(reelWatchBackstack$BackstackEntry.c);
        if (a2 instanceof haz) {
            ((haz) a2).m(reelWatchBackstack$BackstackEntry.d);
        }
        return a2;
    }

    private final void j(ce ceVar) {
        int i2 = 0;
        Optional map = Optional.ofNullable(ceVar).filter(new han(hax.class, i2)).map(new hau(hax.class, i2));
        map.ifPresent(gfd.j);
        this.d.c(map);
    }

    private final void k(ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry) {
        ce ceVar;
        reelWatchBackstack$BackstackEntry.a.getClass();
        reelWatchBackstack$BackstackEntry.b.getClass();
        if (!g()) {
            apxf apxfVar = reelWatchBackstack$BackstackEntry.a;
            apxf b = b();
            Object a = aahe.a(apxfVar);
            a.getClass();
            Object a2 = aahe.a(b);
            a2.getClass();
            if (a.equals(a2)) {
                return;
            }
        }
        this.b.e(reelWatchBackstack$BackstackEntry);
        if (this.c.peekLast() instanceof hax) {
            ((hax) this.c.peekLast()).c();
        }
        if (this.c.size() == 1) {
            f((ce) this.c.peekFirst(), this.b.a() - 2);
            ceVar = (ce) this.c.removeFirst();
        } else {
            ceVar = null;
        }
        ce i2 = i(reelWatchBackstack$BackstackEntry, haw.PUSH, this.b.a() - 1);
        this.c.addLast(i2);
        dn k = this.j.getSupportFragmentManager().k();
        k.p(R.id.reel_watch_backstack_container, i2);
        k.d();
        if (ceVar != null) {
            dn k2 = this.j.getSupportFragmentManager().k();
            k2.m(ceVar);
            k2.a();
        }
        j(i2);
    }

    public final ce a() {
        return (ce) this.c.peekLast();
    }

    public final apxf b() {
        ReelWatchBackstack$BackstackEntry c = this.b.c();
        if (c == null) {
            return null;
        }
        return c.a;
    }

    public final void e(apxf apxfVar, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        k(ReelWatchBackstack$BackstackEntry.a(apxfVar, bundle, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(ce ceVar, int i2) {
        ReelWatchBackstack$BackstackEntry b = this.b.b(i2);
        Fragment$SavedState c = this.j.getSupportFragmentManager().c(ceVar);
        Object l = ceVar instanceof haz ? ((haz) ceVar).l() : null;
        Bundle bundle = b.b;
        bundle.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY");
        bundle.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_CLIENT_TRIGGERED_GET_PLAYER_INITIAL_KEY");
        ReelWatchBackstack$BackstackEntry a = ReelWatchBackstack$BackstackEntry.a(b.a, bundle, c, l);
        ReelWatchBackstack$BackstackEntryStack reelWatchBackstack$BackstackEntryStack = this.b;
        reelWatchBackstack$BackstackEntryStack.a.remove(i2);
        reelWatchBackstack$BackstackEntryStack.a.add(i2, a);
    }

    public final boolean g() {
        return this.b.f();
    }

    public final boolean h() {
        if (this.b.f()) {
            aujl aujlVar = this.n.b().E;
            if (aujlVar == null) {
                aujlVar = aujl.a;
            }
            if (aujlVar.b) {
                return false;
            }
            throw new NoSuchElementException();
        }
        if ((this.c.peekLast() instanceof hax) && !((hax) this.c.peekLast()).k()) {
            return false;
        }
        this.b.d();
        ce ceVar = (ce) this.c.removeLast();
        if (!g()) {
            ReelWatchBackstack$BackstackEntry d = this.b.d();
            aong aongVar = (aong) d.a.toBuilder();
            aongVar.d(atmb.b);
            apxf h2 = ((acqz) this.l.get()).mM().h((apxf) aongVar.build());
            aone builder = ((atmc) h2.pX(atmb.b)).toBuilder();
            builder.copyOnWrite();
            atmc atmcVar = (atmc) builder.instance;
            atmcVar.b |= 2;
            atmcVar.d = 22156;
            atmc atmcVar2 = (atmc) builder.build();
            aong aongVar2 = (aong) h2.toBuilder();
            aongVar2.e(atmb.b, atmcVar2);
            apxf apxfVar = (apxf) aongVar2.build();
            Bundle bundle = d.b;
            bundle.putByteArray(hae.a, apxfVar.toByteArray());
            this.b.e(ReelWatchBackstack$BackstackEntry.a(apxfVar, bundle, d.c, d.d));
            if (this.c.isEmpty()) {
                ce i2 = i(this.b.c(), haw.POP, this.b.a() - 1);
                this.c.addLast(i2);
                dn k = this.j.getSupportFragmentManager().k();
                k.p(R.id.reel_watch_backstack_container, i2);
                k.d();
            }
            dn k2 = this.j.getSupportFragmentManager().k();
            k2.m(ceVar);
            k2.a();
            j((ce) this.c.peekLast());
            return true;
        }
        this.j.finish();
        return false;
    }
}
