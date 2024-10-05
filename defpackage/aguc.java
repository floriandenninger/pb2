package defpackage;

import android.content.Intent;
import android.os.Binder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aguc extends Binder {
    public final /* synthetic */ agud a;

    public aguc(agud agudVar) {
        this.a = agudVar;
    }

    public final String a() {
        return ((agur) this.a.e).f;
    }

    public final void b() {
        agud agudVar = this.a;
        agzy.a(agudVar, new Intent(agudVar, agudVar.getClass()));
    }
}
