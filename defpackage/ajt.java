package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajt {
    public static final ajn a = new ajr(null, false);
    public static final ajn b = new ajr(null, true);
    public static final ajn c = new ajr(ajo.a, false);
    public static final ajn d = new ajr(ajo.a, true);
    public static final ajn e = new ajr(ajo.b, false);
    public static final ajn f = ajs.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
