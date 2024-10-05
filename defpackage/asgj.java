package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgj extends aonm implements aooz {
    public static final asgj a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public aott f;
    public int g;
    private byte i = 2;

    static {
        asgj asgjVar = new asgj();
        a = asgjVar;
        aonm.registerDefaultInstance(asgj.class, asgjVar);
    }

    private asgj() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ဉ\u0004\u0005ᐉ\u0002\u0006င\u0005", new Object[]{"b", "c", "e", "f", "d", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asgj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asgj.class) {
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
