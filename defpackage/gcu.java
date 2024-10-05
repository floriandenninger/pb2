package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gcu implements gbi {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final avcn e;
    public final avci f;
    public final avbz g;
    public final avcb h;
    public final CharSequence i;
    public final int j;
    public final apxf k;
    public final String l;
    public final gbu m;
    public final int n;
    public final int o;

    public gcu() {
    }

    public gcu(boolean z, boolean z2, boolean z3, int i, avcn avcnVar, avci avciVar, avbz avbzVar, avcb avcbVar, gbu gbuVar, CharSequence charSequence, int i2, int i3, int i4, apxf apxfVar, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = avcnVar;
        this.f = avciVar;
        this.g = avbzVar;
        this.h = avcbVar;
        this.m = gbuVar;
        this.i = charSequence;
        this.n = i2;
        this.o = i3;
        this.j = i4;
        this.k = apxfVar;
        this.l = str;
    }

    @Override // defpackage.gbi
    public final int a() {
        return 3;
    }

    @Override // defpackage.gbi
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.gbi
    public final boolean c() {
        return this.b;
    }

    public final gcu d(String str) {
        gct f = f();
        f.j = str;
        return f.a();
    }

    public final boolean equals(Object obj) {
        avci avciVar;
        avbz avbzVar;
        avcb avcbVar;
        gbu gbuVar;
        CharSequence charSequence;
        apxf apxfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gcu) {
            gcu gcuVar = (gcu) obj;
            if (this.a == gcuVar.a && this.b == gcuVar.b && this.c == gcuVar.c && this.d == gcuVar.d && this.e.equals(gcuVar.e) && ((avciVar = this.f) != null ? avciVar.equals(gcuVar.f) : gcuVar.f == null) && ((avbzVar = this.g) != null ? avbzVar.equals(gcuVar.g) : gcuVar.g == null) && ((avcbVar = this.h) != null ? avcbVar.equals(gcuVar.h) : gcuVar.h == null) && ((gbuVar = this.m) != null ? gbuVar.equals(gcuVar.m) : gcuVar.m == null) && ((charSequence = this.i) != null ? charSequence.equals(gcuVar.i) : gcuVar.i == null)) {
                int i = this.n;
                int i2 = gcuVar.n;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.o;
                    int i4 = gcuVar.o;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.j == gcuVar.j && ((apxfVar = this.k) != null ? apxfVar.equals(gcuVar.k) : gcuVar.k == null)) {
                        String str = this.l;
                        String str2 = gcuVar.l;
                        if (str != null ? str.equals(str2) : str2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final gct f() {
        return new gct(this);
    }

    public final int hashCode() {
        int hashCode = ((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        avci avciVar = this.f;
        int hashCode2 = (hashCode ^ (avciVar == null ? 0 : avciVar.hashCode())) * 1000003;
        avbz avbzVar = this.g;
        int hashCode3 = (hashCode2 ^ (avbzVar == null ? 0 : avbzVar.hashCode())) * 1000003;
        avcb avcbVar = this.h;
        int hashCode4 = (hashCode3 ^ (avcbVar == null ? 0 : avcbVar.hashCode())) * 1000003;
        gbu gbuVar = this.m;
        int hashCode5 = (hashCode4 ^ (gbuVar == null ? 0 : gbuVar.hashCode())) * 1000003;
        CharSequence charSequence = this.i;
        int hashCode6 = (hashCode5 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        int i = this.n;
        if (i == 0) {
            throw null;
        }
        int i2 = (hashCode6 ^ i) * 1000003;
        int i3 = this.o;
        if (i3 == 0) {
            throw null;
        }
        int i4 = (((i2 ^ i3) * 1000003) ^ this.j) * 1000003;
        apxf apxfVar = this.k;
        int hashCode7 = (i4 ^ (apxfVar == null ? 0 : apxfVar.hashCode())) * 1000003;
        String str = this.l;
        return hashCode7 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        int i = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.m);
        String valueOf6 = String.valueOf(this.i);
        int i2 = this.n;
        String num = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        int i3 = this.o;
        String num2 = i3 != 0 ? Integer.toString(i3 - 1) : "null";
        int i4 = this.j;
        String valueOf7 = String.valueOf(this.k);
        String str = this.l;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 305 + length2 + length3 + length4 + length5 + length6 + num.length() + num2.length() + String.valueOf(valueOf7).length() + String.valueOf(str).length());
        sb.append("SurveyBottomUiModel{rateLimited=");
        sb.append(z);
        sb.append(", shownOnFullscreen=");
        sb.append(z2);
        sb.append(", counterfactual=");
        sb.append(z3);
        sb.append(", surveyType=");
        sb.append(i);
        sb.append(", surveySupportedRenderers=");
        sb.append(valueOf);
        sb.append(", singleOptionSurvey=");
        sb.append(valueOf2);
        sb.append(", checkboxSurvey=");
        sb.append(valueOf3);
        sb.append(", freeTextSurvey=");
        sb.append(valueOf4);
        sb.append(", responseListener=");
        sb.append(valueOf5);
        sb.append(", question=");
        sb.append(valueOf6);
        sb.append(", displayTime=");
        sb.append(num);
        sb.append(", displayStart=");
        sb.append(num2);
        sb.append(", displayDelaySec=");
        sb.append(i4);
        sb.append(", dismissalEndpoint=");
        sb.append(valueOf7);
        sb.append(", cpn=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final boolean e(avcn avcnVar) {
        avcb avcbVar;
        int i = this.d;
        if (i == 1) {
            avci avciVar = this.f;
            if (avciVar != null) {
                avci avciVar2 = avcnVar.c;
                if (avciVar2 == null) {
                    avciVar2 = avci.a;
                }
                if (avciVar.equals(avciVar2)) {
                    return true;
                }
            }
            return false;
        }
        if (i != 2) {
            if (i == 3 && (avcbVar = this.h) != null) {
                avcb avcbVar2 = avcnVar.f;
                if (avcbVar2 == null) {
                    avcbVar2 = avcb.a;
                }
                if (avcbVar.equals(avcbVar2)) {
                    return true;
                }
            }
            return false;
        }
        avbz avbzVar = this.g;
        if (avbzVar != null) {
            avbz avbzVar2 = avcnVar.d;
            if (avbzVar2 == null) {
                avbzVar2 = avbz.a;
            }
            if (avbzVar.equals(avbzVar2)) {
                return true;
            }
        }
        return false;
    }
}
