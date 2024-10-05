package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ByteStoreConfig;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaht {
    public final ByteStore a;
    private final aals b;
    private final aalo c;
    private final FaultSubscription unusedFaultSubscription;
    private final Subscription unusedSubscription;

    public aaht(Observer observer, FaultObserver faultObserver, aals aalsVar, aalo aaloVar) {
        sgf.D();
        ByteStore create = ByteStore.create(new ByteStoreConfig());
        this.a = create;
        this.b = aalsVar;
        this.c = aaloVar;
        this.unusedSubscription = create.subscribe(null, observer);
        this.unusedFaultSubscription = create.subscribeToFaults(faultObserver);
    }

    public static aaku f(awuh awuhVar) {
        if (awuhVar != null) {
            aqud aqudVar = awuhVar.c;
            if (aqudVar == null) {
                aqudVar = aqud.a;
            }
            return aaku.b(aqudVar);
        }
        return aaku.a;
    }

    private final void i(String str) {
        this.b.a("InMemoryEntityStore", str);
    }

    public final Snapshot a() {
        Snapshot snapshot = this.a.snapshot();
        if (snapshot != null) {
            return snapshot;
        }
        i("Failed to create snapshot");
        return null;
    }

    public final aahs b(String str) {
        return c(str, a());
    }

    public final aahs c(String str, Snapshot snapshot) {
        aakt e = !snapshot.contains(str) ? null : e(snapshot, str);
        awuh g = g(snapshot, str);
        if (g == null) {
            g = awuh.a;
        }
        return new aahs(e, g);
    }

    public final aakt d(String str) {
        return e(a(), str);
    }

    public final aakt e(Snapshot snapshot, String str) {
        byte[] find;
        if (snapshot == null || (find = snapshot.find(str)) == null) {
            return null;
        }
        return this.c.a(str, find);
    }

    public final awuh g(Snapshot snapshot, String str) {
        byte[] retrieveMetadata;
        if (snapshot == null || (retrieveMetadata = snapshot.retrieveMetadata(str)) == null) {
            return null;
        }
        try {
            return (awuh) aonm.parseFrom(awuh.a, retrieveMetadata, aomw.b());
        } catch (aoob unused) {
            String valueOf = String.valueOf(str);
            i(valueOf.length() != 0 ? "Unparseable companion for ".concat(valueOf) : new String("Unparseable companion for "));
            return null;
        }
    }

    public final void h(aakt aaktVar, awuh awuhVar) {
        this.a.setWithMetadata(aaktVar.d(), aaktVar.c(), awuhVar.toByteArray());
    }
}
