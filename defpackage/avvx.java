package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avvx extends aonm implements aooz {
    public static final avvx a;
    private static volatile aopf e;
    public avvw b;
    public aowz d;
    private int f;
    private byte g = 2;
    public int c = 1;

    static {
        avvx avvxVar = new avvx();
        a = avvxVar;
        aonm.registerDefaultInstance(avvx.class, avvxVar);
    }

    private avvx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0002\u0003င\u0001", new Object[]{"f", "b", "d", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avvx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (avvx.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
