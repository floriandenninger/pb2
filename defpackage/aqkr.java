package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqkr extends aonm implements aooz {
    public static final aqkr a;
    public static final aonk b;
    private static volatile aopf d;
    public apxf c;
    private int e;
    private byte f = 2;

    static {
        aqkr aqkrVar = new aqkr();
        a = aqkrVar;
        aonm.registerDefaultInstance(aqkr.class, aqkrVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, aqkrVar, aqkrVar, null, 388636837, aoqn.MESSAGE, aqkr.class);
    }

    private aqkr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqkr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqkr.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
