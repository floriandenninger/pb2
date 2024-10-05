package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbe extends aonm implements aooz {
    public static final aqbe a;
    private static volatile aopf i;
    public int b;
    public aqyg c;
    public aulq d;
    public aulq e;
    private aota j;
    private byte k = 2;
    public int f = 12;
    public int g = 3;
    public aomf h = aomf.b;

    static {
        aqbe aqbeVar = new aqbe();
        a = aqbeVar;
        aonm.registerDefaultInstance(aqbe.class, aqbeVar);
    }

    private aqbe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0005ည\u0006\u0006င\u0003\u0007င\u0004", new Object[]{"b", "c", "d", "e", "j", "h", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqbe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqbe.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
