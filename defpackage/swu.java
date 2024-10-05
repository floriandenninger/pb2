package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class swu {
    public final View a;
    public final View b;
    public final szk c;
    public final Object d;
    public final awpu e;
    public final sxs f;
    public final String g;
    public final syb h;
    public final sxc i;

    public swu() {
    }

    public swu(View view, View view2, szk szkVar, Object obj, awpu awpuVar, sxs sxsVar, String str, syb sybVar, sxc sxcVar) {
        this.a = view;
        this.b = view2;
        this.c = szkVar;
        this.d = obj;
        this.e = awpuVar;
        this.f = sxsVar;
        this.g = str;
        this.h = sybVar;
        this.i = sxcVar;
    }

    public static sws a() {
        sws swsVar = new sws();
        swsVar.b(sxc.a);
        return swsVar;
    }

    public final sws b() {
        return new sws(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof swu) {
            swu swuVar = (swu) obj;
            View view = this.a;
            if (view != null ? view.equals(swuVar.a) : swuVar.a == null) {
                View view2 = this.b;
                if (view2 != null ? view2.equals(swuVar.b) : swuVar.b == null) {
                    szk szkVar = this.c;
                    if (szkVar != null ? szkVar.equals(swuVar.c) : swuVar.c == null) {
                        Object obj2 = this.d;
                        if (obj2 != null ? obj2.equals(swuVar.d) : swuVar.d == null) {
                            awpu awpuVar = this.e;
                            if (awpuVar != null ? awpuVar.equals(swuVar.e) : swuVar.e == null) {
                                sxs sxsVar = this.f;
                                if (sxsVar != null ? sxsVar.equals(swuVar.f) : swuVar.f == null) {
                                    String str = this.g;
                                    if (str != null ? str.equals(swuVar.g) : swuVar.g == null) {
                                        syb sybVar = this.h;
                                        if (sybVar != null ? sybVar.equals(swuVar.h) : swuVar.h == null) {
                                            if (this.i.equals(swuVar.i)) {
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
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String str = this.g;
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 146 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("CommandEventData{view=");
        sb.append(valueOf);
        sb.append(", anchorView=");
        sb.append(valueOf2);
        sb.append(", touchLocation=");
        sb.append(valueOf3);
        sb.append(", customData=");
        sb.append(valueOf4);
        sb.append(", senderState=");
        sb.append(valueOf5);
        sb.append(", elementBuilder=");
        sb.append(valueOf6);
        sb.append(", identifier=");
        sb.append(str);
        sb.append(", elementsConfig=");
        sb.append(valueOf7);
        sb.append(", conversionContext=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        View view = this.a;
        int hashCode = ((view == null ? 0 : view.hashCode()) ^ 1000003) * 1000003;
        View view2 = this.b;
        int hashCode2 = (hashCode ^ (view2 == null ? 0 : view2.hashCode())) * 1000003;
        szk szkVar = this.c;
        int hashCode3 = (hashCode2 ^ (szkVar == null ? 0 : szkVar.hashCode())) * 1000003;
        Object obj = this.d;
        int hashCode4 = (hashCode3 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        awpu awpuVar = this.e;
        int hashCode5 = (hashCode4 ^ (awpuVar == null ? 0 : awpuVar.hashCode())) * 1000003;
        sxs sxsVar = this.f;
        int hashCode6 = (hashCode5 ^ (sxsVar == null ? 0 : sxsVar.hashCode())) * 1000003;
        String str = this.g;
        int hashCode7 = (hashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        syb sybVar = this.h;
        return ((hashCode7 ^ (sybVar != null ? sybVar.hashCode() : 0)) * 1000003) ^ this.i.hashCode();
    }
}
