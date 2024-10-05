package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcn implements cqi {
    private int b;
    private int c;
    private boolean d;
    private final int e = -1;
    private final int f = -1;
    private final int g = -1;
    private Integer h;
    private Integer i;
    private Integer j;

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(21).putInt(this.c).put((byte) 0).putInt(0).putInt(-1).putInt(-1).putInt(-1).array());
    }

    public final void b(int i) {
        this.b |= i;
        this.c = i | this.c;
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof tcn) {
            tcn tcnVar = (tcn) obj;
            if (this.c == tcnVar.c) {
                boolean z = tcnVar.d;
                Integer num = tcnVar.h;
                if (ddn.m(null, null)) {
                    int i = tcnVar.e;
                    int i2 = tcnVar.f;
                    int i3 = tcnVar.g;
                    Integer num2 = tcnVar.i;
                    if (ddn.m(null, null)) {
                        Integer num3 = tcnVar.j;
                        if (ddn.m(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return ddn.e(this.c, ddn.e(0, ddn.f(null, ddn.e(-1, ddn.e(-1, ddn.e(-1, ddn.e(0, ddn.d(0))))))));
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.b;
        String str3 = (i & 16) != 0 ? "kill_animation " : "";
        String str4 = (i & 4) != 0 ? "no_overlay " : "";
        String str5 = (i & 8192) != 0 ? "app_domain " : "";
        String str6 = 1 != (i & 1) ? "" : "crop ";
        String str7 = (4194304 & i) != 0 ? "circlecrop " : "";
        String str8 = (i & 8) != 0 ? "smartcrop " : "";
        String str9 = (33554432 & i) != 0 ? "centercrop " : "";
        String str10 = (i & 4096) != 0 ? "loose_face_crop " : "";
        String str11 = (i & 512) != 0 ? "exif " : "";
        String str12 = (i & 2048) != 0 ? "jpeg " : "";
        String str13 = (i & 32) != 0 ? "webp " : "";
        String str14 = (i & 16384) != 0 ? "webp_animation " : "";
        String str15 = (32768 & i) != 0 ? "blur " : "";
        String str16 = (i & 131072) != 0 ? "mp4 " : "";
        String str17 = (i & 65536) != 0 ? "loop " : "";
        String str18 = (i & 262144) != 0 ? "no_silhouette " : "";
        String str19 = (i & 524288) != 0 ? "monogram " : "";
        String str20 = (i & 64) != 0 ? "no_upscale " : "";
        String str21 = (i & 8388608) != 0 ? "no_google_metadata " : "";
        String str22 = (i & 16777216) != 0 ? "google_metadata " : "";
        String str23 = (i & 67108864) != 0 ? "force_transformation " : "";
        String str24 = (i & 134217728) != 0 ? "colorize_filter " : "";
        if ((i & 256) != 0) {
            str = "";
            StringBuilder sb = new StringBuilder("null".length() + 11 + "null".length());
            sb.append("soften-1,");
            sb.append("null");
            sb.append(",");
            sb.append("null");
            sb.append(" ");
            str2 = sb.toString();
        } else {
            str = "";
            str2 = str;
        }
        int length = str3.length();
        int length2 = str4.length();
        int length3 = str5.length();
        int length4 = str6.length();
        int length5 = str7.length();
        int length6 = str8.length();
        int length7 = str9.length();
        int length8 = str10.length();
        int length9 = str11.length();
        int length10 = str12.length();
        int length11 = str13.length();
        int length12 = str14.length();
        int length13 = str15.length();
        int length14 = str16.length();
        int length15 = str17.length();
        int length16 = str18.length();
        int length17 = str19.length();
        int length18 = str20.length();
        int length19 = str21.length();
        int length20 = str22.length();
        String str25 = str2;
        StringBuilder sb2 = new StringBuilder(length + 18 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + length19 + length20 + str23.length() + str24.length() + String.valueOf(str2).length());
        sb2.append("FifeUrlOptions{ ");
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        sb2.append(str6);
        sb2.append(str7);
        sb2.append(str8);
        sb2.append(str9);
        sb2.append(str10);
        sb2.append(str11);
        sb2.append(str12);
        String str26 = str;
        sb2.append(str26);
        sb2.append(str13);
        sb2.append(str14);
        sb2.append(str15);
        sb2.append(str16);
        sb2.append(str17);
        sb2.append(str18);
        sb2.append(str19);
        sb2.append(str20);
        sb2.append(str21);
        sb2.append(str22);
        sb2.append(str23);
        sb2.append(str26);
        sb2.append(str24);
        sb2.append(str25);
        sb2.append(" }");
        return sb2.toString();
    }
}
