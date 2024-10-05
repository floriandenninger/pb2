package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class angu implements anfy {
    final /* synthetic */ Callable a;

    public angu(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        return anaf.O(this.a.call());
    }

    public final String toString() {
        return this.a.toString();
    }
}
