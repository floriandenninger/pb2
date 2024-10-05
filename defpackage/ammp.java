package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ammp extends ammr {
    final /* synthetic */ ammr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ammp(ammr ammrVar, ammr ammrVar2) {
        super(ammrVar2);
        this.a = ammrVar;
    }

    @Override // defpackage.ammr
    public final void a(Appendable appendable, Iterator it) {
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(ammr.g(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.a.b);
                appendable.append(ammr.g(next2));
            }
        }
    }
}
