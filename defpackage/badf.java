package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class badf {
    static bade a;
    static long b;

    private badf() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bade a() {
        synchronized (badf.class) {
            bade badeVar = a;
            if (badeVar != null) {
                a = badeVar.f;
                badeVar.f = null;
                b -= 8192;
                return badeVar;
            }
            return new bade();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(bade badeVar) {
        if (badeVar.f != null || badeVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (badeVar.d) {
            return;
        }
        synchronized (badf.class) {
            long j = b;
            if (j + 8192 > 65536) {
                return;
            }
            b = j + 8192;
            badeVar.f = a;
            badeVar.c = 0;
            badeVar.b = 0;
            a = badeVar;
        }
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    public static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int f(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static int h(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }
}
