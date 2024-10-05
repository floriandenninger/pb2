package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aurk extends aonm implements aooz {
    public static final aurk a;
    private static volatile aopf g;
    public int b;
    public aqyg c;
    public aulq d;
    public aurj f;
    private aota h;
    private byte i = 2;
    public aomf e = aomf.b;

    static {
        aurk aurkVar = new aurk();
        a = aurkVar;
        aonm.registerDefaultInstance(aurk.class, aurkVar);
    }

    private aurk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ည\u0002\u0003ᐉ\u0003\u0004ᐉ\u0001\u0005ᐉ\u0004", new Object[]{"b", "c", "e", "h", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aurk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aurk.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
