package defpackage;

import android.accounts.Account;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fjx implements ayrv {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ fjx(String str, int i) {
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        final int i = 0;
        switch (this.b) {
            case 0:
                String str = this.a;
                fkb fkbVar = fkb.a;
                aoot aootVar = ((fkg) obj).j;
                if (aootVar.containsKey(str)) {
                    fkbVar = (fkb) aootVar.get(str);
                }
                return Boolean.valueOf(fkbVar.e);
            case 1:
                String str2 = this.a;
                int i2 = ezw.g;
                zhq.m(str2);
                return ammw.a(str2, (Account) obj);
            case 2:
                final String str3 = this.a;
                final int i3 = 1;
                return ((aypy) obj).ad(false, new ayro() { // from class: mmr
                    @Override // defpackage.ayro
                    public final Object a(Object obj2, Object obj3) {
                        if (i3 != 0) {
                            return Boolean.valueOf(((Boolean) obj2).booleanValue() || ((String) obj3).equals(str3));
                        }
                        return Boolean.valueOf(((Boolean) obj2).booleanValue() || ((String) obj3).equals(str3));
                    }
                }).ah(false).B().al(gsv.r);
            case 3:
                return Boolean.valueOf(((amsx) obj).contains(this.a));
            case 4:
                return Boolean.valueOf(((amsx) obj).contains(this.a));
            case 5:
                return Boolean.valueOf(((amsx) obj).contains(this.a));
            case 6:
                return Boolean.valueOf(((amsx) obj).contains(this.a));
            case 7:
                String str4 = this.a;
                ArrayList arrayList = new ArrayList(((athw) obj).getSelectedVideoIds());
                if (arrayList.contains(str4)) {
                    arrayList.remove(str4);
                } else {
                    arrayList.add(str4);
                }
                return arrayList;
            case 8:
                String str5 = this.a;
                zhq.m(str5);
                return ammw.a(str5, (Account) obj);
            case 9:
                final String str6 = this.a;
                return ((aypy) obj).ad(false, new ayro() { // from class: mmr
                    @Override // defpackage.ayro
                    public final Object a(Object obj2, Object obj3) {
                        if (i != 0) {
                            return Boolean.valueOf(((Boolean) obj2).booleanValue() || ((String) obj3).equals(str6));
                        }
                        return Boolean.valueOf(((Boolean) obj2).booleanValue() || ((String) obj3).equals(str6));
                    }
                }).ah(false).B().al(khf.s);
            case 10:
                return Pair.create(this.a, (ammv) obj);
            case 11:
                return Pair.create(this.a, (ammv) obj);
            case 12:
                return Pair.create(this.a, (ammv) obj);
            case 13:
                String str7 = this.a;
                zhq.m(str7);
                return ammw.a(str7, (Account) obj);
            default:
                String str8 = this.a;
                aaln aalnVar = (aaln) obj;
                aakx a = aakz.a();
                a.c(str8);
                a.b = aalnVar.b;
                a.b(aalnVar.c);
                return a.a();
        }
    }
}
