package defpackage;

import android.graphics.Typeface;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class idd extends EnumMap {
    public idd() {
        super(axch.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Typeface a(axch axchVar) {
        Typeface typeface;
        idc idcVar = (idc) get(axchVar);
        if (idcVar == null) {
            return null;
        }
        synchronized (idcVar) {
            typeface = idcVar.d;
        }
        return typeface;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(axch axchVar, Typeface typeface) {
        idc idcVar = (idc) get(axchVar);
        if (idcVar != null) {
            synchronized (idcVar) {
                idcVar.d = typeface;
            }
        }
    }
}
