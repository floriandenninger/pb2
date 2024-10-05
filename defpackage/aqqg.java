package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqqg extends aonm implements aooz {
    public static final aqqg a;
    private static volatile aopf h;
    public int b;
    public aqqh c;
    public aqqi e;
    public aqqb g;
    public int d = 1;
    public aony f = emptyProtobufList();

    static {
        aqqg aqqgVar = new aqqg();
        a = aqqgVar;
        aonm.registerDefaultInstance(aqqg.class, aqqgVar);
    }

    private aqqg() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဉ\u0003\u0005\u001b\u0006ဉ\u0004", new Object[]{"b", "c", "d", aqkw.o, "e", "f", aqqf.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqqg();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqqg.class) {
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
