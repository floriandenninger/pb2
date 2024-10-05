package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoly extends aolz {
    final /* synthetic */ aomf a;
    private int b = 0;
    private final int c;

    public aoly(aomf aomfVar) {
        this.a = aomfVar;
        this.c = aomfVar.d();
    }

    @Override // defpackage.aomb
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
