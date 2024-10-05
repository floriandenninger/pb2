package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahej {
    private final int a;
    private final String b;

    public ahej(int i) {
        this(i, null);
    }

    public static boolean d(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        int i = this.a;
        return i == 5 || i == 6;
    }

    public boolean e() {
        int i = this.a;
        return i == 3 || i == 6 || i == 10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ahej) && this.a == ((ahej) obj).a;
    }

    public boolean f() {
        int i = this.a;
        return i == 2 || i == 5 || i == 9;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public ahej(int i, String str) {
        amkq.E(d(i));
        this.a = i;
        this.b = str;
    }
}
