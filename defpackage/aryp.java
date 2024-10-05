package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryp extends aonm implements aooz {
    public static final aryp a;
    private static volatile aopf f;
    public int b;
    public boolean c;
    public String d = "";
    public aony e = aonm.emptyProtobufList();

    static {
        aryp arypVar = new aryp();
        a = arypVar;
        aonm.registerDefaultInstance(aryp.class, arypVar);
    }

    private aryp() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aryp();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aryp.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
