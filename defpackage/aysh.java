package defpackage;

import com.google.android.apps.youtube.app.common.playerviewmodemonitor.DefaultPlayerViewModeMonitor;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysh implements ayrv {
    private final /* synthetic */ int a;

    public aysh(int i) {
        this.a = i;
    }

    @Override // defpackage.ayrv
    public final /* synthetic */ Object a(Object obj) {
        if (this.a == 0) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            if (length != 7) {
                StringBuilder sb = new StringBuilder(44);
                sb.append("Array of size 7 expected but got ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            int intValue = ((Integer) obj3).intValue();
            boolean booleanValue2 = ((Boolean) obj4).booleanValue();
            boolean booleanValue3 = ((Boolean) obj5).booleanValue();
            fkw fkwVar = (fkw) obj6;
            int intValue2 = ((Integer) obj7).intValue();
            boolean booleanValue4 = ((Boolean) obj8).booleanValue();
            if (booleanValue3) {
                return fhg.VIRTUAL_REALITY_FULLSCREEN;
            }
            if (booleanValue) {
                return fhg.WATCH_WHILE_PICTURE_IN_PICTURE;
            }
            if (intValue == 0) {
                if (!booleanValue2 || fkwVar != fkw.WATCH_WHILE || booleanValue4) {
                    return fhg.NONE;
                }
                return fhg.INLINE_MINIMAL;
            }
            if (intValue == 1) {
                return DefaultPlayerViewModeMonitor.l(intValue2, fhg.WATCH_WHILE_MAXIMIZED);
            }
            if (intValue == 2) {
                return DefaultPlayerViewModeMonitor.l(intValue2, fhg.WATCH_WHILE_MINIMIZED);
            }
            if (intValue == 3) {
                return DefaultPlayerViewModeMonitor.l(intValue2, fhg.WATCH_WHILE_FULLSCREEN);
            }
            if (intValue == 4) {
                return fhg.HIDDEN;
            }
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("No view mode available for layout state: ");
            sb2.append(intValue);
            throw new IllegalArgumentException(sb2.toString());
        }
        Object[] objArr2 = (Object[]) obj;
        int length2 = objArr2.length;
        if (length2 != 5) {
            StringBuilder sb3 = new StringBuilder(44);
            sb3.append("Array of size 5 expected but got ");
            sb3.append(length2);
            throw new IllegalArgumentException(sb3.toString());
        }
        Object obj9 = objArr2[0];
        Object obj10 = objArr2[1];
        Object obj11 = objArr2[2];
        Object obj12 = objArr2[3];
        fhg fhgVar = (fhg) obj9;
        gai gaiVar = (gai) obj10;
        dsm dsmVar = (dsm) obj12;
        Optional optional = (Optional) objArr2[4];
        if (!((Boolean) obj11).booleanValue() && dsmVar.c != 0 && (!optional.isPresent() || ((jfz) optional.get()).a < 0.9f)) {
            if (!fhgVar.i()) {
                return (gaj) gaiVar.c.orElse(gaj.ACTIVITY_DEFAULT);
            }
            return gaj.ACTIVITY_DEFAULT;
        }
        return gaj.DARK;
    }
}
