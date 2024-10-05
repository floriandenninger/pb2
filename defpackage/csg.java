package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csg {
    public final czz a;
    public final hy b;
    private final Class c;
    private final List d;
    private final String e;

    public csg(Class cls, Class cls2, Class cls3, List list, czz czzVar, hy hyVar) {
        this.c = cls;
        this.d = list;
        this.a = czzVar;
        this.b = hyVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed DecodePath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.e = sb.toString();
    }

    public final ctd a(cqy cqyVar, int i, int i2, cqn cqnVar, List list) {
        int size = this.d.size();
        ctd ctdVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            cqp cqpVar = (cqp) this.d.get(i3);
            try {
                if (cqpVar.b(cqyVar.a(), cqnVar)) {
                    ctdVar = cqpVar.a(cqyVar.a(), i, i2, cqnVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (ctdVar != null) {
                break;
            }
        }
        if (ctdVar != null) {
            return ctdVar;
        }
        throw new csz(this.e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DecodePath{ dataClass=");
        sb.append(valueOf);
        sb.append(", decoders=");
        sb.append(valueOf2);
        sb.append(", transcoder=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
