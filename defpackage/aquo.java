package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aquo extends aonm implements aooz {
    public static final aquo a;
    private static volatile aopf h;
    public int b;
    public boolean c;
    public aony d = emptyProtobufList();
    public boolean e;
    public aqup f;
    public boolean g;

    static {
        aquo aquoVar = new aquo();
        a = aquoVar;
        aonm.registerDefaultInstance(aquo.class, aquoVar);
    }

    private aquo() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0004ဇ\u0002\u0006ဉ\u0004\nဇ\b", new Object[]{"b", "c", "d", aquq.class, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aquo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aquo.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
