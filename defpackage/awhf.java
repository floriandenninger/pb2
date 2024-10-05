package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhf extends aonm implements aooz {
    public static final awhf a;
    private static volatile aopf d;
    public int b;
    public aqyg c;
    private aqyg e;
    private apmh f;
    private apmh g;
    private aota h;
    private byte i = 2;

    static {
        awhf awhfVar = new awhf();
        a = awhfVar;
        aonm.registerDefaultInstance(awhf.class, awhfVar);
    }

    private awhf() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0006ᐉ\u0004", new Object[]{"b", "e", "c", "f", "h", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awhf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awhf.class) {
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
