package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nc {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public qq h;
    qm i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public nc(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(qq qqVar) {
        qm qmVar;
        qq qqVar2 = this.h;
        if (qqVar == qqVar2) {
            return;
        }
        if (qqVar2 != null) {
            qqVar2.m(this.i);
        }
        this.h = qqVar;
        if (qqVar == null || (qmVar = this.i) == null) {
            return;
        }
        qqVar.g(qmVar);
    }
}
