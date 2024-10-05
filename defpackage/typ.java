package defpackage;

import android.content.Intent;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class typ extends tyr {
    private final tys a;
    private final int b;
    private final String c;
    private final twu d;
    private final List e;
    private final aokw f;
    private final aohq g;
    private final Intent h;
    private final ucx i;
    private final aojx j;
    private final boolean k;

    private typ(tys tysVar, int i, String str, twu twuVar, List list, aokw aokwVar, aohq aohqVar, Intent intent, ucx ucxVar, aojx aojxVar, boolean z) {
        this.a = tysVar;
        this.b = i;
        this.c = str;
        this.d = twuVar;
        this.e = list;
        this.f = aokwVar;
        this.g = aohqVar;
        this.h = intent;
        this.i = ucxVar;
        this.j = aojxVar;
        this.k = z;
    }

    public /* synthetic */ typ(tys tysVar, int i, String str, twu twuVar, List list, aokw aokwVar, aohq aohqVar, Intent intent, ucx ucxVar, aojx aojxVar, boolean z, tyo tyoVar) {
        this(tysVar, i, str, twuVar, list, aokwVar, aohqVar, intent, ucxVar, aojxVar, z);
    }

    @Override // defpackage.tyr
    public int a() {
        return this.b;
    }

    @Override // defpackage.tyr
    public Intent b() {
        return this.h;
    }

    @Override // defpackage.tyr
    public twu c() {
        return this.d;
    }

    @Override // defpackage.tyr
    public tys d() {
        return this.a;
    }

    @Override // defpackage.tyr
    public ucx e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        String str;
        twu twuVar;
        Intent intent;
        aojx aojxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tyr) {
            tyr tyrVar = (tyr) obj;
            if (this.a.equals(tyrVar.d()) && this.b == tyrVar.a() && ((str = this.c) != null ? str.equals(tyrVar.i()) : tyrVar.i() == null) && ((twuVar = this.d) != null ? twuVar.equals(tyrVar.c()) : tyrVar.c() == null) && this.e.equals(tyrVar.j()) && this.f.equals(tyrVar.h()) && this.g.equals(tyrVar.f()) && ((intent = this.h) != null ? intent.equals(tyrVar.b()) : tyrVar.b() == null) && this.i.equals(tyrVar.e()) && ((aojxVar = this.j) != null ? aojxVar.equals(tyrVar.g()) : tyrVar.g() == null) && this.k == tyrVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tyr
    public aohq f() {
        return this.g;
    }

    @Override // defpackage.tyr
    public aojx g() {
        return this.j;
    }

    @Override // defpackage.tyr
    public aokw h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        twu twuVar = this.d;
        int hashCode3 = (((((((hashCode2 ^ (twuVar == null ? 0 : twuVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        Intent intent = this.h;
        int hashCode4 = (((hashCode3 ^ (intent == null ? 0 : intent.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003;
        aojx aojxVar = this.j;
        return ((hashCode4 ^ (aojxVar != null ? aojxVar.hashCode() : 0)) * 1000003) ^ (true != this.k ? 1237 : 1231);
    }

    @Override // defpackage.tyr
    public String i() {
        return this.c;
    }

    @Override // defpackage.tyr
    public List j() {
        return this.e;
    }

    @Override // defpackage.tyr
    public boolean k() {
        return this.k;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        boolean z = this.k;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 171 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("NotificationEvent{source=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(i);
        sb.append(", actionId=");
        sb.append(str);
        sb.append(", account=");
        sb.append(valueOf2);
        sb.append(", threads=");
        sb.append(valueOf3);
        sb.append(", threadStateUpdate=");
        sb.append(valueOf4);
        sb.append(", removeReason=");
        sb.append(valueOf5);
        sb.append(", intent=");
        sb.append(valueOf6);
        sb.append(", localThreadState=");
        sb.append(valueOf7);
        sb.append(", action=");
        sb.append(valueOf8);
        sb.append(", activityLaunched=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
