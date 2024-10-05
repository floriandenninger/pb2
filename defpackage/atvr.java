package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atvr extends aonm implements aooz {
    public static final atvr a;
    private static volatile aopf l;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public atvs i;
    public atvs j;
    public boolean k;

    static {
        atvr atvrVar = new atvr();
        a = atvrVar;
        aonm.registerDefaultInstance(atvr.class, atvrVar);
    }

    private atvr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0013\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0005\u0003င\u0001\u0007င\u0004\bဇ\t\u000bဉ\u000b\fဉ\f\u0012ဇ\n\u0013ဇ\u0011", new Object[]{"b", "c", "f", "d", "e", "g", "i", "j", "h", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new atvr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (atvr.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
