package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asmd extends aonm implements aooz {
    public static final asmd a;
    private static volatile aopf k;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public long h;
    public boolean i;
    public String f = "";
    public aony j = emptyProtobufList();

    static {
        asmd asmdVar = new asmd();
        a = asmdVar;
        aonm.registerDefaultInstance(asmd.class, asmdVar);
    }

    private asmd() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0000\u0001င\u0000\u0004ဌ\u0003\u0007င\u0006\nဈ\t\u000bဇ\n\fဂ\u000b\rဇ\f\u0010\u001b", new Object[]{"b", "c", "d", asje.g, "e", "f", "g", "h", "i", "j", asmc.class});
            case NEW_MUTABLE_INSTANCE:
                return new asmd();
            case NEW_BUILDER:
                return new aone((byte[][][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (asmd.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
