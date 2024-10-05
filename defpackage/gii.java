package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gii implements ayrt {
    private final /* synthetic */ int m;
    public static final /* synthetic */ gii l = new gii(12);
    public static final /* synthetic */ gii k = new gii(11);
    public static final /* synthetic */ gii j = new gii(10);
    public static final /* synthetic */ gii i = new gii(9);
    public static final /* synthetic */ gii h = new gii(8);
    public static final /* synthetic */ gii g = new gii(6);
    public static final /* synthetic */ gii f = new gii(5);
    public static final /* synthetic */ gii e = new gii(4);
    public static final /* synthetic */ gii d = new gii(3);
    public static final /* synthetic */ gii c = new gii(2);
    public static final /* synthetic */ gii b = new gii(1);
    public static final /* synthetic */ gii a = new gii(0);

    public /* synthetic */ gii(int i2) {
        this.m = i2;
    }

    @Override // defpackage.ayrt
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i2 = 1;
        r1 = true;
        boolean z = true;
        r1 = true;
        boolean z2 = true;
        switch (this.m) {
            case 0:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && ((Boolean) obj3).booleanValue());
            case 1:
                return badl.d((Boolean) obj, (enz) obj2, (fhg) obj3);
            case 2:
                ita itaVar = (ita) obj;
                return (!((Boolean) obj2).booleanValue() || ((Boolean) obj3).booleanValue()) ? itaVar : itg.d(itaVar);
            case 3:
                ita itaVar2 = (ita) obj;
                return (!((Boolean) obj3).booleanValue() || ((Boolean) obj2).booleanValue()) ? itaVar2 : itg.d(itaVar2);
            case 4:
                return Boolean.valueOf((((nxh) obj) == nxh.HIDDEN || ((Boolean) obj2).booleanValue() || ((Integer) obj3).intValue() != 1) ? false : true);
            case 5:
                return new mmu((avuf) ((aakz) obj).c, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            case 6:
                ammv ammvVar = (ammv) obj3;
                return (!ammvVar.h() || ((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue()) ? amlr.a : ammvVar;
            case 7:
                Rect rect = (Rect) obj3;
                int intValue = ((Integer) obj2).intValue() - ((Integer) obj).intValue();
                return new Rect(rect.left, intValue, rect.right, Math.max(intValue, rect.height()));
            case 8:
                return Integer.valueOf(nwx.a(((Rect) obj).bottom, ((Integer) obj2).intValue(), (nxh) obj3));
            case 9:
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                if ((!((Boolean) obj).booleanValue() || !bool.booleanValue()) && !bool2.booleanValue()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 10:
                return badl.d((Boolean) obj, (nxh) obj2, (nuu) obj3);
            case 11:
                nuu nuuVar = (nuu) obj2;
                Boolean bool3 = (Boolean) obj3;
                if (((Boolean) obj).booleanValue() || (nuuVar != nuu.LANDSCAPE_PLAYER_OVERLAY && !bool3.booleanValue())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                aign aignVar = (aign) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                long j2 = oad.a;
                if (!aignVar.h()) {
                    i2 = (aignVar.c(aign.READY) || booleanValue || booleanValue2) ? 0 : -1;
                }
                return Integer.valueOf(i2);
        }
    }
}
