package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aitw extends ddw {
    public static final aitw b = new aitw();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ddw
    public final deb b(String str, byte[] bArr) {
        char c;
        switch (str.hashCode()) {
            case 3346442:
                if (str.equals("mdat")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3357433:
                if (str.equals("moof")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3357449:
                if (str.equals("moov")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3363941:
                if (str.equals("mvhd")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3556994:
                if (str.equals("tfdt")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3568419:
                if (str.equals("traf")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new dga();
        }
        if (c == 1) {
            return new det();
        }
        if (c == 2) {
            return new deu();
        }
        if (c == 3) {
            return new dfs();
        }
        if (c == 4) {
            return new dfw();
        }
        if (c == 5) {
            return new dfv();
        }
        return new dfo(str);
    }
}
