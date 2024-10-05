package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagd {
    public final String a;
    public final int b;
    public final int c;

    public bagd(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.a = str;
    }

    public bagd(bagd bagdVar, int i, byte[] bArr) {
        this(bagdVar.a, i, bagdVar.b, null);
    }

    public bagd(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public static String a(int i) {
        int i2 = i - 1;
        try {
            StringBuilder sb = new StringBuilder(35);
            sb.append("auto_offline_video_list_");
            sb.append(i2);
            return sb.toString();
        } catch (NullPointerException unused) {
            return "auto_offline_video_list_0";
        }
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder(40);
        sb.append("offline_candidate_video_list_");
        sb.append(i - 1);
        return sb.toString();
    }

    public bagd(String str, int i, int i2, byte[] bArr) {
        str.getClass();
        this.a = str;
        this.c = i;
        this.b = i2;
    }
}
