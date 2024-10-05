package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avqg extends aonm implements aooz {
    public static final avqg a;
    private static volatile aopf f;
    public aqyg b;
    public aqyg c;
    public aots d;
    public long e;
    private int g;
    private byte h = 2;

    static {
        avqg avqgVar = new avqg();
        a = avqgVar;
        aonm.registerDefaultInstance(avqg.class, avqgVar);
    }

    private avqg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ဂ\u0003\u0004ᐉ\u0001\u0006ဉ\u0002", new Object[]{"g", "b", "e", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new avqg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avqg.class) {
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
