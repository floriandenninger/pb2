package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class slu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final awnw e;
    public final awnw f;
    public final swu g;
    public final DialogInterface.OnKeyListener h;
    public final int i;
    public final slt j;
    public final Object k;
    public final aomf l;
    public final int m;

    public slu() {
    }

    public slu(String str, String str2, String str3, String str4, awnw awnwVar, awnw awnwVar2, swu swuVar, DialogInterface.OnKeyListener onKeyListener, int i, int i2, slt sltVar, Object obj, aomf aomfVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = awnwVar;
        this.f = awnwVar2;
        this.g = swuVar;
        this.h = onKeyListener;
        this.m = i;
        this.i = i2;
        this.j = sltVar;
        this.k = obj;
        this.l = aomfVar;
    }

    public static sls a() {
        sls slsVar = new sls();
        slsVar.l = 1;
        slsVar.b(-1);
        return slsVar;
    }

    public final boolean equals(Object obj) {
        slt sltVar;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof slu) {
            slu sluVar = (slu) obj;
            String str = this.a;
            if (str != null ? str.equals(sluVar.a) : sluVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(sluVar.b) : sluVar.b == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(sluVar.c) : sluVar.c == null) {
                        String str4 = this.d;
                        if (str4 != null ? str4.equals(sluVar.d) : sluVar.d == null) {
                            awnw awnwVar = this.e;
                            if (awnwVar != null ? awnwVar.equals(sluVar.e) : sluVar.e == null) {
                                awnw awnwVar2 = this.f;
                                if (awnwVar2 != null ? awnwVar2.equals(sluVar.f) : sluVar.f == null) {
                                    swu swuVar = this.g;
                                    if (swuVar != null ? swuVar.equals(sluVar.g) : sluVar.g == null) {
                                        DialogInterface.OnKeyListener onKeyListener = this.h;
                                        if (onKeyListener != null ? onKeyListener.equals(sluVar.h) : sluVar.h == null) {
                                            int i = this.m;
                                            int i2 = sluVar.m;
                                            if (i == 0) {
                                                throw null;
                                            }
                                            if (i == i2 && this.i == sluVar.i && ((sltVar = this.j) != null ? sltVar.equals(sluVar.j) : sluVar.j == null) && ((obj2 = this.k) != null ? obj2.equals(sluVar.k) : sluVar.k == null)) {
                                                aomf aomfVar = this.l;
                                                aomf aomfVar2 = sluVar.l;
                                                if (aomfVar != null ? aomfVar.equals(aomfVar2) : aomfVar2 == null) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        int i = this.m;
        String str5 = i != 1 ? i != 2 ? i != 3 ? "null" : "LAYOUT_FULLSCREEN" : "FULLSCREEN" : "ALERT";
        int i2 = this.i;
        String valueOf5 = String.valueOf(this.j);
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(valueOf).length();
        int length6 = String.valueOf(valueOf2).length();
        int length7 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 239 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf4).length() + str5.length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("DialogData{title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", actionTitle=");
        sb.append(str3);
        sb.append(", cancelTitle=");
        sb.append(str4);
        sb.append(", actionCommand=");
        sb.append(valueOf);
        sb.append(", cancelCommand=");
        sb.append(valueOf2);
        sb.append(", commandEventData=");
        sb.append(valueOf3);
        sb.append(", onKeyListener=");
        sb.append(valueOf4);
        sb.append(", dialogType=");
        sb.append(str5);
        sb.append(", requestedOrientation=");
        sb.append(i2);
        sb.append(", dialogEventListener=");
        sb.append(valueOf5);
        sb.append(", interactionLogger=");
        sb.append(valueOf6);
        sb.append(", newScreenTrackingParams=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        awnw awnwVar = this.e;
        int hashCode5 = (hashCode4 ^ (awnwVar == null ? 0 : awnwVar.hashCode())) * 1000003;
        awnw awnwVar2 = this.f;
        int hashCode6 = (hashCode5 ^ (awnwVar2 == null ? 0 : awnwVar2.hashCode())) * 1000003;
        swu swuVar = this.g;
        int hashCode7 = (hashCode6 ^ (swuVar == null ? 0 : swuVar.hashCode())) * 1000003;
        DialogInterface.OnKeyListener onKeyListener = this.h;
        int hashCode8 = (hashCode7 ^ (onKeyListener == null ? 0 : onKeyListener.hashCode())) * 1000003;
        int i = this.m;
        if (i == 0) {
            throw null;
        }
        int i2 = (((hashCode8 ^ i) * 1000003) ^ this.i) * 1000003;
        slt sltVar = this.j;
        int hashCode9 = (i2 ^ (sltVar == null ? 0 : sltVar.hashCode())) * 1000003;
        Object obj = this.k;
        int hashCode10 = (hashCode9 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        aomf aomfVar = this.l;
        return hashCode10 ^ (aomfVar != null ? aomfVar.hashCode() : 0);
    }
}
