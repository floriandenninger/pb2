package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bany {
    public static final int[] a = {1, 2, 3, 4, 5, 6, 7, 9};

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "FLOAT32";
            case 2:
                return "INT32";
            case 3:
                return "UINT8";
            case 4:
                return "INT64";
            case 5:
                return "STRING";
            case 6:
                return "BOOL";
            case 7:
                return "INT16";
            case 8:
            default:
                return "null";
            case 9:
                return "INT8";
        }
    }

    public static int b(int i) {
        switch (i) {
            case 1:
            case 2:
                return 4;
            case 3:
            case 9:
                return 1;
            case 4:
                return 8;
            case 5:
            case 6:
                return -1;
            case 7:
                return 2;
            case 8:
            default:
                String a2 = a(i);
                StringBuilder sb = new StringBuilder(a2.length() + 46);
                sb.append("DataType error: DataType ");
                sb.append(a2);
                sb.append(" is not supported yet");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public static String c(int i) {
        switch (i) {
            case 1:
                return "float";
            case 2:
                return "int";
            case 3:
            case 9:
                return "byte";
            case 4:
                return "long";
            case 5:
                return "string";
            case 6:
                return "bool";
            case 7:
                return "short";
            case 8:
            default:
                String a2 = a(i);
                StringBuilder sb = new StringBuilder(a2.length() + 46);
                sb.append("DataType error: DataType ");
                sb.append(a2);
                sb.append(" is not supported yet");
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
