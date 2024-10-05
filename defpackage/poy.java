package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class poy implements poz {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.poz
    public final pox a(pms pmsVar) {
        char c;
        String str = pmsVar.n;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return new ppj(null);
            }
            if (c == 1) {
                return new ppe();
            }
            if (c == 2) {
                return new ppk();
            }
            if (c == 3) {
                return new ppg();
            }
            if (c == 4) {
                return new ppd();
            }
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    @Override // defpackage.poz
    public final boolean b(pms pmsVar) {
        String str = pmsVar.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
