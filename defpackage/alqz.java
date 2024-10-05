package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alqz {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final List e;
    private final int f;
    private final List g;
    private final List h;
    private final PendingIntent i;

    public alqz() {
    }

    public alqz(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.a = i;
        this.b = i2;
        this.f = i3;
        this.c = j;
        this.d = j2;
        this.g = list;
        this.h = list2;
        this.i = pendingIntent;
        this.e = list3;
    }

    public static alqz a(int i, int i2, int i3, long j, long j2, List list, List list2) {
        return new alqz(i, i2, i3, j, j2, list, list2, null, null);
    }

    public static alqz b(Bundle bundle) {
        return new alqz(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public final List c() {
        List list = this.h;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public final List d() {
        List list = this.g;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof alqz) {
            alqz alqzVar = (alqz) obj;
            if (this.a == alqzVar.a && this.b == alqzVar.b && this.f == alqzVar.f && this.c == alqzVar.c && this.d == alqzVar.d && ((list = this.g) != null ? list.equals(alqzVar.g) : alqzVar.g == null) && ((list2 = this.h) != null ? list2.equals(alqzVar.h) : alqzVar.h == null) && ((pendingIntent = this.i) != null ? pendingIntent.equals(alqzVar.i) : alqzVar.i == null)) {
                List list3 = this.e;
                List list4 = alqzVar.e;
                if (list3 != null ? list3.equals(list4) : list4 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.f;
        long j = this.c;
        long j2 = this.d;
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(this.h);
        String valueOf3 = String.valueOf(this.i);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.f;
        long j = this.c;
        long j2 = this.d;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List list = this.g;
        int hashCode = (i4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.h;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.i;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.e;
        return hashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }
}
