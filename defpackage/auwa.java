package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auwa extends aonm implements aooz {
    public static final auwa a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aqyg d;
    public avyx e;
    public int f;
    public aulq g;
    private aota i;
    private byte j = 2;

    static {
        auwa auwaVar = new auwa();
        a = auwaVar;
        aonm.registerDefaultInstance(auwa.class, auwaVar);
    }

    private auwa() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0006ᐉ\u0006\u0007ဌ\u0003", new Object[]{"b", "c", "d", "e", "i", "g", "f", auqy.n});
            case NEW_MUTABLE_INSTANCE:
                return new auwa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auwa.class) {
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
