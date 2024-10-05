package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ipl implements ajms {
    public static final Uri a = ajmu.g(4, "subscribe_button", "channelId");
    public final Uri b;
    public final String c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final Boolean h;
    public final avaa i;
    public final avae j;
    public final apmp k;

    public ipl() {
    }

    public ipl(Uri uri, String str, long j, long j2, boolean z, boolean z2, Boolean bool, avaa avaaVar, avae avaeVar, apmp apmpVar) {
        this.b = uri;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = z2;
        this.h = bool;
        this.i = avaaVar;
        this.j = avaeVar;
        this.k = apmpVar;
    }

    public static Uri a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a.buildUpon().appendPath(str).build();
    }

    public static ipk b(auzj auzjVar) {
        avae avaeVar;
        avaa avaaVar;
        ipk c = c(auzjVar.f);
        c.c = Boolean.valueOf(auzjVar.l);
        auzh auzhVar = auzjVar.p;
        if (auzhVar == null) {
            auzhVar = auzh.a;
        }
        apmp apmpVar = null;
        if (auzhVar.b == 119226798) {
            auzh auzhVar2 = auzjVar.p;
            if (auzhVar2 == null) {
                auzhVar2 = auzh.a;
            }
            if (auzhVar2.b == 119226798) {
                avaeVar = (avae) auzhVar2.c;
            } else {
                avaeVar = avae.a;
            }
        } else {
            avaeVar = null;
        }
        c.e = avaeVar;
        auzh auzhVar3 = auzjVar.p;
        if (auzhVar3 == null) {
            auzhVar3 = auzh.a;
        }
        if (auzhVar3.b == 136076983) {
            auzh auzhVar4 = auzjVar.p;
            if (auzhVar4 == null) {
                auzhVar4 = auzh.a;
            }
            if (auzhVar4.b == 136076983) {
                avaaVar = (avaa) auzhVar4.c;
            } else {
                avaaVar = avaa.a;
            }
        } else {
            avaaVar = null;
        }
        c.d = avaaVar;
        apmh apmhVar = auzjVar.o;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 2) != 0) {
            apmh apmhVar2 = auzjVar.o;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmpVar = apmhVar2.d;
            if (apmpVar == null) {
                apmpVar = apmp.a;
            }
        }
        c.f = apmpVar;
        c.b(auzjVar.F);
        c.d(auzjVar.G);
        return c;
    }

    public static ipk c(String str) {
        amkq.E(!TextUtils.isEmpty(str));
        ipk ipkVar = new ipk();
        if (str != null) {
            ipkVar.b = str;
            Uri a2 = a(str);
            if (a2 != null) {
                ipkVar.a = a2;
                ipkVar.c(false);
                ipkVar.e(false);
                ipkVar.b(0L);
                ipkVar.d(0L);
                return ipkVar;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null channelId");
    }

    public static ipl d(ajmu ajmuVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ajms b = ajmuVar.b(a(str));
        if (b instanceof ipl) {
            return (ipl) b;
        }
        return null;
    }

    @Override // defpackage.ajms
    public final ajms e(ajms ajmsVar) {
        long j;
        ipl iplVar;
        ipl iplVar2;
        if (!(ajmsVar instanceof ipl)) {
            return this;
        }
        ipl iplVar3 = (ipl) ajmsVar;
        long j2 = this.d;
        if (j2 > 0 || iplVar3.d > 0) {
            j = iplVar3.d;
        } else {
            j2 = this.e;
            j = iplVar3.e;
        }
        if (j2 != 0 && (j == 0 || j > j2)) {
            iplVar2 = this;
            iplVar = iplVar3;
        } else {
            iplVar = this;
            iplVar2 = iplVar3;
        }
        ipk f = iplVar.f();
        Boolean bool = iplVar.h;
        if (bool == null) {
            bool = iplVar2.h;
        }
        f.c = bool;
        f.d(Math.max(this.d, iplVar3.d));
        f.b(Math.max(this.e, iplVar3.e));
        if (iplVar.i == null && iplVar.j == null && iplVar.k == null) {
            f.d = iplVar2.i;
            f.e = iplVar2.j;
            f.f = iplVar2.k;
        }
        return f.a();
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        avaa avaaVar;
        avae avaeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ipl) {
            ipl iplVar = (ipl) obj;
            if (this.b.equals(iplVar.b) && this.c.equals(iplVar.c) && this.d == iplVar.d && this.e == iplVar.e && this.f == iplVar.f && this.g == iplVar.g && ((bool = this.h) != null ? bool.equals(iplVar.h) : iplVar.h == null) && ((avaaVar = this.i) != null ? avaaVar.equals(iplVar.i) : iplVar.i == null) && ((avaeVar = this.j) != null ? avaeVar.equals(iplVar.j) : iplVar.j == null)) {
                apmp apmpVar = this.k;
                apmp apmpVar2 = iplVar.k;
                if (apmpVar != null ? apmpVar.equals(apmpVar2) : apmpVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ipk f() {
        return new ipk(this);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        long j = this.d;
        long j2 = this.e;
        int i = (((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003;
        Boolean bool = this.h;
        int hashCode3 = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        avaa avaaVar = this.i;
        int hashCode4 = (hashCode3 ^ (avaaVar == null ? 0 : avaaVar.hashCode())) * 1000003;
        avae avaeVar = this.j;
        int hashCode5 = (hashCode4 ^ (avaeVar == null ? 0 : avaeVar.hashCode())) * 1000003;
        apmp apmpVar = this.k;
        return hashCode5 ^ (apmpVar != null ? apmpVar.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        long j = this.d;
        long j2 = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        String valueOf2 = String.valueOf(this.h);
        String valueOf3 = String.valueOf(this.i);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 300 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("SubscribeButtonStateModel{uri=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(str);
        sb.append(", serverTimestamp=");
        sb.append(j);
        sb.append(", clientTimestamp=");
        sb.append(j2);
        sb.append(", subscriptionStateChanged=");
        sb.append(z);
        sb.append(", didRequireSignIn=");
        sb.append(z2);
        sb.append(", subscribed=");
        sb.append(valueOf2);
        sb.append(", subscriptionNotificationToggleButtonRenderer=");
        sb.append(valueOf3);
        sb.append(", subscriptionNotificationOptionsRenderer=");
        sb.append(valueOf4);
        sb.append(", toggleButtonRenderer=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
