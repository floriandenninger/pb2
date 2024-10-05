package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiud {
    public static final aiud a = new aiud();
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public String l;
    public int m;
    public String n;

    public aiud() {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = PrivateKeyType.INVALID;
        this.l = "#000000";
        this.m = PrivateKeyType.INVALID;
        this.n = "#000000";
    }

    public aiud(aiud aiudVar) {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = PrivateKeyType.INVALID;
        this.l = "#000000";
        this.m = PrivateKeyType.INVALID;
        this.n = "#000000";
        this.b = aiudVar.b;
        this.c = aiudVar.c;
        this.d = aiudVar.d;
        this.e = aiudVar.e;
        this.f = aiudVar.f;
        this.g = aiudVar.g;
        this.h = aiudVar.h;
        this.i = aiudVar.i;
        this.j = aiudVar.j;
        this.k = aiudVar.k;
        this.l = aiudVar.l;
        this.m = aiudVar.m;
        this.n = aiudVar.n;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder(128);
        if (!this.j.equals("#FFFFFF")) {
            sb.append("<font color=");
            sb.append(this.j);
            sb.append(">");
        }
        if (this.c) {
            sb.append("<I>");
        }
        return sb.toString();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder(128);
        if (this.c) {
            sb.append("</I>");
        }
        if (!this.j.equals("#FFFFFF")) {
            sb.append("</font>");
        }
        return sb.toString();
    }
}
