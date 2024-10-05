package defpackage;

import java.util.Collection;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoaw extends amzq {
    private final Collection a;

    public aoaw(String str, Collection collection) {
        super(str);
        this.a = collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amyp
    public final void c(amyo amyoVar) {
        amxe it = ((amru) this.a).iterator();
        while (it.hasNext()) {
            amyp amypVar = (amyp) it.next();
            if (amyoVar.x() || amypVar.d(amyoVar.m())) {
                amypVar.c(amyoVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amyp
    public final boolean d(Level level) {
        amxe it = ((amru) this.a).iterator();
        while (it.hasNext()) {
            if (((amyp) it.next()).d(level)) {
                return true;
            }
        }
        return false;
    }
}
