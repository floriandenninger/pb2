package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asnq extends aonm implements aooz {
    public static final asnq a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aqyg d;
    public arfs e;
    public aulq f;
    public aulq g;
    private aota i;
    private byte j = 2;

    static {
        asnq asnqVar = new asnq();
        a = asnqVar;
        aonm.registerDefaultInstance(asnq.class, asnqVar);
    }

    private asnq() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asnq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asnq.class) {
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
