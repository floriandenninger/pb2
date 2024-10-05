package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arly extends aonm implements aooz {
    public static final arly a;
    private static volatile aopf i;
    public int b;
    public arnd c;
    public arlz d;
    public boolean e;
    public audn f;
    public arlj h;
    private aqzg j;
    private byte k = 2;
    public aony g = emptyProtobufList();

    static {
        arly arlyVar = new arly();
        a = arlyVar;
        aonm.registerDefaultInstance(arly.class, arlyVar);
    }

    private arly() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0003\u0006Л\u0007ᐉ\u0004\bဇ\u0002̉ᐉ\u0005", new Object[]{"b", "c", "d", "f", "g", apxf.class, "h", "e", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new arly();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arly.class) {
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
