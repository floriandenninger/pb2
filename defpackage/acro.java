package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acro {
    public aooy a;
    public aomf b;
    public asht c;

    public acro(aooy aooyVar, aomf aomfVar) {
        a(aooyVar, aomfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aooy aooyVar, aomf aomfVar) {
        this.a = aooyVar;
        this.b = aomfVar;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acro)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        acro acroVar = (acro) obj;
        if (amkq.b(this.a, acroVar.a) && amkq.b(this.b, acroVar.b)) {
            asht ashtVar = acroVar.c;
            if (amkq.b(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b}) * 31;
    }
}
