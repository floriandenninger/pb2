package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xbp implements afxe {
    private final tdt a;
    private final Map b;

    public xbp(tdt tdtVar, Map map) {
        this.a = tdtVar;
        this.b = map;
    }

    public static xbp c(tdt tdtVar, Map map) {
        return new xbp(tdtVar, map);
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        Integer num = (Integer) xbr.a.get(str);
        if (num == null) {
            return null;
        }
        if (!afxf.h(this.b, str, uri)) {
            return (String) xbr.b.get(str);
        }
        int intValue = num.intValue();
        if (intValue == 49) {
            tdt tdtVar = this.a;
            return tdtVar != null ? tdtVar.a : "";
        }
        if (intValue == 60) {
            tdt tdtVar2 = this.a;
            return tdtVar2 != null ? tdtVar2.b : "";
        }
        switch (intValue) {
            case 62:
                tdt tdtVar3 = this.a;
                return tdtVar3 != null ? tdtVar3.c : "";
            case 63:
                tdt tdtVar4 = this.a;
                return tdtVar4 != null ? tdtVar4.d : "";
            case 64:
                tdt tdtVar5 = this.a;
                return tdtVar5 != null ? tdtVar5.e : "";
            default:
                return null;
        }
    }

    @Override // defpackage.afxe
    public final String b() {
        return "xbp";
    }
}
