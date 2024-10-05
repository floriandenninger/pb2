package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asbm extends aonm implements aooz {
    public static final asbm a;
    private static volatile aopf g;
    public Object c;
    public Object e;
    public arnd f;
    private int h;
    private aqzg i;
    public int b = 0;
    public int d = 0;
    private byte j = 2;

    static {
        asbm asbmVar = new asbm();
        a = asbmVar;
        aonm.registerDefaultInstance(asbm.class, asbmVar);
    }

    private asbm() {
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
                return newMessageInfo(a, "\u0001\u0006\u0002\u0001\u0001̉\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0001\u0004ျ\u0000\u0005ျ\u0001̉ᐉ\u0005", new Object[]{"c", "b", "e", "d", "h", "f", aryr.class, asfc.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asbm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asbm.class) {
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
