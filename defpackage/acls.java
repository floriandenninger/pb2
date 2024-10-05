package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acls {
    public final String a;
    public final int b;
    public final axio c;

    public acls(String str, int i, axio axioVar) {
        this.a = str;
        this.b = i;
        this.c = axioVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static axio a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return axio.VP8;
        }
        if (c == 1) {
            return axio.VP9;
        }
        if (c == 2) {
            return axio.H264;
        }
        if (c == 3) {
            return axio.H265X;
        }
        String valueOf = String.valueOf(str);
        zga.m("EncoderSupportUtil", valueOf.length() != 0 ? "Unexpected codec type: ".concat(valueOf) : new String("Unexpected codec type: "));
        return null;
    }
}
