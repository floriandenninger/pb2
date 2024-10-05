package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xbm {
    public static final /* synthetic */ int c = 0;
    public final xbl a;
    public final String b;

    static {
        new xbm(xbl.NONE, "");
    }

    public xbm(xbl xblVar, String str) {
        xblVar.getClass();
        this.a = xblVar;
        this.b = afhm.d(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static xbm d(afih afihVar) {
        char c2;
        xbl xblVar;
        String i = afihVar.i();
        switch (i.hashCode()) {
            case -1190444323:
                if (i.equals("net.closed")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -429516272:
                if (i.equals("net.timeout")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 107525503:
                if (i.equals("net.unavailable")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1835746713:
                if (i.equals("net.connect")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1841299800:
                if (i.equals("net.dns")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 2112079600:
                if (i.equals("fmt.noneavailable")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            xblVar = xbl.VIDEO_PLAYBACK_ERROR_UNKNOWN_HOST;
        } else if (c2 == 1) {
            xblVar = xbl.VIDEO_PLAYBACK_ERROR_CANNOT_CONNECT;
        } else if (c2 == 2) {
            xblVar = xbl.VIDEO_PLAYBACK_ERROR_TIMEOUT;
        } else if (c2 == 3) {
            xblVar = xbl.VIDEO_PLAYBACK_ERROR_TIMEOUT;
        } else if (c2 == 4) {
            xblVar = xbl.VIDEO_PLAYBACK_ERROR_NO_NETWORK;
        } else if (c2 == 5) {
            xblVar = xbl.UNSUPPORTED_VIDEO_FORMAT;
        } else {
            xblVar = xbl.VIDEO_PLAYBACK_UNKNOWN_ERROR;
        }
        return new xbm(xblVar, afihVar.k());
    }

    public final int a() {
        return this.a.p;
    }

    public final int b() {
        return this.a.q;
    }

    public final int c() {
        return this.a.r;
    }

    public final boolean e() {
        return this.a.p != 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(str).length());
        sb.append("AdError: type=");
        sb.append(valueOf);
        sb.append(" message=");
        sb.append(str);
        return sb.toString();
    }
}
