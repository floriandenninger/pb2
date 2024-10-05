package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupd extends aonm implements aooz {
    public static final aupd a;
    private static volatile aopf f;
    public aqyg b;
    public apxf c;
    public aqyg d;
    public aott e;
    private int g;
    private byte h = 2;

    static {
        aupd aupdVar = new aupd();
        a = aupdVar;
        aonm.registerDefaultInstance(aupd.class, aupdVar);
    }

    private aupd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aupd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aupd.class) {
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
