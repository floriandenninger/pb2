package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auve extends aonm implements aooz {
    public static final auve a;
    private static volatile aopf d;
    public aulq b;
    public aulq c;
    private int e;
    private aota f;
    private aoxz g;
    private byte h = 2;

    static {
        auve auveVar = new auve();
        a = auveVar;
        aonm.registerDefaultInstance(auve.class, auveVar);
    }

    private auve() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0004\tᐉ\u0006", new Object[]{"e", "b", "c", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new auve();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (auve.class) {
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
