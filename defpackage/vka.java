package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vka implements apo {
    private final Map a;

    public vka(Map map) {
        this.a = map;
    }

    @Override // defpackage.apo
    public final apm a(Class cls) {
        azrw azrwVar = (azrw) this.a.get(cls);
        if (azrwVar == null) {
            Iterator it = ((amrz) this.a).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    azrwVar = (azrw) entry.getValue();
                    break;
                }
            }
        }
        if (azrwVar == null) {
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Unknown ViewModel class ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return (apm) azrwVar.get();
    }
}
