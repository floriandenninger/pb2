package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aopm extends aolz {
    final aopn a;
    aomb b = b();
    final /* synthetic */ aopp c;

    public aopm(aopp aoppVar) {
        this.c = aoppVar;
        this.a = new aopn(aoppVar);
    }

    private final aomb b() {
        if (this.a.hasNext()) {
            return this.a.next().iterator();
        }
        return null;
    }

    @Override // defpackage.aomb
    public final byte a() {
        aomb aombVar = this.b;
        if (aombVar == null) {
            throw new NoSuchElementException();
        }
        byte a = aombVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return a;
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
