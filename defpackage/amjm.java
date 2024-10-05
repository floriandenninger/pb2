package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjm extends aonm implements aooz {
    public static final amjm a;
    private static volatile aopf j;
    public int b;
    public long c;
    public long d;
    public aony e = emptyProtobufList();
    public long f;
    public long g;
    public amhq h;
    public int i;

    static {
        amjm amjmVar = new amjm();
        a = amjmVar;
        aonm.registerDefaultInstance(amjm.class, amjmVar);
    }

    private amjm() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\nဉ\u0004\u000bဌ\u0005", new Object[]{"b", "c", "d", "e", amik.class, "f", "g", "h", "i", amjl.b()});
            case NEW_MUTABLE_INSTANCE:
                return new amjm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (amjm.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
