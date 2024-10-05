package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dzd extends dyt {
    @Override // defpackage.dyt
    public final dyn a(String str, dxk dxkVar, List list) {
        if (str == null || str.isEmpty() || !dxkVar.h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        dyn d = dxkVar.d(str);
        if (!(d instanceof dyh)) {
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        return ((dyh) d).a(dxkVar, list);
    }
}
