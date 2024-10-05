package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawe {
    public final String a;
    public final amru b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final argf i;
    public final amru j;
    public final auec k;

    public aawe() {
    }

    public aawe(String str, amru amruVar, String str2, Long l, String str3, String str4, String str5, String str6, argf argfVar, amru amruVar2, auec auecVar) {
        this.a = str;
        this.b = amruVar;
        this.c = str2;
        this.d = l;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = argfVar;
        this.j = amruVar2;
        this.k = auecVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aawe) {
            aawe aaweVar = (aawe) obj;
            String str = this.a;
            if (str != null ? str.equals(aaweVar.a) : aaweVar.a == null) {
                amru amruVar = this.b;
                if (amruVar != null ? amkq.aV(amruVar, aaweVar.b) : aaweVar.b == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(aaweVar.c) : aaweVar.c == null) {
                        Long l = this.d;
                        if (l != null ? l.equals(aaweVar.d) : aaweVar.d == null) {
                            String str3 = this.e;
                            if (str3 != null ? str3.equals(aaweVar.e) : aaweVar.e == null) {
                                String str4 = this.f;
                                if (str4 != null ? str4.equals(aaweVar.f) : aaweVar.f == null) {
                                    String str5 = this.g;
                                    if (str5 != null ? str5.equals(aaweVar.g) : aaweVar.g == null) {
                                        String str6 = this.h;
                                        if (str6 != null ? str6.equals(aaweVar.h) : aaweVar.h == null) {
                                            argf argfVar = this.i;
                                            if (argfVar != null ? argfVar.equals(aaweVar.i) : aaweVar.i == null) {
                                                amru amruVar2 = this.j;
                                                if (amruVar2 != null ? amkq.aV(amruVar2, aaweVar.j) : aaweVar.j == null) {
                                                    auec auecVar = this.k;
                                                    auec auecVar2 = aaweVar.k;
                                                    if (auecVar != null ? auecVar.equals(auecVar2) : auecVar2 == null) {
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
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        String valueOf3 = String.valueOf(this.i);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.k);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        int length7 = String.valueOf(str5).length();
        int length8 = String.valueOf(str6).length();
        int length9 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 220 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("PostCreationData{contentText=");
        sb.append(str);
        sb.append(", pollOptions=");
        sb.append(valueOf);
        sb.append(", accessRestrictions=");
        sb.append(str2);
        sb.append(", scheduledPublishTimeSec=");
        sb.append(valueOf2);
        sb.append(", videoId=");
        sb.append(str3);
        sb.append(", lightweightVideoId=");
        sb.append(str4);
        sb.append(", imageEncryptedBlobId=");
        sb.append(str5);
        sb.append(", imageSourceVideoId=");
        sb.append(str6);
        sb.append(", imagePreviewCoordinates=");
        sb.append(valueOf3);
        sb.append(", images=");
        sb.append(valueOf4);
        sb.append(", postCreationData=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        amru amruVar = this.b;
        int hashCode2 = (hashCode ^ (amruVar == null ? 0 : amruVar.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.d;
        int hashCode4 = (hashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.g;
        int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.h;
        int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        argf argfVar = this.i;
        int hashCode9 = (hashCode8 ^ (argfVar == null ? 0 : argfVar.hashCode())) * 1000003;
        amru amruVar2 = this.j;
        int hashCode10 = (hashCode9 ^ (amruVar2 == null ? 0 : amruVar2.hashCode())) * 1000003;
        auec auecVar = this.k;
        return hashCode10 ^ (auecVar != null ? auecVar.hashCode() : 0);
    }
}
