package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jhv {
    public final String a;
    public final String b;
    public final String c;
    public final Optional d;
    public final amru e;
    public final int f;
    public final Optional g;

    public jhv() {
    }

    public jhv(String str, String str2, String str3, Optional optional, amru amruVar, int i, Optional optional2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = optional;
        this.e = amruVar;
        this.f = i;
        this.g = optional2;
    }

    public static jhv a(Context context, boolean z, amru amruVar) {
        String str;
        String str2;
        amru amruVar2;
        Integer num;
        amru amruVar3 = (amru) Collection.EL.stream(amruVar).map(iur.m).filter(ghv.o).map(iur.n).collect(ampm.a);
        jhu jhuVar = new jhu(null);
        jhuVar.b("");
        jhuVar.a("");
        jhuVar.d(amru.q());
        jhuVar.c(0);
        jhuVar.a = "PPSV";
        jhuVar.b(context.getString(R.string.single_videos_playlist_title));
        jhuVar.d(amruVar3);
        jhuVar.c(amruVar3.size());
        if (z) {
            jhuVar.a(context.getString(R.string.single_videos_playlist_subtitle));
            aong aongVar = (aong) arfs.a.createBuilder();
            arfr arfrVar = arfr.OFFLINE_PIN;
            aongVar.copyOnWrite();
            arfs arfsVar = (arfs) aongVar.instance;
            arfsVar.c = arfrVar.pV;
            arfsVar.b |= 1;
            jhuVar.d = Optional.of((arfs) aongVar.build());
        }
        String str3 = jhuVar.a;
        if (str3 == null || (str = jhuVar.b) == null || (str2 = jhuVar.c) == null || (amruVar2 = jhuVar.e) == null || (num = jhuVar.f) == null) {
            StringBuilder sb = new StringBuilder();
            if (jhuVar.a == null) {
                sb.append(" id");
            }
            if (jhuVar.b == null) {
                sb.append(" title");
            }
            if (jhuVar.c == null) {
                sb.append(" subtitle");
            }
            if (jhuVar.e == null) {
                sb.append(" videos");
            }
            if (jhuVar.f == null) {
                sb.append(" totalVideoCount");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new jhv(str3, str, str2, jhuVar.d, amruVar2, num.intValue(), jhuVar.g);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jhv) {
            jhv jhvVar = (jhv) obj;
            if (this.a.equals(jhvVar.a) && this.b.equals(jhvVar.b) && this.c.equals(jhvVar.c) && this.d.equals(jhvVar.d) && amkq.aV(this.e, jhvVar.e) && this.f == jhvVar.f && this.g.equals(jhvVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        String valueOf3 = String.valueOf(this.g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 107 + length2 + length3 + length4 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MainDownloadedVideoList{id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", subtitle=");
        sb.append(str3);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", videos=");
        sb.append(valueOf2);
        sb.append(", totalVideoCount=");
        sb.append(i);
        sb.append(", alertMessage=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
