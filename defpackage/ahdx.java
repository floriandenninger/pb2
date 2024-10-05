package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahdx {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final long e;
    private final boolean f;
    private final PlayerResponseModel g;
    private final String h;
    private final boolean i;
    private final long j;

    public ahdx(String str, String str2, String str3, String str4, long j, long j2, boolean z, boolean z2, PlayerResponseModel playerResponseModel) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.h = str4;
        this.d = j;
        this.j = j2;
        this.f = z;
        this.i = z2;
        this.g = playerResponseModel;
        this.e = (!z || str.equals(str4)) ? -1L : 0L;
    }

    public long a() {
        return this.j;
    }

    public long b() {
        return this.d;
    }

    public PlayerResponseModel c() {
        return this.g;
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.g.y();
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.c;
    }

    public boolean i() {
        return this.f;
    }

    public boolean j() {
        return this.i;
    }
}
